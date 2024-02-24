package dsa_intermediate;

import java.util.ArrayList;
import java.util.List;

public class FabonaciiSeries {

    public static void main(String[] args) {
        List<Integer> output = generateFabonacii(100);
        System.out.println("Fabonacii series are: " + output);
    }
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public static List<Integer> generateFabonacii(int n) {
        List<Integer> fab = new ArrayList<>();
        fab.add(0);
        fab.add(1);
        while (fab.size() < n) {
            Integer last = fab.get(fab.size() - 1);
            Integer sec = fab.get(fab.size() - 2);
            fab.add(last + sec);
        }
        return fab;
    }
}
