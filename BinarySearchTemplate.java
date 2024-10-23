abstract class BinarySearchTemplate
{
    public final int binarySearch(int[] array, int target)
    {
        return search(array, target, 0, array.length - 1);
    }
    abstract int search(int[] array, int target, int left, int right);
}
class IterativeBinarySearch extends BinarySearchTemplate
{
    @Override
    protected int search(int[] array, int target, int left, int right)
    {
        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if(array[mid] == target)
            {
                return mid;
            }
            if (array[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return -1;
    }
}
class RecursiveBinarySearch extends BinarySearchTemplate
{
    @Override
    protected int search(int[] array, int target, int left, int right)
    {
        if (right >= left)
        {
            int mid = left + (right - left) / 2;
            if (array[mid] == target)
            {
                return mid;
            }
            if (array[mid] < target)
            {
                return search(array, target, mid + 1, right);
            }
            else
            {
                return search(array, target, left, mid - 1);
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        BinarySearchTemplate iterativeSearch = new IterativeBinarySearch();
        int iterativeResult = iterativeSearch.binarySearch(sortedArray, target);
        System.out.println("Iterative Binary Search: " + (iterativeResult != -1 ? "Element found index " + iterativeResult : "Element not found"));
        BinarySearchTemplate recursiveSearch = new RecursiveBinarySearch();
        int recursiveResult = recursiveSearch.binarySearch(sortedArray, target);
        System.out.println("Recursive Binary Search: " + (recursiveResult != -1 ? "Element found index " + recursiveResult : "Element not found"));
    }
}
