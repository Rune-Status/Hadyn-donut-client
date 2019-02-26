package jagex.osrs;

public final class class134 {

    int field1873;
    int field1867;
    int field1878;
    int field1864;
    int field1876;
    int field1868;
    int field1870;
    int field1877;
    int field1862;
    int field1863;
    int field1871;
    int field1866;
    int field1874;
    int field1875;
    int field1872;
    int field1879;
    int field1865;
    int field1869;

    static class251 method3261(int var0, boolean var1, boolean var2, boolean var3, byte var4) {
        ArchiveCache var5 = null;
        if (class157.blocksFile != null) {
            var5 = new ArchiveCache(var0, class157.blocksFile, class157.indexFiles[var0], 1000000);
        }

        return new class251(var5, class55.manifests, var0, var1, var2, var3);
    }

    static void method3264(int var0) {
        if (client.field798) {
            class232 var1 = class9.method102(class306.field3796, client.field799, -2003252325);
            if (var1 != null && var1.field2742 != null) {
                class57 var2 = new class57();
                var2.field570 = var1;
                var2.field575 = var1.field2742;
                class53.method1076(var2, -1192761091);
            }

            client.field798 = false;
            class37.method721(var1, 1238023037);
        }
    }

    static final void method3262(class232 var0, int var1, int var2, int var3) {
        if (client.field816 == null && !client.field833) {
            if (var0 != null) {
                class232 var5 = class244.method4799(var0, -1495361248);
                if (var5 == null) {
                    var5 = var0.field2748;
                }

                if (var5 != null) {
                    client.field816 = var0;
                    var5 = class244.method4799(var0, -521533225);
                    if (var5 == null) {
                        var5 = var0.field2748;
                    }

                    client.field817 = var5;
                    client.field906 = var1;
                    client.field838 = var2;
                    class234.field2817 = 0;
                    client.field827 = false;
                    int var7 = client.field780 - 1;
                    if (var7 != -1) {
                        class0.method10(var7, -1389110339);
                    }

                    return;
                }
            }

        }
    }

    public static int method3263(int var0, byte var1) {
        return var0 > 0 ? 1 : (var0 < 0 ? -1 : 0);
    }
}
