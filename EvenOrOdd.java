import java.util.*;
public class EvenOrOdd {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if ((n & 1)==0) {
            System.out.println("Number is Even");
            
        }
        else{
            System.out.println("Number is Odd");
        }
        sc.close();
    }
}
