// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _COMMPROP {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wPacketLength"),
        Constants$root.C_SHORT$LAYOUT.withName("wPacketVersion"),
        Constants$root.C_LONG$LAYOUT.withName("dwServiceMask"),
        Constants$root.C_LONG$LAYOUT.withName("dwReserved1"),
        Constants$root.C_LONG$LAYOUT.withName("dwMaxTxQueue"),
        Constants$root.C_LONG$LAYOUT.withName("dwMaxRxQueue"),
        Constants$root.C_LONG$LAYOUT.withName("dwMaxBaud"),
        Constants$root.C_LONG$LAYOUT.withName("dwProvSubType"),
        Constants$root.C_LONG$LAYOUT.withName("dwProvCapabilities"),
        Constants$root.C_LONG$LAYOUT.withName("dwSettableParams"),
        Constants$root.C_LONG$LAYOUT.withName("dwSettableBaud"),
        Constants$root.C_SHORT$LAYOUT.withName("wSettableData"),
        Constants$root.C_SHORT$LAYOUT.withName("wSettableStopParity"),
        Constants$root.C_LONG$LAYOUT.withName("dwCurrentTxQueue"),
        Constants$root.C_LONG$LAYOUT.withName("dwCurrentRxQueue"),
        Constants$root.C_LONG$LAYOUT.withName("dwProvSpec1"),
        Constants$root.C_LONG$LAYOUT.withName("dwProvSpec2"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("wcProvChar"),
        MemoryLayout.paddingLayout(16)
    ).withName("_COMMPROP");
    public static MemoryLayout $LAYOUT() {
        return _COMMPROP.$struct$LAYOUT;
    }
    static final VarHandle wPacketLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPacketLength"));
    public static VarHandle wPacketLength$VH() {
        return _COMMPROP.wPacketLength$VH;
    }
    public static short wPacketLength$get(MemorySegment seg) {
        return (short)_COMMPROP.wPacketLength$VH.get(seg);
    }
    public static void wPacketLength$set( MemorySegment seg, short x) {
        _COMMPROP.wPacketLength$VH.set(seg, x);
    }
    public static short wPacketLength$get(MemorySegment seg, long index) {
        return (short)_COMMPROP.wPacketLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPacketLength$set(MemorySegment seg, long index, short x) {
        _COMMPROP.wPacketLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPacketVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPacketVersion"));
    public static VarHandle wPacketVersion$VH() {
        return _COMMPROP.wPacketVersion$VH;
    }
    public static short wPacketVersion$get(MemorySegment seg) {
        return (short)_COMMPROP.wPacketVersion$VH.get(seg);
    }
    public static void wPacketVersion$set( MemorySegment seg, short x) {
        _COMMPROP.wPacketVersion$VH.set(seg, x);
    }
    public static short wPacketVersion$get(MemorySegment seg, long index) {
        return (short)_COMMPROP.wPacketVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPacketVersion$set(MemorySegment seg, long index, short x) {
        _COMMPROP.wPacketVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwServiceMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwServiceMask"));
    public static VarHandle dwServiceMask$VH() {
        return _COMMPROP.dwServiceMask$VH;
    }
    public static int dwServiceMask$get(MemorySegment seg) {
        return (int)_COMMPROP.dwServiceMask$VH.get(seg);
    }
    public static void dwServiceMask$set( MemorySegment seg, int x) {
        _COMMPROP.dwServiceMask$VH.set(seg, x);
    }
    public static int dwServiceMask$get(MemorySegment seg, long index) {
        return (int)_COMMPROP.dwServiceMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwServiceMask$set(MemorySegment seg, long index, int x) {
        _COMMPROP.dwServiceMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReserved1"));
    public static VarHandle dwReserved1$VH() {
        return _COMMPROP.dwReserved1$VH;
    }
    public static int dwReserved1$get(MemorySegment seg) {
        return (int)_COMMPROP.dwReserved1$VH.get(seg);
    }
    public static void dwReserved1$set( MemorySegment seg, int x) {
        _COMMPROP.dwReserved1$VH.set(seg, x);
    }
    public static int dwReserved1$get(MemorySegment seg, long index) {
        return (int)_COMMPROP.dwReserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved1$set(MemorySegment seg, long index, int x) {
        _COMMPROP.dwReserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMaxTxQueue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMaxTxQueue"));
    public static VarHandle dwMaxTxQueue$VH() {
        return _COMMPROP.dwMaxTxQueue$VH;
    }
    public static int dwMaxTxQueue$get(MemorySegment seg) {
        return (int)_COMMPROP.dwMaxTxQueue$VH.get(seg);
    }
    public static void dwMaxTxQueue$set( MemorySegment seg, int x) {
        _COMMPROP.dwMaxTxQueue$VH.set(seg, x);
    }
    public static int dwMaxTxQueue$get(MemorySegment seg, long index) {
        return (int)_COMMPROP.dwMaxTxQueue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMaxTxQueue$set(MemorySegment seg, long index, int x) {
        _COMMPROP.dwMaxTxQueue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMaxRxQueue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMaxRxQueue"));
    public static VarHandle dwMaxRxQueue$VH() {
        return _COMMPROP.dwMaxRxQueue$VH;
    }
    public static int dwMaxRxQueue$get(MemorySegment seg) {
        return (int)_COMMPROP.dwMaxRxQueue$VH.get(seg);
    }
    public static void dwMaxRxQueue$set( MemorySegment seg, int x) {
        _COMMPROP.dwMaxRxQueue$VH.set(seg, x);
    }
    public static int dwMaxRxQueue$get(MemorySegment seg, long index) {
        return (int)_COMMPROP.dwMaxRxQueue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMaxRxQueue$set(MemorySegment seg, long index, int x) {
        _COMMPROP.dwMaxRxQueue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMaxBaud$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMaxBaud"));
    public static VarHandle dwMaxBaud$VH() {
        return _COMMPROP.dwMaxBaud$VH;
    }
    public static int dwMaxBaud$get(MemorySegment seg) {
        return (int)_COMMPROP.dwMaxBaud$VH.get(seg);
    }
    public static void dwMaxBaud$set( MemorySegment seg, int x) {
        _COMMPROP.dwMaxBaud$VH.set(seg, x);
    }
    public static int dwMaxBaud$get(MemorySegment seg, long index) {
        return (int)_COMMPROP.dwMaxBaud$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMaxBaud$set(MemorySegment seg, long index, int x) {
        _COMMPROP.dwMaxBaud$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProvSubType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwProvSubType"));
    public static VarHandle dwProvSubType$VH() {
        return _COMMPROP.dwProvSubType$VH;
    }
    public static int dwProvSubType$get(MemorySegment seg) {
        return (int)_COMMPROP.dwProvSubType$VH.get(seg);
    }
    public static void dwProvSubType$set( MemorySegment seg, int x) {
        _COMMPROP.dwProvSubType$VH.set(seg, x);
    }
    public static int dwProvSubType$get(MemorySegment seg, long index) {
        return (int)_COMMPROP.dwProvSubType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProvSubType$set(MemorySegment seg, long index, int x) {
        _COMMPROP.dwProvSubType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProvCapabilities$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwProvCapabilities"));
    public static VarHandle dwProvCapabilities$VH() {
        return _COMMPROP.dwProvCapabilities$VH;
    }
    public static int dwProvCapabilities$get(MemorySegment seg) {
        return (int)_COMMPROP.dwProvCapabilities$VH.get(seg);
    }
    public static void dwProvCapabilities$set( MemorySegment seg, int x) {
        _COMMPROP.dwProvCapabilities$VH.set(seg, x);
    }
    public static int dwProvCapabilities$get(MemorySegment seg, long index) {
        return (int)_COMMPROP.dwProvCapabilities$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProvCapabilities$set(MemorySegment seg, long index, int x) {
        _COMMPROP.dwProvCapabilities$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSettableParams$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSettableParams"));
    public static VarHandle dwSettableParams$VH() {
        return _COMMPROP.dwSettableParams$VH;
    }
    public static int dwSettableParams$get(MemorySegment seg) {
        return (int)_COMMPROP.dwSettableParams$VH.get(seg);
    }
    public static void dwSettableParams$set( MemorySegment seg, int x) {
        _COMMPROP.dwSettableParams$VH.set(seg, x);
    }
    public static int dwSettableParams$get(MemorySegment seg, long index) {
        return (int)_COMMPROP.dwSettableParams$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSettableParams$set(MemorySegment seg, long index, int x) {
        _COMMPROP.dwSettableParams$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSettableBaud$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSettableBaud"));
    public static VarHandle dwSettableBaud$VH() {
        return _COMMPROP.dwSettableBaud$VH;
    }
    public static int dwSettableBaud$get(MemorySegment seg) {
        return (int)_COMMPROP.dwSettableBaud$VH.get(seg);
    }
    public static void dwSettableBaud$set( MemorySegment seg, int x) {
        _COMMPROP.dwSettableBaud$VH.set(seg, x);
    }
    public static int dwSettableBaud$get(MemorySegment seg, long index) {
        return (int)_COMMPROP.dwSettableBaud$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSettableBaud$set(MemorySegment seg, long index, int x) {
        _COMMPROP.dwSettableBaud$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wSettableData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wSettableData"));
    public static VarHandle wSettableData$VH() {
        return _COMMPROP.wSettableData$VH;
    }
    public static short wSettableData$get(MemorySegment seg) {
        return (short)_COMMPROP.wSettableData$VH.get(seg);
    }
    public static void wSettableData$set( MemorySegment seg, short x) {
        _COMMPROP.wSettableData$VH.set(seg, x);
    }
    public static short wSettableData$get(MemorySegment seg, long index) {
        return (short)_COMMPROP.wSettableData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wSettableData$set(MemorySegment seg, long index, short x) {
        _COMMPROP.wSettableData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wSettableStopParity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wSettableStopParity"));
    public static VarHandle wSettableStopParity$VH() {
        return _COMMPROP.wSettableStopParity$VH;
    }
    public static short wSettableStopParity$get(MemorySegment seg) {
        return (short)_COMMPROP.wSettableStopParity$VH.get(seg);
    }
    public static void wSettableStopParity$set( MemorySegment seg, short x) {
        _COMMPROP.wSettableStopParity$VH.set(seg, x);
    }
    public static short wSettableStopParity$get(MemorySegment seg, long index) {
        return (short)_COMMPROP.wSettableStopParity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wSettableStopParity$set(MemorySegment seg, long index, short x) {
        _COMMPROP.wSettableStopParity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCurrentTxQueue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCurrentTxQueue"));
    public static VarHandle dwCurrentTxQueue$VH() {
        return _COMMPROP.dwCurrentTxQueue$VH;
    }
    public static int dwCurrentTxQueue$get(MemorySegment seg) {
        return (int)_COMMPROP.dwCurrentTxQueue$VH.get(seg);
    }
    public static void dwCurrentTxQueue$set( MemorySegment seg, int x) {
        _COMMPROP.dwCurrentTxQueue$VH.set(seg, x);
    }
    public static int dwCurrentTxQueue$get(MemorySegment seg, long index) {
        return (int)_COMMPROP.dwCurrentTxQueue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCurrentTxQueue$set(MemorySegment seg, long index, int x) {
        _COMMPROP.dwCurrentTxQueue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCurrentRxQueue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCurrentRxQueue"));
    public static VarHandle dwCurrentRxQueue$VH() {
        return _COMMPROP.dwCurrentRxQueue$VH;
    }
    public static int dwCurrentRxQueue$get(MemorySegment seg) {
        return (int)_COMMPROP.dwCurrentRxQueue$VH.get(seg);
    }
    public static void dwCurrentRxQueue$set( MemorySegment seg, int x) {
        _COMMPROP.dwCurrentRxQueue$VH.set(seg, x);
    }
    public static int dwCurrentRxQueue$get(MemorySegment seg, long index) {
        return (int)_COMMPROP.dwCurrentRxQueue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCurrentRxQueue$set(MemorySegment seg, long index, int x) {
        _COMMPROP.dwCurrentRxQueue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProvSpec1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwProvSpec1"));
    public static VarHandle dwProvSpec1$VH() {
        return _COMMPROP.dwProvSpec1$VH;
    }
    public static int dwProvSpec1$get(MemorySegment seg) {
        return (int)_COMMPROP.dwProvSpec1$VH.get(seg);
    }
    public static void dwProvSpec1$set( MemorySegment seg, int x) {
        _COMMPROP.dwProvSpec1$VH.set(seg, x);
    }
    public static int dwProvSpec1$get(MemorySegment seg, long index) {
        return (int)_COMMPROP.dwProvSpec1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProvSpec1$set(MemorySegment seg, long index, int x) {
        _COMMPROP.dwProvSpec1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProvSpec2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwProvSpec2"));
    public static VarHandle dwProvSpec2$VH() {
        return _COMMPROP.dwProvSpec2$VH;
    }
    public static int dwProvSpec2$get(MemorySegment seg) {
        return (int)_COMMPROP.dwProvSpec2$VH.get(seg);
    }
    public static void dwProvSpec2$set( MemorySegment seg, int x) {
        _COMMPROP.dwProvSpec2$VH.set(seg, x);
    }
    public static int dwProvSpec2$get(MemorySegment seg, long index) {
        return (int)_COMMPROP.dwProvSpec2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProvSpec2$set(MemorySegment seg, long index, int x) {
        _COMMPROP.dwProvSpec2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment wcProvChar$slice(MemorySegment seg) {
        return seg.asSlice(60, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


