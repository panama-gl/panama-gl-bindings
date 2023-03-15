// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("BeginAddress"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("UnwindData"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(2).withName("Flag"),
                    MemoryLayout.paddingLayout(11).withName("FunctionLength"),
                    MemoryLayout.paddingLayout(3).withName("RegF"),
                    MemoryLayout.paddingLayout(4).withName("RegI"),
                    MemoryLayout.paddingLayout(1).withName("H"),
                    MemoryLayout.paddingLayout(2).withName("CR"),
                    MemoryLayout.paddingLayout(9).withName("FrameSize")
                )
            ).withName("$anon$0")
        ).withName("$anon$0")
    ).withName("_IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle BeginAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BeginAddress"));
    public static VarHandle BeginAddress$VH() {
        return _IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY.BeginAddress$VH;
    }
    public static int BeginAddress$get(MemorySegment seg) {
        return (int)_IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY.BeginAddress$VH.get(seg);
    }
    public static void BeginAddress$set( MemorySegment seg, int x) {
        _IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY.BeginAddress$VH.set(seg, x);
    }
    public static int BeginAddress$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY.BeginAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BeginAddress$set(MemorySegment seg, long index, int x) {
        _IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY.BeginAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UnwindData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("UnwindData"));
    public static VarHandle UnwindData$VH() {
        return _IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY.UnwindData$VH;
    }
    public static int UnwindData$get(MemorySegment seg) {
        return (int)_IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY.UnwindData$VH.get(seg);
    }
    public static void UnwindData$set( MemorySegment seg, int x) {
        _IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY.UnwindData$VH.set(seg, x);
    }
    public static int UnwindData$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY.UnwindData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UnwindData$set(MemorySegment seg, long index, int x) {
        _IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY.UnwindData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


