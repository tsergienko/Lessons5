
import java.io.IOException;

public class ArrayMaMin {
    public static void main(String[] args) throws IOException
    {

        int[] mass = {7, 10, 99, 1, 5676, 999443, 323423, 234234, 5};
        int  maximum = mass[0];
        int  minimum = mass[0];
        for (int i = 0; i < mass.length; i++)
        {
            if (mass[i] > maximum)
                maximum = mass[i];
            if (mass[i] < minimum)
                minimum = mass[i];
        }
        System.out.println(" ");
        System.out.println(maximum);
        System.out.println(" ");
        System.out.println(minimum);


    }
}
