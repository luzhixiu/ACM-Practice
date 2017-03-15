import java.util.Scanner;


public class SecrectMessage {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        sc.nextLine();
        while(c-->0){
            String s=sc.nextLine();
            int l=s.length();
            int gridSize=0;
            for(int i=0;i<1000;i++){
            if(i*i>=l){gridSize=i;
            break;
            }
            }
            for(int i=0;i<(gridSize*gridSize-l);i++){
                s=s+" ";
            }
            char grid[][]=new char[gridSize][gridSize];
            for(int i=0;i<s.length();i++){
                grid[i/gridSize][i%gridSize]=s.charAt(i);
            }
            
            
            
            char grid2[][]=new char[gridSize][gridSize];
            for (int i = 0; i < gridSize; i++) {
                for (int j = 0; j < gridSize; j++) {
                    grid2[i][j] = grid[j][i];
                }
            }
             String result="";
             for (int i = 0; i < gridSize; i++) {
                 StringBuilder line=new StringBuilder();
                 for (int j = 0; j < gridSize; j++) {
                 line.append(grid2[i][j]);
                }
                 result+=line.reverse();
             }
            System.out.println(trimS(result));
            
        
        
        }
        
        
  

        
        
        
    }
    
    
    
        static public String trimS(String s){
            String mys=s.replaceAll("\\s+","");
          
            return mys;
        }
    
}
