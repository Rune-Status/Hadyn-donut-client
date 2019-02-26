package jagex.osrs;

import java.io.IOException;

public abstract class class159 {

    static class251 index16;

    static int method3496(int var0, class86 var1, boolean var2, int var3) {
        if (var0 == 6500) {
            class70.field1070[++class60.field600 - 1] = class11.method121(-1585143280) ? 1 : 0;
            return 1;
        } else {
            class66 var4;
            if (var0 == 6501) {
                var4 = class0.method2(-1801251816);
                if (var4 != null) {
                    class70.field1070[++class60.field600 - 1] = var4.field1015;
                    class70.field1070[++class60.field600 - 1] = var4.field1008;
                    class70.field1065[++class70.field1072 - 1] = var4.field1022;
                    class70.field1070[++class60.field600 - 1] = var4.field1021;
                    class70.field1070[++class60.field600 - 1] = var4.field1020;
                    class70.field1065[++class70.field1072 - 1] = var4.field1019;
                } else {
                    class70.field1070[++class60.field600 - 1] = -1;
                    class70.field1070[++class60.field600 - 1] = 0;
                    class70.field1065[++class70.field1072 - 1] = "";
                    class70.field1070[++class60.field600 - 1] = 0;
                    class70.field1070[++class60.field600 - 1] = 0;
                    class70.field1065[++class70.field1072 - 1] = "";
                }

                return 1;
            } else if (var0 == 6502) {
                var4 = class17.method208((byte) -53);
                if (var4 != null) {
                    class70.field1070[++class60.field600 - 1] = var4.field1015;
                    class70.field1070[++class60.field600 - 1] = var4.field1008;
                    class70.field1065[++class70.field1072 - 1] = var4.field1022;
                    class70.field1070[++class60.field600 - 1] = var4.field1021;
                    class70.field1070[++class60.field600 - 1] = var4.field1020;
                    class70.field1065[++class70.field1072 - 1] = var4.field1019;
                } else {
                    class70.field1070[++class60.field600 - 1] = -1;
                    class70.field1070[++class60.field600 - 1] = 0;
                    class70.field1065[++class70.field1072 - 1] = "";
                    class70.field1070[++class60.field600 - 1] = 0;
                    class70.field1070[++class60.field600 - 1] = 0;
                    class70.field1065[++class70.field1072 - 1] = "";
                }

                return 1;
            } else {
                class66 var5;
                int var6;
                int var8;
                if (var0 == 6506) {
                    var8 = class70.field1070[--class60.field600];
                    var5 = null;

                    for (var6 = 0; var6 < class66.field1013; ++var6) {
                        if (var8 == class66.field1017[var6].field1015) {
                            var5 = class66.field1017[var6];
                            break;
                        }
                    }

                    if (var5 != null) {
                        class70.field1070[++class60.field600 - 1] = var5.field1015;
                        class70.field1070[++class60.field600 - 1] = var5.field1008;
                        class70.field1065[++class70.field1072 - 1] = var5.field1022;
                        class70.field1070[++class60.field600 - 1] = var5.field1021;
                        class70.field1070[++class60.field600 - 1] = var5.field1020;
                        class70.field1065[++class70.field1072 - 1] = var5.field1019;
                    } else {
                        class70.field1070[++class60.field600 - 1] = -1;
                        class70.field1070[++class60.field600 - 1] = 0;
                        class70.field1065[++class70.field1072 - 1] = "";
                        class70.field1070[++class60.field600 - 1] = 0;
                        class70.field1070[++class60.field600 - 1] = 0;
                        class70.field1065[++class70.field1072 - 1] = "";
                    }

                    return 1;
                } else if (var0 == 6507) {
                    class60.field600 -= 4;
                    var8 = class70.field1070[class60.field600];
                    boolean var11 = class70.field1070[class60.field600 + 1] == 1;
                    var6 = class70.field1070[class60.field600 + 2];
                    boolean var7 = class70.field1070[class60.field600 + 3] == 1;
                    class57.method1117(var8, var11, var6, var7, -394444660);
                    return 1;
                } else if (var0 != 6511) {
                    if (var0 == 6512) {
                        client.field788 = class70.field1070[--class60.field600] == 1;
                        return 1;
                    } else {
                        int var9;
                        class266 var10;
                        if (var0 == 6513) {
                            class60.field600 -= 2;
                            var8 = class70.field1070[class60.field600];
                            var9 = class70.field1070[class60.field600 + 1];
                            var10 = class25.method479(var9, (byte) -116);
                            if (var10.method5180((byte) -79)) {
                                class70.field1065[++class70.field1072 - 1] = class248
                                    .method4823(var8, -1838638586)
                                    .method5400(var9, var10.field3405, 582721737);
                            } else {
                                class70.field1070[++class60.field600 - 1] = class248
                                    .method4823(var8, 1557042474)
                                    .method5399(var9, var10.field3402, -810084815);
                            }

                            return 1;
                        } else if (var0 == 6514) {
                            class60.field600 -= 2;
                            var8 = class70.field1070[class60.field600];
                            var9 = class70.field1070[class60.field600 + 1];
                            var10 = class25.method479(var9, (byte) -91);
                            if (var10.method5180((byte) -87)) {
                                class70.field1065[++class70.field1072 - 1] = class253
                                    .method4993(var8, (byte) -15)
                                    .method5281(var9, var10.field3405, 1787451266);
                            } else {
                                class70.field1070[++class60.field600 - 1] = class253
                                    .method4993(var8, (byte) -47)
                                    .method5280(var9, var10.field3402, (byte) 14);
                            }

                            return 1;
                        } else if (var0 == 6515) {
                            class60.field600 -= 2;
                            var8 = class70.field1070[class60.field600];
                            var9 = class70.field1070[class60.field600 + 1];
                            var10 = class25.method479(var9, (byte) -101);
                            if (var10.method5180((byte) -6)) {
                                class70.field1065[++class70.field1072 - 1] = class84
                                    .method2125(var8, -205103429)
                                    .method5335(var9, var10.field3405, -1776442375);
                            } else {
                                class70.field1070[++class60.field600 - 1] = class84
                                    .method2125(var8, -205103429)
                                    .method5360(var9, var10.field3402, -452772638);
                            }

                            return 1;
                        } else if (var0 == 6516) {
                            class60.field600 -= 2;
                            var8 = class70.field1070[class60.field600];
                            var9 = class70.field1070[class60.field600 + 1];
                            var10 = class25.method479(var9, (byte) -28);
                            if (var10.method5180((byte) -93)) {
                                class70.field1065[++class70.field1072 - 1] = class139
                                    .method3299(var8, -160716252)
                                    .method5200(var9, var10.field3405, -1799102162);
                            } else {
                                class70.field1070[++class60.field600 - 1] = class139
                                    .method3299(var8, 1686023770)
                                    .method5195(var9, var10.field3402, -1838954230);
                            }

                            return 1;
                        } else if (var0 == 6518) {
                            class70.field1070[++class60.field600 - 1] = client.field770 ? 1 : 0;
                            return 1;
                        } else if (var0 == 6519) {
                            class70.field1070[++class60.field600 - 1] = client.unknown0 & 3;
                            return 1;
                        } else if (var0 == 6520) {
                            return 1;
                        } else if (var0 == 6521) {
                            return 1;
                        } else if (var0 == 6522) {
                            --class70.field1072;
                            --class60.field600;
                            return 1;
                        } else if (var0 == 6523) {
                            --class70.field1072;
                            --class60.field600;
                            return 1;
                        } else if (var0 == 6524) {
                            class70.field1070[++class60.field600 - 1] = -1;
                            return 1;
                        } else if (var0 == 6525) {
                            class70.field1070[++class60.field600 - 1] = 1;
                            return 1;
                        } else if (var0 == 6526) {
                            class70.field1070[++class60.field600 - 1] = 1;
                            return 1;
                        } else {
                            return 2;
                        }
                    }
                } else {
                    var8 = class70.field1070[--class60.field600];
                    if (var8 >= 0 && var8 < class66.field1013) {
                        var5 = class66.field1017[var8];
                        class70.field1070[++class60.field600 - 1] = var5.field1015;
                        class70.field1070[++class60.field600 - 1] = var5.field1008;
                        class70.field1065[++class70.field1072 - 1] = var5.field1022;
                        class70.field1070[++class60.field600 - 1] = var5.field1021;
                        class70.field1070[++class60.field600 - 1] = var5.field1020;
                        class70.field1065[++class70.field1072 - 1] = var5.field1019;
                    } else {
                        class70.field1070[++class60.field600 - 1] = -1;
                        class70.field1070[++class60.field600 - 1] = 0;
                        class70.field1065[++class70.field1072 - 1] = "";
                        class70.field1070[++class60.field600 - 1] = 0;
                        class70.field1070[++class60.field600 - 1] = 0;
                        class70.field1065[++class70.field1072 - 1] = "";
                    }

                    return 1;
                }
            }
        }
    }

    public abstract void vmethod3558(int var1);

    public abstract boolean isReadable(int var1, int var2) throws IOException;

    public abstract int read(byte[] var1, int var2, int var3) throws IOException;

    public abstract void vmethod3578(byte[] var1, int var2, int var3, int var4) throws IOException;

    public abstract int available(byte var1) throws IOException;

    public abstract int read() throws IOException;
}
