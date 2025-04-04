package CastingTypes;

public class ImplicitCasting {
    public static void main(String[] args) {
        int a = 10;
        float b = a;
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
        double c = a;
        System.out.println("Value of c: "+c);
        long d = a;
        System.out.println("Value of d: "+d);
        short e = (short) a;
        System.out.println("Value of e: "+e);
        byte f = (byte) a;
        System.out.println("Value of f: "+f);
    }
}
