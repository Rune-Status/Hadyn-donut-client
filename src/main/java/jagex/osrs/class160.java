package jagex.osrs;

import java.util.Hashtable;

public class class160 {

    static boolean field2043;
    static Hashtable field2040;

    static {
        field2043 = false;
        field2040 = new Hashtable(16);
    }

    static final void method3502(byte var0) {
        if (class6.field46 != null) {
            class6.field46.method2346((byte) 42);
        }

        if (client.field882 != null) {
            client.field882.method2346((byte) -5);
        }

    }

    static final void decodeEntityPacket(EntityPacket packet) {
        PacketBuffer var2 = client.field690.buffer;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        if (EntityPacket.field2319 == packet) {
            var3 = var2.readUint16();
            var4 = var2.method3883((byte) 91);
            var5 = var2.method3808(-2145476483);
            var6 = var2.readUint8();
            var7 = (var6 >> 4 & 7) + class187.field2433;
            var8 = (var6 & 7) + class72.field1100;
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                var7 = var7 * 128 + 64;
                var8 = var8 * 128 + 64;
                class71 var40 = new class71(var3, class60.level, var7, var8, class152
                    .method3394(var7, var8, class60.level, (byte) 64) - var4, var5,
                                            client.field655);
                client.field711.addLast(var40);
            }

        } else {
            if (EntityPacket.field2322 == packet) {
                var3 = var2.method3891((byte) 0);
                var4 = var3 >> 2;
                var5 = var3 & 3;
                var6 = client.field704[var4];
                var7 = var2.method3891((byte) 0);
                var8 = (var7 >> 4 & 7) + class187.field2433;
                int var32 = (var7 & 7) + class72.field1100;
                if (var8 >= 0 && var32 >= 0 && var8 < 104 && var32 < 104) {
                    class234.method4770(class60.level, var8, var32, var6, -1, var4, var5, 0, -1,
                                        -1761911777);
                }

            } else if (EntityPacket.UPDATE_ITEM_STACK == packet) {
                var3 = var2.method3807(656888673);
                int newAmount = var2.method3792(1237170462);
                int curAmount = var2.method3807(-1748801483);
                var6 = var2.method3883((byte) 62);
                var7 = (var6 >> 4 & 7) + class187.field2433;
                var8 = (var6 & 7) + class72.field1100;
                if (var7 < 0 || var8 < 0 || var7 >= 104 || var8 >= 104) {
                    return;
                }
                Deque var9 = client.itemStacks[class60.level][var7][var8];
                if (var9 == null) {
                    return;
                }
                for (ItemStack var10 = (ItemStack) var9.getFirst(); var10 != null;
                     var10 = (ItemStack) var9.getNext()) {
                    if ((var3 & 32767) == var10.id && curAmount == var10.amount) {
                        var10.amount = newAmount;
                        break;
                    }
                }

                class238.updateItemStacks(var7, var8);

            } else {
                int var33;
                if (EntityPacket.field2325 == packet) {
                    var3 = var2.method3883((byte) 104);
                    var4 = (var3 >> 4 & 7) + class187.field2433;
                    var5 = (var3 & 7) + class72.field1100;
                    var6 = var2.method3891((byte) 0);
                    var7 = var6 >> 2;
                    var8 = var6 & 3;
                    int var32 = client.field704[var7];
                    var33 = var2.method3808(-1993962507);
                    if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                        class234
                            .method4770(class60.level, var4, var5, var32, var33, var7, var8, 0,
                                        -1, -1857389223);
                    }

                } else {
                    int var11;
                    if (EntityPacket.field2321 == packet) {
                        var3 = var2.readUint8();
                        var4 = (var3 >> 4 & 7) + class187.field2433;
                        var5 = (var3 & 7) + class72.field1100;
                        var6 = var2.method3891((byte) 0);
                        var7 = var2.method3883((byte) 9);
                        var8 = var7 >> 4 & 15;
                        int var32 = var7 & 7;
                        var33 = var2.method3792(1264154758);
                        if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                            var11 = var8 + 1;
                            if (class69.localPlayer.wx[0] >= var4 - var11
                                && class69.localPlayer.wx[0] <= var11 + var4
                                && class69.localPlayer.wz[0] >= var5 - var11
                                && class69.localPlayer.wz[0] <= var5 + var11
                                && client.field881 != 0 && var32 > 0 && client.field905 < 50) {
                                client.field884[client.field905] = var33;
                                client.field885[client.field905] = var32;
                                client.field793[client.field905] = var6;
                                client.field710[client.field905] = null;
                                client.field887[client.field905] =
                                    var8 + (var5 << 8) + (var4 << 16);
                                ++client.field905;
                            }
                        }
                    }

                    int var41;
                    if (EntityPacket.field2320 == packet) {
                        var3 = var2.method3891((byte) 0);
                        var4 = var3 >> 2;
                        var5 = var3 & 3;
                        var6 = client.field704[var4];
                        var7 = var2.method3799(339973762);
                        var8 = (var7 >> 4 & 7) + class187.field2433;
                        int var32 = (var7 & 7) + class72.field1100;
                        var33 = var2.readUint16();
                        if (var8 >= 0 && var32 >= 0 && var8 < 103 && var32 < 103) {
                            if (var6 == 0) {
                                class130 var34 = class243.field3173
                                    .method3107(class60.level, var8, var32);
                                if (var34 != null) {
                                    var41 = class56.method1110(var34.field1848);
                                    if (var4 == 2) {
                                        var34.field1846 = new class87(var41, 2, var5 + 4,
                                                                      class60.level, var8, var32,
                                                                      var33, false,
                                                                      var34.field1846);
                                        var34.field1847 = new class87(var41, 2, var5 + 1 & 3,
                                                                      class60.level, var8, var32,
                                                                      var33, false,
                                                                      var34.field1847);
                                    } else {
                                        var34.field1846 = new class87(var41, var4, var5,
                                                                      class60.level, var8, var32,
                                                                      var33, false,
                                                                      var34.field1846);
                                    }
                                }
                            }

                            if (var6 == 1) {
                                class135 var44 = class243.field3173
                                    .method3230(class60.level, var8, var32);
                                if (var44 != null) {
                                    var41 = class56.method1110(var44.field1880);
                                    if (var4 != 4 && var4 != 5) {
                                        if (var4 == 6) {
                                            var44.field1887 = new class87(var41, 4, var5 + 4,
                                                                          class60.level, var8,
                                                                          var32, var33, false,
                                                                          var44.field1887);
                                        } else if (var4 == 7) {
                                            var44.field1887 = new class87(var41, 4,
                                                                          (var5 + 2 & 3) + 4,
                                                                          class60.level, var8,
                                                                          var32, var33, false,
                                                                          var44.field1887);
                                        } else if (var4 == 8) {
                                            var44.field1887 = new class87(var41, 4, var5 + 4,
                                                                          class60.level, var8,
                                                                          var32, var33, false,
                                                                          var44.field1887);
                                            var44.field1888 = new class87(var41, 4,
                                                                          (var5 + 2 & 3) + 4,
                                                                          class60.level, var8,
                                                                          var32, var33, false,
                                                                          var44.field1888);
                                        }
                                    } else {
                                        var44.field1887 = new class87(var41, 4, var5,
                                                                      class60.level, var8, var32,
                                                                      var33, false,
                                                                      var44.field1887);
                                    }
                                }
                            }

                            if (var6 == 2) {
                                class136 var45 = class243.field3173
                                    .method3081(class60.level, var8, var32);
                                if (var4 == 11) {
                                    var4 = 10;
                                }

                                if (var45 != null) {
                                    var45.field1896 = new class87(
                                        class56.method1110(var45.field1904), var4, var5,
                                        class60.level, var8, var32, var33, false,
                                        var45.field1896);
                                }
                            }

                            if (var6 == 3) {
                                class117 var46 = class243.field3173
                                    .method3117(class60.level, var8, var32);
                                if (var46 != null) {
                                    var46.field1586 = new class87(
                                        class56.method1110(var46.field1587), 22, var5,
                                        class60.level, var8, var32, var33, false,
                                        var46.field1586);
                                }
                            }
                        }

                    } else {
                        int var13;
                        byte var14;
                        int var15;
                        if (EntityPacket.field2316 == packet) {
                            var3 = var2.method3891((byte) 0) * 4;
                            var4 = var2.readUint16();
                            var5 = var2.method3808(-1551319053);
                            var6 = var2.method3891((byte) 0) * 4;
                            var7 = var2.method3810(1308083007);
                            var8 = var2.readUint8();
                            int var32 = var2.method3891((byte) 0);
                            var33 = var2.method3807(-407423998);
                            var11 = var2.method3883((byte) 84);
                            var41 = (var11 >> 4 & 7) + class187.field2433;
                            var13 = (var11 & 7) + class72.field1100;
                            var14 = var2.method3968(342339721);
                            byte var42 = var2.method3802(1038768925);
                            var15 = var42 + var41;
                            int var43 = var14 + var13;
                            if (var41 >= 0 && var13 >= 0 && var41 < 104 && var13 < 104 && var15 >= 0
                                && var43 >= 0 && var15 < 104 && var43 < 104 && var5 != 65535) {
                                var41 = var41 * 128 + 64;
                                var13 = var13 * 128 + 64;
                                var15 = var15 * 128 + 64;
                                var43 = var43 * 128 + 64;
                                class80 var16 = new class80(var5, class60.level, var41, var13,
                                                            class152.method3394(var41, var13,
                                                                                class60.level,
                                                                                (byte) 59) - var6,
                                                            var33 + client.field655,
                                                            var4 + client.field655, var8, var32,
                                                            var7, var3);
                                var16.method2042(var15, var43, class152
                                                     .method3394(var15, var43, class60.level, (byte) 38) - var3,
                                                 var33 + client.field655, -1215482147);
                                client.field773.addLast(var16);
                            }

                        } else {
                            ItemStack var36;
                            if (EntityPacket.REMOVE_ITEM_STACK == packet) {
                                var3 = var2.method3883((byte) 45);
                                var4 = (var3 >> 4 & 7) + class187.field2433;
                                var5 = (var3 & 7) + class72.field1100;
                                var6 = var2.method3792(1252117620);
                                if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                                    Deque var35 = client.itemStacks[class60.level][var4][var5];
                                    if (var35 != null) {
                                        for (var36 = (ItemStack) var35.getFirst(); var36 != null;
                                             var36 = (ItemStack) var35.getNext()) {
                                            if ((var6 & 32767) == var36.id) {
                                                var36.unlink();
                                                break;
                                            }
                                        }

                                        if (var35.getFirst() == null) {
                                            client.itemStacks[class60.level][var4][var5] = null;
                                        }

                                        class238.updateItemStacks(var4, var5);
                                    }
                                }

                            } else {
                                if (EntityPacket.field2318 == packet) {
                                    byte var38 = var2.method3802(1038768925);
                                    var4 = var2.method3792(973946034);
                                    byte var39 = var2.method3802(1038768925);
                                    var6 = var2.method3808(-1641211001);
                                    var7 = var2.readUint16();
                                    var8 = var2.method3883((byte) 93);
                                    int var32 = var8 >> 2;
                                    var33 = var8 & 3;
                                    var11 = client.field704[var32];
                                    byte var12 = var2.method3968(1332091000);
                                    var13 = var2.method3807(-105786652);
                                    var14 = var2.method3802(1038768925);
                                    var15 = var2.method3799(-869707183);
                                    int var37 = (var15 >> 4 & 7) + class187.field2433;
                                    int var17 = (var15 & 7) + class72.field1100;
                                    Player var18;
                                    if (var13 == client.localPlayerId) {
                                        var18 = class69.localPlayer;
                                    } else {
                                        var18 = client.players[var13];
                                    }

                                    if (var18 != null) {
                                        class270 var19 = class253.method4993(var6, (byte) 93);
                                        int var20;
                                        int var21;
                                        if (var33 != 1 && var33 != 3) {
                                            var20 = var19.field3501;
                                            var21 = var19.field3475;
                                        } else {
                                            var20 = var19.field3475;
                                            var21 = var19.field3501;
                                        }

                                        int var22 = var37 + (var20 >> 1);
                                        int var23 = var37 + (var20 + 1 >> 1);
                                        int var24 = var17 + (var21 >> 1);
                                        int var25 = var17 + (var21 + 1 >> 1);
                                        int[][] var26 = class50.field506[class60.level];
                                        int var27 = var26[var23][var25] + var26[var23][var24]
                                            + var26[var22][var24] + var26[var22][var25] >> 2;
                                        int var28 = (var37 << 7) + (var20 << 6);
                                        int var29 = (var17 << 7) + (var21 << 6);
                                        class121 var30 = var19
                                            .method5276(var32, var33, var26, var28, var27, var29,
                                                        -1740380750);
                                        if (var30 != null) {
                                            class234
                                                .method4770(class60.level, var37, var17, var11,
                                                            -1, 0, 0, var7 + 1, var4 + 1,
                                                            -1766656264);
                                            var18.field614 = var7 + client.field655;
                                            var18.field615 = var4 + client.field655;
                                            var18.field619 = var30;
                                            var18.field616 = var37 * 128 + var20 * 64;
                                            var18.field612 = var17 * 128 + var21 * 64;
                                            var18.field610 = var27;
                                            byte var31;
                                            if (var38 > var14) {
                                                var31 = var38;
                                                var38 = var14;
                                                var14 = var31;
                                            }

                                            if (var12 > var39) {
                                                var31 = var12;
                                                var12 = var39;
                                                var39 = var31;
                                            }

                                            var18.field608 = var37 + var38;
                                            var18.field621 = var37 + var14;
                                            var18.field606 = var12 + var17;
                                            var18.field623 = var39 + var17;
                                        }
                                    }
                                }

                                if (EntityPacket.CREATE_ITEM_STACK == packet) {
                                    int amount = var2.method3808(-1531351054);
                                    int id = var2.method3792(935999835);
                                    int location = var2.method3883((byte) 59);
                                    int sx = (location >> 4 & 7) + class187.field2433;
                                    int sz = (location & 7) + class72.field1100;
                                    if (sx >= 0 && sz >= 0 && sx < 104 && sz < 104) {
                                        var36 = new ItemStack();
                                        var36.id = id;
                                        var36.amount = amount;
                                        if (client.itemStacks[class60.level][sx][sz] == null) {
                                            client.itemStacks[class60.level][sx][sz] = new Deque();
                                        }

                                        client.itemStacks[class60.level][sx][sz].addLast(var36);
                                        class238.updateItemStacks(sx, sz);
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static final void method3504(int var0, int var1) {
        if (class189.method4028(var0, 829634389)) {
            class232[] var2 = class145.field1951[var0];

            for (int var3 = 0; var3 < var2.length; ++var3) {
                class232 var4 = var2[var3];
                if (var4 != null) {
                    var4.field2795 = 0;
                    var4.field2750 = 0;
                }
            }

        }
    }
}
