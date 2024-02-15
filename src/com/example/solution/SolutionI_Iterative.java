package com.example.solution;
//Iterative Method (Brute Force Method)
public class SolutionI_Iterative {
    static int largestNumber(int[] numbers){
        int length = numbers.length;
        int largestNum = numbers[0];
        for(int i=1; i<length; i++){
            if(numbers[i]>largestNum){
                largestNum = numbers[i];
            }
        }
        return largestNum;
    }
    public static void main(String[] args){
        int[] arr = {4,8,1,9,21,2,19};
        int largestNum = SolutionI_Iterative.largestNumber(arr);
        System.out.println("Largest number in the array: "+largestNum);
    }
}
