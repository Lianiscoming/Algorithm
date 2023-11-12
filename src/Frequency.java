import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 1 2 2 3 1 4 2 2 4 3
        int[] inputNum = new int[10];
        for (int i = 0; i < 10; i++) {
            inputNum[i] = scan.nextInt();
        }
        int[] mode = new int[10];
        for (int i = 0; i < 10; i++) {
            mode[inputNum[i]]++;
        }
        //mode[1] == 2
        //mode[2] == 4
        //mode[3] == 2
        //mode[4] == 2
        int modeNum = 0; // 최빈수
        int modeCnt = 0; // 최빈수가 나온횟수
        for (int i = 0; i < 10; i++) {
            if (modeCnt < mode[i]) {
                modeCnt = mode[i];
                modeNum = i;
            }
        }
        System.out.println("최빈수는 : " + modeNum + " 최빈수의 cnt: " + modeCnt);
    }
}
