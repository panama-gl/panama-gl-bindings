// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class PPM_PERFSTATE_EVENT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("State"),
        Constants$root.C_LONG$LAYOUT.withName("Status"),
        Constants$root.C_LONG$LAYOUT.withName("Latency"),
        Constants$root.C_LONG$LAYOUT.withName("Speed"),
        Constants$root.C_LONG$LAYOUT.withName("Processor")
    );
    public static MemoryLayout $LAYOUT() {
        return PPM_PERFSTATE_EVENT.$struct$LAYOUT;
    }
    static final VarHandle State$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("State"));
    public static VarHandle State$VH() {
        return PPM_PERFSTATE_EVENT.State$VH;
    }
    public static int State$get(MemorySegment seg) {
        return (int)PPM_PERFSTATE_EVENT.State$VH.get(seg);
    }
    public static void State$set( MemorySegment seg, int x) {
        PPM_PERFSTATE_EVENT.State$VH.set(seg, x);
    }
    public static int State$get(MemorySegment seg, long index) {
        return (int)PPM_PERFSTATE_EVENT.State$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void State$set(MemorySegment seg, long index, int x) {
        PPM_PERFSTATE_EVENT.State$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Status$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Status"));
    public static VarHandle Status$VH() {
        return PPM_PERFSTATE_EVENT.Status$VH;
    }
    public static int Status$get(MemorySegment seg) {
        return (int)PPM_PERFSTATE_EVENT.Status$VH.get(seg);
    }
    public static void Status$set( MemorySegment seg, int x) {
        PPM_PERFSTATE_EVENT.Status$VH.set(seg, x);
    }
    public static int Status$get(MemorySegment seg, long index) {
        return (int)PPM_PERFSTATE_EVENT.Status$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Status$set(MemorySegment seg, long index, int x) {
        PPM_PERFSTATE_EVENT.Status$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Latency$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Latency"));
    public static VarHandle Latency$VH() {
        return PPM_PERFSTATE_EVENT.Latency$VH;
    }
    public static int Latency$get(MemorySegment seg) {
        return (int)PPM_PERFSTATE_EVENT.Latency$VH.get(seg);
    }
    public static void Latency$set( MemorySegment seg, int x) {
        PPM_PERFSTATE_EVENT.Latency$VH.set(seg, x);
    }
    public static int Latency$get(MemorySegment seg, long index) {
        return (int)PPM_PERFSTATE_EVENT.Latency$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Latency$set(MemorySegment seg, long index, int x) {
        PPM_PERFSTATE_EVENT.Latency$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Speed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Speed"));
    public static VarHandle Speed$VH() {
        return PPM_PERFSTATE_EVENT.Speed$VH;
    }
    public static int Speed$get(MemorySegment seg) {
        return (int)PPM_PERFSTATE_EVENT.Speed$VH.get(seg);
    }
    public static void Speed$set( MemorySegment seg, int x) {
        PPM_PERFSTATE_EVENT.Speed$VH.set(seg, x);
    }
    public static int Speed$get(MemorySegment seg, long index) {
        return (int)PPM_PERFSTATE_EVENT.Speed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Speed$set(MemorySegment seg, long index, int x) {
        PPM_PERFSTATE_EVENT.Speed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Processor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Processor"));
    public static VarHandle Processor$VH() {
        return PPM_PERFSTATE_EVENT.Processor$VH;
    }
    public static int Processor$get(MemorySegment seg) {
        return (int)PPM_PERFSTATE_EVENT.Processor$VH.get(seg);
    }
    public static void Processor$set( MemorySegment seg, int x) {
        PPM_PERFSTATE_EVENT.Processor$VH.set(seg, x);
    }
    public static int Processor$get(MemorySegment seg, long index) {
        return (int)PPM_PERFSTATE_EVENT.Processor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Processor$set(MemorySegment seg, long index, int x) {
        PPM_PERFSTATE_EVENT.Processor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


