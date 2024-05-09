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