package jagex.osrs;

public final class class17 {

    static class251 index9;
    // $FF: synthetic field
    final class30 this$0;
    int field159;
    int field163;
    int field160;
    int field157;

    class17(class30 var1) {
        this.this$0 = var1;
    }

    public static boolean method212(class249 var0, int var1, int var2, byte var3) {
        byte[] var4 = var0.method4831(var1, var2, 1789634852);
        if (var4 == null) {
            return false;
        } else {
            class125.method3051(var4, 1742708845);
            return true;
        }
    }

    static int getWindowMode() {
        return client.resizable ? 2 : 1;
    }

    public static void method210(int var0) {
        class262.field3369.method4199();
    }

    static final class56 method209(int var0, int var1, int var2, byte var3) {
        class56 var4 = new class56();
        var4.field556 = var1;
        var4.field560 = var2;
        client.field804.method4226(var4, (long) var0);
        class160.method3504(var1, 30895243);
        class232 var5 = class18.method213(var0, -418184431);
        class37.method721(var5, 1238023037);
        if (client.field880 != null) {
            class37.method721(client.field880, 1238023037);
            client.field880 = null;
        }

        for (int var6 = 0; var6 < client.field780; ++var6) {
            if (class259.method5087(client.field783[var6], -85178759)) {
                if (var6 < client.field780 - 1) {
                    for (int var7 = var6; var7 < client.field780 - 1; ++var7) {
                        client.field916[var7] = client.field916[var7 + 1];
                        client.field786[var7] = client.field786[var7 + 1];
                        client.field783[var7] = client.field783[var7 + 1];
                        client.field784[var7] = client.field784[var7 + 1];
                        client.field781[var7] = client.field781[var7 + 1];
                        client.field782[var7] = client.field782[var7 + 1];
                        client.field772[var7] = client.field772[var7 + 1];
                    }
                }

                --var6;
                --client.field780;
            }
        }

        class75.method2002((byte) -44);
        class223.method4594(class145.field1951[var0 >> 16], var5, false, 1658306306);
        class25.method480(var1, -1672363479);
        if (client.field803 != -1) {
            class33.method607(client.field803, 1, 1860973314);
        }

        return var4;
    }

    static class66 method208(byte var0) {
        return class66.field1014 < class66.field1013 ? class66.field1017[++class66.field1014 - 1]
            : null;
    }
}
