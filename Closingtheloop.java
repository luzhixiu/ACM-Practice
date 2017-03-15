import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Closingtheloop {


    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int cases=sc.nextInt();
       for(int c=1;c<=cases;c++){
           ArrayList<Integer> red=new ArrayList(); 
           ArrayList<Integer> black=new ArrayList(); 
           int strings=sc.nextInt();
           for(int i=0;i<strings;i++){
           String s=sc.next();
           if(s.contains("R")){
               red.add(Integer.parseInt(s.replace("R","")));
           }else{black.add(Integer.parseInt(s.replace("B","")));}
           }
           Collections.sort(red);Collections.sort(black);
           Collections.reverse(red);Collections.reverse(black);
           int size=Math.min(red.size(), black.size());
           int length=0;
           if(size==0){System.out.println("Case #"+c+": "+"0");continue;}
           for(int i=0;i<size;i++){
           length+=red.get(i);
           length+=black.get(i);
           length-=2;
            }
           System.out.println("Case #"+c+": "+length);
       
       } 
       
       
    }
    
}
