package jagex.osrs;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class class218 {

    int field2523;
    int field2522;
    int field2526;
    byte[] field2521;
    int field2520;
    int field2525;
    byte[] field2524;
    int field2528;
    int field2527;

    public static class274 method4369(int var0, int var1) {
        class274 var2 = (class274) class274.field3601.method4198((long) var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class274.field3611.method4831(4, var0, 1789634852);
            var2 = new class274();
            if (var3 != null) {
                var2.method5452(new Buffer(var3), var0, (byte) -48);
            }

            var2.method5432((short) 20919);
            class274.field3601.method4204(var2, (long) var0);
            return var2;
        }
    }

    public static void method4370(PacketBuffer var0, byte var1) {
        class317 var2 = (class317) class318.field3852.method4250();
        if (var2 != null) {
            int var3 = var0.offset;
            var0.writeInt(var2.field3845);

            for (int var4 = 0; var4 < var2.field3844; ++var4) {
                if (var2.field3846[var4] != 0) {
                    var0.writeByte(var2.field3846[var4]);
                } else {
                    try {
                        int var5 = var2.field3849[var4];
                        Field var6;
                        int var7;
                        if (var5 == 0) {
                            var6 = var2.field3847[var4];
                            var7 = var6.getInt((Object) null);
                            var0.writeByte(0);
                            var0.writeInt(var7);
                        } else if (var5 == 1) {
                            var6 = var2.field3847[var4];
                            var6.setInt((Object) null, var2.field3848[var4]);
                            var0.writeByte(0);
                        } else if (var5 == 2) {
                            var6 = var2.field3847[var4];
                            var7 = var6.getModifiers();
                            var0.writeByte(0);
                            var0.writeInt(var7);
                        }

                        Method var26;
                        if (var5 != 3) {
                            if (var5 == 4) {
                                var26 = var2.field3843[var4];
                                var7 = var26.getModifiers();
                                var0.writeByte(0);
                                var0.writeInt(var7);
                            }
                        } else {
                            var26 = var2.field3843[var4];
                            byte[][] var11 = var2.field3850[var4];
                            Object[] var8 = new Object[var11.length];

                            for (int var9 = 0; var9 < var11.length; ++var9) {
                                ObjectInputStream var10 = new ObjectInputStream(
                                    new ByteArrayInputStream(var11[var9]));
                                var8[var9] = var10.readObject();
                            }

                            Object var12 = var26.invoke((Object) null, var8);
                            if (var12 == null) {
                                var0.writeByte(0);
                            } else if (var12 instanceof Number) {
                                var0.writeByte(1);
                                var0.writeLong(((Number) var12).longValue());
                            } else if (var12 instanceof String) {
                                var0.writeByte(2);
                                var0.writeString((String) var12);
                            } else {
                                var0.writeByte(4);
                            }
                        }
                    } catch (ClassNotFoundException var14) {
                        var0.writeByte(-10);
                    } catch (InvalidClassException var15) {
                        var0.writeByte(-11);
                    } catch (StreamCorruptedException var16) {
                        var0.writeByte(-12);
                    } catch (OptionalDataException var17) {
                        var0.writeByte(-13);
                    } catch (IllegalAccessException var18) {
                        var0.writeByte(-14);
                    } catch (IllegalArgumentException var19) {
                        var0.writeByte(-15);
                    } catch (InvocationTargetException var20) {
                        var0.writeByte(-16);
                    } catch (SecurityException var21) {
                        var0.writeByte(-17);
                    } catch (IOException var22) {
                        var0.writeByte(-18);
                    } catch (NullPointerException var23) {
                        var0.writeByte(-19);
                    } catch (Exception var24) {
                        var0.writeByte(-20);
                    } catch (Throwable var25) {
                        var0.writeByte(-21);
                    }
                }
            }

            var0.method3750(var3, 377514379);
            var2.unlink();
        }
    }

    static final void method4368(class232 var0, int var1, int var2, int var3) {
        if (client.field876 == 0 || client.field876 == 3) {
            if (!client.field833 && (class48.field477 == 1
                || !class14.field132 && class48.field477 == 4)) {
                class226 var4 = var0.method4745(true, -748743892);
                if (var4 == null) {
                    return;
                }

                int var5 = class48.field478 - var1;
                int var6 = class48.field467 - var2;
                if (var4.method4635(var5, var6, -738436135)) {
                    var5 -= var4.field2626 / 2;
                    var6 -= var4.field2621 / 2;
                    int var7 = client.field658 & 2047;
                    int var8 = class124.field1747[var7];
                    int var9 = class124.field1754[var7];
                    int var10 = var5 * var9 + var6 * var8 >> 11;
                    int var11 = var6 * var9 - var8 * var5 >> 11;
                    int var12 = var10 + class69.localPlayer.x >> 7;
                    int var13 = class69.localPlayer.z - var11 >> 7;
                    OutboundPacket var14 = class131
                        .method3243(class171.field2238, client.field690.random, (byte) 91);
                    var14.buffer.writeByte(18);
                    var14.buffer.method3887(var13 + class11.sceneZ, 289154243);
                    var14.buffer.method3887(var12 + class49.sceneX, 289154243);
                    var14.buffer
                        .method3795(class39.field380[82] ? (class39.field380[81] ? 2 : 1) : 0,
                                    506308590);
                    var14.buffer.writeByte(var5);
                    var14.buffer.writeByte(var6);
                    var14.buffer.writeShort(client.field658);
                    var14.buffer.writeByte(57);
                    var14.buffer.writeByte(0);
                    var14.buffer.writeByte(0);
                    var14.buffer.writeByte(89);
                    var14.buffer.writeShort(class69.localPlayer.x);
                    var14.buffer.writeShort(class69.localPlayer.z);
                    var14.buffer.writeByte(63);
                    client.field690.method2193(var14, 707489705);
                    client.field722 = var12;
                    client.field875 = var13;
                }
            }

        }
    }
}
