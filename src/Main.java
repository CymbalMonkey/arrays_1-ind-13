import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        int[] arr3 = new int[5];
        arr3[0] = 4;
        arr3[1] = 5;
        arr3[2] = 6;
        arr3[3] = 7;
        arr3[4] = 8;
    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] arr1 = new int[3];
        for (int index = 0; index < arr1.length; index++) {
            arr1[index] = index + 1;
            if (index == arr1.length - 1) {
                System.out.println(arr1[index]);
                break;
            }
            System.out.print(arr1[index] + ", ");
        }

        double[] arr2 = {1.57, 7.654, 9.986};
        for (int index = 0; index < arr1.length; index++) {
            if (index == arr2.length - 1) {
                System.out.println(arr2[index]);
                break;
            }
            System.out.print(arr2[index] + ", ");
        }

        int[] arr3 = new int[5];
        arr3[0] = 4;
        arr3[1] = 5;
        arr3[2] = 6;
        arr3[3] = 7;
        arr3[4] = 8;
        for (int index = 0; index < arr3.length; index++) {
            if (index == arr3.length - 1) {
                System.out.println(arr3[index]);
                break;
            }
            System.out.print(arr3[index] + ", ");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");

        int[] arr1 = new int[3];
        for (int index = arr1.length - 1; index >= 0; index--) {
            arr1[index] = index + 1;
            if (index == 0) {
                System.out.println(arr1[index]);
                break;
            }
            System.out.print(arr1[index] + ", ");
        }

        double[] arr2 = {1.57, 7.654, 9.986};
        for (int index = arr2.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arr2[index]);
                break;
            }
            System.out.print(arr2[index] + ", ");
        }

        int[] arr3 = new int[5];
        arr3[0] = 4;
        arr3[1] = 5;
        arr3[2] = 6;
        arr3[3] = 7;
        arr3[4] = 8;
        for (int index = arr3.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arr3[index]);
                break;
            }
            System.out.print(arr3[index] + ", ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int[] arr1 = {1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] = arr1[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}