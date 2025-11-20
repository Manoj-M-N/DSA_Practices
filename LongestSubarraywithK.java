import java.util.HashMap;
import java.util.Map;

public class LongestSubarraywithK {
public static int subArray(int[] arr,int n,int k){
    Map<Integer,Integer>map=new HashMap<>();
    int sum=0,maxlen=0;
    map.put(0, 1);
    for(int i=0;i<n;i++){
        sum+=arr[i];
        if(map.containsKey(sum-k)){
            int length=i-map.get(sum-k);
            maxlen=Math.max(maxlen, length);
        }
        map.put(sum, i);
    }
    return maxlen;
}
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1};
        int n=6,k=3;
        System.out.println(subArray(arr,n,k));
    }
}