public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                // 注意这里补上了 ) 和 \t
                System.out.print(j + "xx" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}