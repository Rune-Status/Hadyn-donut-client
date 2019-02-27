package jagex.osrs;

public class EntityPacket {

    public static final EntityPacket UPDATE_ITEM_STACK;
    public static final EntityPacket field2316;
    public static final EntityPacket field2318;
    public static final EntityPacket field2319;
    public static final EntityPacket field2320;
    public static final EntityPacket field2321;
    public static final EntityPacket field2322;
    public static final EntityPacket REMOVE_ITEM_STACK;
    public static final EntityPacket CREATE_ITEM_STACK;
    public static final EntityPacket field2325;

    static {
        UPDATE_ITEM_STACK = new EntityPacket(7);
        field2316 = new EntityPacket(15);
        field2318 = new EntityPacket(14);
        field2319 = new EntityPacket(6);
        field2320 = new EntityPacket(4);
        field2321 = new EntityPacket(5);
        field2322 = new EntityPacket(2);
        REMOVE_ITEM_STACK = new EntityPacket(3);
        CREATE_ITEM_STACK = new EntityPacket(5);
        field2325 = new EntityPacket(4);
    }

    EntityPacket(int var1) {
    }
}
