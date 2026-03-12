import java.util.*;
import java.lang.*;
import java.io.*;

class CountingOccurencesInAnArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    int[] arr = {12,100,3,1,4,12,17,91,12,50,50,50,50,50};
        int target= 50;
        int out=0;
        
        //using normal loop
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                out++;
            }
        }
        
        System.out.println("Finding occurence using normal loop:"+out);


		 //using binary serach
        int size=arr.length-1;
        int start=0;
        int end=size;
        int mid=0;
        int count=0;
        Arrays.sort(arr);
        int right=0;
        int left=0;
       
        
        while(start<=end){
             mid=(start+(end-start))/2;
            if(arr[mid]==target){
                count++;
                right=mid;
                left=mid;
                while((right<end)&&(arr[right+1]==target)){
                    count++;
                    right++;
                }
                while((left>start)&&(arr[left-1]==target)){
                    count++;
                    left--;
                }
                break;
            }else if(target<arr[mid] ){
                end=mid-1;
            }else if(target > arr[mid]){
                start=mid+1;
            }
       
	}
}
}
