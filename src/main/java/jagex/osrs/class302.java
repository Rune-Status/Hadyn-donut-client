package jagex.osrs;

public class class302 {

    static class176 field3784;

    static int method5894(int var0, class86 var1, boolean var2, int var3) {
        if (var0 == 3300) {
            ScriptExecutor.field1070[++class60.field600 - 1] = client.field655;
            return 1;
        } else {
            int var4;
            int var5;
            if (var0 == 3301) {
                class60.field600 -= 2;
                var4 = ScriptExecutor.field1070[class60.field600];
                var5 = ScriptExecutor.field1070[class60.field600 + 1];
                ScriptExecutor.field1070[++class60.field600 - 1] = class4.method55(var4, var5, -139350520);
                return 1;
            } else if (var0 == 3302) {
                class60.field600 -= 2;
                var4 = ScriptExecutor.field1070[class60.field600];
                var5 = ScriptExecutor.field1070[class60.field600 + 1];
                ScriptExecutor.field1070[++class60.field600 - 1] = class138
                    .method3282(var4, var5, -1620029902);
                return 1;
            } else if (var0 == 3303) {
                class60.field600 -= 2;
                var4 = ScriptExecutor.field1070[class60.field600];
                var5 = ScriptExecutor.field1070[class60.field600 + 1];
                ScriptExecutor.field1070[++class60.field600 - 1] = Player
                    .method1219(var4, var5, 1540177752);
                return 1;
            } else if (var0 == 3304) {
                var4 = ScriptExecutor.field1070[--class60.field600];
                ScriptExecutor.field1070[++class60.field600 - 1] = class187
                    .method4011(var4, -1758970395).field3299;
                return 1;
            } else if (var0 == 3305) {
                var4 = ScriptExecutor.field1070[--class60.field600];
                ScriptExecutor.field1070[++class60.field600 - 1] = client.field775[var4];
                return 1;
            } else if (var0 == 3306) {
                var4 = ScriptExecutor.field1070[--class60.field600];
                ScriptExecutor.field1070[++class60.field600 - 1] = client.field776[var4];
                return 1;
            } else if (var0 == 3307) {
                var4 = ScriptExecutor.field1070[--class60.field600];
                ScriptExecutor.field1070[++class60.field600 - 1] = client.field777[var4];
                return 1;
            } else {
                int var6;
                if (var0 == 3308) {
                    var4 = class60.level;
                    var5 = (class69.localPlayer.x >> 7) + class49.sceneX;
                    var6 = (class69.localPlayer.z >> 7) + class11.sceneZ;
                    ScriptExecutor.field1070[++class60.field600 - 1] = (var5 << 14) + var6 + (var4 << 28);
                    return 1;
                } else if (var0 == 3309) {
                    var4 = ScriptExecutor.field1070[--class60.field600];
                    ScriptExecutor.field1070[++class60.field600 - 1] = var4 >> 14 & 16383;
                    return 1;
                } else if (var0 == 3310) {
                    var4 = ScriptExecutor.field1070[--class60.field600];
                    ScriptExecutor.field1070[++class60.field600 - 1] = var4 >> 28;
                    return 1;
                } else if (var0 == 3311) {
                    var4 = ScriptExecutor.field1070[--class60.field600];
                    ScriptExecutor.field1070[++class60.field600 - 1] = var4 & 16383;
                    return 1;
                } else if (var0 == 3312) {
                    ScriptExecutor.field1070[++class60.field600 - 1] = client.field647 ? 1 : 0;
                    return 1;
                } else if (var0 == 3313) {
                    class60.field600 -= 2;
                    var4 = ScriptExecutor.field1070[class60.field600] + 32768;
                    var5 = ScriptExecutor.field1070[class60.field600 + 1];
                    ScriptExecutor.field1070[++class60.field600 - 1] = class4
                        .method55(var4, var5, 1043293377);
                    return 1;
                } else if (var0 == 3314) {
                    class60.field600 -= 2;
                    var4 = ScriptExecutor.field1070[class60.field600] + 32768;
                    var5 = ScriptExecutor.field1070[class60.field600 + 1];
                    ScriptExecutor.field1070[++class60.field600 - 1] = class138
                        .method3282(var4, var5, -2018047371);
                    return 1;
                } else if (var0 == 3315) {
                    class60.field600 -= 2;
                    var4 = ScriptExecutor.field1070[class60.field600] + 32768;
                    var5 = ScriptExecutor.field1070[class60.field600 + 1];
                    ScriptExecutor.field1070[++class60.field600 - 1] = Player
                        .method1219(var4, var5, 1855691903);
                    return 1;
                } else if (var0 == 3316) {
                    if (client.rights >= 2) {
                        ScriptExecutor.field1070[++class60.field600 - 1] = client.rights;
                    } else {
                        ScriptExecutor.field1070[++class60.field600 - 1] = 0;
                    }

                    return 1;
                } else if (var0 == 3317) {
                    ScriptExecutor.field1070[++class60.field600 - 1] = client.field662;
                    return 1;
                } else if (var0 == 3318) {
                    ScriptExecutor.field1070[++class60.field600 - 1] = client.field691;
                    return 1;
                } else if (var0 == 3321) {
                    ScriptExecutor.field1070[++class60.field600 - 1] = client.field810;
                    return 1;
                } else if (var0 == 3322) {
                    ScriptExecutor.field1070[++class60.field600 - 1] = client.field851;
                    return 1;
                } else if (var0 == 3323) {
                    if (client.field863) {
                        ScriptExecutor.field1070[++class60.field600 - 1] = 1;
                    } else {
                        ScriptExecutor.field1070[++class60.field600 - 1] = 0;
                    }

                    return 1;
                } else if (var0 == 3324) {
                    ScriptExecutor.field1070[++class60.field600 - 1] = client.field660;
                    return 1;
                } else if (var0 == 3325) {
                    class60.field600 -= 4;
                    var4 = ScriptExecutor.field1070[class60.field600];
                    var5 = ScriptExecutor.field1070[class60.field600 + 1];
                    var6 = ScriptExecutor.field1070[class60.field600 + 2];
                    int var7 = ScriptExecutor.field1070[class60.field600 + 3];
                    var4 += var5 << 14;
                    var4 += var6 << 28;
                    var4 += var7;
                    ScriptExecutor.field1070[++class60.field600 - 1] = var4;
                    return 1;
                } else {
                    return 2;
                }
            }
        }
    }
}
