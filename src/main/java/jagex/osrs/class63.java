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

    public static InboundPacketDescriptor[] getInboundPackets(int var0) {
        return new InboundPacketDescriptor[]{InboundPacketDescriptor.field2178, InboundPacketDescriptor.field2159, InboundPacketDescriptor.field2119,
            InboundPacketDescriptor.field2187, InboundPacketDescriptor.field2121, InboundPacketDescriptor.field2122, InboundPacketDescriptor.field2123,
            InboundPacketDescriptor.field2199, InboundPacketDescriptor.field2125, InboundPacketDescriptor.field2126, InboundPacketDescriptor.field2127,
            InboundPacketDescriptor.field2128, InboundPacketDescriptor.field2129, InboundPacketDescriptor.field2130, InboundPacketDescriptor.field2118,
            InboundPacketDescriptor.field2132, InboundPacketDescriptor.field2133, InboundPacketDescriptor.field2134, InboundPacketDescriptor.field2169,
            InboundPacketDescriptor.field2136, InboundPacketDescriptor.field2124, InboundPacketDescriptor.field2165, InboundPacketDescriptor.field2139,
            InboundPacketDescriptor.field2140, InboundPacketDescriptor.field2141, InboundPacketDescriptor.field2198, InboundPacketDescriptor.field2143,
            InboundPacketDescriptor.field2181, InboundPacketDescriptor.field2145, InboundPacketDescriptor.field2146, InboundPacketDescriptor.field2147,
            InboundPacketDescriptor.field2148, InboundPacketDescriptor.field2149, InboundPacketDescriptor.field2175, InboundPacketDescriptor.field2144,
            InboundPacketDescriptor.field2152, InboundPacketDescriptor.field2153, InboundPacketDescriptor.field2200, InboundPacketDescriptor.field2155,
            InboundPacketDescriptor.field2205, InboundPacketDescriptor.field2157, InboundPacketDescriptor.field2158, InboundPacketDescriptor.field2203,
            InboundPacketDescriptor.field2156, InboundPacketDescriptor.field2161, InboundPacketDescriptor.field2162, InboundPacketDescriptor.field2163,
            InboundPacketDescriptor.field2164, InboundPacketDescriptor.field2195, InboundPacketDescriptor.field2194, InboundPacketDescriptor.field2167,
            InboundPacketDescriptor.field2168, InboundPacketDescriptor.field2190, InboundPacketDescriptor.field2170, InboundPacketDescriptor.field2171,
            InboundPacketDescriptor.field2160, InboundPacketDescriptor.field2173, InboundPacketDescriptor.field2174, InboundPacketDescriptor.field2193,
            InboundPacketDescriptor.field2176, InboundPacketDescriptor.field2177, InboundPacketDescriptor.field2138, InboundPacketDescriptor.field2179,
            InboundPacketDescriptor.field2180, InboundPacketDescriptor.field2172, InboundPacketDescriptor.field2182, InboundPacketDescriptor.field2183,
            InboundPacketDescriptor.field2184, InboundPacketDescriptor.field2185, InboundPacketDescriptor.field2186, InboundPacketDescriptor.field2196,
            InboundPacketDescriptor.field2188, InboundPacketDescriptor.field2189, InboundPacketDescriptor.field2154, InboundPacketDescriptor.field2191,
            InboundPacketDescriptor.field2192, InboundPacketDescriptor.field2120, InboundPacketDescriptor.field2137, InboundPacketDescriptor.field2131,
            InboundPacketDescriptor.field2201, InboundPacketDescriptor.field2197, InboundPacketDescriptor.field2135, InboundPacketDescriptor.field2142,
            InboundPacketDescriptor.field2166, InboundPacketDescriptor.field2204};
    }

    public static class159 method1657(Socket var0, int var1, int var2, int var3)
        throws IOException {
        return new class161(var0, var1, var2);
    }

    static int method1658(int var0, class86 var1, boolean var2, int var3) {
        class232 var4 = var2 ? class10.field75 : class70.field1080;
        if (var0 == 1800) {
            class70.field1070[++class60.field600 - 1] = class9
                .method98(class254.method5000(var4, 2143165709), (byte) -78);
            return 1;
        } else if (var0 != 1801) {
            if (var0 == 1802) {
                if (var4.field2697 == null) {
                    class70.field1065[++class70.field1072 - 1] = "";
                } else {
                    class70.field1065[++class70.field1072 - 1] = var4.field2697;
                }

                return 1;
            } else {
                return 2;
            }
        } else {
            int var5 = class70.field1070[--class60.field600];
            --var5;
            if (var4.field2731 != null && var5 < var4.field2731.length
                && var4.field2731[var5] != null) {
                class70.field1065[++class70.field1072 - 1] = var4.field2731[var5];
            } else {
                class70.field1065[++class70.field1072 - 1] = "";
            }

            return 1;
        }
    }
}
