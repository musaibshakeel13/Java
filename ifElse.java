package miniproject;

import java.util.Scanner;
public class ChallengeIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if(age>=21){
            System.out.println("you are eligible Because you are "+age+" years old");
        }else{
            System.out.println("you are ineligible Because you are "+age+" years old");
        }
    }
}
