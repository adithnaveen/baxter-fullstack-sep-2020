package com.training.java11;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static java.util.concurrent.CompletableFuture.supplyAsync;


public class Completable05 {
	private static String job1 = "Job-01"; 
	private static String job2 = "Job-02"; 
	private static String job3 = "Job-03";
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("I'm in " + Thread.currentThread().getName());
		
		CompletableFuture<String> cf = supplyAsync(() -> { return "Hi To All"; });
		
		cf.defaultExecutor().execute(() -> {
			System.out.println("Hey i'm in Execute... ");
		});
		
		
		System.out.println("From Get " + cf.toCompletableFuture().get());
	
		System.out.println("----------------------------------------------------");
		
		work();
	}
	
	public static void work() throws InterruptedException, ExecutionException {
		CompletableFuture<String> req1 = supplyAsync(() -> {
			sleep(1000); 
			System.out.println("I'm in Req 1 " + Thread.currentThread());
			return job1 + " Completed"; 
		} ); 
		
		CompletableFuture<String> req2 = supplyAsync(() -> {
			sleep(1000); 
			System.out.println("I'm in Req 2 " + Thread.currentThread());
			return job2 + " Completed"; 
		} );
		
		CompletableFuture<String> req3 = supplyAsync(() -> {
			sleep(1000); 
			System.out.println("I'm in Req 3 " + Thread.currentThread());
			return job3 + " Completed"; 
		} ); 
		
//		System.out.println(req1.get());
//		System.out.println(req2.get());
//		System.out.println(req3.get());
		
		
//		CompletableFuture<Void> allCompletableFuture = CompletableFuture.allOf(req1,req2, req3); 
		CompletableFuture<Object> allCompletableFuture = CompletableFuture.anyOf(req1,req2, req3);
		
		allCompletableFuture.get(); 
		System.out.println("Last line of the method... ");
		
		
		
	}

	private static void sleep(int i) {
		
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
