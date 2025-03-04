//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        int max=-1,smax=-1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                smax = max;
                max = arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max)
            {
                smax= arr[i];         
                
            }
        }
    return (smax== -1) ? -1 : smax;
    }
}