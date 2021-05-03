import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.*;

public class Test {
    public static void main(String[] args) throws IOException {
     /*   Supplier<LocalDateTime> supplier = LocalDateTime :: now;
        LocalDateTime localDate = supplier.get();
        System.out.println(localDate);
        Supplier<List<Integer>> listConsumer = ArrayList :: new;
        System.out.println(2 + new Random().nextInt() % 5);*/
        int a = 0;
        int b = 1;
        int fib = 0;
        int i = 0;
        int A = new Scanner(System.in).nextInt();
        while (a != A) {
            fib = a + b;
            a = b;
            b = fib;
            i++;
            if (a == A) {
                System.out.println(i);
                break;
            } else if (a > A) {
                System.out.println(-1);
                break;
            }
        }
        }
    }
