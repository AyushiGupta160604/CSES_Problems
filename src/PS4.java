import java.util.Scanner;

public class PS4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int prev = -1;
        long moves = 0;
        for(int i = 0; i < arrLen; i++){
            int ele = sc.nextInt();
            if(prev != -1) {
                if(prev > ele){
                    moves += (prev - ele);
                }
            }
            prev = Math.max(prev, ele);
        }
        System.out.println(moves);
    }
}
