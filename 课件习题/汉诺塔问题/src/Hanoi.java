public class Hanoi {
    // 汉诺塔问题
    public static void hanoi(int n, char pose1, char pose2, char pose3) {
        if(n == 1) {
            move(pose1, pose3);
        } else {
            hanoi(n-1, pose1, pose3, pose2);
            move(pose1, pose3);
            hanoi(n-1, pose2, pose1, pose3);
        }
    }
    public static void move(char pose1, char pose2) {
        System.out.println(pose1 + "-->" + pose2);
    }
    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }
}
