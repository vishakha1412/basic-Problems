class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("welcome to program");
        int[] numArray=arrayutility.inputArray();
        System.out.println(numArray);
        int min=min(numArray);
        //int max=max(numArray);
        System.out.println("min = "+ min);
        System.out.println("min = "+ min);
    }
    public static int min(int[]numArray){
        int min = Integer.MAX_VALUE;
        int i=0;
        while(i<numArray.length){
            if(min>numArray[i]){
                min=numArray[i];
            }
            i++;
        }
        return min;

  // public static int max(int[]numArray){

       // }



    }
}
