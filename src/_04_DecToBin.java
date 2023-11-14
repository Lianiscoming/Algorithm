public class _04_DecToBin {
    public static void main(String[] args) {
        int inputNum = 253;
        int bin[] = new int[100];
        /*
        *  19 / 2   9 ... 1
        *   9 / 2   4 ... 1
        *   4 / 2   2 ... 1
        *   2 / 2   1 ... 1
        *   1 / 2   0 ... 1
        *   (2진수) => (10진수)
        *   010011 => 19
        * */

        int i = 0;
        int mok = inputNum;
        while (mok > 0) {
            bin[i] = mok % 2;
            mok /= 2;
            i++;
        }
        
        i--;
        for (; i >= 0; i--) {
            System.out.print(bin[i]);
        }
    }
}
