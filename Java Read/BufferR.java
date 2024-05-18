import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferR {
            public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter an integer: ");
            String input = reader.readLine();
            
            int number = Integer.parseInt(input);
            int product = 1;
            int tempNumber = number;
    
            while (tempNumber != 0) {
                int digit = tempNumber % 10;
                product *= digit;
                tempNumber /= 10;
            }
    
            System.out.println("Product of digits: " + product);
        }
    }
