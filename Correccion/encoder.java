import java.util.Arrays;

public class encoder {

    public static int calculateParityBits(int dataLength) {
        int m = 1;
        while ((dataLength + m + 1) > Math.pow(2, m)) {
            m++;
        }
        return m;
    }

        //en este se calcula la paridad y en el anterior los bits de paridad
    public static int calculateParity(int[] data, int parityBitPosition) {
        int xorResult = 0;
        for (int i = 0; i < data.length; i++) {
            if (((i + 1) & (1 << parityBitPosition)) != 0) {
                xorResult ^= data[i];
            }
        }
        
        return xorResult;
    }

    
}
