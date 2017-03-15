import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Map.Entry;

public class PizzaHawaii {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int cases=sc.nextInt();
        for (int c = 0; c < cases; c++) {
            Map<String, String> Ita = new HashMap();
            Map<String, String> Eng = new HashMap();
            int pizzas=sc.nextInt();
            for (int p = pizzas; p >0; p--) {
                String garbage = sc.next();
                int Itas=sc.nextInt();
                for (int i = 0; i < Itas; i++) {
                    String key = sc.next();
                    String previousState = Ita.get(key);
                    if (previousState == null) {
                        previousState = "";
                    }
                    Ita.put(key, previousState +p);

                }
                int Engs=sc.nextInt();
                for (int i = 0; i < Engs; i++) {
                    String key = sc.next();
                    String previousState = Eng.get(key);
                    if (previousState == null) {
                        previousState = "";
                    }
                    Eng.put(key, previousState + p);
                }}
                ArrayList<String> ai = new ArrayList();
                for (Entry<String, String> entry1 : Ita.entrySet()) {
                    for (Entry<String, String> entry2 : Eng.entrySet()) {
                        if(entry1.getValue().equals(entry2.getValue())){
                           ai.add("("+entry1.getKey()+", "+entry2.getKey()+")");
                        }
                    }

                }
                Collections.sort(ai);
                for(int i=0;i<ai.size();i++){System.out.println(ai.get(i));}
if(c!=cases-1) System.out.println("");
            }
           
        }

    }
