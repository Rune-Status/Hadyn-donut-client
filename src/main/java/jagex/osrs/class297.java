package jagex.osrs;

public class class297 {

    public static final class297 field3741;
    public static final class297 field3744;
    public static final class297 field3742;
    public static final class297 field3743;
    public static final class297 field3738;
    public static final class297 field3746;
    static class298 field3747;
    static int[] field3739;
    static int field3740;

    static {
        field3744 = new class297("p11_full");
        field3738 = new class297("p12_full");
        field3746 = new class297("b12_full");
        field3741 = new class297("verdana_11pt_regular");
        field3742 = new class297("verdana_13pt_regular");
        field3743 = new class297("verdana_15pt_regular");
    }

    String field3748;

    class297(String var1) {
        this.field3748 = var1;
    }

    static int method5769(int var0, class86 var1, boolean var2, int var3) {
        int var4;
        int var5;
        if (var0 == 4000) {
            class60.field600 -= 2;
            var4 = ScriptExecutor.field1070[class60.field600];
            var5 = ScriptExecutor.field1070[class60.field600 + 1];
            ScriptExecutor.field1070[++class60.field600 - 1] = var5 + var4;
            return 1;
        } else if (var0 == 4001) {
            class60.field600 -= 2;
            var4 = ScriptExecutor.field1070[class60.field600];
            var5 = ScriptExecutor.field1070[class60.field600 + 1];
            ScriptExecutor.field1070[++class60.field600 - 1] = var4 - var5;
            return 1;
        } else if (var0 == 4002) {
            class60.field600 -= 2;
            var4 = ScriptExecutor.field1070[class60.field600];
            var5 = ScriptExecutor.field1070[class60.field600 + 1];
            ScriptExecutor.field1070[++class60.field600 - 1] = var4 * var5;
            return 1;
        } else if (var0 == 4003) {
            class60.field600 -= 2;
            var4 = ScriptExecutor.field1070[class60.field600];
            var5 = ScriptExecutor.field1070[class60.field600 + 1];
            ScriptExecutor.field1070[++class60.field600 - 1] = var4 / var5;
            return 1;
        } else if (var0 == 4004) {
            var4 = ScriptExecutor.field1070[--class60.field600];
            ScriptExecutor.field1070[++class60.field600 - 1] = (int) (Math.random() * (double) var4);
            return 1;
        } else if (var0 == 4005) {
            var4 = ScriptExecutor.field1070[--class60.field600];
            ScriptExecutor.field1070[++class60.field600 - 1] = (int) (Math.random() * (double) (var4 + 1));
            return 1;
        } else if (var0 == 4006) {
            class60.field600 -= 5;
            var4 = ScriptExecutor.field1070[class60.field600];
            var5 = ScriptExecutor.field1070[class60.field600 + 1];
            int var6 = ScriptExecutor.field1070[class60.field600 + 2];
            int var7 = ScriptExecutor.field1070[class60.field600 + 3];
            int var8 = ScriptExecutor.field1070[class60.field600 + 4];
            ScriptExecutor.field1070[++class60.field600 - 1] =
                var4 + (var5 - var4) * (var8 - var6) / (var7 - var6);
            return 1;
        } else if (var0 == 4007) {
            class60.field600 -= 2;
            var4 = ScriptExecutor.field1070[class60.field600];
            var5 = ScriptExecutor.field1070[class60.field600 + 1];
            ScriptExecutor.field1070[++class60.field600 - 1] = var4 + var5 * var4 / 100;
            return 1;
        } else if (var0 == 4008) {
            class60.field600 -= 2;
            var4 = ScriptExecutor.field1070[class60.field600];
            var5 = ScriptExecutor.field1070[class60.field600 + 1];
            ScriptExecutor.field1070[++class60.field600 - 1] = var4 | 1 << var5;
            return 1;
        } else if (var0 == 4009) {
            class60.field600 -= 2;
            var4 = ScriptExecutor.field1070[class60.field600];
            var5 = ScriptExecutor.field1070[class60.field600 + 1];
            ScriptExecutor.field1070[++class60.field600 - 1] = var4 & -1 - (1 << var5);
            return 1;
        } else if (var0 == 4010) {
            class60.field600 -= 2;
            var4 = ScriptExecutor.field1070[class60.field600];
            var5 = ScriptExecutor.field1070[class60.field600 + 1];
            ScriptExecutor.field1070[++class60.field600 - 1] = (var4 & 1 << var5) != 0 ? 1 : 0;
            return 1;
        } else if (var0 == 4011) {
            class60.field600 -= 2;
            var4 = ScriptExecutor.field1070[class60.field600];
            var5 = ScriptExecutor.field1070[class60.field600 + 1];
            ScriptExecutor.field1070[++class60.field600 - 1] = var4 % var5;
            return 1;
        } else if (var0 == 4012) {
            class60.field600 -= 2;
            var4 = ScriptExecutor.field1070[class60.field600];
            var5 = ScriptExecutor.field1070[class60.field600 + 1];
            if (var4 == 0) {
                ScriptExecutor.field1070[++class60.field600 - 1] = 0;
            } else {
                ScriptExecutor.field1070[++class60.field600 - 1] = (int) Math
                    .pow((double) var4, (double) var5);
            }

            return 1;
        } else if (var0 == 4013) {
            class60.field600 -= 2;
            var4 = ScriptExecutor.field1070[class60.field600];
            var5 = ScriptExecutor.field1070[class60.field600 + 1];
            if (var4 == 0) {
                ScriptExecutor.field1070[++class60.field600 - 1] = 0;
                return 1;
            } else {
                switch (var5) {
                    case 0:
                        ScriptExecutor.field1070[++class60.field600 - 1] = Integer.MAX_VALUE;
                        break;
                    case 1:
                        ScriptExecutor.field1070[++class60.field600 - 1] = var4;
                        break;
                    case 2:
                        ScriptExecutor.field1070[++class60.field600 - 1] = (int) Math.sqrt((double) var4);
                        break;
                    case 3:
                        ScriptExecutor.field1070[++class60.field600 - 1] = (int) Math.cbrt((double) var4);
                        break;
                    case 4:
                        ScriptExecutor.field1070[++class60.field600 - 1] = (int) Math
                            .sqrt(Math.sqrt((double) var4));
                        break;
                    default:
                        ScriptExecutor.field1070[++class60.field600 - 1] = (int) Math
                            .pow((double) var4, 1.0D / (double) var5);
                }

                return 1;
            }
        } else if (var0 == 4014) {
            class60.field600 -= 2;
            var4 = ScriptExecutor.field1070[class60.field600];
            var5 = ScriptExecutor.field1070[class60.field600 + 1];
            ScriptExecutor.field1070[++class60.field600 - 1] = var4 & var5;
            return 1;
        } else if (var0 == 4015) {
            class60.field600 -= 2;
            var4 = ScriptExecutor.field1070[class60.field600];
            var5 = ScriptExecutor.field1070[class60.field600 + 1];
            ScriptExecutor.field1070[++class60.field600 - 1] = var4 | var5;
            return 1;
        } else if (var0 == 4018) {
            class60.field600 -= 3;
            long var10 = (long) ScriptExecutor.field1070[class60.field600];
            long var12 = (long) ScriptExecutor.field1070[class60.field600 + 1];
            long var14 = (long) ScriptExecutor.field1070[class60.field600 + 2];
            ScriptExecutor.field1070[++class60.field600 - 1] = (int) (var10 * var14 / var12);
            return 1;
        } else {
            return 2;
        }
    }

    static int method5770(int var0, int var1) {
        return (int) Math.pow(2.0D, (double) (7.0F + (float) var0 / 256.0F));
    }
}
