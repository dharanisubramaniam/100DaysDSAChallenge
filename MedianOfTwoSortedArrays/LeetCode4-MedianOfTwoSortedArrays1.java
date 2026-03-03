import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int[] nums1 = {1,2};
	int[] nums2 = {3,4};
	int[] output = new int[nums1.length+nums2.length];
	int i=0;
	int j=0;
	int k=0;
	
	
	while(i<nums1.length && j<nums2.length){
	    if(nums1[i]<nums2[j]){
	        output[k]=nums1[i];
	         i++;
	    }else{
	        output[k]=nums2[j];
	         if(j<nums2.length){
	              j++;
	         }
	      // System.out.println("sum:"+sum);
	    }
	    	k++;
	    
	}
	while(k<output.length){
	    if(i<nums1.length){
	        output[k++]=nums1[i];
	        i++;
	    }
	    if(j<nums2.length){
	        output[k++]=nums2[j];
	        j++;
	    }
	}
	
	double median;
int n = output.length;

if (n % 2 != 0) {
    median = output[n / 2];
} else {
    median = (output[n / 2] + output[(n / 2) - 1]) / 2.0;
}
System.out.println("Median:"+median);
 
	}
}
