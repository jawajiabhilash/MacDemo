package CastingTypes;

public class ExplicitCasting
{
    public static void main(String[] args)
    {
        double a = 10.5;
        int b = (int) a;
        System.out.println("Value of a: "+a);
        /*Trucation*/
        System.out.println("Value of b: "+b);
        float c = (float) a;
        System.out.println("Value of c: "+c);
        long d = (long) a;
        System.out.println("Value of d: "+d);
        short e = (short) a;
        System.out.println("Value of e: "+e);
        byte f = (byte) a;
        System.out.println("Value of f: "+f);
    }
}
