// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_ASYNC_RETRIEVAL_COMPLETION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pfnCompletion"),
        Constants$root.C_POINTER$LAYOUT.withName("pvCompletion")
    ).withName("_CRYPT_ASYNC_RETRIEVAL_COMPLETION");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_ASYNC_RETRIEVAL_COMPLETION.$struct$LAYOUT;
    }
    static final VarHandle pfnCompletion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnCompletion"));
    public static VarHandle pfnCompletion$VH() {
        return _CRYPT_ASYNC_RETRIEVAL_COMPLETION.pfnCompletion$VH;
    }
    public static MemoryAddress pfnCompletion$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_ASYNC_RETRIEVAL_COMPLETION.pfnCompletion$VH.get(seg);
    }
    public static void pfnCompletion$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_ASYNC_RETRIEVAL_COMPLETION.pfnCompletion$VH.set(seg, x);
    }
    public static MemoryAddress pfnCompletion$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_ASYNC_RETRIEVAL_COMPLETION.pfnCompletion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnCompletion$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_ASYNC_RETRIEVAL_COMPLETION.pfnCompletion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CRYPT_ASYNC_RETRIEVAL_COMPLETION_FUNC pfnCompletion (MemorySegment segment, MemorySession session) {
        return PFN_CRYPT_ASYNC_RETRIEVAL_COMPLETION_FUNC.ofAddress(pfnCompletion$get(segment), session);
    }
    static final VarHandle pvCompletion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvCompletion"));
    public static VarHandle pvCompletion$VH() {
        return _CRYPT_ASYNC_RETRIEVAL_COMPLETION.pvCompletion$VH;
    }
    public static MemoryAddress pvCompletion$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_ASYNC_RETRIEVAL_COMPLETION.pvCompletion$VH.get(seg);
    }
    public static void pvCompletion$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_ASYNC_RETRIEVAL_COMPLETION.pvCompletion$VH.set(seg, x);
    }
    public static MemoryAddress pvCompletion$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_ASYNC_RETRIEVAL_COMPLETION.pvCompletion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvCompletion$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_ASYNC_RETRIEVAL_COMPLETION.pvCompletion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


