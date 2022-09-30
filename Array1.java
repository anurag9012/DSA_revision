package day1;

import java.util.Scanner;

public class Array1 {

    public static void main(String args[]) {

        // writing a code to check if array is sorted..

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }

        int l = a.length;

        boolean flag = true;

        for (int i = 1; i < l; i++) {
            if (a[i] < a[i - 1]) {
                flag = false;
                // System.out.println("false");
                break;
            } else {
                flag = true;
            }
        }

        if (flag == true) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }
    }

    /*
     * //without using a new array , i am reversing an array having new even number
     * of elements
     * System.out.println("before swapping:");
     * for (int i:a){
     * System.out.print(i+" ");
     * }
     * for (int i = 0; i < l / 2; i++) {
     * int t = 0;
     * t=a[i];
     * a[i]=a[l-1-i];
     * a[l-1-i]=t;
     * 
     * }
     * System.out.println("after  swapping:");
     * for (int i:a){
     * 
     * System.out.print(i+" ");
     * }
     */

}
