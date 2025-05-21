import java.util.Arrays;
import java.util.Scanner;

class DeleteFromArray {
    public static void main(String[] args) {
        System.out.println("enter to deletion in array=");
        int[] numArray = arrayutility.inputArray();
        Scanner input = new Scanner(System.in);
        int numToDelete = input.nextInt();
        int[] newArray = deleteNumber(numArray, numToDelete);
        System.out.println("here is your new Array");
        //arrayutility.displayArray(newArray);
        System.out.println(Arrays.toString(newArray));

    }


    public static int[] deleteNumber(int[] numArray, int numToDelete) {
        int occ = occurrencesArray.noOfOccurence(numArray, numToDelete);
        if (occ == 0) {
            return numArray;
        }
        int newSize = numArray.length - occ;
        int[] newArray = new int[newSize];
        int i = 0, j = 0;
        while (i < numArray.length) {
          //  while (j < newArray.length) {
                if (numArray[i] != numToDelete) {
                    int  num =numArray[i];
                   int i1 = j++;
                   // int[j] newArray=num;



                }
                i++;
            }
            return newArray;
        }
        //return newArray;
    }

