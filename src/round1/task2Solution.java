package round1;

import java.util.*;

public class task2Solution {

    public static int findSubArrays(int[] A) {
        if (areZero(A)) {
            return -1;
        }

        int n = A.length;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        ArrayList<Pair> out = new ArrayList<>();

        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += A[i];

            if (sum == 0)
                out.add(new Pair(0, i));
            ArrayList<Integer> al = new ArrayList<>();

            if (map.containsKey(sum)) {
                al = map.get(sum);
                for (int it = 0; it < al.size(); it++) {
                    out.add(new Pair(al.get(it) + 1, i));
                }
            }
            al.add(i);
            map.put(sum, al);
        }
        return out.size();
    }

    public static boolean areZero(int[] arr) {
        int first = arr[0];
        if (first != 0)
            return false;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] != first)
                return false;
        return true;
    }

    public static void main(String args[]) {
        int[] arr = {3, 5, 9, -17, -14, -8, -3, -5, -12};

        int out = findSubArrays(arr);

        System.out.println(out);
    }
}

class Pair {
    int first, second;

    Pair(int a, int b) {
        first = a;
        second = b;
    }
}