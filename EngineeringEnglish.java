import java.util.*;
public class EngineeringEnglish {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> seen=new ArrayList();
        while(sc.hasNext()){
            String line=sc.nextLine();
            String list[]=line.split(" ");
            for(String s:list){
                if(seen.contains(s.toLowerCase()))System.out.print("."+" ");
                else {
                    System.out.print(s+" ");
                    seen.add(s.toLowerCase());
                }
            }
            
        
            System.out.println("");
        }
        
    }
    
}