import java.util.Scanner;

public class CheckSortedArray {
    public static void checkSortedOrNot (int arr[]) {
        boolean isAscending = true;
        boolean isDescending = true;

        for(int i = 1;i<arr.length;i++) {
            if(arr[i-1] > arr[i]) {
                isAscending = false;
                break;
            }
        }

        for(int i = 1;i<arr.length;i++) {
            if(arr[i-1] < arr[i]) {
                isDescending = false;
                break;
            }
        }

        if(isAscending) {
            System.out.println("The Array is Sorted in Ascending Order.");
        }
        else if(isDescending) {
            System.out.println("The Array is Sorted in Descending Order.");
        }
        else {
            System.out.println("The Array is Not Sorted.");
        }
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

        checkSortedOrNot(arr);
    }
}
