/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.AssessmentWeek1;

/**
 *
 * @author nasim
 */
public class SummativeSums {

    public static void main(String[] args) {
        
        
        
        
        

        int myArray1[] = {4,5};
        int myArray2[] = {2, 1, 7, 4, 3};
        int myArray3[] = {4, 6, 5, 11, 3, 9};

        int outPutSumArray1=sumMyArray(myArray1);
        System.out.println("#1 Array1:  "+outPutSumArray1 );
        
        
        int outPutSumArray2 =sumMyArray(myArray2);
         System.out.println("#2 Array2:  "+outPutSumArray2 );
        
        int outPutSumArray3=sumMyArray(myArray3);
         System.out.println("#3 Array3:  " +outPutSumArray3 );
        
        

    }

    public static int sumMyArray(int[] inputArray) {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {

            System.out.print(inputArray[i]);
          
            sum = inputArray[i] + sum;
            

        }

        return sum;
    }

}
