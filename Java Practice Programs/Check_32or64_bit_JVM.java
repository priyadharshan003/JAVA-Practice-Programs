public class Check_32or64_bit_JVM {
    public static void main(String[] a)
    {
       String sys = System.getProperty("sun.arch.data.model");
       System.out.println(sys);

       final String b;
        b = System.getProperty("os.arch");
        System.out.println(b);

    }
}
