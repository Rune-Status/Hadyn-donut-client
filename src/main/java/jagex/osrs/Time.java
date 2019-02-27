package jagex.osrs;

public class Time {

    static long field2420;
    static long field2419;
    static class323[] field2421;

    public static void method4008(int var0) {
        class260.field3344.method4199();
        class260.field3345.method4199();
    }

    public static boolean method4010(int var0, short var1) {
        return (var0 >> 20 & 1) != 0;
    }

  public static synchronized long currentTimeMillis() {
      long var1 = System.currentTimeMillis();
      if (var1 < field2420) {
          field2419 += field2420 - var1;
      }

      field2420 = var1;
      return field2419 + var1;
  }
}
