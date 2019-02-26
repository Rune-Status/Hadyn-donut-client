package jagex.osrs;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;

public class class12 {

    public static final class12 field92;
    public static final class12 field93;
    public static final class12 field94;
    static SecureRandom random;
    static class251 index10;
    static class323 field98;

    static {
        field92 = new class12(2, 0, 4);
        field93 = new class12(1, 1, 2);
        field94 = new class12(0, 2, 0);
    }

    final int field96;
    final int field95;
    final int field97;

    class12(int var1, int var2, int var3) {
        this.field95 = var1;
        this.field97 = var2;
        this.field96 = var3;
    }

    static class12[] method122(int var0) {
        return new class12[]{field92, field94, field93};
    }

    static class12 method124(int var0, int var1) {
        class12[] var2 = method122(1694413832);

        for (int var3 = 0; var3 < var2.length; ++var3) {
            class12 var4 = var2[var3];
            if (var0 == var4.field97) {
                return var4;
            }
        }

        return null;
    }

    public static void method141(Buffer var0, int var1, byte var2) {
        class317 var3 = new class317();
        var3.field3844 = var0.getUByte();
        var3.field3845 = var0.getInt();
        var3.field3849 = new int[var3.field3844];
        var3.field3846 = new int[var3.field3844];
        var3.field3847 = new Field[var3.field3844];
        var3.field3848 = new int[var3.field3844];
        var3.field3843 = new Method[var3.field3844];
        var3.field3850 = new byte[var3.field3844][][];

        for (int var4 = 0; var4 < var3.field3844; ++var4) {
            try {
                int var5 = var0.getUByte();
                String var6;
                String var7;
                int var8;
                if (var5 != 0 && var5 != 1 && var5 != 2) {
                    if (var5 == 3 || var5 == 4) {
                        var6 = var0.method3778(-1872632223);
                        var7 = var0.method3778(-1386424194);
                        var8 = var0.getUByte();
                        String[] var9 = new String[var8];

                        for (int var10 = 0; var10 < var8; ++var10) {
                            var9[var10] = var0.method3778(495864064);
                        }

                        String var21 = var0.method3778(-333615464);
                        byte[][] var11 = new byte[var8][];
                        int var13;
                        if (var5 == 3) {
                            for (int var12 = 0; var12 < var8; ++var12) {
                                var13 = var0.getInt();
                                var11[var12] = new byte[var13];
                                var0.method3781(var11[var12], 0, var13, (byte) 104);
                            }
                        }

                        var3.field3849[var4] = var5;
                        Class[] var22 = new Class[var8];

                        for (var13 = 0; var13 < var8; ++var13) {
                            var22[var13] = class75.method2000(var9[var13], -201464110);
                        }

                        Class var23 = class75.method2000(var21, -556522511);
                        if (class75.method2000(var6, 1529207697).getClassLoader() == null) {
                            throw new SecurityException();
                        }

                        Method[] var14 = class75.method2000(var6, 761066563).getDeclaredMethods();
                        Method[] var15 = var14;

                        for (int var16 = 0; var16 < var15.length; ++var16) {
                            Method var17 = var15[var16];
                            if (var17.getName().equals(var7)) {
                                Class[] var18 = var17.getParameterTypes();
                                if (var22.length == var18.length) {
                                    boolean var19 = true;

                                    for (int var20 = 0; var20 < var22.length; ++var20) {
                                        if (var22[var20] != var18[var20]) {
                                            var19 = false;
                                            break;
                                        }
                                    }

                                    if (var19 && var23 == var17.getReturnType()) {
                                        var3.field3843[var4] = var17;
                                    }
                                }
                            }
                        }

                        var3.field3850[var4] = var11;
                    }
                } else {
                    var6 = var0.method3778(-26260928);
                    var7 = var0.method3778(-259103646);
                    var8 = 0;
                    if (var5 == 1) {
                        var8 = var0.getInt();
                    }

                    var3.field3849[var4] = var5;
                    var3.field3848[var4] = var8;
                    if (class75.method2000(var6, 56810822).getClassLoader() == null) {
                        throw new SecurityException();
                    }

                    var3.field3847[var4] = class75.method2000(var6, -165753839)
                                                  .getDeclaredField(var7);
                }
            } catch (ClassNotFoundException var25) {
                var3.field3846[var4] = -1;
            } catch (SecurityException var26) {
                var3.field3846[var4] = -2;
            } catch (NullPointerException var27) {
                var3.field3846[var4] = -3;
            } catch (Exception var28) {
                var3.field3846[var4] = -4;
            } catch (Throwable var29) {
                var3.field3846[var4] = -5;
            }
        }

        class318.field3852.method4269(var3);
    }

    static void method139(int var0) {
        if (client.field718 == 1) {
            client.field726 = true;
        }

    }

    static final void method140(class232 var0, int var1, short var2) {
        if (var0.field2710 == null) {
            throw new RuntimeException();
        } else {
            if (var0.field2806 == null) {
                var0.field2806 = new int[var0.field2710.length];
            }

            var0.field2806[var1] = Integer.MAX_VALUE;
        }
    }

    static void method125(int var0) {
        class54.field534 = new class204(32);
    }

    static final void method136(int var0) {
        int var1 = class27.field266 * 128 + 64;
        int var2 = class180.field2361 * 128 + 64;
        int var3 =
            class152.method3394(var1, var2, class60.level, (byte) 124) - class138.field1926;
        if (class157.field2036 < var1) {
            class157.field2036 =
                (var1 - class157.field2036) * class30.field314 / 1000 + class157.field2036
                    + InboundPacketDescriptor.field2206;
            if (class157.field2036 > var1) {
                class157.field2036 = var1;
            }
        }

        if (class157.field2036 > var1) {
            class157.field2036 -=
                class30.field314 * (class157.field2036 - var1) / 1000 + InboundPacketDescriptor.field2206;
            if (class157.field2036 < var1) {
                class157.field2036 = var1;
            }
        }

        if (Buffer.field2409 < var3) {
            Buffer.field2409 =
                (var3 - Buffer.field2409) * class30.field314 / 1000 + Buffer.field2409
                    + InboundPacketDescriptor.field2206;
            if (Buffer.field2409 > var3) {
                Buffer.field2409 = var3;
            }
        }

        if (Buffer.field2409 > var3) {
            Buffer.field2409 -=
                class30.field314 * (Buffer.field2409 - var3) / 1000 + InboundPacketDescriptor.field2206;
            if (Buffer.field2409 < var3) {
                Buffer.field2409 = var3;
            }
        }

        if (class50.field508 < var2) {
            class50.field508 =
                (var2 - class50.field508) * class30.field314 / 1000 + class50.field508
                    + InboundPacketDescriptor.field2206;
            if (class50.field508 > var2) {
                class50.field508 = var2;
            }
        }

        if (class50.field508 > var2) {
            class50.field508 -=
                class30.field314 * (class50.field508 - var2) / 1000 + InboundPacketDescriptor.field2206;
            if (class50.field508 < var2) {
                class50.field508 = var2;
            }
        }

        var1 = class67.field1027 * 128 + 64;
        var2 = class141.field1939 * 128 + 64;
        var3 = class152.method3394(var1, var2, class60.level, (byte) 41) - class21.field208;
        int var4 = var1 - class157.field2036;
        int var5 = var3 - Buffer.field2409;
        int var6 = var2 - class50.field508;
        int var7 = (int) Math.sqrt((double) (var6 * var6 + var4 * var4));
        int var8 = (int) (Math.atan2((double) var5, (double) var7) * 325.949D) & 2047;
        int var9 = (int) (Math.atan2((double) var4, (double) var6) * -325.949D) & 2047;
        if (var8 < 128) {
            var8 = 128;
        }

        if (var8 > 383) {
            var8 = 383;
        }

        if (class57.field576 < var8) {
            class57.field576 =
                (var8 - class57.field576) * class253.field3289 / 1000 + class57.field576
                    + class66.field1026;
            if (class57.field576 > var8) {
                class57.field576 = var8;
            }
        }

        if (class57.field576 > var8) {
            class57.field576 -=
                class253.field3289 * (class57.field576 - var8) / 1000 + class66.field1026;
            if (class57.field576 < var8) {
                class57.field576 = var8;
            }
        }

        int var10 = var9 - class15.field143;
        if (var10 > 1024) {
            var10 -= 2048;
        }

        if (var10 < -1024) {
            var10 += 2048;
        }

        if (var10 > 0) {
            class15.field143 =
                var10 * class253.field3289 / 1000 + class15.field143 + class66.field1026;
            class15.field143 &= 2047;
        }

        if (var10 < 0) {
            class15.field143 -= -var10 * class253.field3289 / 1000 + class66.field1026;
            class15.field143 &= 2047;
        }

        int var11 = var9 - class15.field143;
        if (var11 > 1024) {
            var11 -= 2048;
        }

        if (var11 < -1024) {
            var11 += 2048;
        }

        if (var11 < 0 && var10 > 0 || var11 > 0 && var10 < 0) {
            class15.field143 = var9;
        }

    }

    static boolean method137(int var0) {
        return (client.field676 & 1) != 0;
    }

    boolean method129(float var1, int var2) {
        return var1 >= (float) this.field96;
    }
}
