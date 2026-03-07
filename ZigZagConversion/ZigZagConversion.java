import java.util.*;
import java.lang.*;
import java.io.*;

class ZigzagConversion
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="PAYPALISHIRING";
		int n=s.length();
		int rows=3;
		int k=0;
		char[][] charArray = new char[rows][n];
		int i=0;
		int j=0;
		
		while(k<n){
		   while(i<rows && k<n){
		       charArray[i][j] = s.charAt(k);
		       i++;
		      k++;
		   }
		  i -= 2; // Move to the row above the bottom
        j++;    // Move to the next column
        while (i > 0 && k<n) {
            charArray[i][j] = s.charAt(k);
            i--;
            j++;
            k++;
            
        }
		   
		}
		
    StringBuilder ouput = new StringBuilder();
    for (int r = 0; r < rows; r++) {
        for (int c = 0; c < n; c++) {
            if (charArray[r][c] != '\u0000') ouput.append(charArray[r][c]);
        }
    }
	System.out.println("String out:"+ouput);

	}
}
