import java.util.Arrays;
import java.util.Scanner;

public class ExactChange {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int cases=sc.nextInt();
       while(cases-->0){
           int amount=sc.nextInt();
           int types=sc.nextInt();
           int[]coins=new int[types];
           for(int i=0;i<types;i++){
               coins[i]=sc.nextInt();
            }
            Integer table[][]=new Integer[30000][types+1];
            table[0][0]=0;
            for(int i=0;i<types;i++){
                for(int j=0;j<20000;j++){
                    if(table[j][i]!=null){
                        if(table[j+coins[i]][i+1]==null||table[j][i]+1<table[j+coins[i]][i+1]){
                            table[j+coins[i]][i+1]=table[j][i]+1;
                        }//use current option
                        if(table[j][i+1]==null||table[j][i]<table[j][i+1]){
                            table[j][i+1]=table[j][i];
                        }
                      }//not use curent option
               }

           }
             for(int i=amount;i<20000;i++){
                if(table[i][types]!=null){
                    System.out.print(i + " ");
                    System.out.println(table[i][types]);
                    break;
            
            }
               
               

           }
            
            
     
    
}
}
}