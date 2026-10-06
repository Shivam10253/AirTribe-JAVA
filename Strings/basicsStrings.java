package Strings;

import java.util.Scanner;

public class basicsStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // String name = "Shivam";
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // To print the element of String.
        // for (int i = 0; i < name.length(); i++) {
        //     System.out.println(name.charAt(i));
        // }

        // Substring - part of string
        // System.out.println(name.substring(1)); // (1 to n)
        // System.out.println(name.substring(1,5)); // (start:1 to end:n-1)
        // System.out.println(name.substring(1,name.length()));

        
        

        // System.out.println(name.length());
        // System.out.println(name);

        sc.close();
    }
}