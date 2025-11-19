public class GetSingleElement {
    public static int getSingleElement(int[] arr,int n){
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4,4};
        int n=7;
        System.out.println(getSingleElement(arr,n));
    }
}