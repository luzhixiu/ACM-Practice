import java.util.*;

public class TheSpy {


    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int c=0;c<n;c++){
           Map<String,Set<String>> map=new HashMap();
           int pairs=sc.nextInt();sc.nextLine();
           for(int p=0;p<pairs;p++){
               String line=sc.nextLine();
               String pair[]=line.split(" ");// item,type
               if(map.get(pair[1])==null){map.put(pair[1],new HashSet());}
               map.get(pair[1]).add(pair[0]);
             }
           int faces=1;
           for(Map.Entry<String, Set<String>> entry : map.entrySet()){
               faces*=entry.getValue().size()+1;
           }
           System.out.println(faces-1);
           }
        }
    }