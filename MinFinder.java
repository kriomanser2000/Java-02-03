public class MinFinder
{
    public static <T extends Comparable<T>> T findMinimum(T a, T b, T c, T d, T e)
    {
        T min = a;
        if(b.compareTo(min) < 0)
        {
            min = b;
        }
        if(c.compareTo(min) < 0)
        {
            min = c;
        }
        if(d.compareTo(min) < 0)
        {
            min = d;
        }
        if(e.compareTo(min) < 0)
        {
            min = e;
        }
        return min;
    }
    public static void main(String[] args)
    {
        Integer minInt = findMinimum(5, 2, 9, 1, 3);
        System.out.println("Мін серед чисел: " + minInt);
        Double minDouble = findMinimum(5.5, 2.2, 9.9, 1.1, 3.3);
        System.out.println("Мін серед чисел з комою: " + minDouble);
        String minString = findMinimum("A", "B", "C", "D", "E");
        System.out.println("Мін серед рядків: " + minString);
    }
}
