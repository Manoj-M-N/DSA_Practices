import java.util.ArrayList;
import java.util.List;

public class Intersaction {
    public static List<Integer> intersaction(int[] a,int[] b){
        List<Integer>list=new ArrayList<>();
        int i=0,j=0;
        while (i<a.length && j<b.length) {
            if(a[i]==b[j]){
                if(list.isEmpty() || list.get(list.size()-1)!=a[i]){
                    list.add(a[i]);
                }
                    i++;
                    j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,6};
        int[] b={2,3,5};
        List<Integer> list=intersaction(a,b);
        for(int ele:list){
            System.out.print(ele+" ");
        }
    }
}
