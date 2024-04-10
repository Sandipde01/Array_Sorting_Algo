import java.util.*;

//BUBBLE SORT IDEA IS LARGEST ELEMENT SWAPPED TO LAST ,THEN SECOND LARGEST ELEMENT SWAPPED LAST ,THEN THIRD LARGEST ELEMENT SWAPPED TO LAST....SO ON . EVERY TIME ONE ELEMENT'S POSITION IS PERFECT POSITION.

//TIME COMPLEXCITY-0(N^2) . BECAUSE for every element run loop o(n) times so 0(N^2)
// for index 0 run loop o(n) times , index 1 run loop o(n) times .. so on 

//SPACE COMPLEXCITY - 0(1) //BECAUSE no extra space not used .

public class Bubble_Sort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) { // for every element run loop o(n)time loop.

            int len = n - (i + 1);
            int swap = 0;
            for (int j = 0; j < n - 1; j++) { // j<len is same work

                if (arr[j] > arr[j + 1]) { // if current element > next elmented then swap
                    // DECREASING ORDER - - ** if arr[j]<arr[j+1] then swap then array is decreasing
                    // order ********
                    int r = arr[j];
                    int v = arr[j + 1];
                    arr[j] = v;
                    arr[j + 1] = r;
                    swap = 1;
                }

            }

            // this condition only for sorted arrays every time at least one swap is needed.
            // If no swap then the array already sorted .So for Sorted Arrays this algorithm
            // TIME COMPLEXITY is -0(N)
            if (swap == 0) {
                break;
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        bubbleSort(a);

        for (int v : a) {
            System.out.println(v);
        }
        System.out.println(" ");

    }
}
