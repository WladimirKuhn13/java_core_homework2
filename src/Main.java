//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = {1,0,2,6,8,3,6,77,0};
        // int[] array = new int[0]; //Пустой массив для проверки второго задания
        //System.out.println("Количество четных элементов в массиве: " + getCountEvenNumbers(array)); // Вывод результатов из первого задания
        //System.out.println("Разница между максимальным и минимальным элементами массива: " + getDifference(array)); // Вывод результатов из второго задания
        if (checkArrayForEmptyElements(array)) {
            System.out.println("В массиве присутствуют 2 соседних элемента, которые равны 0");
        } else System.out.println("Соседние элементы равные 0 отсутствуют"); // Вывод результатов из третьего задания


    }

    //Task1

    public static int getCountEvenNumbers(int[] array) {
        int countEvenNumbers = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0 && array[i] != 0) {
                countEvenNumbers++;
            }
        }

        return countEvenNumbers;
    }

    //Task2

    public static int getDifference(int[] array) {

        int max;
        int min;
        int difference = 0;

        if (array.length == 0) {
            throw new RuntimeException("Ошибка! Вы передали пустой массив");
        } else {
            max = array[0];
            min = array[0];
            for (int i = 0; i < array.length; i++) {
                if(array[i] > max) {
                    max = array[i];
                } else if (array[i] < min) {
                    min = array[i];
                }
            }
        }

        difference = max - min;


        return difference;
    }

    //Task3

    public static boolean checkArrayForEmptyElements(int[] array) {
        boolean result = false;

        for (int i = 1; i < array.length - 1; i++) {
            if ((array[i] == 0 && array[i - 1] == 0) || (array[i] == 0 && array[i + 1] == 0)) {
                result = true;
            }
        }
        return result;
    }
}
