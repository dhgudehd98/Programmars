package Lv0;

public class _24피자나눠먹기2 {

    /**
     *
     */
    public static void main(String[] args) {
        int n = 10 ; // 사람 수 , 한판의 6조각
        int b = 6;

        int answer = (n * b) / gcd(n,b);
        System.out.println(answer);
    }


    /**
     * 최대 공약수
     * a= 6 b =4
     * @param a
     * @param b
     * @return
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a= temp;
        }
        return a;
    }




}