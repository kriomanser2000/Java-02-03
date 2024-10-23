public abstract class MinimumFinder<T>
{
    public T findMinimum(T[] array)
    {
        if(array == null || array.length == 0)
        {
            throw new IllegalArgumentException("The given array is null or empty");
        }
        T minValue = array[0];
        for(T element : array)
        {
            if(compare(element, minValue) < 0)
            {
                minValue = element;
            }
        }
        return minValue;
    }
    protected abstract int compare(T a, T b);
    public static void main(String[] args)
    {
        MinimumFinder<Integer> integerFinder = new MinimumFinder<>()
        {
            @Override
            protected int compare(Integer a, Integer b)
            {
                return Integer.compare(a, b);

            }
        };
        Integer[] intArray = {5, 2, 8, 1, 3};
        System.out.println("Min full nums in massive: " + integerFinder.findMinimum(intArray));
        MinimumFinder<String> stringFinder = new MinimumFinder<>()
        {
            @Override
            protected int compare(String a, String b)
            {
                return a.compareTo(b);
            }
        };
        String[] stringArray = {"A", "B", "C", "D", "E", "F"};
        System.out.println("Min full nums in string: " + stringFinder.findMinimum(stringArray));
    }
}
