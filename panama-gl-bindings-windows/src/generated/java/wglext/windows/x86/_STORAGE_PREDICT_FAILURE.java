// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_PREDICT_FAILURE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("PredictFailure"),
        MemoryLayout.sequenceLayout(512, Constants$root.C_CHAR$LAYOUT).withName("VendorSpecific")
    ).withName("_STORAGE_PREDICT_FAILURE");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_PREDICT_FAILURE.$struct$LAYOUT;
    }
    static final VarHandle PredictFailure$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PredictFailure"));
    public static VarHandle PredictFailure$VH() {
        return _STORAGE_PREDICT_FAILURE.PredictFailure$VH;
    }
    public static int PredictFailure$get(MemorySegment seg) {
        return (int)_STORAGE_PREDICT_FAILURE.PredictFailure$VH.get(seg);
    }
    public static void PredictFailure$set( MemorySegment seg, int x) {
        _STORAGE_PREDICT_FAILURE.PredictFailure$VH.set(seg, x);
    }
    public static int PredictFailure$get(MemorySegment seg, long index) {
        return (int)_STORAGE_PREDICT_FAILURE.PredictFailure$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PredictFailure$set(MemorySegment seg, long index, int x) {
        _STORAGE_PREDICT_FAILURE.PredictFailure$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment VendorSpecific$slice(MemorySegment seg) {
        return seg.asSlice(4, 512);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


