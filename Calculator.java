import java.util.Scanner;

public class CalculatorJAVA {
    public static void main(String[] args) {
        int input=0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 for ADDITION");
            System.out.println("Press 2 for SUBTRACTION");
            System.out.println("Press 3 for MULTIPLICATION");
            System.out.println("Press 4 for DIVIDE");
            System.out.println("---------------------------");
            System.out.println("Enter your Choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter the first number");
                    float num1 = sc.nextFloat();
                    System.out.println("Enter the second number");
                    float num2 = sc.nextFloat();
                    float num3 = num1 + num2;
                    System.out.println("The ADDITION of two numbers is " + num3);
                    break;
                }
                case 2: {
                    System.out.println("Enter the first number");
                    float num1 = sc.nextFloat();
                    System.out.println("Enter the second number");
                    float num2 = sc.nextFloat();
                    float num3 = num1 - num2;
                    System.out.println("The SUBTRACTION of two numbers is " + num3);
                    break;
                }
                case 3: {
                    System.out.println("Enter the first number");
                    float num1 = sc.nextFloat();
                    System.out.println("Enter the second number");
                    float num2 = sc.nextFloat();
                    float num3 = num1 * num2;
                    System.out.println("The MULTIPLICATION of two numbers is " + num3);
                    break;
                }
                case 4: {
                    System.out.println("Enter the first number");
                    float num1 = sc.nextFloat();
                    System.out.println("Enter the second number");
                    float num2 = sc.nextFloat();
                    float num3 = num1 / num2;
                    System.out.println("The DIVIDE of two numbers is " + num3);
                    break;
                }
                default: {
                    System.out.println("INVALID CHOICE!!!!");
                }
            }
                System.out.println("press 1 for continue");
                input = sc.nextInt();

        }while (input == 1) ;




    }
}
