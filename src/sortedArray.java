class sortedArray {
    public static void main(String[] args) {
        System.out.println("program to check whether array is sortef or not");
        int[] Array=arrayutility.inputArray();
        boolean isDec=isDecreasing(Array);
        boolean isInc=isIncreasing(Array);
        if(isDec||isInc){
            System.out.println("\"array is sorted \"");
        }else{
            System.out.println("\"array is not sorted\"");
        }

    }
    public static boolean isIncreasing(int[] Array){
        for(int i=1;i<Array.length-1;i++){
            if(Array[i]<Array[i-1]){
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int[] Array){
        for(int i=1;i<Array.length-1;i++){
            if(Array[i]>Array[i-1]){
                return false;
            }
        }
        return true;
    }
}