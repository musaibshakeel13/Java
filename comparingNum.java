// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class numComparing {
   public numComparing() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter First number:");
      int var2 = var1.nextInt();
      System.out.println("Enter second number:");
      int var3 = var1.nextInt();
      if (var2 == var3) {
         System.out.println("Numbers are equal");
      } else if (var2 > var3) {
         System.out.println("Num1 is greater");
      } else {
         System.out.println("Num2 is greater");
      }

   }
}

