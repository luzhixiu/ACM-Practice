import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class CD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String line=br.readLine();
            String list[]=line.split(" ");
            int n1=Integer.parseInt(list[0]);
            int n2=Integer.parseInt(list[1]);
            if(n1==0&&n2==0)break;
            Set set=new HashSet();
            for(int i=0;i<n1;i++)set.add(Integer.parseInt(br.readLine()));
            int cnt=0;
            for (int i=0;i<n2;i++)if(!set.add(Integer.parseInt(br.readLine())))cnt++;
            System.out.println(cnt);
         }
         }
   }