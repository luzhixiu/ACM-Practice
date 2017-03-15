import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Collatz {

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       while(true){
       int a=sc.nextInt(); 
       int b=sc.nextInt();
       if(a==0&&b==0)break;
       ArrayList<Long> Alist=new ArrayList();
       ArrayList<Long> Blist=new ArrayList();
       long A=a;
       long B=b;
       while(true){
            if(A==1){
                Alist.add(A);
                break;}
            else{
                   Alist.add(A);
                   A = getNext(A);
               }
           }
       
       while(true){
            if(B==1){
                Blist.add(B);
                break;}
            else{
                   Blist.add(B);
                   B = getNext(B);
               }
           }
       Map<Long, Integer> Bmap=new HashMap();
       for(int i=0;i<Blist.size();i++){
          
           Bmap.put(Blist.get(i),i);
       }
       
       
       
       
       
//       out:for(int i=0;i<ASequence.size();i++){
//           for(int j=0;j<BSequence.size();j++){
//               if(ASequence.get(i)-BSequence.get(j)==0){
//                   System.out.print(a+" needs "+i+" steps, ");
//                   System.out.print(b+" needs "+j+" steps, ");
//                   System.out.println("they meet at "+ASequence.get(i));
//                   break out;
//               
//               
//               }
//           
//           
//           }
//           
//       
//       }
           for (int i = 0; i < Alist.size(); i++) {
               if(Bmap.containsKey(Alist.get(i))){
                  int j=Bmap.get(Alist.get(i));
                   System.out.print(a+" needs "+i+" steps, ");
                   System.out.print(b+" needs "+j+" steps, ");
                   System.out.println("they meet at "+Alist.get(i));
                   break;
               }
           }
 
//           System.out.println(ASequence.size());
//           System.out.println(BSequence.size());
       
       
       
       }
               
    }
 
    static public long getNext(long n) {
        if(n%2==0)return n/2;
        else {return (3*n+1);}
    }

    
}