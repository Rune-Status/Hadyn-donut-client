package jagex.osrs;

public class class228 {

    public int field2634;
    public int field2632;
    public int field2633;

    public class228(class228 var1) {
        this.field2634 = var1.field2634;
        this.field2632 = var1.field2632;
        this.field2633 = var1.field2633;
    }

    public class228(int var1, int var2, int var3) {
        this.field2634 = var1;
        this.field2632 = var2;
        this.field2633 = var3;
    }

    public class228() {
        this.field2634 = -1;
    }

    public class228(int var1) {
        if (var1 == -1) {
            this.field2634 = -1;
        } else {
            this.field2634 = var1 >> 28 & 3;
            this.field2632 = var1 >> 14 & 16383;
            this.field2633 = var1 & 16383;
        }

    }

    static long method4645(CharSequence var0, byte var1) {
        long var2 = 0L;
        int var4 = var0.length();

        for (int var5 = 0; var5 < var4; ++var5) {
            var2 *= 37L;
            char var6 = var0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }

            if (var2 >= 177917621779460413L) {
                break;
            }
        }

        while (0L == var2 % 37L && var2 != 0L) {
            var2 /= 37L;
        }

        return var2;
    }

    String method4656(String var1, int var2) {
        return this.field2634 + var1 + (this.field2632 >> 6) + var1 + (this.field2633 >> 6) + var1
            + (this.field2632 & 63) + var1 + (this.field2633 & 63);
    }

    public int method4646(int var1) {
        return this.field2634 << 28 | this.field2632 << 14 | this.field2633;
    }

    public void method4644(int var1, int var2, int var3, byte var4) {
        this.field2634 = var1;
        this.field2632 = var2;
        this.field2633 = var3;
    }

    boolean method4659(class228 var1, int var2) {
        return this.field2634 != var1.field2634 ? false
            : (this.field2632 != var1.field2632 ? false : this.field2633 == var1.field2633);
    }

    public int hashCode() {
        return this.method4646(1586823338);
    }

    public String toString() {
        return this.method4656(",", -1981309301);
    }

    public boolean equals(Object var1) {
        return this == var1 ? true
            : (!(var1 instanceof class228) ? false : this.method4659((class228) var1, -611395595));
    }
}
