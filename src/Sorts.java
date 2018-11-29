public class Sorts
{
    public static int[] buildArray(int size)
    {
        int[] arr = new int[size];
        for(int i = 0; i < size; i ++)
        {
            arr[i] = (int)(Math.random() * 10000);
        }

        return arr;
    }

    public static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left - 1;

        for(int j = left; j < right; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr,i+1, right);
        return i + 1;
    }

    public static void quickSort(int[] arr, int left, int right)
    {
        if (left < right)
        {

            int pivot = partition(arr, left, right);

            quickSort(arr,left, pivot -1);
            quickSort(arr, pivot + 1, right);

        }
    }

    public static void quickSort3(int[] arr, int left, int right)
    {
        if (left < right)
        {
            int ranMid = (int)(((right - left + 1) * Math.random()) + left) ;

            int pivot = partition(arr, left, right);

            quickSort3(arr,left, pivot -1);
            quickSort3(arr, pivot + 1, right);

        }
    }
}
