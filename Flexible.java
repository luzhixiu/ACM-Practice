import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Flexible {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList();
        list.add(sc.nextInt());
        list.add(0);
        int partition=sc.nextInt();
        for(int i=0;i<partition;i++)list.add(sc.nextInt());
        Collections.sort(list);
        Set<Integer> set=new HashSet();
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if (i != j) {
                    set.add(Math.abs(list.get(i) - list.get(j)));
                }
              }
        }
        ArrayList<Integer> ai=new ArrayList(set);
        Collections.sort(ai);
        for(int i=0;i<ai.size();i++){
            System.out.println(ai.get(i));
        }
        
    }
    
    
    
    
    
}
