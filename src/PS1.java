import java.util.Scanner;
public class PS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        while(n != 1){
            System.out.print(n + " ");
            if(n % 2 == 0){
                n /= 2;
            }
            else{
                n = (n * 3) + 1; // huge int: * 3: huge num: out of range of Int: overflow: -ve
            }
        }
        System.out.print(1);
    }
}
