// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SD_ENUM_SDS_OUTPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("NextOffset"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("NumSDEntriesReturned"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("NumSDBytesReturned"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Hash"),
            Constants$root.C_LONG$LAYOUT.withName("SecurityId"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Offset"),
            Constants$root.C_LONG$LAYOUT.withName("Length"),
            MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Descriptor"),
            MemoryLayout.paddingLayout(24)
        ).withName("_SD_ENUM_SDS_ENTRY")).withName("SDEntry")
    ).withName("_SD_ENUM_SDS_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _SD_ENUM_SDS_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle NextOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NextOffset"));
    public static VarHandle NextOffset$VH() {
        return _SD_ENUM_SDS_OUTPUT.NextOffset$VH;
    }
    public static long NextOffset$get(MemorySegment seg) {
        return (long)_SD_ENUM_SDS_OUTPUT.NextOffset$VH.get(seg);
    }
    public static void NextOffset$set( MemorySegment seg, long x) {
        _SD_ENUM_SDS_OUTPUT.NextOffset$VH.set(seg, x);
    }
    public static long NextOffset$get(MemorySegment seg, long index) {
        return (long)_SD_ENUM_SDS_OUTPUT.NextOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NextOffset$set(MemorySegment seg, long index, long x) {
        _SD_ENUM_SDS_OUTPUT.NextOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumSDEntriesReturned$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumSDEntriesReturned"));
    public static VarHandle NumSDEntriesReturned$VH() {
        return _SD_ENUM_SDS_OUTPUT.NumSDEntriesReturned$VH;
    }
    public static long NumSDEntriesReturned$get(MemorySegment seg) {
        return (long)_SD_ENUM_SDS_OUTPUT.NumSDEntriesReturned$VH.get(seg);
    }
    public static void NumSDEntriesReturned$set( MemorySegment seg, long x) {
        _SD_ENUM_SDS_OUTPUT.NumSDEntriesReturned$VH.set(seg, x);
    }
    public static long NumSDEntriesReturned$get(MemorySegment seg, long index) {
        return (long)_SD_ENUM_SDS_OUTPUT.NumSDEntriesReturned$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumSDEntriesReturned$set(MemorySegment seg, long index, long x) {
        _SD_ENUM_SDS_OUTPUT.NumSDEntriesReturned$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumSDBytesReturned$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumSDBytesReturned"));
    public static VarHandle NumSDBytesReturned$VH() {
        return _SD_ENUM_SDS_OUTPUT.NumSDBytesReturned$VH;
    }
    public static long NumSDBytesReturned$get(MemorySegment seg) {
        return (long)_SD_ENUM_SDS_OUTPUT.NumSDBytesReturned$VH.get(seg);
    }
    public static void NumSDBytesReturned$set( MemorySegment seg, long x) {
        _SD_ENUM_SDS_OUTPUT.NumSDBytesReturned$VH.set(seg, x);
    }
    public static long NumSDBytesReturned$get(MemorySegment seg, long index) {
        return (long)_SD_ENUM_SDS_OUTPUT.NumSDBytesReturned$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumSDBytesReturned$set(MemorySegment seg, long index, long x) {
        _SD_ENUM_SDS_OUTPUT.NumSDBytesReturned$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment SDEntry$slice(MemorySegment seg) {
        return seg.asSlice(24, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


