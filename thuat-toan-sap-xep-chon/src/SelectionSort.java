public class SelectionSort {
    static double [] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            /* Find the minimum in the list[i..list.length-1] */
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            /* Swap list[i] with list[currentMinIndex] if necessary */
            if (currentMinIndex != i) {
                list[currentMinIndex] = arr[i];
                list[i] = currentMin;
            }
        }
    }
    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}


