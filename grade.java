package miniproject;

import java.util.Scanner;
public class switchcasechallange {
    public static void main(String[] args) {
        int input=0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a grade");
            char grade = sc.next().charAt(0);
            switch (grade) {
                case 'A':
                    System.out.println("EXCELLENT");
                    break;
                case 'B':
                    System.out.println("AMAZING");
                    break;
                case 'C':
                    System.out.println("WELLDONE");
                    break;
                case 'D':
                    System.out.println("you can do better next time");
                    break;
                default:
                    System.out.println("invalid grade entered");
            }
            System.out.println("want to continue press 1");
            input=sc.nextInt();
        }while(input==1);
    }
}
