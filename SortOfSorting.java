import java.util.*;


public class SortOfSorting {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     while(true){
         int n=sc.nextInt();if(n==0)break;
         String[] list=new String[n];
         for(int c=0;c<n;c++){
             
             list[c]=sc.next();}
             ArrayList<String>[][] house=new ArrayList[60][60];
             for(int i=0;i<60;i++){
                 for(int j=0;j<60;j++){
                     house[i][j]=new ArrayList();
                 }
             }
             for(int i=0;i<n;i++){
                 String s=list[i];
                 
                 
                 int char1=s.charAt(0)-'A';
                 int char2;
                 if(s.length()==1){ char2=0;}
                 else { char2=s.charAt(1)-'A';}
                // System.out.println(char1+" "+char2);
                 house[char1][char2].add(s);
                 
             }
            for(int i=0;i<60;i++){
                 for(int j=0;j<60;j++){
                     for(int k=0;k<house[i][j].size();k++){
                         System.out.println(house[i][j].get(k));
                     }
                 }
             }
         System.out.println("");
          }
      
     }
      }