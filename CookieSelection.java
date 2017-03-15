import java.util.*;

public class CookieSelection {

    static PriorityQueue<Integer> max = new PriorityQueue(Collections.reverseOrder());
    static PriorityQueue<Integer> min = new PriorityQueue();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.next();
            if(s.equals("#")){balance();System.out.println(min.remove());}
            else{add(Integer.parseInt(s));}
         }
    }

    public static void balance() {
        if(min.size()==max.size()||min.size()==max.size()+1)return;
        if (min.size() - max.size() > 1) {
            max.add(min.remove());
            balance();
        }
        else if(max.size()-min.size()>0){
            min.add(max.remove());
            balance();
        
        }

    }
    public static void add(int n){
       int med;
        if(min.size()!=0) { med=min.peek();}
       else { med=0;}
        if (n>med)min.add(n);
        else max.add(n);
      
    
    
    }

}
