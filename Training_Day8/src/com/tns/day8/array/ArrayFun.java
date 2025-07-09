package com.tns.day8.array;
class ArrayFu {

    // Print array elements
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print newline after the whole array
    }

    // Get sum of elements
    public static int getSum(int... n) {
        int sum = 0;
        for (int no : n)
            sum += no;
        return sum;
    }

    // Count odd numbers
    public static int getOddCount(int[] b) {
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 != 0)
                count++;
        }
        return count;
    }
}

public class ArrayFun {
    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];  // Declaration + instantiation

        // Assigning values
        for (int i = 0; i < a.length; i++) {
            a[i] = 5 * i;
        }

        // Displaying the array
        System.out.print("Array a: ");
        ArrayFu.printArray(a);

        System.out.println();

        int[] b = {10, 20, 30, 40, 50};
        System.out.print("Array b: ");
        ArrayFu.printArray(b);

        System.out.println("Sum of elements in array a: " + ArrayFu.getSum(a));
        System.out.println("Sum of elements in array b: " + ArrayFu.getSum(b));
        System.out.println("Odd count in array b: " + ArrayFu.getOddCount(b));
    }
}