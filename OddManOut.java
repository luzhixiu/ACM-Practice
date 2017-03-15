import java.util.*;

public class OddManOut {

 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        for(int c=1;c<=n;c++){
            Set<Integer> set=new HashSet();
            sc.nextInt();sc.nextLine();
            String line=sc.nextLine();
            String list[]=line.split(" ");
            int numbers[]=new int[list.length];
            for(int i=0;i<list.length;i++){
            numbers[i]=Integer.parseInt(list[i]);
            }
            for(int i=0;i<numbers.length;i++){
                if(set.contains(numbers[i]))set.remove(numbers[i]);
                else set.add(numbers[i]);
            }
            for(int i:set)System.out.println("Case #"+c+": "+i);
            
        }
    }
}