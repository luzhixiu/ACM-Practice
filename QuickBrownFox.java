import java.util.*;

public class QuickBrownFox {

   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(); sc.nextLine();
       for(int c=0;c<n;c++){
           String line=sc.nextLine().toLowerCase();
           ArrayList<String> ai=new ArrayList();
           String list[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
           ai.addAll(Arrays.asList(list));
           for(int i=0;i<line.length();i++)ai.remove(line.charAt(i)+"");
           if(ai.isEmpty())System.out.println("pangram");
           else{
               System.out.print("missing ");
               for(String s:ai)System.out.print(s);
               System.out.println("");
           }
           
       }
       }
    
}