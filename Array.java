//Program to print alternate numbers
public class Array {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6, 7 };

        for (int i = 0; i < num.length; i += 2) {
            System.out.println(num[i]);
        }
    }
}
