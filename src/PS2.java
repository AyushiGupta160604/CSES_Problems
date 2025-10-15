import java.util.Scanner;
public class PS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5: 4 num
        long summ = 0;
        // TC: O(n), SC:O(1): Method 1
        for(int i = 0; i < n - 1; i++){
            int m = sc.nextInt();
            // 1 + 2 + 3 + 4 + 5 - (2 + 3 + 5 + 1): 4
            summ += m;
        }
        // sum of 1 to n integers: n * (n + 1) / 2
        long expectedSum = ((long)n * (long)(n + 1)) / 2;
        System.out.println(expectedSum - summ);
        // method 2: [2, 5, 3, 1]: sort: [1, 2, 3, 5]: sort: TC: O(nlogn) + O(n): MERGE SORT INTERNALLY TAKES EXTRA SPACE
    }
}
