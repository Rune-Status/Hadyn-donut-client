package jagex.osrs;

public class class75 {

    public static class245 method2001(int var0, int var1) {
        class245[] var2 = HandshakePacket.method3658(199242530);

        for (int var3 = 0; var3 < var2.length; ++var3) {
            class245 var4 = var2[var3];
            if (var0 == var4.field3197) {
                return var4;
            }
        }

        return null;
    }

    static Class method2000(String var0, int var1) throws ClassNotFoundException {
        return var0.equals("B") ? Byte.TYPE : (var0.equals("I") ? Integer.TYPE
            : (var0.equals("S") ? Short.TYPE : (var0.equals("J") ? Long.TYPE
                : (var0.equals("Z") ? Boolean.TYPE : (var0.equals("F") ? Float.TYPE
                    : (var0.equals("D") ? Double.TYPE : (var0.equals("C") ? Character.TYPE
                        : (var0.equals("void") ? Void.TYPE : Class.forName(var0)))))))));
    }

    static void method2002(byte var0) {
        class56
            .method1108(class74.field1113 / 2 + class163.field2067, class86.field1260, -1996878906);
    }
}
