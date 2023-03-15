// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_HW_FIRMWARE_INFO_QUERY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved")
    ).withName("_STORAGE_HW_FIRMWARE_INFO_QUERY");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_HW_FIRMWARE_INFO_QUERY.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_HW_FIRMWARE_INFO_QUERY.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_HW_FIRMWARE_INFO_QUERY.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _STORAGE_HW_FIRMWARE_INFO_QUERY.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_HW_FIRMWARE_INFO_QUERY.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_HW_FIRMWARE_INFO_QUERY.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_HW_FIRMWARE_INFO_QUERY.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_HW_FIRMWARE_INFO_QUERY.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _STORAGE_HW_FIRMWARE_INFO_QUERY.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_HW_FIRMWARE_INFO_QUERY.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_HW_FIRMWARE_INFO_QUERY.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _STORAGE_HW_FIRMWARE_INFO_QUERY.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_STORAGE_HW_FIRMWARE_INFO_QUERY.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _STORAGE_HW_FIRMWARE_INFO_QUERY.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_STORAGE_HW_FIRMWARE_INFO_QUERY.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _STORAGE_HW_FIRMWARE_INFO_QUERY.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _STORAGE_HW_FIRMWARE_INFO_QUERY.Reserved$VH;
    }
    public static int Reserved$get(MemorySegment seg) {
        return (int)_STORAGE_HW_FIRMWARE_INFO_QUERY.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, int x) {
        _STORAGE_HW_FIRMWARE_INFO_QUERY.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_STORAGE_HW_FIRMWARE_INFO_QUERY.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _STORAGE_HW_FIRMWARE_INFO_QUERY.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


