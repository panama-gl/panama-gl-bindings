// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_HW_FIRMWARE_DOWNLOAD {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_CHAR$LAYOUT.withName("Slot"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_CHAR$LAYOUT).withName("Reserved"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Offset"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("BufferSize"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("ImageBuffer"),
        MemoryLayout.paddingLayout(56)
    ).withName("_STORAGE_HW_FIRMWARE_DOWNLOAD");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_HW_FIRMWARE_DOWNLOAD.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_HW_FIRMWARE_DOWNLOAD.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_HW_FIRMWARE_DOWNLOAD.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _STORAGE_HW_FIRMWARE_DOWNLOAD.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_HW_FIRMWARE_DOWNLOAD.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_HW_FIRMWARE_DOWNLOAD.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_HW_FIRMWARE_DOWNLOAD.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_HW_FIRMWARE_DOWNLOAD.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _STORAGE_HW_FIRMWARE_DOWNLOAD.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_HW_FIRMWARE_DOWNLOAD.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_HW_FIRMWARE_DOWNLOAD.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _STORAGE_HW_FIRMWARE_DOWNLOAD.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_STORAGE_HW_FIRMWARE_DOWNLOAD.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _STORAGE_HW_FIRMWARE_DOWNLOAD.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_STORAGE_HW_FIRMWARE_DOWNLOAD.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _STORAGE_HW_FIRMWARE_DOWNLOAD.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Slot$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Slot"));
    public static VarHandle Slot$VH() {
        return _STORAGE_HW_FIRMWARE_DOWNLOAD.Slot$VH;
    }
    public static byte Slot$get(MemorySegment seg) {
        return (byte)_STORAGE_HW_FIRMWARE_DOWNLOAD.Slot$VH.get(seg);
    }
    public static void Slot$set( MemorySegment seg, byte x) {
        _STORAGE_HW_FIRMWARE_DOWNLOAD.Slot$VH.set(seg, x);
    }
    public static byte Slot$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_HW_FIRMWARE_DOWNLOAD.Slot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Slot$set(MemorySegment seg, long index, byte x) {
        _STORAGE_HW_FIRMWARE_DOWNLOAD.Slot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(13, 3);
    }
    static final VarHandle Offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Offset"));
    public static VarHandle Offset$VH() {
        return _STORAGE_HW_FIRMWARE_DOWNLOAD.Offset$VH;
    }
    public static long Offset$get(MemorySegment seg) {
        return (long)_STORAGE_HW_FIRMWARE_DOWNLOAD.Offset$VH.get(seg);
    }
    public static void Offset$set( MemorySegment seg, long x) {
        _STORAGE_HW_FIRMWARE_DOWNLOAD.Offset$VH.set(seg, x);
    }
    public static long Offset$get(MemorySegment seg, long index) {
        return (long)_STORAGE_HW_FIRMWARE_DOWNLOAD.Offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Offset$set(MemorySegment seg, long index, long x) {
        _STORAGE_HW_FIRMWARE_DOWNLOAD.Offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BufferSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BufferSize"));
    public static VarHandle BufferSize$VH() {
        return _STORAGE_HW_FIRMWARE_DOWNLOAD.BufferSize$VH;
    }
    public static long BufferSize$get(MemorySegment seg) {
        return (long)_STORAGE_HW_FIRMWARE_DOWNLOAD.BufferSize$VH.get(seg);
    }
    public static void BufferSize$set( MemorySegment seg, long x) {
        _STORAGE_HW_FIRMWARE_DOWNLOAD.BufferSize$VH.set(seg, x);
    }
    public static long BufferSize$get(MemorySegment seg, long index) {
        return (long)_STORAGE_HW_FIRMWARE_DOWNLOAD.BufferSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BufferSize$set(MemorySegment seg, long index, long x) {
        _STORAGE_HW_FIRMWARE_DOWNLOAD.BufferSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ImageBuffer$slice(MemorySegment seg) {
        return seg.asSlice(32, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


