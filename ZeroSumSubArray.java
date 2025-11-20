import java.util.HashMap;
import java.util.Map;

public class ZeroSumSubArray {
    public static int zeroSum(int[] arr,int n){
        Map<Integer,Integer>map=new HashMap<>();
        int sum=0,count=0;
        map.put(0, 1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                count+=map.get(sum);
            }
           map.put(sum, map.getOrDefault(sum, 0)+1);
        
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={0,0,5,5,0,0};
        int n=6;
        System.out.println(zeroSum(arr,n));
    }
}
