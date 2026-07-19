import java.util.Scanner;
public class Segregate_zero_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter numbers in form of 0's and 1's");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count_zero = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                count_zero++;
            }
        }

        // for filling 0's into array
        for(int i=0;i<count_zero;i++){
            arr[i] = 0;
        }
        // for filling 1's into array
        for(int i=count_zero;i<arr.length;i++){
            arr[i] = 1;
        }

        System.out.println("After segregating 0's and 1's : ");
        // printing the final array
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
        sc.close();
    }
}
