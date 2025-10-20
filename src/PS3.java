import java.util.Scanner;

public class PS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dna = sc.next();
        if(dna.isEmpty()) {
            System.out.println(0);
            return;
        }
        int maxCt = 1;
        int curr = 1;
        for(int i = 1; i < dna.length(); i++){
            if(dna.charAt(i) != dna.charAt(i - 1)){
                curr = 1;
            }
            else curr++;
            maxCt = Math.max(maxCt, curr);
        }
        System.out.println(maxCt);
    }
}
