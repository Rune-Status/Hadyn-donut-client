package jagex.osrs;

import java.io.IOException;
import java.net.Socket;

public final class class63 extends Node {

    int field932;
    int field933;
    int field934;
    int field922;
    int field925;
    int field926;
    int field929;
    int field931;
    int field930;
    int field923;
    int field924;
    int field935;

    class63() {
        this.field932 = 0;
        this.field933 = -1;
    }

    public static InboundPacketDescriptor[] getInboundPackets() {
        return new InboundPacketDescriptor[]{
            InboundPacketDescriptor.REBUILD_SCENE,
            InboundPacketDescriptor.LOGOUT,
            InboundPacketDescriptor.INBOUND_PACKET_2,
            InboundPacketDescriptor.INBOUND_PACKET_3,
            InboundPacketDescriptor.INBOUND_PACKET_4,
            InboundPacketDescriptor.INBOUND_PACKET_5,
            InboundPacketDescriptor.INBOUND_PACKET_6,
            InboundPacketDescriptor.INBOUND_PACKET_7,
            InboundPacketDescriptor.INBOUND_PACKET_8,
            InboundPacketDescriptor.INBOUND_PACKET_9,
            InboundPacketDescriptor.INBOUND_PACKET_10,
            InboundPacketDescriptor.INBOUND_PACKET_11,
            InboundPacketDescriptor.INBOUND_PACKET_12,
            InboundPacketDescriptor.INBOUND_PACKET_13,
            InboundPacketDescriptor.REMOVE_ITEM_STACK,
            InboundPacketDescriptor.UPDATE_ITEM_STACK,
            InboundPacketDescriptor.INBOUND_PACKET_16,
            InboundPacketDescriptor.INBOUND_PACKET_17,
            InboundPacketDescriptor.OPEN_URL,
            InboundPacketDescriptor.INBOUND_PACKET_19,
            InboundPacketDescriptor.INBOUND_PACKET_20,
            InboundPacketDescriptor.INBOUND_PACKET_21,
            InboundPacketDescriptor.INBOUND_PACKET_22,
            InboundPacketDescriptor.INBOUND_PACKET_23,
            InboundPacketDescriptor.INBOUND_PACKET_24,
            InboundPacketDescriptor.INBOUND_PACKET_25,
            InboundPacketDescriptor.CREATE_GROUND_ITEM,
            InboundPacketDescriptor.INBOUND_PACKET_27,
            InboundPacketDescriptor.INBOUND_PACKET_28,
            InboundPacketDescriptor.INBOUND_PACKET_29,
            InboundPacketDescriptor.INBOUND_PACKET_30,
            InboundPacketDescriptor.INBOUND_PACKET_31,
            InboundPacketDescriptor.INBOUND_PACKET_32,
            InboundPacketDescriptor.INBOUND_PACKET_33,
            InboundPacketDescriptor.INBOUND_PACKET_34,
            InboundPacketDescriptor.INBOUND_PACKET_35,
            InboundPacketDescriptor.INBOUND_PACKET_36,
            InboundPacketDescriptor.INBOUND_PACKET_37,
            InboundPacketDescriptor.INBOUND_PACKET_38,
            InboundPacketDescriptor.INBOUND_PACKET_39,
            InboundPacketDescriptor.INBOUND_PACKET_40,
            InboundPacketDescriptor.INBOUND_PACKET_41,
            InboundPacketDescriptor.INBOUND_PACKET_42,
            InboundPacketDescriptor.INBOUND_PACKET_43,
            InboundPacketDescriptor.INBOUND_PACKET_44,
            InboundPacketDescriptor.INBOUND_PACKET_45,
            InboundPacketDescriptor.INBOUND_PACKET_46,
            InboundPacketDescriptor.INBOUND_PACKET_47,
            InboundPacketDescriptor.INBOUND_PACKET_48,
            InboundPacketDescriptor.INBOUND_PACKET_49,
            InboundPacketDescriptor.INBOUND_PACKET_50,
            InboundPacketDescriptor.REBUILD_INSTANCED_SCENE,
            InboundPacketDescriptor.INBOUND_PACKET_52,
            InboundPacketDescriptor.INBOUND_PACKET_53,
            InboundPacketDescriptor.INBOUND_PACKET_54,
            InboundPacketDescriptor.INBOUND_PACKET_55,
            InboundPacketDescriptor.INBOUND_PACKET_56,
            InboundPacketDescriptor.INBOUND_PACKET_57,
            InboundPacketDescriptor.INBOUND_PACKET_58,
            InboundPacketDescriptor.INBOUND_PACKET_59,
            InboundPacketDescriptor.INBOUND_PACKET_60,
            InboundPacketDescriptor.INBOUND_PACKET_61,
            InboundPacketDescriptor.EXECUTE_SCRIPT,
            InboundPacketDescriptor.INBOUND_PACKET_63,
            InboundPacketDescriptor.INBOUNC_PACKET_64,
            InboundPacketDescriptor.INBOUND_PACKET_65,
            InboundPacketDescriptor.SET_PLAYER_OPTION,
            InboundPacketDescriptor.INBOUND_PACKET_67,
            InboundPacketDescriptor.INBOUND_PACKET_68,
            InboundPacketDescriptor.INBOUND_PACKET_69,
            InboundPacketDescriptor.INBOUND_PACKET_70,
            InboundPacketDescriptor.INBOUND_PACKET_71,
            InboundPacketDescriptor.INBOUND_PACKET_72,
            InboundPacketDescriptor.INBOUND_PACKET_73,
            InboundPacketDescriptor.INBOUND_PACKET_74,
            InboundPacketDescriptor.INBOUND_PACKET_75,
            InboundPacketDescriptor.INBOUND_PACKET_76,
            InboundPacketDescriptor.INBOUND_PACKET_77,
            InboundPacketDescriptor.INBOUND_PACKET_78,
            InboundPacketDescriptor.INBOUND_PACKET_79,
            InboundPacketDescriptor.INBOUND_PACKET_80,
            InboundPacketDescriptor.INBOUND_PACKET_81,
            InboundPacketDescriptor.INBOUND_PACKET_82,
            InboundPacketDescriptor.INBOUND_PACKET_83,
            InboundPacketDescriptor.INBOUND_PACKET_84
        };
    }

    public static AbstractSocket method1657(Socket var0, int var1, int var2, int var3)
        throws IOException {
        return new class161(var0, var1, var2);
    }

    static int method1658(int var0, class86 var1, boolean var2, int var3) {
        class232 var4 = var2 ? class10.field75 : ScriptExecutor.field1080;
        if (var0 == 1800) {
            ScriptExecutor.field1070[++class60.field600 - 1] = class9
                .method98(class254.method5000(var4, 2143165709), (byte) -78);
            return 1;
        } else if (var0 != 1801) {
            if (var0 == 1802) {
                if (var4.field2697 == null) {
                    ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = "";
                } else {
                    ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = var4.field2697;
                }

                return 1;
            } else {
                return 2;
            }
        } else {
            int var5 = ScriptExecutor.field1070[--class60.field600];
            --var5;
            if (var4.field2731 != null && var5 < var4.field2731.length
                && var4.field2731[var5] != null) {
                ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = var4.field2731[var5];
            } else {
                ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = "";
            }

            return 1;
        }
    }
}
