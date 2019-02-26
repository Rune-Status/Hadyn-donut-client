package jagex.osrs;

public final class class183 {

    final int field2381;
    final int field2400;
    final int field2368;
    final int field2369;
    final int field2370;
    final int field2371;
    int field2398;
    int field2367;
    int[] field2389;
    int[] field2377;
    boolean[] field2393;
    boolean[] field2392;
    byte[] field2395;
    byte[] field2394;
    int[] field2373;
    byte[] field2396;
    byte[] field2372;
    byte[] field2397;
    byte[][] field2383;
    int[][] field2399;
    byte[] field2391;
    int[][] field2384;
    int[][] field2401;
    int[] field2402;
    int field2382;
    int field2376;
    int field2375;
    int field2374;
    int field2378;
    int field2388;
    int field2387;
    int field2390;
    int field2380;
    byte field2379;
    int field2385;
    int field2366;
    int field2386;
    int field2403;

    class183() {
        this.field2381 = 4096;
        this.field2400 = 16;
        this.field2368 = 258;
        this.field2369 = 6;
        this.field2370 = 50;
        this.field2371 = 18002;
        this.field2398 = 0;
        this.field2367 = 0;
        this.field2389 = new int[256];
        this.field2377 = new int[257];
        this.field2393 = new boolean[256];
        this.field2392 = new boolean[16];
        this.field2395 = new byte[256];
        this.field2394 = new byte[4096];
        this.field2373 = new int[16];
        this.field2396 = new byte[18002];
        this.field2397 = new byte[18002];
        this.field2383 = new byte[6][258];
        this.field2399 = new int[6][258];
        this.field2384 = new int[6][258];
        this.field2401 = new int[6][258];
        this.field2402 = new int[6];
    }

    static final void method3749(String var0, String var1, int var2, int var3, int var4, int var5,
                                 boolean var6, byte var7) {
        if (!client.field833) {
            if (client.field780 < 500) {
                client.field916[client.field780] = var0;
                client.field786[client.field780] = var1;
                client.field783[client.field780] = var2;
                client.field784[client.field780] = var3;
                client.field781[client.field780] = var4;
                client.field782[client.field780] = var5;
                client.field772[client.field780] = var6;
                ++client.field780;
            }

        }
    }
}
