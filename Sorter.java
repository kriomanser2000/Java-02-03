abstract class Sorter
{
    public final void sort(int[] array)
    {
        preprocess(array);
        sortArray(array);
        postprocess(array);
    }
    protected void preprocess(int[] array)
    {
        System.out.println("Initial processing of the array.");
    }
    protected abstract void sortArray(int[] array);
    protected  void postprocess(int[] array)
    {
        System.out.println("After processing the array.");
    }
}
class BubbleSort extends Sorter
{
    @Override
    protected void sortArray(int[] array)
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            for(int j = 0; j < array.length - 1 - i; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Array sorted using bubble sort.");
    }
}
class QuickSort extends Sorter
{
    @Override
    protected void sortArray(int[] array)
    {
        quickSort(array, 0, array.length - 1);
        System.out.println("Array sorted using quick sort.");
    }
    private void quickSort(int[] array, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
    private int partition(int[] array, int low, int high)
    {
        int pivot = array[high];
        int i = (low - 1);
        for(int j = low; j < high; j++)
        {
            if(array[j] < pivot)
            {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
    public static void main(String[] args)
    {
        int[] array = {5, 3, 8, 1, 2, 7};
        Sorter bubbleSorter = new BubbleSort();
        bubbleSorter.sort(array.clone());
        Sorter quickSorter = new QuickSort();
        quickSorter.sort(array.clone());
    }
}
