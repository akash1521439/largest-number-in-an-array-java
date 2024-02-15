package com.example.solution;

import java.util.Arrays;
//Largest Element in Array using Java Stream
public class Solution_Stream {
    static int largestNumber(int[] numbers){
        return Arrays.stream(numbers).max().getAsInt();
    }
    public static void main(String[] args){
        int[] arr = {4,8,1,9,21,2,19};
        int largest = Solution_Stream.largestNumber(arr);
        System.out.println("Largest number in the array: "+largest);
    }
}
