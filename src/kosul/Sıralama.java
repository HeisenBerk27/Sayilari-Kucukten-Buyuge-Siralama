package kosul;

import java.util.Scanner;

public class Sıralama {
	
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        a = scanner.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        b = scanner.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        c = scanner.nextInt();

        if (a <= b && a <= c) {
            if (b <= c) {
                System.out.println(a + " <= " + b + " <= " + c);
            } else {
                System.out.println(a + " <= " + c + " <= " + b);
            }
        } else if (b <= a && b <= c) {
            if (a <= c) {
                System.out.println(b + " <= " + a + " <= " + c);
            } else {
                System.out.println(b + " <= " + c + " <= " + a);
            }
        } else {
            if (a <= b) {
                System.out.println(c + " <= " + a + " <= " + b);
            } else {
                System.out.println(c + " <= " + b + " <= " + a);
            }
        }
    }
}

