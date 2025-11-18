import java.util.*;

public class Union{
    public static List<Integer> union(int[] a,int[] b){
        List<Integer>list=new ArrayList<>();
        int n1=a.length,n2=b.length,i=0,j=0;
        while (i<n1 && j<n2) {
            if(a[i]<b[j]){
               if(list.isEmpty() || list.get(list.size()-1)!=a[i]){
                 list.add(a[i]);
                i++;
               }
                
            }
            else if(a[i]>b[j] ){
             if(list.isEmpty() || list.get(list.size()-1)!=b[j]){
                   list.add(b[j]);
                j++;
             }
            }
            else {
                if(list.isEmpty() || list.get(list.size()-1)!=b[j]){
                   list.add(b[j]);
                   i++;
                j++;
             }
        }
    }

        while (i<n1 ) {
            if(list.isEmpty() || list.get(list.size()-1)!=a[i]){
                 list.add(a[i]);
                     i++;
            }
           
        }
        while (j<n2) {
            if(!list.isEmpty() || list.get(list.size()-1)!=b[j]){
                 list.add(b[j]);
                    j++;
            }
           
        }
        
        return list;
    } 
    public static void main(String[] args){
       
        int[] a={1,2,3,4,6};
        int[] b={2,3,5};
        List<Integer> list=union(a,b);
        for(int ele:list){
            System.out.print(ele+" ");
        }
    }
}