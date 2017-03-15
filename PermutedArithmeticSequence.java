import java.util.*;

public class PermutedArithmeticSequence {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();sc.nextLine();
      for(int c=0;c<n;c++){
        String line=sc.nextLine();
        String list[]=line.split(" ");
        int v=Integer.parseInt(list[0]);
        ai=new ArrayList();
        for(int i=1;i<list.length;i++)ai.add(Integer.parseInt(list[i]));
        if(validate()){System.out.println("arithmetic");continue;}
        Collections.sort(ai);
        if(validate()){System.out.println("permuted arithmetic");}
        else System.out.println("non-arithmetic");
          }
    }
    static ArrayList<Integer> ai;
   static public boolean validate(){
        int dif=ai.get(1)-ai.get(0);
        for(int i=1;i<ai.size();i++){
            if(ai.get(i)-ai.get(i-1)!=dif)return false;
        }
        return true;
    }
    
    
    
    
}
