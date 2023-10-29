/*
Write a program that reads a list of integers from input into an array and modifies the array by shifting each element to the right one position and by shifting the last element to the first position.
The input begins with an integer indicating the number of values that follow.
Output the modified array and end with a newline.

Ex: If the input is:
6 
2 4 6 8 10 12

the output is:
12 2 4 6 8 10 

For coding simplicity, follow every output value by a space, including the last one.
*/

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];   // List of integers from input

      int arraySize;
      int i;
      int endArray;
      
      arraySize = scnr.nextInt();
      
      for (i = 0; i < arraySize; i++){
         userValues[i] = scnr.nextInt();
      }
      
      endArray = userValues[arraySize - 1];
      for (i = arraySize - 1; i > 0; i--){
         userValues[i] = userValues[i - 1];
      }
      
      userValues[0] = endArray;
      
      for (i = 0; i < arraySize; i++) {
         System.out.print(userValues[i] + " ");
      }
      System.out.println();
   }
}
