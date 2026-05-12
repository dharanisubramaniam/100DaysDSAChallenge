import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr={4, 5, 6, 7, 0, 1, 2};
		
	int start = 0;
int end = arr.length - 1;

while (start < end) {
    int mid = start + (end - start) / 2;

    if (arr[mid] > arr[end]) {
        // Minimum must be in the right half
        start = mid + 1;
    } else {
        // mid could be the minimum, or it's to the left
        end = mid;
    }
}
// After the loop, start == end, pointing to the minimum
return arr[start];

	}
}
