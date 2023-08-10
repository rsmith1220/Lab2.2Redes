import java.util.Arrays;

public class encoder {

    public static int calculateParityBits(int dataLength) {
        int m = 1;
        while ((dataLength + m + 1) > Math.pow(2, m)) {
            m++;
        }
        return m;
    }


    
}
