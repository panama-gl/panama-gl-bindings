// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_BOUND_FORWARDER_REF {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("TimeDateStamp"),
        Constants$root.C_SHORT$LAYOUT.withName("OffsetModuleName"),
        Constants$root.C_SHORT$LAYOUT.withName("Reserved")
    ).withName("_IMAGE_BOUND_FORWARDER_REF");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_BOUND_FORWARDER_REF.$struct$LAYOUT;
    }
    static final VarHandle TimeDateStamp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TimeDateStamp"));
    public static VarHandle TimeDateStamp$VH() {
        return _IMAGE_BOUND_FORWARDER_REF.TimeDateStamp$VH;
    }
    public static int TimeDateStamp$get(MemorySegment seg) {
        return (int)_IMAGE_BOUND_FORWARDER_REF.TimeDateStamp$VH.get(seg);
    }
    public static void TimeDateStamp$set( MemorySegment seg, int x) {
        _IMAGE_BOUND_FORWARDER_REF.TimeDateStamp$VH.set(seg, x);
    }
    public static int TimeDateStamp$get(MemorySegment seg, long index) {
        return (int)_IMAGE_BOUND_FORWARDER_REF.TimeDateStamp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeDateStamp$set(MemorySegment seg, long index, int x) {
        _IMAGE_BOUND_FORWARDER_REF.TimeDateStamp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle OffsetModuleName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OffsetModuleName"));
    public static VarHandle OffsetModuleName$VH() {
        return _IMAGE_BOUND_FORWARDER_REF.OffsetModuleName$VH;
    }
    public static short OffsetModuleName$get(MemorySegment seg) {
        return (short)_IMAGE_BOUND_FORWARDER_REF.OffsetModuleName$VH.get(seg);
    }
    public static void OffsetModuleName$set( MemorySegment seg, short x) {
        _IMAGE_BOUND_FORWARDER_REF.OffsetModuleName$VH.set(seg, x);
    }
    public static short OffsetModuleName$get(MemorySegment seg, long index) {
        return (short)_IMAGE_BOUND_FORWARDER_REF.OffsetModuleName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OffsetModuleName$set(MemorySegment seg, long index, short x) {
        _IMAGE_BOUND_FORWARDER_REF.OffsetModuleName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _IMAGE_BOUND_FORWARDER_REF.Reserved$VH;
    }
    public static short Reserved$get(MemorySegment seg) {
        return (short)_IMAGE_BOUND_FORWARDER_REF.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, short x) {
        _IMAGE_BOUND_FORWARDER_REF.Reserved$VH.set(seg, x);
    }
    public static short Reserved$get(MemorySegment seg, long index) {
        return (short)_IMAGE_BOUND_FORWARDER_REF.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, short x) {
        _IMAGE_BOUND_FORWARDER_REF.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


