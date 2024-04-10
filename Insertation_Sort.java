import java.util.*;

//Time Complexcity  = 0(N^2)
//Space Complexcity = 0(1)

//Insertion Sort Idea is every time we change  a element's position  in his correct position . Here 0(n) loop run for each element because all element compare . 

public class Insertation_Sort {
    public static void  insertionSort(int arr[]){
        int n = arr.length;

        //Esay for understand *

        // for(int i=0;i<n;i++){
        //     for(int j=i;j>0;j--){
        //        if(arr[j]<arr[j-1]){ 
        //                   //here same but we swap in this time step by stepping.
        //           int s = arr[j];
        //           int r = arr[j-1];
        //           arr[j]=r;
        //           arr[j-1]=s;
                 
        //        }
        //     }
        // }
    
        //Same Approach code type different **

        for(int i=1;i<n;i++){ 
          int curr = arr[i]; //here arr start from 1 index 
          int prev = i-1; //arrray prev element 
         
          while(prev>=0 && arr[prev]>curr){ 
            //compare upto when prev element is larger than current element .
            arr[prev+1]=arr[prev];   //every time larger element go to back side .
            prev--;  // prev is >=0
            
          }
          
          arr[prev+1]=curr; 
          //here prev +1 because when loop is stopped then prev value is negative or when curr is bigger than prev value than change value prev . so prev+1 = curr
        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        }
        insertionSort(a);
        for(int v:a){
            System.out.println(v);
        }
    }
}
