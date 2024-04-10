import java.util.*;

//TIME COMPLEXCITY  - 0(n^2)
//SPACE COMPLEXCITY  -0(1)

//every time first smaller element place in first position,second smaller element place in second postion, third smallest element placed in third postion  ...so on every element for run loop o(n) time . so tc - 0(n^2) 
//Oposite of Bubble sort Algorithm ...
public class Selection_Sort {
    public static void selectionSort(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++) {
          int min = Integer.MAX_VALUE; 
          // here choose min value and then calculate max element then place it first postion for , calculate second max element than place it second postion ....so on   DESCENDING ORDER ...***
          int index=0;
          int swap=0;
            for(int j=i;j<n;j++){
              if(min>arr[j]){
                min=arr[j];
                index=j;
                swap++;
               
              }
          }
           // every swap at least 2 times . if it is not then already arr is sorted element ***. if array is sorted then TC IS = 0(N)
          if(swap<2){ 
            break;
          }
          
          int t =arr[i];
          arr[i]=min;
          arr[index]=t;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        selectionSort(a);
        for(int v:a){
            System.out.println(v);
        }
    }
}
