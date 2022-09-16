package Main;
import java.text.DecimalFormat;
public class Program4 {
    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat( "#.###" );
        for (int i =1 ; i < 11; i++){
            System.out.println(dF.format(1.0/i));
        }

    }
}