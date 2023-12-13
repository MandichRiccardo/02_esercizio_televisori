import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Televisore t1;
        t1 = new Televisore("philips", "nero", 24.5);
        Televisore t2 = new Televisore("LG", "bianco", 60);
        t1.setVolume(input("quale volume vuoi inserire nel primo televisore?", 30));
        t2.setVolume(input("quale volume vuoi inserire nel secondo televisore?", 35));
        output("t1:");
        t1.printTelevisore();
        output("t2:");
        t2.printTelevisore();
    }
    
    public static void output(String y)
    {
        System.out.print(y+"\n");
    }
    public static int input(String a, int b){
        output(a);
        int c = b;
        Scanner scan = new Scanner(System.in);
        b = scan.nextInt();
        return b;
    }
}