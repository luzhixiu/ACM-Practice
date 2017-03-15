import java.util.Scanner;

public class EightQueens {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean hor[]=new boolean[20];
        boolean ver[]=new boolean[20];
        boolean leftD[]=new boolean[20];
        boolean rightD[]=new boolean[20];
        boolean valid=true;
        int count=0;
        for(int y=0;y<8;y++){//is is the y
           String line=sc.nextLine(); if(line.length()!=8)valid=false;
           for(int x=0;x<8;x++){//j is the x
               if(line.charAt(x)=='*'){
               count++;
               if(hor[y])valid=false;
               else hor[y]=true; 
               if(ver[x])valid=false;
               else ver[x]=true;
               if(leftD[y+x])valid=false;
               else leftD[y+x]=true;
               if(rightD[y-x+8])valid=false;
               else rightD[y - x + 8] = true;
                }
            }
        }
        if(count!=8)valid=false;
        if (valid) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}