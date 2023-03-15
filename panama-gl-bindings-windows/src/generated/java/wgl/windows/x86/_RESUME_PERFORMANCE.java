// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RESUME_PERFORMANCE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("PostTimeMs"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TotalResumeTimeMs"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ResumeCompleteTimestamp")
    ).withName("_RESUME_PERFORMANCE");
    public static MemoryLayout $LAYOUT() {
        return _RESUME_PERFORMANCE.$struct$LAYOUT;
    }
    static final VarHandle PostTimeMs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PostTimeMs"));
    public static VarHandle PostTimeMs$VH() {
        return _RESUME_PERFORMANCE.PostTimeMs$VH;
    }
    public static int PostTimeMs$get(MemorySegment seg) {
        return (int)_RESUME_PERFORMANCE.PostTimeMs$VH.get(seg);
    }
    public static void PostTimeMs$set( MemorySegment seg, int x) {
        _RESUME_PERFORMANCE.PostTimeMs$VH.set(seg, x);
    }
    public static int PostTimeMs$get(MemorySegment seg, long index) {
        return (int)_RESUME_PERFORMANCE.PostTimeMs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PostTimeMs$set(MemorySegment seg, long index, int x) {
        _RESUME_PERFORMANCE.PostTimeMs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalResumeTimeMs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalResumeTimeMs"));
    public static VarHandle TotalResumeTimeMs$VH() {
        return _RESUME_PERFORMANCE.TotalResumeTimeMs$VH;
    }
    public static long TotalResumeTimeMs$get(MemorySegment seg) {
        return (long)_RESUME_PERFORMANCE.TotalResumeTimeMs$VH.get(seg);
    }
    public static void TotalResumeTimeMs$set( MemorySegment seg, long x) {
        _RESUME_PERFORMANCE.TotalResumeTimeMs$VH.set(seg, x);
    }
    public static long TotalResumeTimeMs$get(MemorySegment seg, long index) {
        return (long)_RESUME_PERFORMANCE.TotalResumeTimeMs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalResumeTimeMs$set(MemorySegment seg, long index, long x) {
        _RESUME_PERFORMANCE.TotalResumeTimeMs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ResumeCompleteTimestamp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ResumeCompleteTimestamp"));
    public static VarHandle ResumeCompleteTimestamp$VH() {
        return _RESUME_PERFORMANCE.ResumeCompleteTimestamp$VH;
    }
    public static long ResumeCompleteTimestamp$get(MemorySegment seg) {
        return (long)_RESUME_PERFORMANCE.ResumeCompleteTimestamp$VH.get(seg);
    }
    public static void ResumeCompleteTimestamp$set( MemorySegment seg, long x) {
        _RESUME_PERFORMANCE.ResumeCompleteTimestamp$VH.set(seg, x);
    }
    public static long ResumeCompleteTimestamp$get(MemorySegment seg, long index) {
        return (long)_RESUME_PERFORMANCE.ResumeCompleteTimestamp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ResumeCompleteTimestamp$set(MemorySegment seg, long index, long x) {
        _RESUME_PERFORMANCE.ResumeCompleteTimestamp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


