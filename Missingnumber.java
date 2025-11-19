public class Missingnumber {
    public static int missingNumber(int[] arr,int n){
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n-1;i++){
            xor2^=arr[i];
            xor1^=(i+1);
        }
        xor1=xor1^n;
        return xor1^xor2;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        int n=5;
        System.out.println(missingNumber(arr, n));
    }
}
