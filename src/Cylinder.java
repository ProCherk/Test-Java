import java.util.Scanner;

public class Cylinder {
    public static int Cylinder_V(int h, int r) {
        double a = (3.14 * r * r) * h;
        int V = (int) Math.round(a);
        return V;
    }

    public static int Cylinder_S(int h, int r) {
        double a = 2 * (3.14 * r * r) + (2 * 3.14 * r) * h;
        int S = (int) Math.round(a);
        return S;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input height: ");
        int l = in.nextInt();

        System.out.print("Input radius: ");
        int r = in.nextInt();

        int a = Cylinder_V(l, r);
        int b = Cylinder_S(l, r);

        System.out.print("Volume - ");
        System.out.println(a);

        System.out.print("Square - ");
        System.out.println(b);
    }
}

