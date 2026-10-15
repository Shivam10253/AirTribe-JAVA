package MathsProblems;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        // System.out.println(Integer.MIN_VALUE); // In java, that's how Smallest Integer value you can get
        // System.out.println(Integer.MAX_VALUE); // In java, that's how Largest Integer value you can get

        // int min = Integer.MAX_VALUE;
        int min = num % 10;
        num = num / 10;

        while (num > 0) {

            int digit = num % 10; 

            if (digit < min) {
                min = digit;
            }

            num = num / 10;
        }

        System.out.println("The Smallest number is: " + min);


        sc.close();
    }
}
