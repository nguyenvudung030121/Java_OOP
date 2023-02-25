
package btcb;
import java.util.Scanner;
public class Bai25 {
    public static Scanner sc = new Scanner(System.in);
    public static void BCNN_UCLN(int n, int m) {
        int a = n, b = m;
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        System.out.println("UCLN: " + a);
        System.out.println("BCNN: " + (m * n) / a);
    }
    public static void main(String[] args) {
        
        System.out.print("a = ");
        int a=sc.nextInt();
        System.out.print("b = ");
        int b=sc.nextInt();
        BCNN_UCLN(a,b);
    }
}
