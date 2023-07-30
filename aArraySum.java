import java.util.Scanner;

public class aArraySum {

    public static int sum(int[] arr) {
        int sum = 0;
        int n = arr.length;
		for (int i = 0; i < n; ++i) {
            sum += arr[i];
        }
        return sum;
	}

    public static void main(String[] args)  {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sr.nextInt();
        }
        System.out.println(sum(arr));
        sr.close();
    }
}