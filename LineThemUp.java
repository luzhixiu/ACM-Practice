import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LineThemUp {

   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       ArrayList<String> ai=new ArrayList();
       for(int i=0;i<n;i++)ai.add(sc.next());
       ArrayList<String> IncList=new ArrayList();
       IncList=(ArrayList<String>) ai.clone();
       Collections.sort(IncList);
       ArrayList decList=(ArrayList<String>) IncList.clone();
       Collections.reverse(decList);
       if(match(ai,IncList))System.out.println("INCREASING");
       else if(match(ai,decList))System.out.println("DECREASING");
       else System.out.println("NEITHER");
    }
    
    public static boolean match(ArrayList<String> a,ArrayList<String> b){
        for(int i=0;i<a.size();i++){
            if(a.get(i)!=b.get(i))return false;
            
        }
        return true;
    
    
    }
    
    
}
