// Java program illustrating the working of InputStream method
// mark(), read(), skip()
// markSupported(), close(), reset()
import java.io.*;

public class Input_Stream
{
    public static void main(String[] args) throws Exception
    {
        InputStream pri = null;
        try {

            pri = new FileInputStream("Pri.txt");

            // read() method : reading and printing Characters
            // one by one
            System.out.println("Char : "+(char)pri.read());
            System.out.println("Char : "+(char)pri.read());
            System.out.println("Char : "+(char)pri.read());

            // mark() : read limiting the 'pri' input stream
            pri.mark(1);

            // skip() : it results in reading
            pri.skip(2);
            System.out.println("skip() method comes to play");
            System.out.println("mark() method comes to play");
            System.out.println("Char : "+(char)pri.read());
            System.out.println("Char : "+(char)pri.read());
            System.out.println("Char : "+(char)pri.read());

            boolean check = pri.markSupported();
            if (pri.markSupported())
            {
                // reset() method : repositioning the stram to
                // marked positions.
                pri.reset();
                System.out.println("reset() invoked");
                System.out.println("Char : "+(char)pri.read());
                System.out.println("Char : "+(char)pri.read());
            }
            else
                System.out.println("reset() method not supported.");


            System.out.println("geek.markSupported() supported"+
                    " reset() : "+check);

        }
        catch(Exception excpt)
        {
            // in case of I/O error
            excpt.printStackTrace();
        }
        finally
        {
            // releasing the resources back to the
            // GarbageCollector when closes
            if (pri!=null)
            {
                // Use of close() : closing the file
                // and releasing resources
                pri.close();
            }
        }
    }
}
