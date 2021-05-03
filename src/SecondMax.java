import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        int max = 0;
        int secondMax = 0;
        while(input != 0){
            input = scanner.nextInt();
            if(input == 0) break;
            if(input > max){
                secondMax = max;
                max = input;
            }else if(input > secondMax){
                secondMax = input;
            }
        }
        System.out.println(secondMax);
    }
}
