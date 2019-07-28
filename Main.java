
package practiceff1;

import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
        int a;
        Scanner reader =new Scanner(System.in);
        System.out.println("Enter a number");
        
        a=reader.nextInt();
        switch(a){
            case 1:System.out.println("You entered 1");
            break;
            case 2:System.out.println("You entered 2");
            break;
            case 3:System.out.println("You entered 3");
            break;
            case 4:System.out.println("You entered 4");
            break;
            default:System.out.println("Press a number");
        }
    }
    
}
