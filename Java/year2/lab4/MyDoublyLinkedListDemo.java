package Java.year2.lab4;
import java.util.Iterator;

public class MyDoublyLinkedListDemo {

    public static void main(String[] args) {
        // CREATE A LIST
        var myDoublyLinkedList = new MyDoublyLinkedList<Integer>();

        // MEASURE TIME TO ADD ONE ELEMENT
        measureTime(() -> {
            myDoublyLinkedList.add(42, null);
            printListInfo(myDoublyLinkedList);
        }, "Add one element");

        // MEASURE TIME TO ADD FIRST
        measureTime(() -> {
            myDoublyLinkedList.addFirst(99);
            printListInfo(myDoublyLinkedList);
        }, "addFirst");

        // MEASURE TIME TO REMOVE LAST
        measureTime(() -> {
            myDoublyLinkedList.removeLast();
            printListInfo(myDoublyLinkedList);
        }, "removeLast");
    }

    private static void measureTime(Runnable operation, String operationName) {
        long startTime = System.nanoTime();
        operation.run();
        long endTime = System.nanoTime();
        System.out.println(operationName + ": " + (endTime - startTime) + " nanoseconds");
    }

    private static void printListInfo(MyDoublyLinkedList<Integer> list) {
        System.out.println("List: " + list +
                "\nHead element: " + list.getFirst() +
                "\nHead element next: " + ((list.head.next != null) ? list.head.next.element : "null") +
                "\nTail element: " + list.getLast() +
                "\nTail element next: " + ((list.tail.next != null) ? list.tail.next.element : "null") +
                "\nTail element previous: " + ((list.tail.previous != null) ? list.tail.previous.element : "null") +
                "\nSize: " + list.size + "\n");
    }
}

class MyDoublyLinkedList<E> implements MyList<E> {
    Node<E> head;
    Node<E> tail;
    int size;

    public MyDoublyLinkedList() {
    }

    public MyDoublyLinkedList(E[] objects) {
        for (E object : objects)
            add(size, object);
    }

    public E getFirst() {
        if (size == 0) {
            return null;
        } else {
            return head.element;
        }
    }

    public E getLast() {
        if (size == 0) {
            return null;
        } else {
            return tail.element;
        }
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null)
            tail = head;
        if (head != tail)
            head.next.previous = head;
    }

    public void add(int index, E e) {
        if (index == 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
            temp.previous = current.next;
            current.next.previous = current;
        }
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        Node<E> temp = tail;
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
        tail.previous = temp;
    }

    public E removeLast() {
        if (size == 0) {
            return null;
        } else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    public int indexOf(Object e) {
        int index = 0;
        Node<E> current = head;
        while (current != null) {
            if (e.equals(current.element)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
                result.append(", ");
            } else {
                result.append("]");
            }
        }
        return result.toString();
    }

    static class Node<E> {
        E element;
        Node<E> next;
        Node<E> previous;

        public Node(E o) {
            element = o;
        }
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public E get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public int lastIndexOf(E e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

    @Override
    public E remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public E set(int index, E e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }
}

interface MyList<E> {
    int size();

    boolean contains(Object o);

    Iterator<E> iterator();

    void clear();

    E get(int index);

    int indexOf(Object e);

    int lastIndexOf(E e);

    E remove(int index);

    E set(int index, E e);
}
