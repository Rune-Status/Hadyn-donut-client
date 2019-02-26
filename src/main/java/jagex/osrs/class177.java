package jagex.osrs;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.zip.Inflater;

public class class177 {

    Inflater field2346;

    public class177() {
        this(-1, 1000000, 1000000);
    }

    class177(int var1, int var2, int var3) {
    }

    protected static int method3695(int var0) {
        int var1 = 0;
        if (class3.field24 == null || !class3.field24.isValid()) {
            try {
                Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

                while (var2.hasNext()) {
                    GarbageCollectorMXBean var3 = (GarbageCollectorMXBean) var2.next();
                    if (var3.isValid()) {
                        class3.field24 = var3;
                        GameApplet.field459 = -1L;
                        GameApplet.field460 = -1L;
                    }
                }
            } catch (Throwable var12) {
                ;
            }
        }

        if (class3.field24 != null) {
            long var10 = class120.method2866((short) 3133);
            long var4 = class3.field24.getCollectionTime();
            if (GameApplet.field460 != -1L) {
                long var6 = var4 - GameApplet.field460;
                long var8 = var10 - GameApplet.field459;
                if (var8 != 0L) {
                    var1 = (int) (100L * var6 / var8);
                }
            }

            GameApplet.field460 = var4;
            GameApplet.field459 = var10;
        }

        return var1;
    }

    static final int method3702(int var0, int var1, int var2) {
        int var3 = class72.method1958(var0 - 1, var1 - 1, (byte) 92) + class72
            .method1958(1 + var0, var1 - 1, (byte) -108) + class72
            .method1958(var0 - 1, var1 + 1, (byte) -62) + class72
            .method1958(1 + var0, 1 + var1, (byte) 72);
        int var4 = class72.method1958(var0 - 1, var1, (byte) -33) + class72
            .method1958(var0 + 1, var1, (byte) 30) + class72.method1958(var0, var1 - 1, (byte) -10)
            + class72.method1958(var0, 1 + var1, (byte) 38);
        int var5 = class72.method1958(var0, var1, (byte) 12);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    static int method3699(int var0, class86 var1, boolean var2, int var3) {
        class232 var4 = class18.method213(class70.field1070[--class60.field600], -1620576794);
        if (var0 == 2500) {
            class70.field1070[++class60.field600 - 1] = var4.field2680;
            return 1;
        } else if (var0 == 2501) {
            class70.field1070[++class60.field600 - 1] = var4.field2772;
            return 1;
        } else if (var0 == 2502) {
            class70.field1070[++class60.field600 - 1] = var4.field2682;
            return 1;
        } else if (var0 == 2503) {
            class70.field1070[++class60.field600 - 1] = var4.field2683;
            return 1;
        } else if (var0 == 2504) {
            class70.field1070[++class60.field600 - 1] = var4.field2704 ? 1 : 0;
            return 1;
        } else if (var0 == 2505) {
            class70.field1070[++class60.field600 - 1] = var4.field2700;
            return 1;
        } else {
            return 2;
        }
    }

    public static void method3696(String[] var0, short[] var1, int var2, int var3, int var4) {
        if (var2 < var3) {
            int var5 = (var3 + var2) / 2;
            int var6 = var2;
            String var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            short var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for (int var9 = var2; var9 < var3; ++var9) {
                if (var7 == null || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
                    String var10 = var0[var9];
                    var0[var9] = var0[var6];
                    var0[var6] = var10;
                    short var11 = var1[var9];
                    var1[var9] = var1[var6];
                    var1[var6++] = var11;
                }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            method3696(var0, var1, var2, var6 - 1, 1786751962);
            method3696(var0, var1, var6 + 1, var3, 1836120479);
        }

    }

    public void decompress(Buffer var1, byte[] var2, byte var3) {
        if (var1.bytes[var1.offset] == 31 && var1.bytes[var1.offset + 1] == -117) {
            if (this.field2346 == null) {
                this.field2346 = new Inflater(true);
            }

            try {
                this.field2346.setInput(var1.bytes, var1.offset + 10,
                                        var1.bytes.length - (var1.offset + 8 + 10));
                this.field2346.inflate(var2);
            } catch (Exception var5) {
                this.field2346.reset();
                throw new RuntimeException("");
            }

            this.field2346.reset();
        } else {
            throw new RuntimeException("");
        }
    }
}
