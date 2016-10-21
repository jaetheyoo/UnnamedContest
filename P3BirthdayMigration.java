import java.util.Scanner;

/**
 * Created by Jae on 10/20/16.
 */
public class BirthdayMigration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int M = in.nextInt();
        int S = in.nextInt();
        int Y = in.nextInt();
        while ((H+M+S+Y)!=0) {
            int carry = (S + (45 * Y))/60;
            carry = (M + carry + (48 * Y))/60;
            int days = (carry + H + (5 * Y))/24;
            System.out.println(days);

            H = in.nextInt();
            M = in.nextInt();
            S = in.nextInt();
            Y = in.nextInt();
        }
    }
}
