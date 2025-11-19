public class ConsecutiveOnes {
    public static int findconsecutiveOnes(int[]arr,int n){
        int max=0,count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                max=Math.max(max, count);
            }
            else{
                count=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,0,1,1};
        int n=9;
        System.out.println(findconsecutiveOnes(arr,n));
    }
}
