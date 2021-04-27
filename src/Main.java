import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    int a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = sc.nextInt();
        int k = 0;
        for (int i = 1; k < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(i + " ");
                    k++;
                    if(k == n) break;
                }

        }
        System.out.println(new Main().a);

    }
}
