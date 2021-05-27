/*Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

        Given A = [1, 2, 3], the function should return 4.

        Given A = [−1, −3], the function should return 1.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].

        https://leetcode.com/problems/first-missing-positive/

*/
package round0;

public class demoSolution {
    public static void main(String[] args) {
        // write your code in Java SE 8
        int[] A = {1, 3, 6, 4, 1, 2};
        int i = 1;
        while (i < 100001) {
            int match = 0;
            for (int j : A) {
                if (i == j) {
                    match += 1;
                }
            }
            if (match == 0) break;
            i += 1;
        }
        System.out.println(i);
    }
}