# Custom Lists

This Java program consists of two classes: `CustomLists` and `Main`. The `CustomLists` class implements a custom linked list data structure, while the `Main` class provides a demonstration of how to use the functionalities of the custom list.

## CustomLists Class

### Description
- The `CustomLists` class implements a linked list with basic functionalities such as adding elements to the beginning and end, deleting elements from the beginning and end, checking for element existence, finding the index of an element, and getting the size of the list.

### Methods
- `addFirst(int item)`: Adds an element to the beginning of the list.
- `addLast(int item)`: Adds an element to the end of the list.
- `deleteFirst()`: Deletes the first element of the list.
- `deleteLast()`: Deletes the last element of the list.
- `contains(int item)`: Checks if the list contains a specific element.
- `indexOf(int item)`: Returns the index of the first occurrence of the specified element.
- `Size()`: Returns the size of the list.
- `isEmpty()`: Checks if the list is empty.
- `print()`: Prints the elements of the list.

### Example Usage
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("****************Custom Lists******************");
        CustomLists list = new CustomLists();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.print();

        System.out.println("\n");
        System.out.println("contains value: " + list.contains(100));

        System.out.println("\n");
        System.out.println("index of item: " + list.indexOf(600));

        System.out.println("\n");
        System.out.println("Delete the first item in teh list:");
        list.deleteFirst();
        list.print();

        System.out.println("\n");
        System.out.println("Delete the last item in teh list:");
        list.deleteLast();
        list.print();

        System.out.println("\n");
        System.out.println("List size: " + list.Size());

    }
}
```

## Contributions
Contributions are welcome. If you wish to improve the class or add more functionality, please fork the repository and submit a pull request.

## License
This project is open-sourced under the MIT license.

