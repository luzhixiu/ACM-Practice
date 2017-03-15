import java.util.*;

public class MoneyMatters {
static int n;
static Map<Integer, Integer> money;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        int m = sc.nextInt();
        money = new HashMap();
        for (int i = 0; i < n; i++) {
            money.put(i, sc.nextInt());
        }
        matter = new HashMap();
       for(int i=0;i<m;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
           if(matter.get(a)==null)matter.put(a, new HashSet());
            matter.get(a).add(b);
           if(matter.get(b)==null)matter.put(b, new HashSet());
            matter.get(b).add(a);
        }
        for(int i=0;i<n;i++){
        dfs(i);
        if(sum!=0)possible=false;
         }
        if(possible)System.out.println("POSSIBLE");
        else System.out.println("IMPOSSIBLE");
    }
    static Map<Integer, Set<Integer>> matter;
    static boolean possible = true;
    static Set<Integer> visited=new HashSet();
    static int sum=0;
    static void dfs(int person){
        if(!visited.contains(person)){
        visited.add(person);
        sum+=money.get(person);
        Set<Integer> set=matter.get(person);
        if(set==null)return;
        for(int i:set)dfs(i);
         }
    }
  }