import java.util.HashMap;
import java.util.Map;

public class TargetSum {
    public static int[] targetSum(int[] arr,int n,int k){
        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++){
            int pre=k-arr[i];
            if(map.containsKey(pre)){
                return new int[]{map.get(pre),i};
            }
         map.put(arr[i], i);
           
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr={4,1,2,3,1};
        int n=5,k=3;
        int[] ans=targetSum(arr, n, k);
        
             System.out.print(ans[0]+" "+ans[1]);  
        
        
    }
}
