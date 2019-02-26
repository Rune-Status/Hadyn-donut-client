package jagex.osrs;

public class class221 extends Node {

    int field2586;
    class218 field2566;
    class223 field2571;
    class95 field2565;
    class105 field2581;
    int field2573;
    int field2585;
    int field2572;
    int field2577;
    int field2576;
    int field2569;
    int field2583;
    int field2570;
    int field2567;
    int field2568;
    int field2574;
    int field2575;
    int field2579;
    int field2564;
    int field2580;
    int field2578;

    public static class269 method4528(int var0, int var1) {
        class269 var2 = (class269) class269.field3429.method4198((long) var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class179.field2355.method4831(32, var0, 1789634852);
            var2 = new class269();
            if (var3 != null) {
                var2.method5234(new Buffer(var3), (byte) 60);
            }

            class269.field3429.method4204(var2, (long) var0);
            return var2;
        }
    }

    static final void method4527(int var0) {
        class34
            .method643("Your friend list is full. Max of 200 for free users, and 400 for members",
                       -964069489);
    }

    void method4525(int var1) {
        this.field2571 = null;
        this.field2565 = null;
        this.field2566 = null;
        this.field2581 = null;
    }
}
