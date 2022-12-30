import java.util.*;

class reverseBits {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println();
        System.out.println("Enter a number: ");
        long a = sc.nextLong();
        long ans = 0;
        for (long i=1; i<=32; i++) {
            ans <<= 1;
            ans = ans | (a & 1);
            a >>= 1;
        }
        System.out.println();
        System.out.println("Result is = " + ans);
        System.out.println();
        sc.close();
    }
}