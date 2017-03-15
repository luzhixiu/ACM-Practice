import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Palindroms11 {

    public static void main(String[] args) {
        Set<String> start=new HashSet(); 
        
        String a = "0";
        String b = "1";
        String c = "";
        start.add(a);
        start.add(b);
        start.add(c);
        ArrayList<Set<String>> list=new ArrayList();
        list.add(start);int index=0;
        while (list.get(index).size() < 50000) {
             Set<String> tempSet = new HashSet();
            for (String s : list.get(index)) {
                tempSet.add("0"+s+"0");
                tempSet.add("1" + s + "1");
            }
            list.add(tempSet);
        index++;
        }
       ArrayList<String> ai=new ArrayList();
        for(int i=0;i<list.size();i++){
            for(String s:list.get(i)){
            if(s.length()!=0&&s.charAt(0)=='1'){
            ai.add(s);
            }
            }
             }
        ArrayList<Integer> ai2=new ArrayList();
        for(String s:ai){
        ai2.add(Integer.parseInt(s,2));        }
        Collections.sort(ai2);
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(ai2.get(n-1));

    }

}