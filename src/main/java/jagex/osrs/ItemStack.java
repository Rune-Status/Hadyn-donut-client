package jagex.osrs;

public final class ItemStack extends class129 {

    int id;
    int amount;

    protected final class121 vmethod3236(int var1) {
        return ItemConfig.get(this.id)
                      .method5350(this.amount, -616764050);
    }
}
