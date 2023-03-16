// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_ENCODE_PARA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pfnAlloc"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnFree")
    ).withName("_CRYPT_ENCODE_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_ENCODE_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CRYPT_ENCODE_PARA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CRYPT_ENCODE_PARA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CRYPT_ENCODE_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CRYPT_ENCODE_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CRYPT_ENCODE_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnAlloc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnAlloc"));
    public static VarHandle pfnAlloc$VH() {
        return _CRYPT_ENCODE_PARA.pfnAlloc$VH;
    }
    public static MemoryAddress pfnAlloc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_ENCODE_PARA.pfnAlloc$VH.get(seg);
    }
    public static void pfnAlloc$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_ENCODE_PARA.pfnAlloc$VH.set(seg, x);
    }
    public static MemoryAddress pfnAlloc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_ENCODE_PARA.pfnAlloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnAlloc$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_ENCODE_PARA.pfnAlloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CRYPT_ALLOC pfnAlloc (MemorySegment segment, MemorySession session) {
        return PFN_CRYPT_ALLOC.ofAddress(pfnAlloc$get(segment), session);
    }
    static final VarHandle pfnFree$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnFree"));
    public static VarHandle pfnFree$VH() {
        return _CRYPT_ENCODE_PARA.pfnFree$VH;
    }
    public static MemoryAddress pfnFree$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_ENCODE_PARA.pfnFree$VH.get(seg);
    }
    public static void pfnFree$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_ENCODE_PARA.pfnFree$VH.set(seg, x);
    }
    public static MemoryAddress pfnFree$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_ENCODE_PARA.pfnFree$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnFree$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_ENCODE_PARA.pfnFree$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CRYPT_FREE pfnFree (MemorySegment segment, MemorySession session) {
        return PFN_CRYPT_FREE.ofAddress(pfnFree$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

