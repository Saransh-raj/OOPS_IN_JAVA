import java.util.*;
public class Missing_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // traversing in array and searching for the missing element
        // step 1 :- first we need to find the sum of the given array element
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        // now we need to find the sum of array element for length of the array
        int expectedSum = n * (n + 1) / 2;
        System.out.println(expectedSum-sum);

        sc.close();
    }
}