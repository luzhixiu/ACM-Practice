import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PhoneList {

  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt();
        for(int c=0;c<cases;c++){
            int n=sc.nextInt();
            String[] list=new String[n];
            for(int p=0;p<n;p++)list[p]=sc.next();
            boolean YES=true;
            Arrays.sort(list);
            
            for(int i=1;i<list.length;i++){
               if(contains(list[i],list[i-1])){
                   YES=false;
                   System.out.println("NO");
                   break;
               }
               
            }
            if(YES)System.out.println("YES");
            }
        }
    
    
    static public boolean contains(String l,String s){//shorter
        for(int i=0;i<s.length();i++){
         if(l.charAt(i)!=s.charAt(i))return false;
         
        
        }
    return true;
    
    
    }
    
}