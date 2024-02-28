import java.util.Arrays;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Algorithms a = new Algorithms();

        System.out.println("alpabetical selection");
        a.alphabeticalSelection(new String[]{"zebra", "alpha"});
        System.out.println();
        a.alphabeticalSelection(new String[]{"sakib", "holmer"});
        System.out.println();
        a.alphabeticalSelection(new String[]{"a", "b"});
        System.out.println();


        System.out.println("alphabetical insertion");
        a.alphabeticalInsertion(new String[] {"zebra", "alpha"});
        System.out.println();
        a.alphabeticalInsertion(new String[] {"a", "b"});
        System.out.println();
        a.alphabeticalInsertion(new String[] {"sakib", "sam"});
        System.out.println();


        System.out.println("array list alphabetical selection");
        a.alphabeticalArrayListSelection(new ArrayList<String>(Arrays.asList("zebra", "alpha")));
        System.out.println();
        a.alphabeticalArrayListSelection(new ArrayList<String>(Arrays.asList("a", "b")));
        System.out.println();
        a.alphabeticalArrayListSelection(new ArrayList<String>(Arrays.asList("hagoo", "mata")));
        System.out.println();

        System.out.println("array list alphabetical insertion");
        a.alphabeticalArrayListInsertion((new ArrayList<String>(Arrays.asList("zebra", "alpha"))));
        System.out.println();
        a.alphabeticalArrayListInsertion(new ArrayList<String>(Arrays.asList("b", "a")));
        System.out.println();
        a.alphabeticalArrayListInsertion(new ArrayList<String>(Arrays.asList("wow", "zow")));
        System.out.println();

        System.out.println("ascending selection sort");
        a.arrayListAscnedingOrderSelection(new ArrayList<Integer>(Arrays.asList(1, 0, -1)));
        System.out.println();
        a.arrayListAscnedingOrderSelection(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        System.out.println();
        a.arrayListAscnedingOrderSelection(new ArrayList<Integer>(Arrays.asList(5, 0, -1)));
        System.out.println();

        System.out.println("ascending insertion sort");
        a.ascendingInsertionSort(new ArrayList<Integer>(Arrays.asList(1, 0, -1)));
        a.ascendingInsertionSort(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        a.ascendingInsertionSort(new ArrayList<Integer>(Arrays.asList(4, 0, -1)));










    }
}
