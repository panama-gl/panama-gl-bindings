// Generated by jextract

package opengl.cgl.macos.v10_15_7;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _opaque_pthread_t {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("__sig"),
        C_POINTER.withName("__cleanup_stack"),
        MemoryLayout.sequenceLayout(8176, C_CHAR).withName("__opaque")
    ).withName("_opaque_pthread_t");
    public static MemoryLayout $LAYOUT() {
        return _opaque_pthread_t.$struct$LAYOUT;
    }
    static final VarHandle __sig$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("__sig"));
    public static VarHandle __sig$VH() {
        return _opaque_pthread_t.__sig$VH;
    }
    public static long __sig$get(MemorySegment seg) {
        return (long)_opaque_pthread_t.__sig$VH.get(seg);
    }
    public static void __sig$set( MemorySegment seg, long x) {
        _opaque_pthread_t.__sig$VH.set(seg, x);
    }
    public static long __sig$get(MemorySegment seg, long index) {
        return (long)_opaque_pthread_t.__sig$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __sig$set(MemorySegment seg, long index, long x) {
        _opaque_pthread_t.__sig$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __cleanup_stack$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("__cleanup_stack")));
    public static VarHandle __cleanup_stack$VH() {
        return _opaque_pthread_t.__cleanup_stack$VH;
    }
    public static MemoryAddress __cleanup_stack$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_opaque_pthread_t.__cleanup_stack$VH.get(seg);
    }
    public static void __cleanup_stack$set( MemorySegment seg, MemoryAddress x) {
        _opaque_pthread_t.__cleanup_stack$VH.set(seg, x);
    }
    public static MemoryAddress __cleanup_stack$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_opaque_pthread_t.__cleanup_stack$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __cleanup_stack$set(MemorySegment seg, long index, MemoryAddress x) {
        _opaque_pthread_t.__cleanup_stack$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __opaque$slice(MemorySegment seg) {
        return seg.asSlice(16, 8176);
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


