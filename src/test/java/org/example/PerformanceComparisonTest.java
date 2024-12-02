package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceComparisonTest {
    private static final int TEST_SIZE = 1500;

    @Test
    public void testAddAtEndInt() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        PerformanceComparison<Integer> performanceComparison = new PerformanceComparison<>();

        double arrayTime = performanceComparison.timeAddAtEnd(arrayList);
        double linkedTime = performanceComparison.timeAddAtEnd(linkedList);

        //Время выполнения должно быть примерно одинаковым, т.к. сложность +- одинаковая
        assertTrue(Math.abs(arrayTime - linkedTime) < 1);
    }

    @Test
    public void testAddAtEndDouble() {
        List<Double> arrayList = new ArrayList<>();
        List<Double> linkedList = new LinkedList<>();

        PerformanceComparison<Double> performanceComparison = new PerformanceComparison<>();

        double arrayTime = performanceComparison.timeAddAtEnd(arrayList);
        double linkedTime = performanceComparison.timeAddAtEnd(linkedList);

        //Время выполнения должно быть примерно одинаковым, т.к. сложность +- одинаковая
        assertTrue(Math.abs(arrayTime - linkedTime) < 1);
    }

    @Test
    public void testAddAtEndString() {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        PerformanceComparison<String> performanceComparison = new PerformanceComparison<>();

        double arrayTime = performanceComparison.timeAddAtEnd(arrayList);
        double linkedTime = performanceComparison.timeAddAtEnd(linkedList);

        //Время выполнения должно быть примерно одинаковым, т.к. сложность +- одинаковая
        assertTrue(Math.abs(arrayTime - linkedTime) < 1);
    }

    @Test
    public void testAddAtBeginningInt() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        PerformanceComparison<Integer> performanceComparison = new PerformanceComparison<>();

        double arrayTime = performanceComparison.timeAddAtBeginning(arrayList);
        double linkedTime = performanceComparison.timeAddAtBeginning(linkedList);

        //Время выполнения LinkedList должно быть меньше, чем ArrayList,
        //т.к. сложность LinkedList всегда O(1),
        //а ArrayList в наихудшем случае O(n) из-за сдвига все элементов
        assertTrue(arrayTime / linkedTime > 1);
    }

    @Test
    public void testAddAtBeginningDouble() {
        List<Double> arrayList = new ArrayList<>();
        List<Double> linkedList = new LinkedList<>();

        PerformanceComparison<Double> performanceComparison = new PerformanceComparison<>();

        double arrayTime = performanceComparison.timeAddAtBeginning(arrayList);
        double linkedTime = performanceComparison.timeAddAtBeginning(linkedList);

        //Время выполнения LinkedList должно быть меньше, чем ArrayList,
        //т.к. сложность LinkedList всегда O(1),
        //а ArrayList в наихудшем случае O(n) из-за сдвига все элементов
        assertTrue(arrayTime / linkedTime > 1);
    }

    @Test
    public void testAddAtBeginningString() {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        PerformanceComparison<String> performanceComparison = new PerformanceComparison<>();

        double arrayTime = performanceComparison.timeAddAtBeginning(arrayList);
        double linkedTime = performanceComparison.timeAddAtBeginning(linkedList);

        //Время выполнения LinkedList должно быть меньше, чем ArrayList,
        //т.к. сложность LinkedList всегда O(1),
        //а ArrayList в наихудшем случае O(n) из-за сдвига все элементов
        assertTrue(arrayTime / linkedTime > 1);
    }


    @Test
    public void testGetInt() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        PerformanceComparison<Integer> performanceComparison = new PerformanceComparison<>();

        for (int i = 0; i < TEST_SIZE; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        double arrayTime = performanceComparison.timeGet(arrayList);
        double linkedTime = performanceComparison.timeGet(linkedList);

        //Время выполнения ArrayList должно быть меньше, чем LinkedList,
        //т.к. сложность ArrayList всегда O(1) (обращаемся к индексу),
        //а LinkedList O(n) в наихудшем и среднем случае, т.к. необходим проход по элементам
        assertTrue(arrayTime / linkedTime < 1);
    }

    @Test
    public void testGetDouble() {
        List<Double> arrayList = new ArrayList<>();
        List<Double> linkedList = new LinkedList<>();

        PerformanceComparison<Double> performanceComparison = new PerformanceComparison<>();

        for (int i = 0; i < TEST_SIZE; i++) {
            arrayList.add((double) i);
            linkedList.add((double) i);
        }

        double arrayTime = performanceComparison.timeGet(arrayList);
        double linkedTime = performanceComparison.timeGet(linkedList);

        //Время выполнения ArrayList должно быть меньше, чем LinkedList,
        //т.к. сложность ArrayList всегда O(1) (обращаемся к индексу),
        //а LinkedList O(n) в наихудшем и среднем случае, т.к. необходим проход по элементам
        assertTrue(arrayTime / linkedTime < 1);
    }

    @Test
    public void testGetString() {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        PerformanceComparison<String> performanceComparison = new PerformanceComparison<>();

        for (int i = 0; i < TEST_SIZE; i++) {
            arrayList.add("String " + i);
            linkedList.add("String " + i);
        }

        double arrayTime = performanceComparison.timeGet(arrayList);
        double linkedTime = performanceComparison.timeGet(linkedList);

        //Время выполнения ArrayList должно быть меньше, чем LinkedList,
        //т.к. сложность ArrayList всегда O(1) (обращаемся к индексу),
        //а LinkedList O(n) в наихудшем и среднем случае, т.к. необходим проход по элементам
        assertTrue(arrayTime / linkedTime < 1);
    }

    @Test
    public void testSizeInt() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        PerformanceComparison<Integer> performanceComparison = new PerformanceComparison<>();

        for (int i = 0; i < TEST_SIZE; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        double arrayTime = performanceComparison.timeSize(arrayList);
        double linkedTime = performanceComparison.timeSize(linkedList);

        //Время выполнения должно быть примерно одинаковым, т.к. в обоих случаях размер хранится в отдельной переменной
        assertTrue(Math.abs(arrayTime - linkedTime) < 1);
    }

    @Test
    public void testSizeDouble() {
        List<Double> arrayList = new ArrayList<>();
        List<Double> linkedList = new LinkedList<>();

        PerformanceComparison<Double> performanceComparison = new PerformanceComparison<>();

        for (int i = 0; i < TEST_SIZE; i++) {
            arrayList.add((double) i);
            linkedList.add((double) i);
        }

        double arrayTime = performanceComparison.timeSize(arrayList);
        double linkedTime = performanceComparison.timeSize(linkedList);

        //Время выполнения должно быть примерно одинаковым, т.к. в обоих случаях размер хранится в отдельной переменной
        assertTrue(Math.abs(arrayTime - linkedTime) < 1);
    }

    @Test
    public void testSizeString() {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        PerformanceComparison<String> performanceComparison = new PerformanceComparison<>();

        for (int i = 0; i < TEST_SIZE; i++) {
            arrayList.add("String " + i);
            linkedList.add("String " + i);
        }

        double arrayTime = performanceComparison.timeSize(arrayList);
        double linkedTime = performanceComparison.timeSize(linkedList);

        //Время выполнения должно быть примерно одинаковым, т.к. в обоих случаях размер хранится в отдельной переменной
        assertTrue(Math.abs(arrayTime - linkedTime) < 1);
    }

    @Test
    public void testRemoveFromBeginningInt() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        PerformanceComparison<Integer> performanceComparison = new PerformanceComparison<>();

        for (int i = 0; i < TEST_SIZE; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        double arrayTime = performanceComparison.timeRemoveFromBeginning(arrayList);
        double linkedTime = performanceComparison.timeRemoveFromBeginning(linkedList);

        //Время выполнения LinkedList должно быть меньше, чем ArrayList,
        //т.к. сложность LinkedList всегда O(1) (просто перенаправить узлы),
        //а ArrayList O(n) в наихудшем и среднем случае, т.к. необходим свдиг элементов
        assertTrue(arrayTime / linkedTime > 1);
    }

    @Test
    public void testRemoveFromBeginningDouble() {
        List<Double> arrayList = new ArrayList<>();
        List<Double> linkedList = new LinkedList<>();

        PerformanceComparison<Double> performanceComparison = new PerformanceComparison<>();

        for (int i = 0; i < TEST_SIZE; i++) {
            arrayList.add((double) i);
            linkedList.add((double) i);
        }

        double arrayTime = performanceComparison.timeRemoveFromBeginning(arrayList);
        double linkedTime = performanceComparison.timeRemoveFromBeginning(linkedList);

        //Время выполнения LinkedList должно быть меньше, чем ArrayList,
        //т.к. сложность LinkedList всегда O(1) (просто перенаправить узлы),
        //а ArrayList O(n) в наихудшем и среднем случае, т.к. необходим свдиг элементов
        assertTrue(arrayTime / linkedTime > 1);
    }

    @Test
    public void testRemoveFromBeginningString() {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        PerformanceComparison<String> performanceComparison = new PerformanceComparison<>();

        for (int i = 0; i < TEST_SIZE; i++) {
            arrayList.add("String " + i);
            linkedList.add("String " + i);
        }

        double arrayTime = performanceComparison.timeRemoveFromBeginning(arrayList);
        double linkedTime = performanceComparison.timeRemoveFromBeginning(linkedList);

        //Время выполнения LinkedList должно быть меньше, чем ArrayList,
        //т.к. сложность LinkedList всегда O(1) (просто перенаправить узлы),
        //а ArrayList O(n) в наихудшем и среднем случае, т.к. необходим свдиг элементов
        assertTrue(arrayTime / linkedTime > 1);
    }

    @Test
    public void testRemoveFromEndInt() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        PerformanceComparison<Integer> performanceComparison = new PerformanceComparison<>();

        for (int i = 0; i < TEST_SIZE; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        double arrayTime = performanceComparison.timeRemoveFromEnd(arrayList);
        double linkedTime = performanceComparison.timeRemoveFromEnd(linkedList);

        //Время выполнения должно быть примерно одинаковым, т.к. сложность +- одинаковая
        assertTrue(Math.abs(arrayTime - linkedTime) < 1);
    }

    @Test
    public void testRemoveFromEndDouble() {
        List<Double> arrayList = new ArrayList<>();
        List<Double> linkedList = new LinkedList<>();

        PerformanceComparison<Double> performanceComparison = new PerformanceComparison<>();

        for (int i = 0; i < TEST_SIZE; i++) {
            arrayList.add((double) i);
            linkedList.add((double) i);
        }

        double arrayTime = performanceComparison.timeRemoveFromEnd(arrayList);
        double linkedTime = performanceComparison.timeRemoveFromEnd(linkedList);

        //Время выполнения должно быть примерно одинаковым, т.к. сложность +- одинаковая
        assertTrue(Math.abs(arrayTime - linkedTime) < 1);
    }

    @Test
    public void testRemoveFromEndString() {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        PerformanceComparison<String> performanceComparison = new PerformanceComparison<>();

        for (int i = 0; i < TEST_SIZE; i++) {
            arrayList.add("String " + i);
            linkedList.add("String " + i);
        }

        double arrayTime = performanceComparison.timeRemoveFromEnd(arrayList);
        double linkedTime = performanceComparison.timeRemoveFromEnd(linkedList);

        //Время выполнения должно быть примерно одинаковым, т.к. сложность +- одинаковая
        assertTrue(Math.abs(arrayTime - linkedTime) < 1);
    }
}
