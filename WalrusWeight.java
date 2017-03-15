import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WalrusWeight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet();
        set.add(0);
        for (int c = 0; c < n; c++) {
            int v = sc.nextInt();
            int size = set.size();
            int cnt = 0;
            Set<Integer> subSet=new HashSet();
            for (int val : set) {
                int sum=v+val;
                if(sum<=2000)subSet.add(sum);
                }
            set.addAll(subSet);
        }
        int candidate = 0;
        for (int i : set) {
            candidate = compare(i, candidate);
        }
        System.out.println(candidate);
    }

    public static int compare(int a, int b) {
        if (Math.abs(a - 1000) == Math.abs(b - 1000)) {
            return Math.max(a , b);
        } else if (Math.abs(a - 1000) > Math.abs(b - 1000)) {
            return b;
        } else {
            return a;
        }
    }

}