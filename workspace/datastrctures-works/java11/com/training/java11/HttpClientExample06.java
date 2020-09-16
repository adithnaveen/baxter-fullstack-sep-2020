package com.training.java11;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

// deflate is the way how java 11 compress the data 

public class HttpClientExample06 {
	public static void main(String[] args) throws Exception {
//		httpGetRequest();
//		httpPostRequest(); 

//		asynchronousGetRequest();

		asyncMultipleRequests();

	}

	private static void asyncMultipleRequests() throws URISyntaxException, InterruptedException, ExecutionException {

		URI uri1 = new URI("https://jsonplaceholder.typicode.com/todos/1");
		URI uri2 = new URI("https://jsonplaceholder.typicode.com/todos/2");

		HttpClient client = HttpClient.newHttpClient();

		List<URI> uris = Arrays.asList(uri1, uri2);

		List<HttpRequest> requests = uris.stream().map(HttpRequest::newBuilder).
									map(reqBuilder -> reqBuilder.build())
									.collect(Collectors.toList());
		
		System.out.println("Got Request -> " + requests);
		
		CompletableFuture<Void> future = CompletableFuture.allOf(
					requests.stream().map(request -> client.sendAsync(request, BodyHandlers.ofString()))
					.toArray(CompletableFuture<?> [] :: new)).thenAccept(System.out :: println); 
		
		future.join(); 
		future.get(); 
	}

	private static void asynchronousGetRequest() throws URISyntaxException, InterruptedException, ExecutionException {
		HttpClient client = HttpClient.newHttpClient();

		URI uri = new URI("https://jsonplaceholder.typicode.com/todos/2");
		HttpRequest request = HttpRequest.newBuilder(uri).version(HttpClient.Version.HTTP_2).build();

		CompletableFuture<Void> future = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
				.thenAccept(resp -> {
					System.out.println("Got URI From  -> " + resp.uri());
					System.out.println("Response Body -> " + resp.body());
					System.out.println("Status code ->" + resp.statusCode());
				});

		future.get();
	}

	private static void httpPostRequest() throws URISyntaxException, IOException, InterruptedException {
		HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

		HttpRequest request = HttpRequest.newBuilder(new URI("https://jsonplaceholder.typicode.com/posts"))
				.version(HttpClient.Version.HTTP_2).POST(BodyPublishers.ofString("{sample:sample}")).build();

		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

		System.out.println("Response Body -> \n" + response.body());
		System.out.println("Status Code -> \n " + response.statusCode());
	}

	private static void httpGetRequest() throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder().version(HttpClient.Version.HTTP_2)
				.uri(URI.create("https://jsonplaceholder.typicode.com/todos/2")).build();
//					.headers("Accept-Encoding", "gzip, deflate").build(); 

		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

		String responseBody = response.body();
		int responseStatusCode = response.statusCode();

		System.out.println(responseBody);
		System.out.println(responseStatusCode);
	}
}
