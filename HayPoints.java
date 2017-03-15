import java.util.*;

public class HayPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int words = sc.nextInt();
        int sentences = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> map = new HashMap();
        for (int i = 0; i < words; i++) {
            String line = sc.nextLine();
            String list[] = line.split(" ");
            map.put(list[0], Integer.parseInt(list[1]));
        }
        int scores = 0;
        int cnt=0;
        while(true) {
            
            String line = sc.nextLine();
            if (line.contains(".")) {
                System.out.println(scores);
                scores = 0;cnt++;
                if(cnt==sentences)break;
            }
            String list[] = line.split(" ");
            for (int i = 0; i < list.length; i++) {
                if (map.get(list[i]) != null) {
                    scores += map.get(list[i]);
                }

            }

        }

    }

}
