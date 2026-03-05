import java.util.*;
import java.lang.*;
import java.io.*;

class SearchTargetInRotatedArray
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // find the target in a rotated sorted array
        int[] arr = {
            100,
            101,
            107,
            108,
            109,
            110,
            111,
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            9,
            12,
            17
        };
        int target = 17;
        int result = -1;

        //edge cases
        if (arr == null || arr.length < 1) {
            System.out.println("Invalid input");
            return;
        }
        //not needed to return - correction continue to binary search
        if (arr[0] < arr[arr.length - 1]) {
            System.out.println("Array is not rotated");
            //return;
        }

        //binary search algorihtm
        result = findTargetInRotatedArray(arr, target);
        if (result == -1) {
            System.out.println("No target element found");
        } else {
            System.out.println("Target element found:" + result);
        }

    }
    public static int findTargetInRotatedArray(int[] arr, int target) {
        //finding element is on the left or right side
        //if arr[start]-target <0 then target will be on the right of the pivot point
        //else it will be on the left of the pivot point
        //first find the pivot point
        int pivot = findPivotPoint(arr);


        if (pivot == -1) {
            System.out.println("Error:Cannot find pivot value");
            return -1;
        }
        int start = 0, end = arr.length - 1, mid = 0;
        if (arr[end] < target) {
            end = pivot - 1;
        } else if (arr[end] > target) {
            start = pivot;
        }

        //correction -This logic fails if target == arr[end]. Also, it assumes the pivot splits into strictly increasing halves
        /********* 
         * if (target >= arr[pivot] && target <= arr[end]) {
            start = pivot;
        } else {
            end = pivot - 1;
        }
         ****/


        while (start <= end) {
            //System.out.println("inside target while" + pivot);
            //my version is correct if start +end is used-it is entirely right end-start is still a confusion
            //gpt says end-start prevents overflow - dig deeper into it
            mid = (start + end) / 2;
            //System.out.println("inside target while"+mid+start+end);
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int findPivotPoint(int[] arr) {
        int start = 0, end = arr.length - 1, mid = 0;
        int result = -1;

        while (start <= end) {
            mid = (start + (end - start) / 2);
            //System.out.println("Inside pivot" + mid);
            if (mid < end && arr[mid] > arr[mid + 1]) { //correction - boundary fix mid<end
                result = mid + 1;
                // System.out.println("result inside pivot:" + result);
                return result;

            } else if (mid > start && arr[mid - 1] > arr[mid]) { //correction - boundary fix mid>start
                result = mid;
                return result;
            } else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else if (arr[start] > arr[mid]) {
                end = mid - 1;
            }
        }
        return result;
    }
}