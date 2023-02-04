
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int arr1L = arr1.length;
        int arr2L = arr2.length;
        int arr3L = arr1L + arr2L;
        int[] arr3 = new int[arr3L];

        for(int i = 0; i < arr1L; i ++){
            arr3[i] = arr1[i];
        }
        for(int i = 0; i< arr2L; i ++){
            arr3[arr1L + i] = arr2[i];
        }

        return arr3;
    }
}
