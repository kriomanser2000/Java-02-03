abstract class MaxFinder1
{
    public final int findMax(int[] array)
    {
        if (array == null || array.length == 0)
        {
            throw new IllegalArgumentException("Array must not be empty.");
        }
        int max = initializeMax();
        for (int value : array)
        {
            max = updateMax(max, value);
        }
        return max;
    }
    protected abstract int initializeMax();
    protected abstract int updateMax(int currentMax, int newValue);
}
class SimpleMaxFinder extends MaxFinder1
{
    @Override
    protected int initializeMax()
    {
        return Integer.MIN_VALUE;
    }
    @Override
    protected int updateMax(int currentMax, int newValue)
    {
        return Math.max(currentMax, newValue);
    }
    public static void main(String[] args)
    {
        MaxFinder1 maxFinder1 = new SimpleMaxFinder();
        int[] array = {3, 5, 7, 2, 8, -1, 4};
        int max = maxFinder1.findMax(array);
        System.out.println("Max in massive: " + max);
    }
}
