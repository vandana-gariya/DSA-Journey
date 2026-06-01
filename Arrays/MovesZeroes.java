package Arrays;

public class MovesZeroes {
    static void movesZeroes(int arr[]){
      int i=0;
      for(int j=0;j<arr.length;j++){
        if(arr[j]!=0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
        }
      }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int []arr=new int[]{0,1,0,3,12};
        movesZeroes(arr);
    }
}
