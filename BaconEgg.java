import java.util.*;

public class BaconEgg {

    static Map<String, ArrayList<String>> map;
    static ArrayList<String> ai;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            sc.nextLine();
            if (n == 0) {
                break;
            }
            map = new HashMap(); //food to the listOf people
            ai = new ArrayList();
            for (int p = 0; p < n; p++) {
                String line = sc.nextLine();
                String list[] = line.split(" ");
                for (int i = 1; i < list.length; i++) {
                    ai.add(list[i]);
                    if (map.get(list[i]) == null) {
                        map.put(list[i], new ArrayList());
                    }
                    map.get(list[i]).add(list[0]);

                }

            }
            
            Set set=new HashSet(ai);
            ai=new ArrayList(set);
            Collections.sort(ai);
            for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
                Collections.sort(entry.getValue());
            }
            for (int i = 0; i < ai.size(); i++) {
                ArrayList<String> tempList = map.get(ai.get(i));
                if (tempList == null) {
                    continue;
                }
                System.out.print(ai.get(i) + " ");
                for (int j = 0; j < tempList.size(); j++) {
                    System.out.print(tempList.get(j)+" ");
                }
                System.out.println("");

            }
            System.out.println("");
        }
    }

}
