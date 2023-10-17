package Java.year2.lab4;

class Node<E> 
{
    E element;
    Node<E> next;

    Node(E element) 
    {
        this.element = element;
        this.next = null;
    }
}

class MyLinkedList<E> 
{
    Node<E> head;
    Node<E> tail;
    int size;

    void add(E element) 
    {
        Node<E> newNode = new Node<>(element);
        if (head == null) 
        {
            head = newNode;
            tail = newNode;
        } 
        else 
        {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    void addFirst(E element) 
    {
        Node<E> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        if (tail == null) 
        {
            tail = newNode;
        }
        size++;
    }

    void removeLast() 
    {
        if (head == null) 
        {
            return;
        }
        if (head == tail) 
        {
            head = null;
            tail = null;
        } 
        else 
        {
            Node<E> current = head;
            while (current.next != tail) 
            {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
        size--;
    }

    @Override
    public String toString() 
    {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        while (current != null) 
        {
            result.append(current.element);
            if (current.next != null) 
            {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }
}

public class singleLinkedList 
{
    public static void main(String[] args) 
    {
        var myLinkedList = new MyLinkedList<Integer>();

        measureTime(() -> 
        {
            for (int i = 1; i < 5; i++) 
            {
                myLinkedList.add(i);
                printListInfo(myLinkedList);
            }
        }, "Add one element");

        measureTime(() -> 
        {
            for (int i = 1; i < 5; i++) 
            {
                myLinkedList.addFirst(10 + i);
                printListInfo(myLinkedList);
            }
        }, "addFirst");

        measureTime(() -> 
        {
            for (int i = 0; i < 3; i++) 
            {
                myLinkedList.removeLast();
                printListInfo(myLinkedList);
            }
        }, "removeLast");
    }

    private static void measureTime(Runnable operation, String operationName) 
    {
        long startTime = System.nanoTime();
        operation.run();
        long endTime = System.nanoTime();
        System.out.println(operationName + ": " + (endTime - startTime) + " nanoseconds");
    }

    private static void printListInfo(MyLinkedList<Integer> list) 
    {
        System.out.println("List: " + list +
                ", head element: " + list.head.element +
                ", head element next: " + ((list.head.next != null) ? list.head.next.element : "null") +
                ", tail element: " + list.tail.element +
                ", tail element next: " + ((list.tail.next != null) ? list.tail.next.element : "null") +
                ", size: " + list.size + "\n");
    }
}

