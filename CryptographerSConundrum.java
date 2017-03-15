import java.util.Scanner;

public class CryptographerSConundrum {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       int sections=s.length()/3;
       String PER="";
       for(int i=0;i<sections;i++)PER+="PER";
       int count=0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)!=PER.charAt(i))count++;
       }
        System.out.println(count);
       }
    
}