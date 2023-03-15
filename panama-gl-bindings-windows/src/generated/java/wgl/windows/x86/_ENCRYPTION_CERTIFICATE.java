// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ENCRYPTION_CERTIFICATE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbTotalLength"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pUserSid"),
        Constants$root.C_POINTER$LAYOUT.withName("pCertBlob")
    ).withName("_ENCRYPTION_CERTIFICATE");
    public static MemoryLayout $LAYOUT() {
        return _ENCRYPTION_CERTIFICATE.$struct$LAYOUT;
    }
    static final VarHandle cbTotalLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbTotalLength"));
    public static VarHandle cbTotalLength$VH() {
        return _ENCRYPTION_CERTIFICATE.cbTotalLength$VH;
    }
    public static int cbTotalLength$get(MemorySegment seg) {
        return (int)_ENCRYPTION_CERTIFICATE.cbTotalLength$VH.get(seg);
    }
    public static void cbTotalLength$set( MemorySegment seg, int x) {
        _ENCRYPTION_CERTIFICATE.cbTotalLength$VH.set(seg, x);
    }
    public static int cbTotalLength$get(MemorySegment seg, long index) {
        return (int)_ENCRYPTION_CERTIFICATE.cbTotalLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbTotalLength$set(MemorySegment seg, long index, int x) {
        _ENCRYPTION_CERTIFICATE.cbTotalLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pUserSid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pUserSid"));
    public static VarHandle pUserSid$VH() {
        return _ENCRYPTION_CERTIFICATE.pUserSid$VH;
    }
    public static MemoryAddress pUserSid$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_ENCRYPTION_CERTIFICATE.pUserSid$VH.get(seg);
    }
    public static void pUserSid$set( MemorySegment seg, MemoryAddress x) {
        _ENCRYPTION_CERTIFICATE.pUserSid$VH.set(seg, x);
    }
    public static MemoryAddress pUserSid$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_ENCRYPTION_CERTIFICATE.pUserSid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pUserSid$set(MemorySegment seg, long index, MemoryAddress x) {
        _ENCRYPTION_CERTIFICATE.pUserSid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pCertBlob$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pCertBlob"));
    public static VarHandle pCertBlob$VH() {
        return _ENCRYPTION_CERTIFICATE.pCertBlob$VH;
    }
    public static MemoryAddress pCertBlob$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_ENCRYPTION_CERTIFICATE.pCertBlob$VH.get(seg);
    }
    public static void pCertBlob$set( MemorySegment seg, MemoryAddress x) {
        _ENCRYPTION_CERTIFICATE.pCertBlob$VH.set(seg, x);
    }
    public static MemoryAddress pCertBlob$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_ENCRYPTION_CERTIFICATE.pCertBlob$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pCertBlob$set(MemorySegment seg, long index, MemoryAddress x) {
        _ENCRYPTION_CERTIFICATE.pCertBlob$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


