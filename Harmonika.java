import java.util.Scanner;
public class Harmonika {

    public static void main(String[] args) {
        double result=0;
        int n;
Scanner in=new Scanner(System.in);

        System.out.print("Bir N Sayisi Giriniz:");
        n=in.nextInt();

        for(double i=1;i<=n;i++)
        {
            result+=(1/i);
        }
        System.out.print(result);


    }
}
