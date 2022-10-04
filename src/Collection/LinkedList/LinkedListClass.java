package Collection.LinkedList;

import java.util.LinkedList;

public class LinkedListClass<L> {
    public static void main(String[] args) {
        LinkedList<LinkedClass> linkedList = new LinkedList<LinkedClass>();
        LinkedClass linkedClass = new LinkedClass();
        linkedList.add(linkedClass);
        System.out.println(linkedList);

        LinkedList<String> color= new LinkedList<String>();
        color.add("Red");
        color.add("Blue");

        System.out.println(color);
        color.addFirst("White");
        System.out.println(color);

        color.removeFirst();
        color.removeLast();
        System.out.println(color);

    }




}
