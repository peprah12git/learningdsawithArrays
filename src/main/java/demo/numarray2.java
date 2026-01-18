package demo;

public class numarray2 {

    public  int findNumberOfEvenNumbers(int[] arr){
        int count =0;
        for (int i =0; i<arr.length; i++){

            String numStr = String.valueOf(arr[i]);
            if (numStr.length()%2==0){
                count++;
            }
        }
        return count;
    }
}
