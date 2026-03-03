import java.util.*;
import java.lang.*;
import java.io.*;

class MedianOfTwoSortedArrays
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int[] nums1 = {1,2};
	int[] nums2 = {3,4};
	 int n1 = nums1.length;
    int n2 = nums2.length;
    int total = n1 + n2;
	double median=0;
    
    int i = 0, j = 0;
    int m1 = 0, m2 = 0; // These will store our middle values

    // We only need to walk until the middle point
    for (int count = 0; count <= total / 2; count++) {
        m2 = m1; // Store the previous value
        
        if (i < n1 && (j >= n2 || nums1[i] < nums2[j])) {
            m1 = nums1[i++];
        } else {
            m1 = nums2[j++];
        }
    }

    if (total % 2 == 0) {
        median= (m1 + m2) / 2.0;
    } else {
        median= m1;
    }
}
 
	}

