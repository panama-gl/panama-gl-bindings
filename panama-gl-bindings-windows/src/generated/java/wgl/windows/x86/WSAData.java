// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class WSAData {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("wHighVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("iMaxSockets"),
        Constants$root.C_SHORT$LAYOUT.withName("iMaxUdpDg"),
        Constants$root.C_POINTER$LAYOUT.withName("lpVendorInfo"),
        MemoryLayout.sequenceLayout(257, Constants$root.C_CHAR$LAYOUT).withName("szDescription"),
        MemoryLayout.sequenceLayout(129, Constants$root.C_CHAR$LAYOUT).withName("szSystemStatus"),
        MemoryLayout.paddingLayout(48)
    ).withName("WSAData");
    public static MemoryLayout $LAYOUT() {
        return WSAData.$struct$LAYOUT;
    }
    static final VarHandle wVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wVersion"));
    public static VarHandle wVersion$VH() {
        return WSAData.wVersion$VH;
    }
    public static short wVersion$get(MemorySegment seg) {
        return (short)WSAData.wVersion$VH.get(seg);
    }
    public static void wVersion$set( MemorySegment seg, short x) {
        WSAData.wVersion$VH.set(seg, x);
    }
    public static short wVersion$get(MemorySegment seg, long index) {
        return (short)WSAData.wVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wVersion$set(MemorySegment seg, long index, short x) {
        WSAData.wVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wHighVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wHighVersion"));
    public static VarHandle wHighVersion$VH() {
        return WSAData.wHighVersion$VH;
    }
    public static short wHighVersion$get(MemorySegment seg) {
        return (short)WSAData.wHighVersion$VH.get(seg);
    }
    public static void wHighVersion$set( MemorySegment seg, short x) {
        WSAData.wHighVersion$VH.set(seg, x);
    }
    public static short wHighVersion$get(MemorySegment seg, long index) {
        return (short)WSAData.wHighVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wHighVersion$set(MemorySegment seg, long index, short x) {
        WSAData.wHighVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iMaxSockets$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iMaxSockets"));
    public static VarHandle iMaxSockets$VH() {
        return WSAData.iMaxSockets$VH;
    }
    public static short iMaxSockets$get(MemorySegment seg) {
        return (short)WSAData.iMaxSockets$VH.get(seg);
    }
    public static void iMaxSockets$set( MemorySegment seg, short x) {
        WSAData.iMaxSockets$VH.set(seg, x);
    }
    public static short iMaxSockets$get(MemorySegment seg, long index) {
        return (short)WSAData.iMaxSockets$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iMaxSockets$set(MemorySegment seg, long index, short x) {
        WSAData.iMaxSockets$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iMaxUdpDg$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iMaxUdpDg"));
    public static VarHandle iMaxUdpDg$VH() {
        return WSAData.iMaxUdpDg$VH;
    }
    public static short iMaxUdpDg$get(MemorySegment seg) {
        return (short)WSAData.iMaxUdpDg$VH.get(seg);
    }
    public static void iMaxUdpDg$set( MemorySegment seg, short x) {
        WSAData.iMaxUdpDg$VH.set(seg, x);
    }
    public static short iMaxUdpDg$get(MemorySegment seg, long index) {
        return (short)WSAData.iMaxUdpDg$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iMaxUdpDg$set(MemorySegment seg, long index, short x) {
        WSAData.iMaxUdpDg$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpVendorInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpVendorInfo"));
    public static VarHandle lpVendorInfo$VH() {
        return WSAData.lpVendorInfo$VH;
    }
    public static MemoryAddress lpVendorInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)WSAData.lpVendorInfo$VH.get(seg);
    }
    public static void lpVendorInfo$set( MemorySegment seg, MemoryAddress x) {
        WSAData.lpVendorInfo$VH.set(seg, x);
    }
    public static MemoryAddress lpVendorInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)WSAData.lpVendorInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpVendorInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        WSAData.lpVendorInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szDescription$slice(MemorySegment seg) {
        return seg.asSlice(16, 257);
    }
    public static MemorySegment szSystemStatus$slice(MemorySegment seg) {
        return seg.asSlice(273, 129);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

