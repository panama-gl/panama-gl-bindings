// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_OR_CRL_BLOB {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwChoice"),
        Constants$root.C_LONG$LAYOUT.withName("cbEncoded"),
        Constants$root.C_POINTER$LAYOUT.withName("pbEncoded")
    ).withName("_CERT_OR_CRL_BLOB");
    public static MemoryLayout $LAYOUT() {
        return _CERT_OR_CRL_BLOB.$struct$LAYOUT;
    }
    static final VarHandle dwChoice$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwChoice"));
    public static VarHandle dwChoice$VH() {
        return _CERT_OR_CRL_BLOB.dwChoice$VH;
    }
    public static int dwChoice$get(MemorySegment seg) {
        return (int)_CERT_OR_CRL_BLOB.dwChoice$VH.get(seg);
    }
    public static void dwChoice$set( MemorySegment seg, int x) {
        _CERT_OR_CRL_BLOB.dwChoice$VH.set(seg, x);
    }
    public static int dwChoice$get(MemorySegment seg, long index) {
        return (int)_CERT_OR_CRL_BLOB.dwChoice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwChoice$set(MemorySegment seg, long index, int x) {
        _CERT_OR_CRL_BLOB.dwChoice$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbEncoded$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbEncoded"));
    public static VarHandle cbEncoded$VH() {
        return _CERT_OR_CRL_BLOB.cbEncoded$VH;
    }
    public static int cbEncoded$get(MemorySegment seg) {
        return (int)_CERT_OR_CRL_BLOB.cbEncoded$VH.get(seg);
    }
    public static void cbEncoded$set( MemorySegment seg, int x) {
        _CERT_OR_CRL_BLOB.cbEncoded$VH.set(seg, x);
    }
    public static int cbEncoded$get(MemorySegment seg, long index) {
        return (int)_CERT_OR_CRL_BLOB.cbEncoded$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbEncoded$set(MemorySegment seg, long index, int x) {
        _CERT_OR_CRL_BLOB.cbEncoded$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbEncoded$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbEncoded"));
    public static VarHandle pbEncoded$VH() {
        return _CERT_OR_CRL_BLOB.pbEncoded$VH;
    }
    public static MemoryAddress pbEncoded$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_OR_CRL_BLOB.pbEncoded$VH.get(seg);
    }
    public static void pbEncoded$set( MemorySegment seg, MemoryAddress x) {
        _CERT_OR_CRL_BLOB.pbEncoded$VH.set(seg, x);
    }
    public static MemoryAddress pbEncoded$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_OR_CRL_BLOB.pbEncoded$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbEncoded$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_OR_CRL_BLOB.pbEncoded$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


