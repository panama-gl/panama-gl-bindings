// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1266 {

    static final  GroupLayout NETWORK_MANAGER_FIRST_IP_ADDRESS_ARRIVAL_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment NETWORK_MANAGER_FIRST_IP_ADDRESS_ARRIVAL_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("NETWORK_MANAGER_FIRST_IP_ADDRESS_ARRIVAL_GUID", constants$1266.NETWORK_MANAGER_FIRST_IP_ADDRESS_ARRIVAL_GUID$LAYOUT);
    static final  GroupLayout NETWORK_MANAGER_LAST_IP_ADDRESS_REMOVAL_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment NETWORK_MANAGER_LAST_IP_ADDRESS_REMOVAL_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("NETWORK_MANAGER_LAST_IP_ADDRESS_REMOVAL_GUID", constants$1266.NETWORK_MANAGER_LAST_IP_ADDRESS_REMOVAL_GUID$LAYOUT);
    static final  GroupLayout DOMAIN_JOIN_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment DOMAIN_JOIN_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("DOMAIN_JOIN_GUID", constants$1266.DOMAIN_JOIN_GUID$LAYOUT);
    static final  GroupLayout DOMAIN_LEAVE_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment DOMAIN_LEAVE_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("DOMAIN_LEAVE_GUID", constants$1266.DOMAIN_LEAVE_GUID$LAYOUT);
    static final  GroupLayout FIREWALL_PORT_OPEN_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment FIREWALL_PORT_OPEN_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("FIREWALL_PORT_OPEN_GUID", constants$1266.FIREWALL_PORT_OPEN_GUID$LAYOUT);
    static final  GroupLayout FIREWALL_PORT_CLOSE_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment FIREWALL_PORT_CLOSE_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("FIREWALL_PORT_CLOSE_GUID", constants$1266.FIREWALL_PORT_CLOSE_GUID$LAYOUT);
}


