import java.util.*;
public class array2 {
    static int Row, Col;
    static int [][] Board = new int[100][100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Row = sc.nextInt();
        Col = sc.nextInt();
        for (int i = 0; i < Row; ++i) {
            for (int j = 0; j < Col; ++j) {
                Board[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < Row; ++i) {
            for (int j = 0; j < Col; ++j) {
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
