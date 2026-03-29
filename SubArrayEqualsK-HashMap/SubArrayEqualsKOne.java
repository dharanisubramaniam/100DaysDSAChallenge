import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] nums={-1,-1,1};
		int k=0;
		HashMap<Integer,Integer> map= new HashMap<>();
		int prefixSum=0;
		int output=0;
		for(int i=0;i<nums.length;i++){
		     
		      map.put(nums[i],i);
		    
		    if(map.containsKey(k-prefixSum)){
		        int temp=k-prefixSum;
		        prefixSum=0;
		        output++; 
		    }
		   
		   prefixSum+=nums[i];
		    
		}
System.out.println("out:"+output);
	}
}
