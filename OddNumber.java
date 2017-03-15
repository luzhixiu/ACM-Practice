import java.util.*;

public class OddNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int c=0;c<n;c++){
        int v=sc.nextInt();
        if(v%2==0)System.out.println(v+" is even");
        else System.out.println(v+" is odd");
        }
    }
    }