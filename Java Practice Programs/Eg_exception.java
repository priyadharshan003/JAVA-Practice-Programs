public class Eg_exception {

    public static void main(String[] a)
    {
        int i =0;
        int j =0;

        try{
          int k = i/j;
        }
        catch (Exception e)
        {
            System.out.println("Exception division by zero");
        }
    }
}
