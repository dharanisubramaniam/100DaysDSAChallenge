import java.util.*;
import java.lang.*;
import java.io.*;

class MoveZeroes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] nums={0,1,0,3,12};
		
		int j=0;
		for(int i=0;i<nums.length;i++){
		    if(nums[i]!=0){
		        nums[j]=nums[i];
		        j++;
		    }
		}
		while(j<nums.length){
		    nums[j]=0;
		    j++;
		}
System.out.println("out"+Arrays.toString(nums));
	}
}
