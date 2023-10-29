/*
Write a program that reads a list of integers from input into an array and outputs "yes" if the list is sorted in ascending order between two provided positions. Otherwise, output "no".
The first input specifies the number of items in the list. 
The next set of inputs is the list. The last two inputs are the start and end positions (inclusive). 
Assume the list contains less than 20 integers and position 1 is the first element.

Ex: If the input is:
8 
5 6 7 4 3 2 1 0
1 3

the output is:
yes

Ex: If the input is:
6 
1 2 3 4 5 2
4 6

the output is:
no
*/

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];   // List of integers from input
      
      // My variables
      int arraySize;
      int i;
      String textOutput = "yes";
      
      // Starting Array
      int startArray;
      
      // Ending Array
      int endArray;
      
      arraySize = scnr.nextInt();
      
      for (i = 0; i < arraySize; i++ ) {
         userValues[i] = scnr.nextInt();
      }
      
      startArray = scnr.nextInt();
      endArray = scnr.nextInt();
      
      for (i = startArray; i < endArray - 1; i++) {
         if(userValues[i] > userValues[i + 1]) {
            textOutput = "no";
            break;
         }
      }
      
      System.out.println(textOutput);
   }
}
