import java.util.Scanner;

public class MyScanner {
    Scanner scn;
    public MyScanner() {
        Scanner scn = new Scanner(System.in);
        this.scn = scn;
    }
    public int scanInt(String msg) {
        System.out.print(msg);
        int num = scn.nextInt();
        return num;
    }
    public String scanString(String msg) {
        System.out.print(msg);
        String str = scn.next();
        return str;
    }
}
