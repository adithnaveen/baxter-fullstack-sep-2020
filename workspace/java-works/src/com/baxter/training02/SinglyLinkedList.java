package com.baxter.training02;

public class SinglyLinkedList<E> {

	private static class Node<E> {

		private E value;
		private Node<E> next;

		public Node(E value, Node<E> next) {
			super();
			this.value = value;
			this.next = next;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}

		public E getValue() {
			return value;
		}

		@Override
		public String toString() {
			return "Node [value=" + value + ", next=" + next + "]";
		}

	}

	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;

	public SinglyLinkedList() {
	}

	public void addFirst(E e) {
		head = new Node<>(e, head);
		if (size == 0) {
			tail = head;
		}

		size++;
	}

	public void addLast(E e) {
		Node<E> newElement = new Node<>(e, null);
		if (isEmpty()) {
			head = newElement;
		} else {
			tail.setNext(newElement);
		}

		tail = newElement;
		size++;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E removeFirst() {
		if (isEmpty())
			return null;

		E content = head.getValue();

		head = head.getNext();
		size--;

		if (size == 0) {
			tail = null;
		}

		return content;
	}

	
	public E removeLast() {
		return null; 
	}
	
	public E first() {
		if (isEmpty())
			return null;
		return head.getValue();
	}

	public E last() {
		if (isEmpty())
			return null;

		return tail.getValue();
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		return "SinglyLinkedList [head=" + head + ", tail=" + tail + ", size=" + size + "]";
	}
	
	
	
}
