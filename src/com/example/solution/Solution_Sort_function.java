package com.example.solution;

import java.util.Arrays;
//Pre Defined Function
public class Solution_Sort_function {

    static int largestNumber(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length -1 ];
    }
    public static void main(String[] args){
        int[] arr = {4,8,32,9,21,2,19,3};
        int largest = Solution_Sort_function.largestNumber(arr);
        System.out.println("Largest number in the array: "+largest);
    }
}
