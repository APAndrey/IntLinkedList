package com.petrusandrey;

public class Main {

    public static void main(String[] args) {
        IntList list = new IntLinkedList();

        list.add(9);
        list.add(13);
        list.add(16);
        list.add(20);

        System.out.println("Source list: " + list);
        System.out.println("Size list: " + list.size());

        list.set(0, 21);
        System.out.println("Element 0 mouth. value 21: " + list);

        list.add(3,99);
        System.out.println("Added element 99 to position 3:" + list);

        list.remove(1);
        System.out.println("Removed item in position 1: " + list);

        System.out.println("Contains an element with a value of 11? " + list.contains(16));
        System.out.println("Element with index 2: " + list.get(2));

        list.clear();
        System.out.println("Now the list is empty? " + list.isEmpty());

    }
}
