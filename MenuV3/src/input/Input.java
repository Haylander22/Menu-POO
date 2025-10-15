package input;

import java.util.Scanner;

public class Input {
    public static Scanner scan = new Scanner(System.in);

    public static int inI(String msg) {
        System.out.println(msg);
        return Integer.parseInt(scan.nextLine());
    }

    public static double inD(String msg) {
        System.out.println(msg);
        return Double.parseDouble(scan.nextLine());
    }

    public static String inS(String msg) {
        System.out.println(msg);
        return scan.nextLine();
    }
}


