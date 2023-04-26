import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SortingPackages {

    private static final Random seed = new Random();

    private static int[] arrayMaker() {

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter the length of your integer array: ");
        int upperLimit = input.nextInt();

        System.out.println("\n[Running arrayMaker()...]");

        int[] arr = new int[upperLimit];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = seed.nextInt(); // store integers
        }
        System.out.println("[Storing elements...]");
        System.out.println("[arrayMaker() execution successful.]\n");
        return arr;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    
    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (k = 0; k < temp.length; k++) {
            arr[left + k] = temp[k];
        }
    }

    // To generate permutation of the array
    static void shuffle(int[] a)
    {
        // Math.random() returns a double positive
        // value, greater than or equal to 0.0 and
        // less than 1.0.
        for (int i = 0; i < a.length; i++)
            swap(a, i, (int)(Math.random() * i));
    }

    // Swapping 2 elements
    static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static long timeSort(int[] arr, String algorithm) {
        long startTime = System.nanoTime();
        switch (algorithm) {
            case "Bubble":
                Arrays.sort(arr);
                break;
            case "Quick":
                quickSort(arr, 0, arr.length - 1);
                break;
            case "Merge":
                mergeSort(arr, 0, arr.length - 1);
                break;
            case "Bogo":
                while (!isSorted(arr)) {
                    shuffle(arr);
                }
                break;
            default:
                System.out.println("[Invalid sorting algorithm.]");
                return -1;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static void main(String[] args) {

        int[] arr;
        Scanner input = new Scanner(System.in);

        arr = arrayMaker();

        System.out.println("Choose a sorting algorithm (Bubble/Quick/Merge/Bogo): \n");
        String algorithm = input.nextLine();
        System.out.println();

        long elapsedTime = timeSort(arr, algorithm);

        if (isSorted(arr)) {
            System.out.println("[Sorting successful.]");
            System.out.println("[Elapsed time: " + elapsedTime + " ns.]\n");
        } else {
            System.out.println("[Sorting failed.]\n");
        }
    }
}
