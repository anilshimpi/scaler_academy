public class BackTrackingExample {

    public static void main(String[] args) {
        int N=3;//index length
        int[] arr= new int[N];
        findAll(arr,0,N);
    }

    private static void findAll(int[] arr, int i, int n) {

        if(i==n){
            for(int j=0;j<n;j++){

                System.out.print(arr[j]+" ");
            }
            System.out.println();

          return;
        }
        for(int c=1;c<=3;c++){
            arr[i]=c;
            findAll(arr, i+1, n);

        }
        return;
    }
}
