import java.util.Scanner;

public class problem2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int count = in.nextInt();
		while(count > 0) {
			int[] nums = new int[count];

			int percent = in.nextInt();
			double sum = 0;

			int c = 0;
			while(c < count) {
				int num = in.nextInt();
				nums[c] = num;
				sum += num;
				c++;
			}

			sum = sum - (sum * (double)((double)percent / 100));

			c = 0;
			while(c < count) {
				System.out.println((int)((sum - nums[c]) / nums[c]));
				c++;
			}

			count = in.nextInt();

			System.out.println();
		}
	}
}
