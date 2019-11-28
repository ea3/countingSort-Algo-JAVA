package dev.ea3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int [] intArray = {2,5,9,8,2,8,7,10,4,3};

        System.out.println("Unsorted Array: "+ Arrays.toString(intArray));

        countingSort(intArray, 1, 10);
        System.out.println("Sorted Array: " + Arrays.toString(intArray));
    }

    public static void countingSort(int [] input, int min, int max){

        int [] countArray = new int[(max - min) + 1];


        for (int i = 0; i < input.length; i++){
//            countArray[input[i] - min]++;
            countArray[input[i] - min] =  countArray[input[i] - min] + 1;
           System.out.println(Arrays.toString(countArray));
        }

        int j = 0;
        for(int i = min; i <= max; i++){
            while(countArray[i - min] > 0){
                input[j++] = i;
                countArray[i - min]--;
            }
        }

    }
}
