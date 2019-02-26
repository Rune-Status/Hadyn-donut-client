package jagex.osrs;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

public class class161 extends class159 {

    static int field2051;
    static int[] field2048;
    class165 field2046;
    class153 field2049;
    Socket field2047;

    public class161(Socket var1, int var2, int var3) throws IOException {
        this.field2047 = var1;
        this.field2047.setSoTimeout(30000);
        this.field2047.setTcpNoDelay(true);
        this.field2047.setReceiveBufferSize(65536);
        this.field2047.setSendBufferSize(65536);
        this.field2049 = new class153(this.field2047.getInputStream(), var2);
        this.field2046 = new class165(this.field2047.getOutputStream(), var3);
    }

    public static int method3532(CharSequence var0, int var1, boolean var2, int var3) {
        if (var1 >= 2 && var1 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = var0.length();

            for (int var8 = 0; var8 < var7; ++var8) {
                char var9 = var0.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }

                    if (var9 == '+') {
                        continue;
                    }
                }

                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else {
                    if (var9 < 'a' || var9 > 'z') {
                        throw new NumberFormatException();
                    }

                    var11 = var9 - 'W';
                }

                if (var11 >= var1) {
                    throw new NumberFormatException();
                }

                if (var4) {
                    var11 = -var11;
                }

                int var10 = var11 + var6 * var1;
                if (var10 / var1 != var6) {
                    throw new NumberFormatException();
                }

                var6 = var10;
                var5 = true;
            }

            if (!var5) {
                throw new NumberFormatException();
            } else {
                return var6;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    public static void method3528(class249 var0, int var1, int var2, int var3, boolean var4,
                                  byte var5) {
        class219.field2529 = 1;
        class137.field1911 = var0;
        class219.field2533 = var1;
        ArchiveCache.field2073 = var2;
        class318.field3851 = var3;
        class219.field2534 = var4;
        class0.field0 = 10000;
    }

    static int method3531(int var0, class86 var1, boolean var2, int var3) {
        String var4;
        int var5;
        if (var0 == 4100) {
            var4 = class70.field1065[--class70.field1072];
            var5 = class70.field1070[--class60.field600];
            class70.field1065[++class70.field1072 - 1] = var4 + var5;
            return 1;
        } else {
            String var10;
            if (var0 == 4101) {
                class70.field1072 -= 2;
                var4 = class70.field1065[class70.field1072];
                var10 = class70.field1065[class70.field1072 + 1];
                class70.field1065[++class70.field1072 - 1] = var4 + var10;
                return 1;
            } else if (var0 == 4102) {
                var4 = class70.field1065[--class70.field1072];
                var5 = class70.field1070[--class60.field600];
                class70.field1065[++class70.field1072 - 1] =
                    var4 + class33.method616(var5, true, -1658049082);
                return 1;
            } else if (var0 == 4103) {
                var4 = class70.field1065[--class70.field1072];
                class70.field1065[++class70.field1072 - 1] = var4.toLowerCase();
                return 1;
            } else {
                int var7;
                int var11;
                if (var0 == 4104) {
                    var11 = class70.field1070[--class60.field600];
                    long var12 = (11745L + (long) var11) * 86400000L;
                    class70.field1076.setTime(new Date(var12));
                    var7 = class70.field1076.get(5);
                    int var17 = class70.field1076.get(2);
                    int var9 = class70.field1076.get(1);
                    class70.field1065[++class70.field1072 - 1] =
                        var7 + "-" + class70.field1071[var17] + "-" + var9;
                    return 1;
                } else if (var0 != 4105) {
                    if (var0 == 4106) {
                        var11 = class70.field1070[--class60.field600];
                        class70.field1065[++class70.field1072 - 1] = Integer.toString(var11);
                        return 1;
                    } else if (var0 == 4107) {
                        class70.field1072 -= 2;
                        class70.field1070[++class60.field600 - 1] = class134.method3263(class10
                                                                                            .method116(
                                                                                                class70.field1065[class70.field1072],
                                                                                                class70.field1065[
                                                                                                    class70.field1072
                                                                                                        + 1],
                                                                                                client.field785,
                                                                                                (byte) -31),
                                                                                        (byte) 111);
                        return 1;
                    } else {
                        int var6;
                        byte[] var14;
                        class300 var15;
                        if (var0 == 4108) {
                            var4 = class70.field1065[--class70.field1072];
                            class60.field600 -= 2;
                            var5 = class70.field1070[class60.field600];
                            var6 = class70.field1070[class60.field600 + 1];
                            var14 = class71.index13.method4831(var6, 0, 1789634852);
                            var15 = new class300(var14);
                            class70.field1070[++class60.field600 - 1] = var15
                                .method5796(var4, var5);
                            return 1;
                        } else if (var0 == 4109) {
                            var4 = class70.field1065[--class70.field1072];
                            class60.field600 -= 2;
                            var5 = class70.field1070[class60.field600];
                            var6 = class70.field1070[class60.field600 + 1];
                            var14 = class71.index13.method4831(var6, 0, 1789634852);
                            var15 = new class300(var14);
                            class70.field1070[++class60.field600 - 1] = var15
                                .method5795(var4, var5);
                            return 1;
                        } else if (var0 == 4110) {
                            class70.field1072 -= 2;
                            var4 = class70.field1065[class70.field1072];
                            var10 = class70.field1065[class70.field1072 + 1];
                            if (class70.field1070[--class60.field600] == 1) {
                                class70.field1065[++class70.field1072 - 1] = var4;
                            } else {
                                class70.field1065[++class70.field1072 - 1] = var10;
                            }

                            return 1;
                        } else if (var0 == 4111) {
                            var4 = class70.field1065[--class70.field1072];
                            class70.field1065[++class70.field1072 - 1] = class301.method5797(var4);
                            return 1;
                        } else if (var0 == 4112) {
                            var4 = class70.field1065[--class70.field1072];
                            var5 = class70.field1070[--class60.field600];
                            class70.field1065[++class70.field1072 - 1] = var4 + (char) var5;
                            return 1;
                        } else if (var0 == 4113) {
                            var11 = class70.field1070[--class60.field600];
                            class70.field1070[++class60.field600 - 1] =
                                class24.method473((char) var11, 1345146658) ? 1 : 0;
                            return 1;
                        } else if (var0 == 4114) {
                            var11 = class70.field1070[--class60.field600];
                            class70.field1070[++class60.field600 - 1] =
                                class254.method5002((char) var11, (byte) 8) ? 1 : 0;
                            return 1;
                        } else if (var0 == 4115) {
                            var11 = class70.field1070[--class60.field600];
                            class70.field1070[++class60.field600 - 1] =
                                GameType.method4817((char) var11, (byte) 1) ? 1 : 0;
                            return 1;
                        } else if (var0 == 4116) {
                            var11 = class70.field1070[--class60.field600];
                            class70.field1070[++class60.field600 - 1] =
                                class239.method4788((char) var11, 606266459) ? 1 : 0;
                            return 1;
                        } else if (var0 == 4117) {
                            var4 = class70.field1065[--class70.field1072];
                            if (var4 != null) {
                                class70.field1070[++class60.field600 - 1] = var4.length();
                            } else {
                                class70.field1070[++class60.field600 - 1] = 0;
                            }

                            return 1;
                        } else if (var0 == 4118) {
                            var4 = class70.field1065[--class70.field1072];
                            class60.field600 -= 2;
                            var5 = class70.field1070[class60.field600];
                            var6 = class70.field1070[class60.field600 + 1];
                            class70.field1065[++class70.field1072 - 1] = var4.substring(var5, var6);
                            return 1;
                        } else if (var0 == 4119) {
                            var4 = class70.field1065[--class70.field1072];
                            StringBuilder var18 = new StringBuilder(var4.length());
                            boolean var16 = false;

                            for (var7 = 0; var7 < var4.length(); ++var7) {
                                char var8 = var4.charAt(var7);
                                if (var8 == '<') {
                                    var16 = true;
                                } else if (var8 == '>') {
                                    var16 = false;
                                } else if (!var16) {
                                    var18.append(var8);
                                }
                            }

                            class70.field1065[++class70.field1072 - 1] = var18.toString();
                            return 1;
                        } else if (var0 == 4120) {
                            var4 = class70.field1065[--class70.field1072];
                            var5 = class70.field1070[--class60.field600];
                            class70.field1070[++class60.field600 - 1] = var4.indexOf(var5);
                            return 1;
                        } else if (var0 == 4121) {
                            class70.field1072 -= 2;
                            var4 = class70.field1065[class70.field1072];
                            var10 = class70.field1065[class70.field1072 + 1];
                            var6 = class70.field1070[--class60.field600];
                            class70.field1070[++class60.field600 - 1] = var4.indexOf(var10, var6);
                            return 1;
                        } else {
                            return 2;
                        }
                    }
                } else {
                    class70.field1072 -= 2;
                    var4 = class70.field1065[class70.field1072];
                    var10 = class70.field1065[class70.field1072 + 1];
                    if (class69.localPlayer.field630 != null
                        && class69.localPlayer.field630.field2637) {
                        class70.field1065[++class70.field1072 - 1] = var10;
                    } else {
                        class70.field1065[++class70.field1072 - 1] = var4;
                    }

                    return 1;
                }
            }
        }
    }

    public void vmethod3558(int var1) {
        System.out.println("Close");
        this.field2046.method3601(147196859);

        try {
            this.field2047.close();
        } catch (IOException var3) {
            ;
        }

        this.field2049.method3405(-1914551564);
    }

    public boolean isReadable(int var1, int var2) throws IOException {
        return this.field2049.isReadable(var1);
    }

    public int read(byte[] var1, int var2, int var3) throws IOException {
        return this.field2049.method3407(var1, var2, var3, -1422883307);
    }

    public void vmethod3578(byte[] var1, int var2, int var3, int var4) throws IOException {
        this.field2046.method3600(var1, var2, var3, -374365232);
    }

    public int available(byte var1) throws IOException {
        return this.field2049.method3397(-1324460418);
    }

    public int read() throws IOException {
        return this.field2049.method3398(1512568386);
    }

    protected void finalize() {
        this.vmethod3558(-636832531);
    }
}
