// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SCM_PD_MANAGEMENT_STATUS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("Health"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfOperationalStatus"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfAdditionalReasons"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_LONG$LAYOUT).withName("OperationalStatus"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("AdditionalReasons")
    ).withName("_SCM_PD_MANAGEMENT_STATUS");
    public static MemoryLayout $LAYOUT() {
        return _SCM_PD_MANAGEMENT_STATUS.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _SCM_PD_MANAGEMENT_STATUS.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_SCM_PD_MANAGEMENT_STATUS.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _SCM_PD_MANAGEMENT_STATUS.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_MANAGEMENT_STATUS.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _SCM_PD_MANAGEMENT_STATUS.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SCM_PD_MANAGEMENT_STATUS.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_SCM_PD_MANAGEMENT_STATUS.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _SCM_PD_MANAGEMENT_STATUS.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_MANAGEMENT_STATUS.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SCM_PD_MANAGEMENT_STATUS.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Health$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Health"));
    public static VarHandle Health$VH() {
        return _SCM_PD_MANAGEMENT_STATUS.Health$VH;
    }
    public static int Health$get(MemorySegment seg) {
        return (int)_SCM_PD_MANAGEMENT_STATUS.Health$VH.get(seg);
    }
    public static void Health$set( MemorySegment seg, int x) {
        _SCM_PD_MANAGEMENT_STATUS.Health$VH.set(seg, x);
    }
    public static int Health$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_MANAGEMENT_STATUS.Health$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Health$set(MemorySegment seg, long index, int x) {
        _SCM_PD_MANAGEMENT_STATUS.Health$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfOperationalStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfOperationalStatus"));
    public static VarHandle NumberOfOperationalStatus$VH() {
        return _SCM_PD_MANAGEMENT_STATUS.NumberOfOperationalStatus$VH;
    }
    public static int NumberOfOperationalStatus$get(MemorySegment seg) {
        return (int)_SCM_PD_MANAGEMENT_STATUS.NumberOfOperationalStatus$VH.get(seg);
    }
    public static void NumberOfOperationalStatus$set( MemorySegment seg, int x) {
        _SCM_PD_MANAGEMENT_STATUS.NumberOfOperationalStatus$VH.set(seg, x);
    }
    public static int NumberOfOperationalStatus$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_MANAGEMENT_STATUS.NumberOfOperationalStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfOperationalStatus$set(MemorySegment seg, long index, int x) {
        _SCM_PD_MANAGEMENT_STATUS.NumberOfOperationalStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfAdditionalReasons$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfAdditionalReasons"));
    public static VarHandle NumberOfAdditionalReasons$VH() {
        return _SCM_PD_MANAGEMENT_STATUS.NumberOfAdditionalReasons$VH;
    }
    public static int NumberOfAdditionalReasons$get(MemorySegment seg) {
        return (int)_SCM_PD_MANAGEMENT_STATUS.NumberOfAdditionalReasons$VH.get(seg);
    }
    public static void NumberOfAdditionalReasons$set( MemorySegment seg, int x) {
        _SCM_PD_MANAGEMENT_STATUS.NumberOfAdditionalReasons$VH.set(seg, x);
    }
    public static int NumberOfAdditionalReasons$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_MANAGEMENT_STATUS.NumberOfAdditionalReasons$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfAdditionalReasons$set(MemorySegment seg, long index, int x) {
        _SCM_PD_MANAGEMENT_STATUS.NumberOfAdditionalReasons$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment OperationalStatus$slice(MemorySegment seg) {
        return seg.asSlice(20, 64);
    }
    public static MemorySegment AdditionalReasons$slice(MemorySegment seg) {
        return seg.asSlice(84, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


