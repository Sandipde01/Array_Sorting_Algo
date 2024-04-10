import java.util.*;

//Time Complexcity =O(n + k). k is maximum element in array . 
//Space Complexcity = 0(1)

//Counting Sort Idea is create a array of size  (array's max element +1) then those element presnt in array store frequency in count array(count array index is element of array ). At end traverse count array (also traverse for add  frequency of element ).




public class Countting_Sort {

    public static void countSort(int arr[]){
        int n = arr.length;
        int max=0;
        for(int i=0; i<n; i++){
           if(max<arr[i]){
              max=arr[i];  //calculate max value 
           }
        }
       //  System.out.println(max);
        int count [] = new int [max+1]; // length is max+1 because start from 0 index 
        for(int i=0;i<n;i++){
           int e = arr[i];
           int t = count[e];  // every index of count array is a the element frequency of array
           t++;
           count[e]=t;
        }
        int index =0;
        for(int i=count.length-1;i>=0;i--){  // **traverse count array from end then it DESCENDING ORDER
           int t = count[i];
           for(int j=0;j<t;j++){  //push element in array **
               arr[index]=i;
               index++;
           }
        }
 
       
    }
    public static void main(String[] args) {
        int arr[]  = {23,45,32,56,12,34};
        countSort(arr);
        for(int v:arr){
             System.out.println(v);
        }
    }
}
