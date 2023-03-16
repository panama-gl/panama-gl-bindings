// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_PROTOCOL_DATA_DESCRIPTOR_EXT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("ProtocolType"),
            Constants$root.C_LONG$LAYOUT.withName("DataType"),
            Constants$root.C_LONG$LAYOUT.withName("ProtocolDataValue"),
            Constants$root.C_LONG$LAYOUT.withName("ProtocolDataSubValue"),
            Constants$root.C_LONG$LAYOUT.withName("ProtocolDataOffset"),
            Constants$root.C_LONG$LAYOUT.withName("ProtocolDataLength"),
            Constants$root.C_LONG$LAYOUT.withName("FixedProtocolReturnData"),
            Constants$root.C_LONG$LAYOUT.withName("ProtocolDataSubValue2"),
            Constants$root.C_LONG$LAYOUT.withName("ProtocolDataSubValue3"),
            Constants$root.C_LONG$LAYOUT.withName("ProtocolDataSubValue4"),
            Constants$root.C_LONG$LAYOUT.withName("ProtocolDataSubValue5"),
            MemoryLayout.sequenceLayout(5, Constants$root.C_LONG$LAYOUT).withName("Reserved")
        ).withName("ProtocolSpecificData")
    ).withName("_STORAGE_PROTOCOL_DATA_DESCRIPTOR_EXT");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_PROTOCOL_DATA_DESCRIPTOR_EXT.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_PROTOCOL_DATA_DESCRIPTOR_EXT.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_PROTOCOL_DATA_DESCRIPTOR_EXT.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _STORAGE_PROTOCOL_DATA_DESCRIPTOR_EXT.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_PROTOCOL_DATA_DESCRIPTOR_EXT.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_PROTOCOL_DATA_DESCRIPTOR_EXT.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_PROTOCOL_DATA_DESCRIPTOR_EXT.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_PROTOCOL_DATA_DESCRIPTOR_EXT.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _STORAGE_PROTOCOL_DATA_DESCRIPTOR_EXT.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_PROTOCOL_DATA_DESCRIPTOR_EXT.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_PROTOCOL_DATA_DESCRIPTOR_EXT.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ProtocolSpecificData$slice(MemorySegment seg) {
        return seg.asSlice(8, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


