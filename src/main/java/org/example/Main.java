package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static final int TEST_SIZE = 1500;

    public static void main(String[] args) {
        System.out.println("method\t\t\t\tCount\tArrayList Time (ms)\tLinkedList Time (ms)");

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        PerformanceComparison<Integer> performanceComparison = new PerformanceComparison<>();

        double[] arrayListTimes = performanceComparison.getTimes(arrayList);
        double[] linkedListTimes = performanceComparison.getTimes(linkedList);

        for (int i = 0; i < 6; i++) {
            String methodName;

            switch (i) {
                case 0: methodName = "add (end)"; break;
                case 1: methodName = "add (beginning)"; break;
                case 2: methodName = "get"; break;
                case 3: methodName = "size"; break;
                case 4: methodName = "remove (beginning)"; break;
                case 5: methodName = "remove (end)"; break;
                default: methodName = ""; break;
            }

            System.out.printf("%-20s %-10d %-20.2f %-20.2f%n", methodName, TEST_SIZE, arrayListTimes[i], linkedListTimes[i]);
        }
    }
}