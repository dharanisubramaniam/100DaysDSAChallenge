 import java.util.*;
 import java.lang.*;
 import java.io.*;

 class Codechef
 {
     public static void main(String[] args) throws java.lang.Exception
     {
         // finding the first and last occurence of an element using binary search
         int[] arr = {
             0,
             1
         };
         int target = 8;

         //edge cases
         if (arr.length < 1) {
             System.out.println("Invalid input");
             return;
         }
         if (arr.length == 1) {
             if (arr[0] != target) {
                 return;
             }
         }


         //using binary search
         ArrayList < Integer > result = findFirstAndLastOccurence(arr, target);

         if (result.isEmpty()) {
             System.out.println("Target element not found");
         } else {
             System.out.println("First and last occurence index:" + result);
         }

     }

     public static ArrayList < Integer > findFirstAndLastOccurence(int[] arr, int target) {

         ArrayList < Integer > result = new ArrayList < > ();
         int start = 0;
         int end = arr.length - 1;
         int mid = 0;
         while (start <= end) {

             mid = (start + end) / 2;
             System.out.println("inside" + mid);
             if (arr[mid] == target) {
                 //System.out.println("inside mid");
                 //**************corrected version 
                 //Bugs - In while (firstIndex <= mid), you’re decrementing firstIndex but not checking array bounds (firstIndex could become -1).
                 //For left side: if (arr[firstIndex] < target) → this will almost never be true until you hit a different number, but you should really stop when firstIndex goes out of target range.
                 //loop conditions are incorrect--Move left while the element is still equal to target.
                 int firstIndex = mid;
                 while (firstIndex - 1 >= 0 && arr[firstIndex - 1] == target) {
                     firstIndex--;
                 }

                 int lastIndex = mid;
                 while (lastIndex + 1 < arr.length && arr[lastIndex + 1] == target) {
                     lastIndex++;
                 }

                 result.add(firstIndex);
                 result.add(lastIndex);
                 //**********my version
                 /**int firstIndex = mid - 1;
                  int lastIndex = mid + 1;
                  while (firstIndex <= mid) {
                     //check left side
                     //System.out.println("inside while loop");

                     if (arr[firstIndex] < target) {
                         firstIndex = firstIndex + 1;
                         System.out.println("firstIndex:" + firstIndex);
                         result.add(firstIndex);
                         break;
                     } else if (arr[firstIndex] == target) {
                         firstIndex--;
                     }



                 }
                 //check right side
                 while (lastIndex >= mid) {
                     if (arr[lastIndex] > target) {
                         lastIndex = lastIndex - 1;
                         System.out.println("lastIndex:" + lastIndex);
                         result.add(lastIndex);
                         break;
                     } else if (arr[lastIndex] == target) {
                         lastIndex++;
                     }

                 }
                 return result;**/

             } else if (arr[mid] < target) {
                 start = mid + 1;

             } else {
                 System.out.println("***");
                 end = mid - 1;
             }
         }
         return result;
     }


     //more efficient version for big tech using two binary searches
     public static ArrayList<Integer> findFirstAndLastOccurenceLogN(int[] arr, int target) {
    ArrayList<Integer> result = new ArrayList<>();
    int first = findFirst(arr, target);
    int last = findLast(arr, target);

    if (first != -1 && last != -1) {
        result.add(first);
        result.add(last);
    }
    return result;
}

public static int findFirst(int[] arr, int target) {
    int start = 0, end = arr.length - 1, ans = -1;
    while (start <= end) {
        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            ans = mid;
            end = mid - 1; // keep searching left
        } else if (arr[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return ans;
}

public static int findLast(int[] arr, int target) {
    int start = 0, end = arr.length - 1, ans = -1;
    while (start <= end) {
        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            ans = mid;
            start = mid + 1; // keep searching right
        } else if (arr[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return ans;
}

 }