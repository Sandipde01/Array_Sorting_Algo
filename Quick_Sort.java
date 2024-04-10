package Recursion_Apna_college.Recursion_Apna_college;

import java.util.Arrays;


//time com - 0(n logn) (Best ,Average) But Worst case is 0(n^2) when array is already sorted then it's come **
public class Quick_Sort {

    public static void quickSort(int arr[],int start,int end){
        if(start>=end){
            return ;
        }
       int pivot = partion(arr,start,end);
       quickSort(arr, start, pivot-1);
       quickSort(arr, pivot+1, end);

    }

    public static int  partion(int arr[],int start,int end){
      int pivot = arr[end];
      int i = start-1;

      for(int j=start;j<end;j++){

        if(pivot>=arr[j]){
            i++;
            int t = arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
      }

      i++;
      int t = arr[end];
      arr[end]=arr[i];
      arr[i]=t;
      return i;

    }


    public static void main(String[] args) {
        int arr[] = {2,223,51,23,45,67,8,9};
        quickSort(arr, 0, arr.length-1);
        for(int v:arr){
            System.out.println(v);
        }
      
      
    }
}
