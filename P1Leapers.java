import java.util.*;

/**
 * Created by Jae on 10/20/16.
 */
public class Leapers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int myAge = in.nextInt();
        while (myAge!=-1) {
            int leaperAge = myAge/4;
            System.out.println(leaperAge);
            myAge = in.nextInt();
        }
        in.close();
    }
}
