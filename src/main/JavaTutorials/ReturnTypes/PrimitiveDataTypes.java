package ReturnTypes;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

       /* int float, double, char, boolean, long, short, byte, void;*/
        int a = 10;
        float b = 10.5f;
        double c = 10.5;
        char d = 'A';
        boolean e = true;
        long f = 1000000000;
        short g = 10;
        byte h = 10;
        /*System.out.println("Integer: "+a);
        System.out.println("Float: "+b);
        System.out.println("Double: "+c);
        System.out.println("Char: "+d);
        System.out.println("Boolean: "+e);
        System.out.println("Long: "+f);
        System.out.println("Short: "+g);
        System.out.println("Byte: "+h);*/
        /*add(10,20);
        add(10.5f,20.5f);*/
        add(true,false);

    }

    public static int add(int a, int b){
        System.out.println("Addition of a and b is: "+(a+b));
        return a+b;
    }

    public static float add(float a, float b){
        System.out.println("Addition of a and b is: "+(a+b));
        return a+b;
    }
    public static double add(double a, double b){
        System.out.println("Addition of a and b is: "+(a+b));
        return a+b;
    }
    public static char add(char a, char b){
        System.out.println("Addition of a and b is: "+(a+b));
        return (char) (a+b);
    }
    public static boolean add(boolean a, boolean b){
        System.out.println("Addition of a and b is: "+(a||b));
        return a||b;
    }
    public static long add(long a, long b){
        System.out.println("Addition of a and b is: "+(a+b));
        return a+b;
    }


}
