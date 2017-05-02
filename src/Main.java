/**
 *
 * @author Scott Pantall
 */
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        for(int i = 1; i <= 12; i++) {
            for(int j = 1; j <= 12; j++) {
                int k = i * j;
                if(j % 12 != 0) {
                    System.out.printf("%4d", k);
                }
                else {
                    System.out.printf("%4d%n", k);
                }
            }
            
        }        
    }
}
