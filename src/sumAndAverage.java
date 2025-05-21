class sumAndAverage {
    public static void main(String[] args) {
        System.out.println("welcome to array sum and average ");
        int[] numArray=arrayutility.inputArray();
        long sum =sum(numArray);
      //  double avg = average(numArray);
        System.out.println("sum = "+ sum);
        double average=average(numArray);
        System.out.println("averag = " +average );
    }
    public static long sum(int[] numArray) {
        long sum=0;
        int i=0;
        while(i<numArray.length){
            sum=sum+numArray[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] numArray){
        double sum=sum(numArray);
         double avg=sum/numArray.length;
        return avg;
    }
}
