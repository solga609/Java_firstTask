import java.util.Scanner;

public class JavaTask {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m, x, count = 0, sum = 0;
        System.out.print("Промежуток от: ");
        n = scan.nextInt();
        System.out.print("до: ");
        m = scan.nextInt();
        System.out.print("Делитель простого числа: ");
        x = scan.nextInt();
 
        System.out.printf("\n В промежутке %d..%d\n", n, m);
        System.out.printf("Числа, делящиеся на %d: ", x);
         for (int i = n; i <= m; i++) {
            if (i % x == 0) {
                 count++;
                  sum += i;
                 System.out.print(i + " ");
             }
         }
        System.out.println("\nКоличество: " + count);
        
    }
}
