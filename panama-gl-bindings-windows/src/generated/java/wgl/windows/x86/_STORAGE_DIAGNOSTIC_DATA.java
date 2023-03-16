// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_DIAGNOSTIC_DATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ProviderId"),
        Constants$root.C_LONG$LAYOUT.withName("BufferSize"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("DiagnosticDataBuffer"),
        MemoryLayout.paddingLayout(24)
    ).withName("_STORAGE_DIAGNOSTIC_DATA");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_DIAGNOSTIC_DATA.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_DIAGNOSTIC_DATA.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_DIAGNOSTIC_DATA.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _STORAGE_DIAGNOSTIC_DATA.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DIAGNOSTIC_DATA.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_DIAGNOSTIC_DATA.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_DIAGNOSTIC_DATA.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_DIAGNOSTIC_DATA.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _STORAGE_DIAGNOSTIC_DATA.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DIAGNOSTIC_DATA.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_DIAGNOSTIC_DATA.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ProviderId$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    static final VarHandle BufferSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BufferSize"));
    public static VarHandle BufferSize$VH() {
        return _STORAGE_DIAGNOSTIC_DATA.BufferSize$VH;
    }
    public static int BufferSize$get(MemorySegment seg) {
        return (int)_STORAGE_DIAGNOSTIC_DATA.BufferSize$VH.get(seg);
    }
    public static void BufferSize$set( MemorySegment seg, int x) {
        _STORAGE_DIAGNOSTIC_DATA.BufferSize$VH.set(seg, x);
    }
    public static int BufferSize$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DIAGNOSTIC_DATA.BufferSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BufferSize$set(MemorySegment seg, long index, int x) {
        _STORAGE_DIAGNOSTIC_DATA.BufferSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _STORAGE_DIAGNOSTIC_DATA.Reserved$VH;
    }
    public static int Reserved$get(MemorySegment seg) {
        return (int)_STORAGE_DIAGNOSTIC_DATA.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, int x) {
        _STORAGE_DIAGNOSTIC_DATA.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DIAGNOSTIC_DATA.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _STORAGE_DIAGNOSTIC_DATA.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment DiagnosticDataBuffer$slice(MemorySegment seg) {
        return seg.asSlice(32, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


