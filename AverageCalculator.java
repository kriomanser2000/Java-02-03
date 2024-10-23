public class AverageCalculator
{
    public static <T extends Number> double calculateAverage(T[] numbers)
    {
        double sum = 0.0;
        for (T number : numbers)
        {
            sum += number.doubleValue();
        }
        return sum / numbers.length;
    }
    public static void main(String[] args)
    {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.5, 2.5, 3.5};
        double intAverage = calculateAverage(intArray);
        double doubleAverage = calculateAverage(doubleArray);
        System.out.println("Average is " + intAverage);
        System.out.println("Average is " + doubleAverage);
    }
}
