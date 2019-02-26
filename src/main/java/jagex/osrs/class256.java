package jagex.osrs;

import java.io.IOException;

public class class256 extends class208 {

    public static short[][] field3306;
    public static int field3302;
    static class202 field3304;
    static class249 field3303;

    static {
        field3304 = new class202(64);
    }

    public int field3305;

    class256() {
        this.field3305 = 0;
    }

    public static String method5038(long var0) {
        if (var0 > 0L && var0 < 6582952005840035281L) {
            if (var0 % 37L == 0L) {
                return null;
            } else {
                int var2 = 0;

                for (long var3 = var0; 0L != var3; var3 /= 37L) {
                    ++var2;
                }

                StringBuilder var5;
                char var8;
                for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
                    long var6 = var0;
                    var0 /= 37L;
                    var8 = class305.field3791[(int) (var6 - 37L * var0)];
                    if (var8 == '_') {
                        int var9 = var5.length() - 1;
                        var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                        var8 = 160;
                    }
                }

                var5.reverse();
                var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
                return var5.toString();
            }
        } else {
            return null;
        }
    }

    public static void method5039(class176 var0, int var1) {
        class302.field3784 = var0;
    }

    static void writeUid(Buffer var0) {
        if (client.field708 != null) {
            var0.writeBytes(client.field708, 0, client.field708.length);
        } else {
            byte[] var3 = new byte[24];

            try {
                class157.field2038.seek(0L);
                class157.field2038.method2685(var3, -604403753);

                int var4;
                for (var4 = 0; var4 < 24 && var3[var4] == 0; ++var4) {
                    ;
                }

                if (var4 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var7) {
                for (int var5 = 0; var5 < 24; ++var5) {
                    var3[var5] = -1;
                }
            }

            var0.writeBytes(var3, 0, var3.length);
        }
    }

    static int method5037(int var0, class86 var1, boolean var2, byte var3) {
        if (var0 == 3600) {
            if (InboundPacketDescriptor.field2150.field1042 == 0) {
                class70.field1070[++class60.field600 - 1] = -2;
            } else if (InboundPacketDescriptor.field2150.field1042 == 1) {
                class70.field1070[++class60.field600 - 1] = -1;
            } else {
                class70.field1070[++class60.field600 - 1] = InboundPacketDescriptor.field2150.field1040
                    .method5586((byte) 1);
            }

            return 1;
        } else {
            int var4;
            if (var0 == 3601) {
                var4 = class70.field1070[--class60.field600];
                if (InboundPacketDescriptor.field2150.method1751(-1806746806) && var4 >= 0
                    && var4 < InboundPacketDescriptor.field2150.field1040.method5586((byte) 1)) {
                    class294 var9 = (class294) InboundPacketDescriptor.field2150.field1040
                        .method5595(var4, -2005277078);
                    class70.field1065[++class70.field1072 - 1] = var9.method5548(-678646739);
                    class70.field1065[++class70.field1072 - 1] = var9.method5544(-417976815);
                } else {
                    class70.field1065[++class70.field1072 - 1] = "";
                    class70.field1065[++class70.field1072 - 1] = "";
                }

                return 1;
            } else if (var0 == 3602) {
                var4 = class70.field1070[--class60.field600];
                if (InboundPacketDescriptor.field2150.method1751(-1806746806) && var4 >= 0
                    && var4 < InboundPacketDescriptor.field2150.field1040.method5586((byte) 1)) {
                    class70.field1070[++class60.field600
                        - 1] = ((class289) InboundPacketDescriptor.field2150.field1040
                        .method5595(var4, -1466827162)).field3708;
                } else {
                    class70.field1070[++class60.field600 - 1] = 0;
                }

                return 1;
            } else if (var0 == 3603) {
                var4 = class70.field1070[--class60.field600];
                if (InboundPacketDescriptor.field2150.method1751(-1806746806) && var4 >= 0
                    && var4 < InboundPacketDescriptor.field2150.field1040.method5586((byte) 1)) {
                    class70.field1070[++class60.field600
                        - 1] = ((class289) InboundPacketDescriptor.field2150.field1040
                        .method5595(var4, -953271532)).field3710;
                } else {
                    class70.field1070[++class60.field600 - 1] = 0;
                }

                return 1;
            } else {
                String var6;
                if (var0 == 3604) {
                    var6 = class70.field1065[--class70.field1072];
                    int var7 = class70.field1070[--class60.field600];
                    class146.method3356(var6, var7, -1994298062);
                    return 1;
                } else if (var0 == 3605) {
                    var6 = class70.field1065[--class70.field1072];
                    InboundPacketDescriptor.field2150.method1758(var6, (byte) -49);
                    return 1;
                } else if (var0 == 3606) {
                    var6 = class70.field1065[--class70.field1072];
                    InboundPacketDescriptor.field2150.method1762(var6, -781698198);
                    return 1;
                } else if (var0 == 3607) {
                    var6 = class70.field1065[--class70.field1072];
                    InboundPacketDescriptor.field2150.method1760(var6, 1778002338);
                    return 1;
                } else if (var0 == 3608) {
                    var6 = class70.field1065[--class70.field1072];
                    InboundPacketDescriptor.field2150.method1780(var6, (byte) 1);
                    return 1;
                } else if (var0 == 3609) {
                    var6 = class70.field1065[--class70.field1072];
                    var6 = class85.method2145(var6, 438985548);
                    class70.field1070[++class60.field600 - 1] = InboundPacketDescriptor.field2150
                        .method1776(new class293(var6, client.field920), false, (byte) 3) ? 1 : 0;
                    return 1;
                } else if (var0 == 3611) {
                    if (class3.field26 != null) {
                        class70.field1065[++class70.field1072 - 1] = class3.field26.field3726;
                    } else {
                        class70.field1065[++class70.field1072 - 1] = "";
                    }

                    return 1;
                } else if (var0 == 3612) {
                    if (class3.field26 != null) {
                        class70.field1070[++class60.field600 - 1] = class3.field26
                            .method5586((byte) 1);
                    } else {
                        class70.field1070[++class60.field600 - 1] = 0;
                    }

                    return 1;
                } else if (var0 == 3613) {
                    var4 = class70.field1070[--class60.field600];
                    if (class3.field26 != null && var4 < class3.field26.method5586((byte) 1)) {
                        class70.field1065[++class70.field1072 - 1] = class3.field26
                            .method5595(var4, -1282331815).method5542((byte) -23)
                            .method5706(-165222639);
                    } else {
                        class70.field1065[++class70.field1072 - 1] = "";
                    }

                    return 1;
                } else if (var0 == 3614) {
                    var4 = class70.field1070[--class60.field600];
                    if (class3.field26 != null && var4 < class3.field26.method5586((byte) 1)) {
                        class70.field1070[++class60.field600 - 1] = ((class289) class3.field26
                            .method5595(var4, -1189252838)).method5677((byte) 0);
                    } else {
                        class70.field1070[++class60.field600 - 1] = 0;
                    }

                    return 1;
                } else if (var0 == 3615) {
                    var4 = class70.field1070[--class60.field600];
                    if (class3.field26 != null && var4 < class3.field26.method5586((byte) 1)) {
                        class70.field1070[++class60.field600 - 1] = ((class289) class3.field26
                            .method5595(var4, -1234557418)).field3710;
                    } else {
                        class70.field1070[++class60.field600 - 1] = 0;
                    }

                    return 1;
                } else if (var0 == 3616) {
                    class70.field1070[++class60.field600 - 1] =
                        class3.field26 != null ? class3.field26.field3731 : 0;
                    return 1;
                } else if (var0 == 3617) {
                    var6 = class70.field1065[--class70.field1072];
                    class4.method43(var6, -1815800189);
                    return 1;
                } else if (var0 == 3618) {
                    class70.field1070[++class60.field600 - 1] =
                        class3.field26 != null ? class3.field26.field3732 : 0;
                    return 1;
                } else if (var0 == 3619) {
                    var6 = class70.field1065[--class70.field1072];
                    class269.method5255(var6, (byte) 0);
                    return 1;
                } else if (var0 == 3620) {
                    class52.method1064(1669330682);
                    return 1;
                } else if (var0 == 3621) {
                    if (!InboundPacketDescriptor.field2150.method1751(-1806746806)) {
                        class70.field1070[++class60.field600 - 1] = -1;
                    } else {
                        class70.field1070[++class60.field600 - 1] = InboundPacketDescriptor.field2150.field1041
                            .method5586((byte) 1);
                    }

                    return 1;
                } else if (var0 == 3622) {
                    var4 = class70.field1070[--class60.field600];
                    if (InboundPacketDescriptor.field2150.method1751(-1806746806) && var4 >= 0
                        && var4 < InboundPacketDescriptor.field2150.field1041.method5586((byte) 1)) {
                        class288 var5 = (class288) InboundPacketDescriptor.field2150.field1041
                            .method5595(var4, -1021917398);
                        class70.field1065[++class70.field1072 - 1] = var5.method5548(-678646739);
                        class70.field1065[++class70.field1072 - 1] = var5.method5544(-1521421146);
                    } else {
                        class70.field1065[++class70.field1072 - 1] = "";
                        class70.field1065[++class70.field1072 - 1] = "";
                    }

                    return 1;
                } else if (var0 == 3623) {
                    var6 = class70.field1065[--class70.field1072];
                    var6 = class85.method2145(var6, -2078992433);
                    class70.field1070[++class60.field600 - 1] = InboundPacketDescriptor.field2150
                        .method1803(new class293(var6, client.field920), 1440386847) ? 1 : 0;
                    return 1;
                } else if (var0 == 3624) {
                    var4 = class70.field1070[--class60.field600];
                    if (class3.field26 != null && var4 < class3.field26.method5586((byte) 1)
                        && class3.field26.method5595(var4, -2013930860).method5542((byte) 9)
                                         .equals(class69.localPlayer.field625)) {
                        class70.field1070[++class60.field600 - 1] = 1;
                    } else {
                        class70.field1070[++class60.field600 - 1] = 0;
                    }

                    return 1;
                } else if (var0 == 3625) {
                    if (class3.field26 != null && class3.field26.field3730 != null) {
                        class70.field1065[++class70.field1072 - 1] = class3.field26.field3730;
                    } else {
                        class70.field1065[++class70.field1072 - 1] = "";
                    }

                    return 1;
                } else if (var0 == 3626) {
                    var4 = class70.field1070[--class60.field600];
                    if (class3.field26 != null && var4 < class3.field26.method5586((byte) 1)
                        && ((class283) class3.field26.method5595(var4, -2006890725))
                        .method5522(-1822391492)) {
                        class70.field1070[++class60.field600 - 1] = 1;
                    } else {
                        class70.field1070[++class60.field600 - 1] = 0;
                    }

                    return 1;
                } else if (var0 != 3627) {
                    if (var0 == 3628) {
                        InboundPacketDescriptor.field2150.field1040.method5605((byte) -88);
                        return 1;
                    } else {
                        boolean var8;
                        if (var0 == 3629) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            InboundPacketDescriptor.field2150.field1040.method5606(new class313(var8), 1672281426);
                            return 1;
                        } else if (var0 == 3630) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            InboundPacketDescriptor.field2150.field1040.method5606(new class314(var8), 1905218151);
                            return 1;
                        } else if (var0 == 3631) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            InboundPacketDescriptor.field2150.field1040.method5606(new class145(var8), 1852467383);
                            return 1;
                        } else if (var0 == 3632) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            InboundPacketDescriptor.field2150.field1040.method5606(new class139(var8), -915559358);
                            return 1;
                        } else if (var0 == 3633) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            InboundPacketDescriptor.field2150.field1040.method5606(new class144(var8), -778953786);
                            return 1;
                        } else if (var0 == 3634) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            InboundPacketDescriptor.field2150.field1040.method5606(new class147(var8), 944726579);
                            return 1;
                        } else if (var0 == 3635) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            InboundPacketDescriptor.field2150.field1040.method5606(new class143(var8), -841891935);
                            return 1;
                        } else if (var0 == 3636) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            InboundPacketDescriptor.field2150.field1040.method5606(new class141(var8), 2090874733);
                            return 1;
                        } else if (var0 == 3637) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            InboundPacketDescriptor.field2150.field1040.method5606(new class140(var8), -360545772);
                            return 1;
                        } else if (var0 == 3638) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            InboundPacketDescriptor.field2150.field1040
                                .method5606(new class142(var8), -1749814663);
                            return 1;
                        } else if (var0 == 3639) {
                            InboundPacketDescriptor.field2150.field1040.method5601((short) 710);
                            return 1;
                        } else if (var0 == 3640) {
                            InboundPacketDescriptor.field2150.field1041.method5605((byte) -32);
                            return 1;
                        } else if (var0 == 3641) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            InboundPacketDescriptor.field2150.field1041.method5606(new class313(var8), 1655183142);
                            return 1;
                        } else if (var0 == 3642) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            InboundPacketDescriptor.field2150.field1041.method5606(new class314(var8), 1315807550);
                            return 1;
                        } else if (var0 == 3643) {
                            InboundPacketDescriptor.field2150.field1041.method5601((short) 710);
                            return 1;
                        } else if (var0 == 3644) {
                            if (class3.field26 != null) {
                                class3.field26.method5605((byte) -74);
                            }

                            return 1;
                        } else if (var0 == 3645) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            if (class3.field26 != null) {
                                class3.field26.method5606(new class313(var8), 942949285);
                            }

                            return 1;
                        } else if (var0 == 3646) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            if (class3.field26 != null) {
                                class3.field26.method5606(new class314(var8), -379777514);
                            }

                            return 1;
                        } else if (var0 == 3647) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            if (class3.field26 != null) {
                                class3.field26.method5606(new class145(var8), 1286504633);
                            }

                            return 1;
                        } else if (var0 == 3648) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            if (class3.field26 != null) {
                                class3.field26.method5606(new class139(var8), 1944352220);
                            }

                            return 1;
                        } else if (var0 == 3649) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            if (class3.field26 != null) {
                                class3.field26.method5606(new class144(var8), 1187530866);
                            }

                            return 1;
                        } else if (var0 == 3650) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            if (class3.field26 != null) {
                                class3.field26.method5606(new class147(var8), -1492545800);
                            }

                            return 1;
                        } else if (var0 == 3651) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            if (class3.field26 != null) {
                                class3.field26.method5606(new class143(var8), -228615334);
                            }

                            return 1;
                        } else if (var0 == 3652) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            if (class3.field26 != null) {
                                class3.field26.method5606(new class141(var8), -1179258503);
                            }

                            return 1;
                        } else if (var0 == 3653) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            if (class3.field26 != null) {
                                class3.field26.method5606(new class140(var8), 1962561282);
                            }

                            return 1;
                        } else if (var0 == 3654) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            if (class3.field26 != null) {
                                class3.field26.method5606(new class142(var8), 1851519003);
                            }

                            return 1;
                        } else if (var0 == 3655) {
                            if (class3.field26 != null) {
                                class3.field26.method5601((short) 710);
                            }

                            return 1;
                        } else if (var0 == 3656) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            InboundPacketDescriptor.field2150.field1040.method5606(new class146(var8), -52578920);
                            return 1;
                        } else if (var0 == 3657) {
                            var8 = class70.field1070[--class60.field600] == 1;
                            if (class3.field26 != null) {
                                class3.field26.method5606(new class146(var8), -432672165);
                            }

                            return 1;
                        } else {
                            return 2;
                        }
                    }
                } else {
                    var4 = class70.field1070[--class60.field600];
                    if (class3.field26 != null && var4 < class3.field26.method5586((byte) 1)
                        && ((class283) class3.field26.method5595(var4, -1591897531))
                        .method5525((byte) 16)) {
                        class70.field1070[++class60.field600 - 1] = 1;
                    } else {
                        class70.field1070[++class60.field600 - 1] = 0;
                    }

                    return 1;
                }
            }
        }
    }

    void method5020(Buffer var1, int var2, int var3) {
        if (var2 == 5) {
            this.field3305 = var1.readUint16();
        }

    }

    void method5019(Buffer var1, int var2) {
        while (true) {
            int var3 = var1.getUByte();
            if (var3 == 0) {
                return;
            }

            this.method5020(var1, var3, -411010868);
        }
    }
}
