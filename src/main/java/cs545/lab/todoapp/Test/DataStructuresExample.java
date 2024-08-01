package cs545.lab.todoapp.Test;

import java.util.*;

public class DataStructuresExample {
    public static void main(String[] args) {
        // Array
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        // String
        String str = "Hello, World!";
        System.out.println("String:");
        System.out.println(str);

        // List
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("List:");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println("Queue:");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();

        // Map
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("Map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Set
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println("Set:");
        for (String item : set) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
