import java.util.NoSuchElementException;

public class CustomLists {
    private static class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    private Node first;
    private Node last;
    private int size;

    public void addFirst(int item){
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLast(int item)
    {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }
    public void deleteFirst()
    {
        if (isEmpty())
            throw new NoSuchElementException();
        else {
            var temp = first.next;
            first = null;
            first = temp;

            size--;
        }
    }
    public void deleteLast(){
        if (isEmpty())
            throw new NoSuchElementException();
        else {
            var previous = getPrevious();
            if (previous != null){
                previous.next = null;
                last = previous;
            }
        }
    }

    private Node getPrevious(){
        var current = first;
        while(current != null)
            if (current.next == last){
                return current;
            }else{
                current = current.next;
            }
        return null;
    }
    public boolean contains(int item)
    {
        if (isEmpty())
            return false;
        var current = first;
        while (current != null){
            if (current.value == item)
                return true;
            current = current.next;
        }
        return false;
    }
    public int indexOf(int item)
    {
        int index = 0;
        var current = first;
        while (current != null){
            if (current.value == item)
                return index;
            else {
                index++;
                current = current.next;
            }
        }
        return -1;
    }

    public int Size()
    {
        return  size;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void print(){
        var current = first;
        while (current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }
}
