// package conditionalStatements;

import java.util.*;
public class checkEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENter the number to check the number is even or odd:");
        int number=sc.nextInt();
        if (number%2==0){
            System.out.println("Even number?");
        }
        else{
            System.out.println("Odd number!");
        }
    }
    
}

