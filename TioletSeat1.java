import java.util.*;


public class TioletSeat1 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        int up=0,down=0; String concise=""+line.charAt(0);
      if(line.charAt(0)=='U'&&line.charAt(1)=='D'){down++;}
      if(line.charAt(0)=='D'&&line.charAt(1)=='U'){up++;}
      if(line.charAt(0)=='U'&&line.charAt(1)=='U'){down--;}
      if(line.charAt(0)=='D'&&line.charAt(1)=='D'){up--;}  
      for(int i=1;i<line.length();i++){
           if(line.charAt(i)=='D')up+=2;
            if(line.charAt(i)=='U')down+=2;
            if(line.charAt(i)!=line.charAt(i-1))concise+=line.charAt(i);
           }
       
        System.out.println(up);
        System.out.println(down);
        System.out.println(concise.length()-1);
        }
 }