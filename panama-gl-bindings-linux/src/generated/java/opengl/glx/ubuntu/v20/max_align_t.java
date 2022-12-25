// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_LONG_LONG;
import java.lang.invoke.VarHandle;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
public class max_align_t {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG_LONG.withName("__clang_max_align_nonce1"),
        MemoryLayout.paddingLayout(64),
        MemoryLayout.paddingLayout(128).withName("__clang_max_align_nonce2")
    );
    public static MemoryLayout $LAYOUT() {
        return max_align_t.$struct$LAYOUT;
    }
    static final VarHandle __clang_max_align_nonce1$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("__clang_max_align_nonce1"));
    public static VarHandle __clang_max_align_nonce1$VH() {
        return max_align_t.__clang_max_align_nonce1$VH;
    }
    public static long __clang_max_align_nonce1$get(MemorySegment seg) {
        return (long)max_align_t.__clang_max_align_nonce1$VH.get(seg);
    }
    public static void __clang_max_align_nonce1$set( MemorySegment seg, long x) {
        max_align_t.__clang_max_align_nonce1$VH.set(seg, x);
    }
    public static long __clang_max_align_nonce1$get(MemorySegment seg, long index) {
        return (long)max_align_t.__clang_max_align_nonce1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __clang_max_align_nonce1$set(MemorySegment seg, long index, long x) {
        max_align_t.__clang_max_align_nonce1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.ofScope(scope)); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.ofScope(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


