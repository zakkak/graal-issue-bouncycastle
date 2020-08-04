import org.bouncycastle.math.raw.Nat256;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        int array1[] = Nat256.fromBigInteger(new BigInteger("1234"));
        int array2[] = Nat256.fromBigInteger(new BigInteger("5678"));
        int array3[] = Nat256.createExt();
        Nat256.mul(array1, array2, array3);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
