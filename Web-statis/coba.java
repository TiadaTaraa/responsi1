import java.util.Scanner;
public class coba
{
    public static int rectangle(int x, int y)
    {
		int luas = x * y;
		return luas;
    }
    public static void main(String[] args)
    {
		Scanner in = new Scanner(System.in);
        int x, y;
        System.out.print("Masukan Panjang : ");
        x = in.nextInt();
        System.out.print("Masukan Lebar : ");
        y = in.nextInt();
        int keluar = rectangle(x,y);
        System.out.println(keluar);
    }
}