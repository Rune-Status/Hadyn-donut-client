package jagex.osrs;

public class class151 extends class162 {

    long field1975;

    class151() {
        this.field1975 = System.nanoTime();
    }

    public int vmethod3535(int var1, int var2, int var3) {
        long var4 = 1000000L * (long) var2;
        long var6 = this.field1975 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }

        class272.method5390(var6 / 1000000L);
        long var8 = System.nanoTime();

        int var10;
        for (var10 = 0; var10 < 10 && (var10 < 1 || this.field1975 < var8);
             this.field1975 += (long) var1 * 1000000L) {
            ++var10;
        }

        if (this.field1975 < var8) {
            this.field1975 = var8;
        }

        return var10;
    }

    public void vmethod3534(int var1) {
        this.field1975 = System.nanoTime();
    }
}
