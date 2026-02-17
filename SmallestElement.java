import java.util.Scanner;

public class SmallestElement {
    public static int smallestElement (int arr[]) {
        int min = Integer.MAX_VALUE;

        for(int i = 0;i<arr.length;i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
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

        System.out.println("The Smallest Element Present in the Array is : "+smallestElement(arr));
    }
}