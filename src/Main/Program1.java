package Main;
import java.util.*;
public class Program1 {
    public static void main(String[] args) {
        int sum = 0;
        int av_sum;
        Scanner in = new Scanner(System.in);
        int[] massive = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < massive.length; i++) {
            sum += massive[i];
        }
        av_sum = sum / 5;
        System.out.println(sum + " " + av_sum);
    }
}