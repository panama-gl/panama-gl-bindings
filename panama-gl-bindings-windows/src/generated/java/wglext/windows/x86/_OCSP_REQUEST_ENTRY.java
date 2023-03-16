// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _OCSP_REQUEST_ENTRY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("cbData"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_POINTER$LAYOUT.withName("pbData")
                ).withName("Parameters")
            ).withName("HashAlgorithm"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("IssuerNameHash"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("IssuerKeyHash"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("SerialNumber")
        ).withName("CertId"),
        Constants$root.C_LONG$LAYOUT.withName("cExtension"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgExtension")
    ).withName("_OCSP_REQUEST_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _OCSP_REQUEST_ENTRY.$struct$LAYOUT;
    }
    public static MemorySegment CertId$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    static final VarHandle cExtension$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cExtension"));
    public static VarHandle cExtension$VH() {
        return _OCSP_REQUEST_ENTRY.cExtension$VH;
    }
    public static int cExtension$get(MemorySegment seg) {
        return (int)_OCSP_REQUEST_ENTRY.cExtension$VH.get(seg);
    }
    public static void cExtension$set( MemorySegment seg, int x) {
        _OCSP_REQUEST_ENTRY.cExtension$VH.set(seg, x);
    }
    public static int cExtension$get(MemorySegment seg, long index) {
        return (int)_OCSP_REQUEST_ENTRY.cExtension$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cExtension$set(MemorySegment seg, long index, int x) {
        _OCSP_REQUEST_ENTRY.cExtension$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgExtension$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgExtension"));
    public static VarHandle rgExtension$VH() {
        return _OCSP_REQUEST_ENTRY.rgExtension$VH;
    }
    public static MemoryAddress rgExtension$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_OCSP_REQUEST_ENTRY.rgExtension$VH.get(seg);
    }
    public static void rgExtension$set( MemorySegment seg, MemoryAddress x) {
        _OCSP_REQUEST_ENTRY.rgExtension$VH.set(seg, x);
    }
    public static MemoryAddress rgExtension$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_OCSP_REQUEST_ENTRY.rgExtension$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgExtension$set(MemorySegment seg, long index, MemoryAddress x) {
        _OCSP_REQUEST_ENTRY.rgExtension$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


