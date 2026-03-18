import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr={1,-1,0,2,-2};
		int k=0;
		
		HashMap<Integer,Integer> map=new HashMap<>();
		//Set<List<Integer>> finalList = new LinkedHashSet<>();
		//int j=0;
		int prefixSum=0;
		int currSum=0;
		int count=0;
		
		for(int i=0;i<arr.length;i++){
		    currSum=map.getOrDefault(i,prefixSum)+arr[i];
		    if(currSum==k){
		        count++;
		    }
		    prefixSum=prefixSum+arr[i];
		    map.put(i,prefixSum);
		}
         System.out.println("output:"+count);

	}
}
