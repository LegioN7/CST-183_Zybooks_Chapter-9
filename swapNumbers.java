/*
Complete the swap() method in LabProgram.java to exchange the values of the num field of two Number objects, num1 and num2.

Hint: Refer to the given Number class to see the definitions of num field and other methods available.

Ex: If num1 is 19 and num2 is 178, calling swap(num1, num2) will swap the values so that num1 becomes 178 and num2 becomes 19.
*/

import java.util.Scanner;

public class LabProgram {
   
   public static void swap(Number num1, Number num2) {
      int x = num1.getNum();
      num1.setNum(num2.getNum());
      num2.setNum(x);
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int int1;
      int int2;
      
      int1 = scnr.nextInt();
      int2 = scnr.nextInt();
      
      Number num1 = new Number(int1);
      Number num2 = new Number(int2);
      
      swap(num1, num2);
      System.out.println("num1 = " + num1.getNum() + ", num2 = " + num2.getNum());
   }
}
