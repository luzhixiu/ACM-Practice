import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ABS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            long a=sc.nextLong();
            long b=sc.nextLong();
            System.out.println(Math.abs(a-b));
        
        
        }
        
        
    }
    
}
