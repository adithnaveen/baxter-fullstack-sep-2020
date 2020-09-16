package com.training.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadWriteOperation04 {
	public static void main(String[] args)
	throws IOException{
		//Files.writeString(Path.of("Sample.txt"), "Welcome Java 11");
		System.out.println(Files.readString(Path.of("Sample.txt")));
	}
}
