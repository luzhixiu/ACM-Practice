import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SmartPhone {
 public static void main(String[] args) throws FileNotFoundException {
    // Scanner sc=new Scanner(new File("smPhone.in"));
      Scanner sc=new Scanner(System.in);
     int n=Integer.parseInt(sc.nextLine());
       for(int i=0;i<n;i++){
       String target=sc.nextLine();
       String s0=sc.nextLine();
       String s1=sc.nextLine();
       String s2=sc.nextLine();
       String s3=sc.nextLine();
       int min=Integer.MAX_VALUE;
       int n0=MinimuSteps(target,s0);if(n0<=min){min=n0;}
       int n1=MinimuSteps(target,s1)+1;if(n1<=min){min=n1;}
       int n2=MinimuSteps(target,s2)+1;if(n2<=min){min=n2;}
       int n3=MinimuSteps(target,s3)+1;if(n3<=min){min=n3;}
           System.out.println(min);
        }
    }
   static  public int MinimuSteps(String target,String soFar){
        int smallerLength=0;
 	if(target.length()>=soFar.length()){smallerLength=soFar.length();}        
	else{smallerLength=target.length();}
        int similarity=0;
        for(int i=0;i<smallerLength;i++){
        if(target.charAt(i)==soFar.charAt(i)){similarity++;}
        else{break;}
        }
        return (soFar.length()+target.length()-(similarity*2));
      }
    
    
}