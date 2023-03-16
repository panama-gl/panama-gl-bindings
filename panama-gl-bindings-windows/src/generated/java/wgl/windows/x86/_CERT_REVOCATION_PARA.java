// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_REVOCATION_PARA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pIssuerCert"),
        Constants$root.C_LONG$LAYOUT.withName("cCertStore"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgCertStore"),
        Constants$root.C_POINTER$LAYOUT.withName("hCrlStore"),
        Constants$root.C_POINTER$LAYOUT.withName("pftTimeToUse")
    ).withName("_CERT_REVOCATION_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CERT_REVOCATION_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CERT_REVOCATION_PARA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CERT_REVOCATION_PARA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CERT_REVOCATION_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CERT_REVOCATION_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CERT_REVOCATION_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pIssuerCert$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pIssuerCert"));
    public static VarHandle pIssuerCert$VH() {
        return _CERT_REVOCATION_PARA.pIssuerCert$VH;
    }
    public static MemoryAddress pIssuerCert$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_REVOCATION_PARA.pIssuerCert$VH.get(seg);
    }
    public static void pIssuerCert$set( MemorySegment seg, MemoryAddress x) {
        _CERT_REVOCATION_PARA.pIssuerCert$VH.set(seg, x);
    }
    public static MemoryAddress pIssuerCert$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_REVOCATION_PARA.pIssuerCert$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pIssuerCert$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_REVOCATION_PARA.pIssuerCert$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cCertStore$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cCertStore"));
    public static VarHandle cCertStore$VH() {
        return _CERT_REVOCATION_PARA.cCertStore$VH;
    }
    public static int cCertStore$get(MemorySegment seg) {
        return (int)_CERT_REVOCATION_PARA.cCertStore$VH.get(seg);
    }
    public static void cCertStore$set( MemorySegment seg, int x) {
        _CERT_REVOCATION_PARA.cCertStore$VH.set(seg, x);
    }
    public static int cCertStore$get(MemorySegment seg, long index) {
        return (int)_CERT_REVOCATION_PARA.cCertStore$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cCertStore$set(MemorySegment seg, long index, int x) {
        _CERT_REVOCATION_PARA.cCertStore$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgCertStore$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgCertStore"));
    public static VarHandle rgCertStore$VH() {
        return _CERT_REVOCATION_PARA.rgCertStore$VH;
    }
    public static MemoryAddress rgCertStore$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_REVOCATION_PARA.rgCertStore$VH.get(seg);
    }
    public static void rgCertStore$set( MemorySegment seg, MemoryAddress x) {
        _CERT_REVOCATION_PARA.rgCertStore$VH.set(seg, x);
    }
    public static MemoryAddress rgCertStore$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_REVOCATION_PARA.rgCertStore$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgCertStore$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_REVOCATION_PARA.rgCertStore$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCrlStore$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hCrlStore"));
    public static VarHandle hCrlStore$VH() {
        return _CERT_REVOCATION_PARA.hCrlStore$VH;
    }
    public static MemoryAddress hCrlStore$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_REVOCATION_PARA.hCrlStore$VH.get(seg);
    }
    public static void hCrlStore$set( MemorySegment seg, MemoryAddress x) {
        _CERT_REVOCATION_PARA.hCrlStore$VH.set(seg, x);
    }
    public static MemoryAddress hCrlStore$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_REVOCATION_PARA.hCrlStore$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCrlStore$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_REVOCATION_PARA.hCrlStore$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pftTimeToUse$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pftTimeToUse"));
    public static VarHandle pftTimeToUse$VH() {
        return _CERT_REVOCATION_PARA.pftTimeToUse$VH;
    }
    public static MemoryAddress pftTimeToUse$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_REVOCATION_PARA.pftTimeToUse$VH.get(seg);
    }
    public static void pftTimeToUse$set( MemorySegment seg, MemoryAddress x) {
        _CERT_REVOCATION_PARA.pftTimeToUse$VH.set(seg, x);
    }
    public static MemoryAddress pftTimeToUse$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_REVOCATION_PARA.pftTimeToUse$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pftTimeToUse$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_REVOCATION_PARA.pftTimeToUse$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


