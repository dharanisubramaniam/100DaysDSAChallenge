import java.util.*;
import java.lang.*;
import java.io.*;

class Sorting
{
    public static void main(String[] args) throws java.lang.Exception
    {
        //selection sorting an array in ascending order
        int[] array = {3,9,1,45,37,90,2};
        // 1 -> 1,5,4,2,8
        //2-> 1,2,4,5,8
        
        //logic
        //take the first element and compare it with the other elements
        //if the element is greater than the other swap it 
        int temp=0;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        
        
        //bubble sort
        //comparing the first element to adjacent elements until the largest is at the end
        //the largest bubbles up to end after first pass
       
        int temp=0;
       for(int i=0;i<array.length-1;i++){
         for(int j=0;j<(array.length-i-1);j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
                System.out.println("Sorted array inside:"+Arrays.toString(array));
            }
            System.out.println("Sorted array:"+Arrays.toString(array));
        }
        
       

    }
}