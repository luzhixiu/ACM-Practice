import java.util.*;

public class GussTheDST {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
      
            Queue<Integer> q = new LinkedList();boolean isQ=true;
            Stack<Integer> s = new Stack();     boolean isS=true;
            PriorityQueue<Integer> pq = new PriorityQueue(10,Collections.reverseOrder());   boolean ispq=true;
            int n = sc.nextInt(); 
            for (int c = 0; c < n; c++) {
                int a=sc.nextInt();
                int b=sc.nextInt();
                if (a == 1) {q.add(b);s.push(b);pq.add(b);}
                else {
                    if (q.isEmpty()) {
                        isQ = false;
                    } else {
                        if (q.remove() != b) {
                            isQ = false;
                        }
                    }
                    if (s.isEmpty()) {
                        isS = false;
                    } else {
                        if (s.pop() != b) {
                            isS = false;
                        }
                    }
                    if (pq.isEmpty()) {
                        ispq = false;
                    } else {
                        if (pq.poll() != b) {
                            ispq = false;
                        }
                    }
                 }
            if(!sc.hasNext())break;
            }
            int i=0;
            if(isQ)i++; 
            if(isS)i++; 
            if(ispq)i++;
            if(i>=2){System.out.println("not sure");}
            else if(i<=0) {System.out.println("impossible");}
            else if (i == 1) {
                if (isQ) {System.out.println("queue");} 
                else if (isS) {System.out.println("stack");} 
                else {System.out.println("priority queue");}
            }
        }
       
    }

}