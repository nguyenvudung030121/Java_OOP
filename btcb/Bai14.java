
package btcb;
import java.util.Scanner;
public class Bai14 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int d, m, y, top, dayofweek;
        System.out.print("Nhap vao ngay = ");
        d = sc.nextInt();
        System.out.print("Nhap vao thang = ");
        m = sc.nextInt();
        System.out.print("Nhap vao nam = ");
        y = sc.nextInt();
        while (true) {
            if (d < 1 || d > 31) {
                System.out.println("Ngay ko hop le");
                break;
            }
            if (m < 1 || m > 12) {
                System.out.println("Thang ko hop le");
                break;
            }
            if (y < 1582) {
                System.out.println("Nam ko hop le");
                break;
            }
            switch (m) {
                case 4: {
                    top = 30;
                    break;
                }
                case 6: {
                    top = 30;
                    break;
                }
                case 9: {
                    top = 30;
                    break;
                }
                case 11: {
                    top = 30;
                    break;
                }
                case 2: {
                    if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                        top = 29;
                        break;
                    } else {
                        top = 28;
                        break;
                    }

                }
                default: {
                    top = 31;
                }
            }
            int newd,newm,newy,oldd = 0,oldm,oldy;
            if (d==top){
                if (m==12)
                {
                    newy=y+1;
                    newm=1;
                    newd=1;
                    
                }
                else{
                    newy=y;
                    newm=m+1;
                    newd=1;
                }
            }else{
                newd=d+1;
                newm=m;
                newy=y;
            }
        
            
              if (d==1){
                if (m==1)
                {
                    oldy=y-1;
                    oldm=12;
                    oldd=31;
                    
                }
                else{
                    oldy=y;
                    oldm=m-1;
                    if (top==30)
                        oldd=31;
                    if (top==31 && m!=3)
                        oldd=30;
                    else if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)){
                        oldd=29;
                    }else oldd=28;
                        
                    
                }
            }else{
                oldd=d-1;
                oldm=m;
                oldy=y;
            }
            System.out.println("Ngay mai: "+newd+"/"+newm+"/"+newy);
            System.out.println("Ngay truoc: "+oldd+"/"+oldm+"/"+oldy);
            break;
        }

    }
}
