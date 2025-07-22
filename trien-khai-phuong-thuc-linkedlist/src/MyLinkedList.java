public class MyLinkedList<E> {
    private Node<E> head;
    private int numNodes = 0;

    private static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
        }
    }

    public MyLinkedList(E data) {
        head = new Node<>(data);
        numNodes++;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) throw new IndexOutOfBoundsException();

        Node<E> temp = head;
        Node<E> holder;

        if (index == 0) {
            addFirst(element);
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node<>(element);
            temp.next.next = holder;
            numNodes++;
        }
    }

    public void addFirst(E element) {
        Node<E> temp = head;
        head = new Node<>(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node<>(element);
        numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) throw new IndexOutOfBoundsException();

        Node<E> temp = head;
        E removedData;

        if (index == 0) {
            removedData = head.data;
            head = head.next;
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            removedData = temp.next.data;
            temp.next = temp.next.next;
        }
        numNodes--;
        return removedData;
    }

    public boolean remove(Object o) {
        if (head == null) return false;

        if (head.data.equals(o)) {
            head = head.next;
            numNodes--;
            return true;
        }

        Node<E> temp = head;
        while (temp.next != null) {
            if (temp.next.data.equals(o)) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) throw new IndexOutOfBoundsException();

        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return numNodes;
    }

    public void printList() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public MyLinkedList<E> clone() {
        if (head == null) return null;

        MyLinkedList<E> cloned = new MyLinkedList<>(head.data);
        Node<E> currentOriginal = head.next;
        Node<E> currentCloned = cloned.head;

        while (currentOriginal != null) {
            currentCloned.next = new Node<>(currentOriginal.data);
            currentOriginal = currentOriginal.next;
            currentCloned = currentCloned.next;
            cloned.numNodes++;
        }

        return cloned;
    }

    public boolean contains(E element) {
        Node<E> temp = head;
        while (temp != null) {
            if (temp.data.equals(element)) return true;
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element) {
        Node<E> temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(element)) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }
}

