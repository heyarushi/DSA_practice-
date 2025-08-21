public class PrintTable {
    public static void printTable(int i, int n) {
        if (i == 11) {
            return;
        }
        System.out.println(n + "*" + i + "=" + (n * i));
        printTable(i + 1, n);
    }

    public static void main(String[] args) {
        printTable(1, 5);

    }
}
