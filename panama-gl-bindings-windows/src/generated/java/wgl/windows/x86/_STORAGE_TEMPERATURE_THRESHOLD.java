// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_TEMPERATURE_THRESHOLD {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_SHORT$LAYOUT.withName("Flags"),
        Constants$root.C_SHORT$LAYOUT.withName("Index"),
        Constants$root.C_SHORT$LAYOUT.withName("Threshold"),
        Constants$root.C_CHAR$LAYOUT.withName("OverThreshold"),
        Constants$root.C_CHAR$LAYOUT.withName("Reserved")
    ).withName("_STORAGE_TEMPERATURE_THRESHOLD");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_TEMPERATURE_THRESHOLD.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_TEMPERATURE_THRESHOLD.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_TEMPERATURE_THRESHOLD.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _STORAGE_TEMPERATURE_THRESHOLD.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_TEMPERATURE_THRESHOLD.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_TEMPERATURE_THRESHOLD.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_TEMPERATURE_THRESHOLD.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_TEMPERATURE_THRESHOLD.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _STORAGE_TEMPERATURE_THRESHOLD.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_TEMPERATURE_THRESHOLD.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_TEMPERATURE_THRESHOLD.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _STORAGE_TEMPERATURE_THRESHOLD.Flags$VH;
    }
    public static short Flags$get(MemorySegment seg) {
        return (short)_STORAGE_TEMPERATURE_THRESHOLD.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, short x) {
        _STORAGE_TEMPERATURE_THRESHOLD.Flags$VH.set(seg, x);
    }
    public static short Flags$get(MemorySegment seg, long index) {
        return (short)_STORAGE_TEMPERATURE_THRESHOLD.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, short x) {
        _STORAGE_TEMPERATURE_THRESHOLD.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Index$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Index"));
    public static VarHandle Index$VH() {
        return _STORAGE_TEMPERATURE_THRESHOLD.Index$VH;
    }
    public static short Index$get(MemorySegment seg) {
        return (short)_STORAGE_TEMPERATURE_THRESHOLD.Index$VH.get(seg);
    }
    public static void Index$set( MemorySegment seg, short x) {
        _STORAGE_TEMPERATURE_THRESHOLD.Index$VH.set(seg, x);
    }
    public static short Index$get(MemorySegment seg, long index) {
        return (short)_STORAGE_TEMPERATURE_THRESHOLD.Index$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Index$set(MemorySegment seg, long index, short x) {
        _STORAGE_TEMPERATURE_THRESHOLD.Index$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Threshold$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Threshold"));
    public static VarHandle Threshold$VH() {
        return _STORAGE_TEMPERATURE_THRESHOLD.Threshold$VH;
    }
    public static short Threshold$get(MemorySegment seg) {
        return (short)_STORAGE_TEMPERATURE_THRESHOLD.Threshold$VH.get(seg);
    }
    public static void Threshold$set( MemorySegment seg, short x) {
        _STORAGE_TEMPERATURE_THRESHOLD.Threshold$VH.set(seg, x);
    }
    public static short Threshold$get(MemorySegment seg, long index) {
        return (short)_STORAGE_TEMPERATURE_THRESHOLD.Threshold$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Threshold$set(MemorySegment seg, long index, short x) {
        _STORAGE_TEMPERATURE_THRESHOLD.Threshold$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle OverThreshold$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OverThreshold"));
    public static VarHandle OverThreshold$VH() {
        return _STORAGE_TEMPERATURE_THRESHOLD.OverThreshold$VH;
    }
    public static byte OverThreshold$get(MemorySegment seg) {
        return (byte)_STORAGE_TEMPERATURE_THRESHOLD.OverThreshold$VH.get(seg);
    }
    public static void OverThreshold$set( MemorySegment seg, byte x) {
        _STORAGE_TEMPERATURE_THRESHOLD.OverThreshold$VH.set(seg, x);
    }
    public static byte OverThreshold$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_TEMPERATURE_THRESHOLD.OverThreshold$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OverThreshold$set(MemorySegment seg, long index, byte x) {
        _STORAGE_TEMPERATURE_THRESHOLD.OverThreshold$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _STORAGE_TEMPERATURE_THRESHOLD.Reserved$VH;
    }
    public static byte Reserved$get(MemorySegment seg) {
        return (byte)_STORAGE_TEMPERATURE_THRESHOLD.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, byte x) {
        _STORAGE_TEMPERATURE_THRESHOLD.Reserved$VH.set(seg, x);
    }
    public static byte Reserved$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_TEMPERATURE_THRESHOLD.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, byte x) {
        _STORAGE_TEMPERATURE_THRESHOLD.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


