
import java.util.*;
import java.lang.*;
import java.io.*;

class MoveZeroes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] nums={0,1,0,3,12};
		
		int j=0;
		int i=0;
	while(i<nums.length && j<nums.length){
	    System.out.println("i"+i);
	    System.out.println("j"+j);
		   if(nums[i]==0){
		       i++;
		   }else if(nums[i]>0 || nums[i]<0){
		       int temp=nums[j];
		       nums[j]=nums[i];
		       nums[i]=temp;
		       j++;
			   i++;
		   }
		}
System.out.println("out"+Arrays.toString(nums));
	}
}
