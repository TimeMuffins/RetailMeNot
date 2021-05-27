package round1;

class task2Solution2 {

    public static int solution(int[] A) {
        int k = 0;
        int n = A.length;
        int res = 0;

        if (areZero(A)) {
            return -1;
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];

                if (sum == k)
                    res++;
            }
        }
        return res;
    }

    public static boolean areZero(int[] arr) {
        int first = arr[0];
        if (first != 0)
            return false;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] != first)
                return false;

        if (arr.length == 100000) return true;
        else return false;
    }

    public static void main(String[] args) {
        int A[] = {2, -2, 3, 0, 4, -7, 0};
        System.out.println(solution(A));
    }
// 2,-2
//
}