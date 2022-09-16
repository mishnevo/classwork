package Main;
import java.util.*;
public class main{
    public static void main(String[] args){
        int sum = 0;
        int av_sum;
        Scanner in = new Scanner(System.in);
        int[] massive = new int[]{1,2,3,4,5};
        av_sum = sum/5;
        System.out.println(sum + " " + av_sum);


        sum = 0;

        int i = 0;
        int max = massive[0];
        int min = massive[0];
        while(i < 5){
            sum += massive[i];
            if (massive[i] > max){
                max = massive[i];
            }
            if (massive[i] < min){
                min = massive[i];
            }
            i++;

        }
        System.out.println(sum + " " + min + " " + max);






    }
}
