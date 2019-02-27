package jagex.osrs;

public class class238 {

    public static void method4785(int var0) {
        if (class39.field386 != null) {
            class39 var1 = class39.field386;
            synchronized (class39.field386) {
                class39.field386 = null;
            }
        }

    }

    static final void updateItemStacks(int sx, int sz) {
        Deque stacks = client.itemStacks[class60.level][sx][sz];
        if (stacks == null) {
            class243.field3173.method3078(class60.level, sx, sz);
            return;
        }

        long maximumValue = -99999999L;

        ItemStack highestValue = null;

        for (ItemStack stack = (ItemStack) stacks.getFirst();
            stack != null;
            stack = (ItemStack) stacks.getNext()) {
            ItemConfig config = ItemConfig.get(stack.id);
            long value = (long) config.value;
            if (config.stackable == 1) {
                value *= (long) (stack.amount + 1);
            }

            if (value > maximumValue) {
                maximumValue = value;
                highestValue = stack;
            }
        }

        if (highestValue == null) {
            class243.field3173.method3078(class60.level, sx, sz);
        } else {
            stacks.addFirst(highestValue);
            ItemStack var13 = null;
            ItemStack var12 = null;

            for (ItemStack stack = (ItemStack) stacks.getFirst(); stack != null;
                stack = (ItemStack) stacks.getNext()) {
                if (highestValue.id == stack.id) {
                    continue;
                }
                if (var13 == null) {
                    var13 = stack;
                }

                if (stack.id != var13.id && var12 == null) {
                    var12 = stack;
                }
            }

            long var10 = class0.method12(sx, sz, 3, false, 0, -2018038234);
            class243.field3173.method3064(class60.level, sx, sz, class152
                                              .method3394(sx * 128 + 64, sz * 128 + 64, class60.level, (byte) 114),
                                          highestValue, var10, var13, var12);
        }
    }
}
