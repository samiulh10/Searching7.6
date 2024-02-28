import java.util.ArrayList;

public class Algorithms {
    public static int findMinIndex(int index, int[] arr) {
        int minUpdate = 0;
        int min = arr[index];
        for (int i = index; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
                minUpdate++;
            }
        }
        System.out.println("Minimum Updates: " + minUpdate);
        return index;
    }

    public static void print(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++)
            str += arr[i] + ", ";
        str += arr[arr.length - 1] + "]";
        System.out.println(str);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(int[] arr) {
        int swaps = 0;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = findMinIndex(i, arr);
            if (minIndex != i) {
                swap(arr, i, minIndex);
                swaps++;
            }
            print(arr);
        }
    }

    public static void insertionSort(int[] arr) {
        int swaps = 0;
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int index = i;
            while (index > 0 && temp < arr[index - 1]) {
                swap(arr, index, index - 1);
                swaps++;
                index--;
            }
            print(arr);
        }
        System.out.println("Swaps: " + swaps);
    }

    public void alphabeticalSelection(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k].compareTo(arr[minIndex]) < 0) {
                    minIndex = k;
                }
            }
            if (minIndex != i) {
                String temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        for (String word: arr) {
            System.out.print(word + " ");
        }
    }

    public void alphabeticalInsertion(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int minIndex = i;
            String temp = arr[i];
            while (minIndex > 0 && (temp.compareTo(arr[minIndex - 1]) < 0)) {
                String tempOne = arr[minIndex];
                arr[minIndex] = arr[minIndex - 1];
                arr[minIndex -1] = tempOne;
                minIndex--;
            }
        }
        for (String word: arr) {
            System.out.print(word + " ");
        }
    }

    public void alphabeticalArrayListSelection(ArrayList<String> arr) {
        {
            for (int i = 0; i < arr.size() - 1; i++) {
                int minIndex = i;
                for (int k = i + 1; k < arr.size(); k++) {
                    if (arr.get(k).compareTo(arr.get(minIndex)) < 0) {
                        minIndex = k;
                    }
                }
                if (minIndex != i) {
                    String temp = arr.get(minIndex);
                    arr.set(minIndex, arr.get(i));
                    arr.set(i, temp);
                }
            }
            for (String word: arr) {
                System.out.print(word + " ");
            }
        }


    }
    public void alphabeticalArrayListInsertion(ArrayList<String> arr) {

        for (int i = 1; i < arr.size(); i++) {
            int minIndex = i;
            String temp = arr.get(i);
            while (minIndex > 0 && (temp.compareTo(arr.get(minIndex - 1)) < 0)) {
                String tempOne = arr.get(minIndex);
                arr.set(minIndex, arr.get(minIndex -1));
                arr.set(minIndex -1, tempOne);
                minIndex--;
            }
        }
        for (String word: arr) {
            System.out.print(word + " ");
        }
    }

    public void arrayListAscnedingOrderSelection(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() -1; i++) {
            int minIndex = i;
            for (int k = 1; k < arr.size(); k++) {
                if (arr.get(k) < arr.get(minIndex)) minIndex = k;
            }

            if (minIndex != i) {
                int temp = arr.get(minIndex);
                arr.set(minIndex, arr.get(i));
                arr.set(i, temp);
            }
        }
        for (int integer: arr) System.out.print(integer + " ");
    }

        public void ascendingInsertionSort(ArrayList<Integer> arr) {
            for (int i = 1; i < arr.size(); i++) {
                int minIndex = arr.get(i);
                int k = i -1;
                while (k >= 0 && arr.get(k) > minIndex) {
                    arr.set(k + 1, arr.get(k));
                    k--;
                }
                arr.set(k + 1, minIndex);
            }
            for (int integer: arr) System.out.print(integer + " ");
        }
    }

