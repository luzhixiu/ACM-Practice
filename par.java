import java.util.Scanner;

public class Averageeasy {

 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int cases=sc.nextInt();sc.nextLine();
        for(int c=0;c<cases;c++){
           int CSC=sc.nextInt();
           int ECON=sc.nextInt();
           int C[]=new int[CSC];
           int E[]=new int[ECON];
           for(int i=0;i<CSC;i++){
               C[i]=sc.nextInt();
           }
           for(int i=0;i<ECON;i++){
               E[i]=sc.nextInt();
           }
           double Caverage=sum(C)/(double)(C.length);
           double Eaverage=sum(E)/(double)(E.length);
           int cnt=0;
           for(int i=0;i<C.length;i++){
               if(C[i]<Caverage&&C[i]>Eaverage){cnt++;}
           }
            System.out.println(cnt);
        
        
        
        }
    }
    static public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    
    
    
}