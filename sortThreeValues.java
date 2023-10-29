/*

Write a method ascend3() with an array of integers of size three as the parameter, that sorts the values of the array into ascending order. Ex: If the array contains [5, 2, 7], after the call ascend3(int[] vals), the array will now hold [2, 5, 7].

Hints:

Return type should be void.

One approach puts the three values into an array, then sorts the array. We won't be describing that approach here. Instead, we'll use branches.

One solution approach realizes that only 6 possible orderings of xyz exist: xyz, xzy, yxz, yzx, zxy, zyx. An if-else can be used to detect which order x, y, z are initially in.

Once detected, three variables lowVal, midVal, and highVal can be assigned. Note: Don't assign the parameter right away, because you'll overwrite a value that is still needed.

After the if-else, those lowVal, midVal, and highVal variables are ready. So just set the vals[0] with lowVal, vals[1] with midVal, and vals[2] with highVal.

Be aware that two values could be equal. So use <= rather than < in your comparisons.

*/

import java.util.Scanner;

public class LabProgram {

    public static void ascend3(int[] arrVals){
        int lowVal, midVal, highVal;

        if(arrVals[0] <= arrVals[1] && arrVals[0] <= arrVals[2]) {
            lowVal = arrVals[0];
            if (arrVals[1] <= arrVals[2]) {
                midVal = arrVals[1];
                highVal = arrVals[2];
            } else {
                midVal = arrVals[2];
                highVal = arrVals[1];
            }

        } else if(arrVals[1] <= arrVals[0] && arrVals[1] <= arrVals[2]) {
            lowVal = arrVals[1];
            if (arrVals[0] <= arrVals[2]) {
                midVal = arrVals[0];
                highVal = arrVals[2];
            } else {
                midVal = arrVals[2];
                highVal = arrVals[0];
            }
        } else {
            lowVal = arrVals[2];
            if (arrVals[0] <= arrVals[1]) {
                midVal = arrVals[0];
                highVal = arrVals[1];
            } else {
                midVal = arrVals[1];
                highVal = arrVals[0];
            }
        }
        arrVals[0] = lowVal;
        arrVals[1] = midVal;
        arrVals[2] = highVal;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] arrVals = new int[3];

        arrVals[0] = scnr.nextInt(); // x
        arrVals[1] = scnr.nextInt(); // y
        arrVals[2] = scnr.nextInt(); // z

        ascend3(arrVals);

        System.out.println(arrVals[0] + " " + arrVals[1] + " " + arrVals[2]);
    }
}

