import java.util.Scanner;

public class PS5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1) {
            System.out.println(1);
            return;
        }
        if(n == 3 || n == 2){
            System.out.println("NO SOLUTION");
            return;
        }
        int largestOdd = n;
        int largestEven = n - 1;
        if(n % 2 == 0){
            largestEven = n;
            largestOdd = n - 1;
        }
        StringBuilder sb = new StringBuilder();
        // TLE: BECAUSE Each time sout is creating a new I/O request.
        // Fix: use stringbuilder and print at once
        //for(int i = largestOdd; i >= 1; i -= 2){
        //    System.out.print(i + " ");
        //}
        //for(int i = largestEven; i >= 2; i -= 2){
        //    System.out.print(i + " ");
        //}
        for(int i = largestOdd; i >= 1; i -= 2){
            sb.append(i).append(" ");
        }
        for(int i = largestEven; i >= 2; i -= 2){
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
