import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseInteger
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	  if(x==0){return 0;}
         long n=x;
       	long z=Math.abs(n);
       
		ArrayList<Integer> arr=new ArrayList<Integer>();
		while(z>0 ){
		    arr.add((int)z%10);
		    z=z/10;
		}
		System.out.println("Array:"+arr);
		StringBuilder out=new StringBuilder();
		
		for(int i:arr){
		    out.append(i);
		}
        int result = 0;
    try {
        long parsedValue = Long.parseLong(out.toString());
        
        if (x < 0) parsedValue *= -1;

        if (parsedValue > Integer.MAX_VALUE || parsedValue < Integer.MIN_VALUE) {
            return 0;
        }
        
        result = (int) parsedValue;

    } catch (NumberFormatException e) {
        return 0;
    }
		
        return result;

	}
}
