class MaxArray { public static void main(String[] args) {
    System.out.println("welcome to program");
    int[] numArray=arrayutility.inputArray();
    System.out.println(numArray);
    int max=max(numArray);
    //int max=max(numArray);
    System.out.println("max = "+ max);
    System.out.println(" = "+ max);
}
    public static int max(int[]numArray){
        int max = Integer.MIN_VALUE;
        int i=0;
        while(i<numArray.length){
            if(max<numArray[i]){
                max=numArray[i];
            }
            i++;
        }
        return max;

        // public static int max(int[]numArray){

        // }



    }
}


