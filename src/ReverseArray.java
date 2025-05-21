import java.util.Arrays;

class ReverseArray {
    public static void main(String[] args) {
        System.out.println("welcome to reverse array =");
        int[] numArr=arrayutility.inputArray();
        reverse(numArr);
        System.out.println("your reverse array is=");
        arrayutility.displayArray(numArr);
        System.out.println(Arrays.toString(numArr));
        //System.out.println{arrayutility.displayArray(numArr)};


    }

    public static  void reverse(int[] numArr){
        // approach== swap element of first half with second half so that there will be no need to form another array
        for(int i=0;i<numArr.length/2;i++){
            int swap=numArr[i];
            numArr[i]=numArr[numArr.length-1-i];
            numArr[numArr.length-1-i]=swap;
        }
        return ;
    }
}
