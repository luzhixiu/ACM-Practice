import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication80 {

    static int permutation[];
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        while(true){
        
        int n=sc.nextInt();
        if(n==0){break;}
        permutation=new int[n];
        for(int i=0;i<n;i++){permutation[i]=sc.nextInt();}
        sc.nextLine();
        String line=sc.nextLine();
        line=makeSpace(line,n);
        ArrayList<String> ai=new ArrayList();
        for(int i=n;i<=line.length();i+=n){
            ai.add(line.substring(i-n,i));
        }
        
       
        String result="";
        for(String s:ai){
            result+=encrypt(s);
        
        }
         System.out.println("'"+result+"'");
        
        
        
        
        
        
      }
    }
    static public String encrypt(String s){
        String result="";
        for(int i=0;i<permutation.length;i++){result+=s.charAt(permutation[i]-1);}
        return result;
    }
    static public String makeSpace(String s,int n){
        int finalSize=0;
        while(finalSize<s.length()){
            finalSize+=n;
        }
        
        String result=s;
        for(int i=s.length();i<finalSize;i++){result=result+' ';;}
        return result;
        

    }
    
    
    
}