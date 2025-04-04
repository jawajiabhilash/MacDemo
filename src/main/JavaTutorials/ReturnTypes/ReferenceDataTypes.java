package ReturnTypes;

public class ReferenceDataTypes    {
    public static void main(String[] args) {
        String name = "Sai";
        getName(name);
    }

    public static String getName(String name) {
        System.out.println("My name is+"+name);
        return name;
    }
}
