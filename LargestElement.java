import java.util.Scanner;

public class LargestElement {
    public static int largestElement (int arr[]) {
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of the Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter Array Elements : ");

        for(int i = 0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Largest Element Present in the Array is : "+largestElement(arr));
    }
}