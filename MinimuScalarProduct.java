import java.util.Arrays;
import java.util.Scanner;

public class MinimuScalarProduct {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int cases=sc.nextInt();
       for(int c=0;c<cases;c++){
           int n=sc.nextInt();
           long[] list1=new long[n];
           long[] list2=new long[n];
           for(int i=0;i<n;i++){list1[i]=sc.nextLong();}
           for(int i=0;i<n;i++){list2[i]=sc.nextLong();}
           Arrays.sort(list1);
           Arrays.sort(list2);
           long product=0;
           for (int i=0;i<n;i++){
               product+=(list1[i]*list2[n-1-i]);
           }
           System.out.println("Case #"+(c+1)+": "+product);
       
       
       }
        
        
        
        
        
    }
    
}