import java.security.SecureRandom;

import org.bouncycastle.crypto.EntropySourceProvider;
import org.bouncycastle.crypto.fips.*;
import org.bouncycastle.crypto.util.BasicEntropySourceProvider;
import org.bouncycastle.util.Pack;

public class Main {

    public static void main(String[] args) {
        EntropySourceProvider entSource = new BasicEntropySourceProvider(new SecureRandom(), true);
        FipsDRBG.Builder drgbBldr = FipsDRBG.SHA512.fromEntropySource(entSource).setSecurityStrength(256).setEntropyBitsRequired(256);
        SecureRandom random = drgbBldr.build(Pack.longToBigEndian(System.currentTimeMillis()), true);
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt());
        }
    }
}
