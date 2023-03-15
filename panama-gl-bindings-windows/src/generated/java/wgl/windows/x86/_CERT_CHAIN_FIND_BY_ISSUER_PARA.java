// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_CHAIN_FIND_BY_ISSUER_PARA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pszUsageIdentifier"),
        Constants$root.C_LONG$LAYOUT.withName("dwKeySpec"),
        Constants$root.C_LONG$LAYOUT.withName("dwAcquirePrivateKeyFlags"),
        Constants$root.C_LONG$LAYOUT.withName("cIssuer"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgIssuer"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnFindCallback"),
        Constants$root.C_POINTER$LAYOUT.withName("pvFindArg")
    ).withName("_CERT_CHAIN_FIND_BY_ISSUER_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CERT_CHAIN_FIND_BY_ISSUER_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CERT_CHAIN_FIND_BY_ISSUER_PARA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CERT_CHAIN_FIND_BY_ISSUER_PARA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CERT_CHAIN_FIND_BY_ISSUER_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CERT_CHAIN_FIND_BY_ISSUER_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CERT_CHAIN_FIND_BY_ISSUER_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszUsageIdentifier$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszUsageIdentifier"));
    public static VarHandle pszUsageIdentifier$VH() {
        return _CERT_CHAIN_FIND_BY_ISSUER_PARA.pszUsageIdentifier$VH;
    }
    public static MemoryAddress pszUsageIdentifier$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_CHAIN_FIND_BY_ISSUER_PARA.pszUsageIdentifier$VH.get(seg);
    }
    public static void pszUsageIdentifier$set( MemorySegment seg, MemoryAddress x) {
        _CERT_CHAIN_FIND_BY_ISSUER_PARA.pszUsageIdentifier$VH.set(seg, x);
    }
    public static MemoryAddress pszUsageIdentifier$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_CHAIN_FIND_BY_ISSUER_PARA.pszUsageIdentifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszUsageIdentifier$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_CHAIN_FIND_BY_ISSUER_PARA.pszUsageIdentifier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwKeySpec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwKeySpec"));
    public static VarHandle dwKeySpec$VH() {
        return _CERT_CHAIN_FIND_BY_ISSUER_PARA.dwKeySpec$VH;
    }
    public static int dwKeySpec$get(MemorySegment seg) {
        return (int)_CERT_CHAIN_FIND_BY_ISSUER_PARA.dwKeySpec$VH.get(seg);
    }
    public static void dwKeySpec$set( MemorySegment seg, int x) {
        _CERT_CHAIN_FIND_BY_ISSUER_PARA.dwKeySpec$VH.set(seg, x);
    }
    public static int dwKeySpec$get(MemorySegment seg, long index) {
        return (int)_CERT_CHAIN_FIND_BY_ISSUER_PARA.dwKeySpec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwKeySpec$set(MemorySegment seg, long index, int x) {
        _CERT_CHAIN_FIND_BY_ISSUER_PARA.dwKeySpec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwAcquirePrivateKeyFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAcquirePrivateKeyFlags"));
    public static VarHandle dwAcquirePrivateKeyFlags$VH() {
        return _CERT_CHAIN_FIND_BY_ISSUER_PARA.dwAcquirePrivateKeyFlags$VH;
    }
    public static int dwAcquirePrivateKeyFlags$get(MemorySegment seg) {
        return (int)_CERT_CHAIN_FIND_BY_ISSUER_PARA.dwAcquirePrivateKeyFlags$VH.get(seg);
    }
    public static void dwAcquirePrivateKeyFlags$set( MemorySegment seg, int x) {
        _CERT_CHAIN_FIND_BY_ISSUER_PARA.dwAcquirePrivateKeyFlags$VH.set(seg, x);
    }
    public static int dwAcquirePrivateKeyFlags$get(MemorySegment seg, long index) {
        return (int)_CERT_CHAIN_FIND_BY_ISSUER_PARA.dwAcquirePrivateKeyFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAcquirePrivateKeyFlags$set(MemorySegment seg, long index, int x) {
        _CERT_CHAIN_FIND_BY_ISSUER_PARA.dwAcquirePrivateKeyFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cIssuer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cIssuer"));
    public static VarHandle cIssuer$VH() {
        return _CERT_CHAIN_FIND_BY_ISSUER_PARA.cIssuer$VH;
    }
    public static int cIssuer$get(MemorySegment seg) {
        return (int)_CERT_CHAIN_FIND_BY_ISSUER_PARA.cIssuer$VH.get(seg);
    }
    public static void cIssuer$set( MemorySegment seg, int x) {
        _CERT_CHAIN_FIND_BY_ISSUER_PARA.cIssuer$VH.set(seg, x);
    }
    public static int cIssuer$get(MemorySegment seg, long index) {
        return (int)_CERT_CHAIN_FIND_BY_ISSUER_PARA.cIssuer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cIssuer$set(MemorySegment seg, long index, int x) {
        _CERT_CHAIN_FIND_BY_ISSUER_PARA.cIssuer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgIssuer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgIssuer"));
    public static VarHandle rgIssuer$VH() {
        return _CERT_CHAIN_FIND_BY_ISSUER_PARA.rgIssuer$VH;
    }
    public static MemoryAddress rgIssuer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_CHAIN_FIND_BY_ISSUER_PARA.rgIssuer$VH.get(seg);
    }
    public static void rgIssuer$set( MemorySegment seg, MemoryAddress x) {
        _CERT_CHAIN_FIND_BY_ISSUER_PARA.rgIssuer$VH.set(seg, x);
    }
    public static MemoryAddress rgIssuer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_CHAIN_FIND_BY_ISSUER_PARA.rgIssuer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgIssuer$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_CHAIN_FIND_BY_ISSUER_PARA.rgIssuer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnFindCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnFindCallback"));
    public static VarHandle pfnFindCallback$VH() {
        return _CERT_CHAIN_FIND_BY_ISSUER_PARA.pfnFindCallback$VH;
    }
    public static MemoryAddress pfnFindCallback$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_CHAIN_FIND_BY_ISSUER_PARA.pfnFindCallback$VH.get(seg);
    }
    public static void pfnFindCallback$set( MemorySegment seg, MemoryAddress x) {
        _CERT_CHAIN_FIND_BY_ISSUER_PARA.pfnFindCallback$VH.set(seg, x);
    }
    public static MemoryAddress pfnFindCallback$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_CHAIN_FIND_BY_ISSUER_PARA.pfnFindCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnFindCallback$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_CHAIN_FIND_BY_ISSUER_PARA.pfnFindCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK pfnFindCallback (MemorySegment segment, MemorySession session) {
        return PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK.ofAddress(pfnFindCallback$get(segment), session);
    }
    static final VarHandle pvFindArg$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvFindArg"));
    public static VarHandle pvFindArg$VH() {
        return _CERT_CHAIN_FIND_BY_ISSUER_PARA.pvFindArg$VH;
    }
    public static MemoryAddress pvFindArg$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_CHAIN_FIND_BY_ISSUER_PARA.pvFindArg$VH.get(seg);
    }
    public static void pvFindArg$set( MemorySegment seg, MemoryAddress x) {
        _CERT_CHAIN_FIND_BY_ISSUER_PARA.pvFindArg$VH.set(seg, x);
    }
    public static MemoryAddress pvFindArg$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_CHAIN_FIND_BY_ISSUER_PARA.pvFindArg$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvFindArg$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_CHAIN_FIND_BY_ISSUER_PARA.pvFindArg$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


