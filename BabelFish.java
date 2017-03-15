import java.util.*;

public class BabelFish {

    public static void main(String[] args) {
        Map<String,String> map=new HashMap();
        Scanner sc=new Scanner(System.in);
        while(true){
            String line=sc.nextLine();if(line.isEmpty())break;
            String pair[]=line.split(" ");
            map.put(pair[1],pair[0]);//voice to animal
        }
        while(sc.hasNext()){
            String voice=sc.next();
        if(map.get(voice)==null){System.out.println("eh");}
        else System.out.println(map.get(voice));
        }
      }
 }