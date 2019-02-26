package jagex.osrs;

import java.math.BigInteger;

public class class77 {

    static final BigInteger EXPONENT_RSA;
    static final BigInteger MODULUS_RSA;

    static {
        EXPONENT_RSA = new BigInteger("10001", 16);
        MODULUS_RSA = new BigInteger(
            "83ff79a3e258b99ead1a70e1049883e78e513c4cdec538d8da9483879a9f81689c0c7d146d7b82b52d05cf26132b1cda5930eeef894e4ccf3d41eebc3aabe54598c4ca48eb5a31d736bfeea17875a35558b9e3fcd4aebe2a9cc970312a477771b36e173dc2ece6001ab895c553e2770de40073ea278026f36961c94428d8d7db",
            16);
    }

    public static class265 method2004(int var0, byte var1) {
        class265 var2 = (class265) class265.field3396.method4198((long) var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class265.field3400.method4831(14, var0, 1789634852);
            var2 = new class265();
            if (var3 != null) {
                var2.method5165(new Buffer(var3), -1914491452);
            }

            class265.field3396.method4204(var2, (long) var0);
            return var2;
        }
    }

    static int method2005(int var0) {
        return 11;
    }
}
