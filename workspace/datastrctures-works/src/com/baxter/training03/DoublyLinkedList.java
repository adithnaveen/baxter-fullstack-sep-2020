package com.baxter.training03;

public class DoublyLinkedList<E> {

	private static class Node<E> {
		private E element;
		private Node<E> prev;
		private Node<E> next;

		public Node(E element, Node<E> prev, Node<E> next) {
			super();
			this.element = element;
			this.prev = prev;
			this.next = next;
		}

		public E getElement() {
			return element;
		}

		public void setElement(E element) {
			this.element = element;
		}

		public Node<E> getPrev() {
			return prev;
		}

		public void setPrev(Node<E> prev) {
			this.prev = prev;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}
	} // end of node class

	// the header and trailer node are empty which are called sentineal nodes

	private Node<E> header;
	private Node<E> trailer;
	private int size = 0;

	public Node<E> getHeader() {
		return header;
	}

	public Node<E> getTrailer() {
		return trailer;
	}

	public int getSize() {
		return size;
	}

	public DoublyLinkedList() {
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		header.setNext(trailer);
	}

	public E first() {
		if (isEmpty()) {
			return null;
		}
		return header.getNext().getElement();
	}

	public E last() {
		if (isEmpty()) {
			return null;
		}
		return trailer.getPrev().getElement();
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void addFirst(E e) {
		addBetween(e, header, header.next);
	}

	public void addLast(E e) {
		addBetween(e, trailer.prev, trailer);
	}

	public E removeFirst() {
		if (isEmpty())
			return null;

		return remove(header.getNext());
	}

	public E removeLast() {
		if (isEmpty())
			return null;

		return remove(trailer.getPrev());
	}

	private E remove(Node<E> node) {
		Node<E> predecessor = node.getPrev();
		Node<E> successor = node.getNext();

		predecessor.setNext(successor);
		successor.setPrev(predecessor);

		size--;
		return node.getElement();
	}

	private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		Node<E> newNode = new Node<>(e, predecessor, successor);
		predecessor.setNext(newNode);
		successor.setPrev(newNode);

		size++;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder("(");

		Node<E> walking = header.getNext();

		while (walking != trailer) {
			sb.append(walking.getElement());
			walking = walking.getNext();

			if (walking != trailer) {
				sb.append(", ");
			}
		}
		sb.append(")");
		return sb.toString();

	}

}
