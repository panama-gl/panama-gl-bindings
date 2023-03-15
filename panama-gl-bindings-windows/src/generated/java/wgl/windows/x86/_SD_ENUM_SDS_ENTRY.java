// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SD_ENUM_SDS_ENTRY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Hash"),
        Constants$root.C_LONG$LAYOUT.withName("SecurityId"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Offset"),
        Constants$root.C_LONG$LAYOUT.withName("Length"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Descriptor"),
        MemoryLayout.paddingLayout(24)
    ).withName("_SD_ENUM_SDS_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _SD_ENUM_SDS_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle Hash$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Hash"));
    public static VarHandle Hash$VH() {
        return _SD_ENUM_SDS_ENTRY.Hash$VH;
    }
    public static int Hash$get(MemorySegment seg) {
        return (int)_SD_ENUM_SDS_ENTRY.Hash$VH.get(seg);
    }
    public static void Hash$set( MemorySegment seg, int x) {
        _SD_ENUM_SDS_ENTRY.Hash$VH.set(seg, x);
    }
    public static int Hash$get(MemorySegment seg, long index) {
        return (int)_SD_ENUM_SDS_ENTRY.Hash$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Hash$set(MemorySegment seg, long index, int x) {
        _SD_ENUM_SDS_ENTRY.Hash$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SecurityId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SecurityId"));
    public static VarHandle SecurityId$VH() {
        return _SD_ENUM_SDS_ENTRY.SecurityId$VH;
    }
    public static int SecurityId$get(MemorySegment seg) {
        return (int)_SD_ENUM_SDS_ENTRY.SecurityId$VH.get(seg);
    }
    public static void SecurityId$set( MemorySegment seg, int x) {
        _SD_ENUM_SDS_ENTRY.SecurityId$VH.set(seg, x);
    }
    public static int SecurityId$get(MemorySegment seg, long index) {
        return (int)_SD_ENUM_SDS_ENTRY.SecurityId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SecurityId$set(MemorySegment seg, long index, int x) {
        _SD_ENUM_SDS_ENTRY.SecurityId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Offset"));
    public static VarHandle Offset$VH() {
        return _SD_ENUM_SDS_ENTRY.Offset$VH;
    }
    public static long Offset$get(MemorySegment seg) {
        return (long)_SD_ENUM_SDS_ENTRY.Offset$VH.get(seg);
    }
    public static void Offset$set( MemorySegment seg, long x) {
        _SD_ENUM_SDS_ENTRY.Offset$VH.set(seg, x);
    }
    public static long Offset$get(MemorySegment seg, long index) {
        return (long)_SD_ENUM_SDS_ENTRY.Offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Offset$set(MemorySegment seg, long index, long x) {
        _SD_ENUM_SDS_ENTRY.Offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return _SD_ENUM_SDS_ENTRY.Length$VH;
    }
    public static int Length$get(MemorySegment seg) {
        return (int)_SD_ENUM_SDS_ENTRY.Length$VH.get(seg);
    }
    public static void Length$set( MemorySegment seg, int x) {
        _SD_ENUM_SDS_ENTRY.Length$VH.set(seg, x);
    }
    public static int Length$get(MemorySegment seg, long index) {
        return (int)_SD_ENUM_SDS_ENTRY.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, int x) {
        _SD_ENUM_SDS_ENTRY.Length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Descriptor$slice(MemorySegment seg) {
        return seg.asSlice(20, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


