// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_LONG;
import java.lang.invoke.VarHandle;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
public class pthread_attr_t {

    static final MemoryLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(56, C_CHAR).withName("__size"),
        C_LONG.withName("__align")
    ).withName("pthread_attr_t");
    public static MemoryLayout $LAYOUT() {
        return pthread_attr_t.$union$LAYOUT;
    }
    public static MemorySegment __size$slice(MemorySegment seg) {
        return seg.asSlice(0, 56);
    }
    static final VarHandle __align$VH = $union$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("__align"));
    public static VarHandle __align$VH() {
        return pthread_attr_t.__align$VH;
    }
    public static long __align$get(MemorySegment seg) {
        return (long)pthread_attr_t.__align$VH.get(seg);
    }
    public static void __align$set( MemorySegment seg, long x) {
        pthread_attr_t.__align$VH.set(seg, x);
    }
    public static long __align$get(MemorySegment seg, long index) {
        return (long)pthread_attr_t.__align$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __align$set(MemorySegment seg, long index, long x) {
        pthread_attr_t.__align$VH.set(seg.asSlice(index*sizeof()), x);
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


