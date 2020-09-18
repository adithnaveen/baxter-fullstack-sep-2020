package com.baxter.training03;

public class DoublyLinkedListImpl {
	public static void main(String[] args) {
		DoublyLinkedList<String> list = new DoublyLinkedList<String>();

		list.addFirst("One");
		list.addFirst("Two");
		list.addLast("Three");

		System.out.println(list);
	}
}
