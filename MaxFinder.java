public class MaxFinder
{
    public static <T extends Comparable<T>> T findMax(T a, T b, T c)
    {
        T max = a;
        if (b.compareTo(max) > 0)
        {
            max = b;
        }
        if (c.compareTo(max) > 0)
        {
            max = c;
        }
        return max;
    }
    public static void main(String[] args)
    {
        System.out.println("Максимум: " + findMax(3, 7, 5));
        System.out.println("Максимум: " + findMax(10.5, 7.2, 10.0));
        System.out.println("Максимум: " + findMax("A", "B", "C"));
    }
}
