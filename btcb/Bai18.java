package btcb;
import java.util.Scanner;
public class Bai18 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap vao so gio: "); 
        int h = sc.nextInt();
        System.out.println(h/(24*7)+" tuan");
        System.out.println((h%(24*7))/24+" ngay");
        System.out.println((h%(24*7))%24+" gio");
        
    }
}
