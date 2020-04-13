public class Hanoi {
    // 汉诺塔问题
    public static void hanoi(int n, char A, char B, char C) {
        if(n == 1) {
            move(A, C);
        } else {
            hanoi(n-1, A, C, B);
            move(A, C);
            hanoi(n-1, B, A, C);
        }
    }
    public static void move(char A, char C) {
        System.out.println(A + "-->" + C);
    }
    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }
}
