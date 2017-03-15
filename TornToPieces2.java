import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;

public class TornToPieces2 {

    static Map<String, Set<String>> map = new HashMap();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int p = 0; p < n; p++) {
            String line = sc.nextLine();
            String list[] = line.split(" ");
            for (int i = 1; i < list.length; i++) {
                String From = list[0];
                if (map.get(From) != null) {
                    map.get(From).add(list[i]);
                } else {
                    map.put(From, new HashSet());
                    map.get(From).add(list[i]);
                }
                if (map.get(list[i]) != null) {
                    map.get(list[i]).add(From);
                } else {
                    map.put(list[i], new HashSet());
                    map.get(list[i]).add(From);
                }
            }
        }
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            //    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        String start = sc.next();
        des = sc.next();
        dfs(start);
        if (reachable) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
        } else {
            System.out.println("no route found");
        }

    }
    public static Set<String> visited = new HashSet();
    public static String des;
    static ArrayList<String> ai = new ArrayList();
    static String preString = null;
    static ArrayList<String> list = new ArrayList();
    static boolean reachable = false;

    public static void dfs(String s) {
        visited.add(s);
        ai.add(s);
        if (s.equals(des)) {
            reachable = true;
            for (int i = 0; i < ai.size(); i++) {
                list.add(ai.get(i));
            }
            return;
        }

        Set<String> set = map.get(s);
        if(set==null){return;}
        for (String neighbor : set) {

            if (!visited.contains(neighbor)) {
                dfs(neighbor);
                ai.remove(ai.size() - 1);
            }
        }
        return;
    }

}