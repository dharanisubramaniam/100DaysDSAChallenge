import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseInteger
{
	public int reverse(int x) {
    long reversed = 0; // Use long to detect overflow easily
    
    while (x != 0) {
        int pop = x % 10; // Get the last digit
        x /= 10;          // Remove the last digit
        
        reversed = reversed * 10 + pop;
        
        // Check if we've gone outside the 32-bit signed integer range
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
    }
    
    return (int) reversed;
}
}
