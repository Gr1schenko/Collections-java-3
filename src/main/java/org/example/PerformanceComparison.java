package org.example;

import java.util.List;

/**
 * Класс для сравнения производительности различных операций над списками
 * @author Yuliya Grischenko
 * @version 1.0-SNAPSHOT
 * @param <T> тип элементов, которые будут храниться в списке
 */

public class PerformanceComparison<T> {

    private static final int TEST_SIZE = 1500;

    /**
     * Метод измерения времени добавления элементов в конец списка
     * @param list список, в который осуществляется добавление элементов
     * @return время в миллисекундах, затраченное на добавление элементов
     */
    public double timeAddAtEnd(List<T> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < TEST_SIZE; i++) {
            list.add((T) Integer.valueOf(i));
        }
        return (System.nanoTime() - startTime)/1_000_000.0;
    }

    /**
     * Метод измерения времени добавления элементов в начало списка
     * @param list список, в который осуществляется добавление элементов
     * @return время в миллисекундах, затраченное на добавление элементов
     */
    public double timeAddAtBeginning(List<T> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < TEST_SIZE; i++) {
            list.add(0, (T) Integer.valueOf(i));
        }
        return (System.nanoTime() - startTime)/1_000_000.0;
    }

    /**
     * Метод измерения времени доступа к элементам списка по индексу
     * @param list список, из которого будут получены элементы
     * @return время в миллисекундах, затраченное на доступ к элементам
     */
   public double timeGet(List<T> list) {
        T k;
        long startTime = System.nanoTime();
        for (int i = 0; i < TEST_SIZE; i++) {
            k = list.get(i);
        }
       return (System.nanoTime() - startTime)/1_000_000.0;
   }

    /**
     * Метод измерения времени получения размера списка
     * @param list список, размер которого измеряется
     * @return время в миллисекундах, затраченное на получение размера
     */
    public double timeSize(List<T> list) {
        int n;
        long startTime = System.nanoTime();
        for (int i = 0; i < TEST_SIZE; i++) {
           n = list.size();
        }
        return (System.nanoTime() - startTime)/1_000_000.0;
    }

    /**
     * Метод измерения времени удаления элементов из начала списка
     * @param list список, в котором осуществляется удаление элементов
     * @return время в миллисекундах, затраченное на удаление элементов
     */
    public double timeRemoveFromBeginning(List<T> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < TEST_SIZE; i++) {
            list.remove(0);
        }
        return (System.nanoTime() - startTime)/1_000_000.0;
    }

    /**
     * Метод измерения времени удаления элементов из конца списка
     * @param list список, в котором осуществляется удаление элементов
     * @return время в миллисекундах, затраченное на удаление элементов
     */
    public double timeRemoveFromEnd(List<T> list) {
        long startTime = System.nanoTime();
        for (int i = TEST_SIZE - 1; i >= 0; i--) {
            list.remove(i);
        }
        return (System.nanoTime() - startTime)/1_000_000.0;
    }

    /**
     * Метод получения времени выполнения операций над списком
     * @param list список, измерить время выполнения операций которого необходимо
     * @return массив времени в миллисекундах
     */
    public double[] getTimes(List<T> list) {
        double[] times = new double[9];

        times[0] = timeAddAtEnd(list);
        times[1] = timeAddAtBeginning(list);
        times[2] = timeGet(list);
        times[3] = timeSize(list);
        times[4] = timeRemoveFromBeginning(list);
        times[5] = timeRemoveFromEnd(list);

        return times;
    }
}
