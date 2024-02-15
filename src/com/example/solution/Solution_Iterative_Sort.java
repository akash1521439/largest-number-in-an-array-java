package com.example.solution;
//By sorting
public class Solution_Iterative_Sort {
    static int largestNumber(int[] numbers){
        int length = numbers.length;
        int key = numbers[0];
        for(int i=0;i<length;i++){
            for(int j = i+1;j<length;j++){
                if(numbers[j]>key){
                    numbers[i] = numbers[j];
                    key = numbers[j];
                }
            }
        }
        return numbers[length-1];
    }
    public static void main(String[] args){
        int[] arr = {4,8,32,9,21,2,19};
        int largest = Solution_Stream.largestNumber(arr);
        System.out.println("Largest number in the array: "+largest);
    }
}
