// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_POLICY95_QUALIFIER1 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszPracticesReference"),
        Constants$root.C_POINTER$LAYOUT.withName("pszNoticeIdentifier"),
        Constants$root.C_POINTER$LAYOUT.withName("pszNSINoticeIdentifier"),
        Constants$root.C_LONG$LAYOUT.withName("cCPSURLs"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgCPSURLs")
    ).withName("_CERT_POLICY95_QUALIFIER1");
    public static MemoryLayout $LAYOUT() {
        return _CERT_POLICY95_QUALIFIER1.$struct$LAYOUT;
    }
    static final VarHandle pszPracticesReference$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszPracticesReference"));
    public static VarHandle pszPracticesReference$VH() {
        return _CERT_POLICY95_QUALIFIER1.pszPracticesReference$VH;
    }
    public static MemoryAddress pszPracticesReference$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY95_QUALIFIER1.pszPracticesReference$VH.get(seg);
    }
    public static void pszPracticesReference$set( MemorySegment seg, MemoryAddress x) {
        _CERT_POLICY95_QUALIFIER1.pszPracticesReference$VH.set(seg, x);
    }
    public static MemoryAddress pszPracticesReference$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY95_QUALIFIER1.pszPracticesReference$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszPracticesReference$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_POLICY95_QUALIFIER1.pszPracticesReference$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszNoticeIdentifier$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszNoticeIdentifier"));
    public static VarHandle pszNoticeIdentifier$VH() {
        return _CERT_POLICY95_QUALIFIER1.pszNoticeIdentifier$VH;
    }
    public static MemoryAddress pszNoticeIdentifier$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY95_QUALIFIER1.pszNoticeIdentifier$VH.get(seg);
    }
    public static void pszNoticeIdentifier$set( MemorySegment seg, MemoryAddress x) {
        _CERT_POLICY95_QUALIFIER1.pszNoticeIdentifier$VH.set(seg, x);
    }
    public static MemoryAddress pszNoticeIdentifier$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY95_QUALIFIER1.pszNoticeIdentifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszNoticeIdentifier$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_POLICY95_QUALIFIER1.pszNoticeIdentifier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszNSINoticeIdentifier$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszNSINoticeIdentifier"));
    public static VarHandle pszNSINoticeIdentifier$VH() {
        return _CERT_POLICY95_QUALIFIER1.pszNSINoticeIdentifier$VH;
    }
    public static MemoryAddress pszNSINoticeIdentifier$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY95_QUALIFIER1.pszNSINoticeIdentifier$VH.get(seg);
    }
    public static void pszNSINoticeIdentifier$set( MemorySegment seg, MemoryAddress x) {
        _CERT_POLICY95_QUALIFIER1.pszNSINoticeIdentifier$VH.set(seg, x);
    }
    public static MemoryAddress pszNSINoticeIdentifier$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY95_QUALIFIER1.pszNSINoticeIdentifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszNSINoticeIdentifier$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_POLICY95_QUALIFIER1.pszNSINoticeIdentifier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cCPSURLs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cCPSURLs"));
    public static VarHandle cCPSURLs$VH() {
        return _CERT_POLICY95_QUALIFIER1.cCPSURLs$VH;
    }
    public static int cCPSURLs$get(MemorySegment seg) {
        return (int)_CERT_POLICY95_QUALIFIER1.cCPSURLs$VH.get(seg);
    }
    public static void cCPSURLs$set( MemorySegment seg, int x) {
        _CERT_POLICY95_QUALIFIER1.cCPSURLs$VH.set(seg, x);
    }
    public static int cCPSURLs$get(MemorySegment seg, long index) {
        return (int)_CERT_POLICY95_QUALIFIER1.cCPSURLs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cCPSURLs$set(MemorySegment seg, long index, int x) {
        _CERT_POLICY95_QUALIFIER1.cCPSURLs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgCPSURLs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgCPSURLs"));
    public static VarHandle rgCPSURLs$VH() {
        return _CERT_POLICY95_QUALIFIER1.rgCPSURLs$VH;
    }
    public static MemoryAddress rgCPSURLs$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY95_QUALIFIER1.rgCPSURLs$VH.get(seg);
    }
    public static void rgCPSURLs$set( MemorySegment seg, MemoryAddress x) {
        _CERT_POLICY95_QUALIFIER1.rgCPSURLs$VH.set(seg, x);
    }
    public static MemoryAddress rgCPSURLs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY95_QUALIFIER1.rgCPSURLs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgCPSURLs$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_POLICY95_QUALIFIER1.rgCPSURLs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


