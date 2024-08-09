package ua.whydie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(array);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Target: ");
        int target = scanner.nextInt();

        int index = binarySearch(array, target);
        if (index != -1) {
            System.out.println("Index: " + index);
        } else {
            System.out.println("Not found");
        }
    }

    private static void printArray(int[] array) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d%s", array[i], (i < array.length - 1) ? ", " : "");
        }
        System.out.println();
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
