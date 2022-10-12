import java.util.Scanner;

public class Main {

    public static int rUs(int a, int b)
    {
        if (b==0)
        {
            return 1;
        }

        return  rUs(a,b-1)*a;
    }

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int x=in.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int y=in.nextInt();

        System.out.println("Sonuç: "+rUs(x,y));
    }

}