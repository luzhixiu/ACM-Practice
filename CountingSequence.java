import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountingSequence {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt();
        for(int c=0;c<cases;c++){
            long sum=0;
            int n=sc.nextInt();
            long[] list=new long[n];
            Map<Long,Integer> map=new HashMap();
            map.put(Long.valueOf(0),1);
            
            int cnt=0;
            for(int i=0;i<n;i++){
               sum+=sc.nextInt(); 
            list[i]=sum;
            if(map.get(list[i])!=null)map.put(list[i],map.get(list[i])+1);
            else map.put(list[i], 1);
            if(map.get(list[i]-47)!=null)cnt+=map.get(list[i]-47);
               
           }
            System.out.println(cnt);
              }
         
    }
     
}