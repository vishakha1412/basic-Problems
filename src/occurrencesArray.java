import java.util.Scanner;

class occurrencesArray {
    public static void main(String[] args) {
        System.out.println("welcome in  occurences array");
        Scanner input =new Scanner(System.in);
        System.out.println("enter the number you want to search");
        int num=input.nextInt();
        int[] numArray=arrayutility.inputArray();
        int noOfOccurence=noOfOccurence(numArray,num);
        System.out.println("number of times number occur in array " + noOfOccurence);
    }


    public static int noOfOccurence(int[] numArray,int num){
        int i=0;
        int occ=0;
        while(i<numArray.length){
            if(numArray[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
