// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_TIMESTAMP_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwVersion"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pszTSAPolicyId"),
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
        ).withName("HashedMessage"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("SerialNumber"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwLowDateTime"),
            Constants$root.C_LONG$LAYOUT.withName("dwHighDateTime")
        ).withName("ftTime"),
        Constants$root.C_POINTER$LAYOUT.withName("pvAccuracy"),
        Constants$root.C_LONG$LAYOUT.withName("fOrdering"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("Nonce"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("Tsa"),
        Constants$root.C_LONG$LAYOUT.withName("cExtension"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgExtension")
    ).withName("_CRYPT_TIMESTAMP_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_TIMESTAMP_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return _CRYPT_TIMESTAMP_INFO.dwVersion$VH;
    }
    public static int dwVersion$get(MemorySegment seg) {
        return (int)_CRYPT_TIMESTAMP_INFO.dwVersion$VH.get(seg);
    }
    public static void dwVersion$set( MemorySegment seg, int x) {
        _CRYPT_TIMESTAMP_INFO.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)_CRYPT_TIMESTAMP_INFO.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        _CRYPT_TIMESTAMP_INFO.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszTSAPolicyId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszTSAPolicyId"));
    public static VarHandle pszTSAPolicyId$VH() {
        return _CRYPT_TIMESTAMP_INFO.pszTSAPolicyId$VH;
    }
    public static MemoryAddress pszTSAPolicyId$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_TIMESTAMP_INFO.pszTSAPolicyId$VH.get(seg);
    }
    public static void pszTSAPolicyId$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_TIMESTAMP_INFO.pszTSAPolicyId$VH.set(seg, x);
    }
    public static MemoryAddress pszTSAPolicyId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_TIMESTAMP_INFO.pszTSAPolicyId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszTSAPolicyId$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_TIMESTAMP_INFO.pszTSAPolicyId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment HashAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(16, 24);
    }
    public static MemorySegment HashedMessage$slice(MemorySegment seg) {
        return seg.asSlice(40, 16);
    }
    public static MemorySegment SerialNumber$slice(MemorySegment seg) {
        return seg.asSlice(56, 16);
    }
    public static MemorySegment ftTime$slice(MemorySegment seg) {
        return seg.asSlice(72, 8);
    }
    static final VarHandle pvAccuracy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvAccuracy"));
    public static VarHandle pvAccuracy$VH() {
        return _CRYPT_TIMESTAMP_INFO.pvAccuracy$VH;
    }
    public static MemoryAddress pvAccuracy$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_TIMESTAMP_INFO.pvAccuracy$VH.get(seg);
    }
    public static void pvAccuracy$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_TIMESTAMP_INFO.pvAccuracy$VH.set(seg, x);
    }
    public static MemoryAddress pvAccuracy$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_TIMESTAMP_INFO.pvAccuracy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvAccuracy$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_TIMESTAMP_INFO.pvAccuracy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fOrdering$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fOrdering"));
    public static VarHandle fOrdering$VH() {
        return _CRYPT_TIMESTAMP_INFO.fOrdering$VH;
    }
    public static int fOrdering$get(MemorySegment seg) {
        return (int)_CRYPT_TIMESTAMP_INFO.fOrdering$VH.get(seg);
    }
    public static void fOrdering$set( MemorySegment seg, int x) {
        _CRYPT_TIMESTAMP_INFO.fOrdering$VH.set(seg, x);
    }
    public static int fOrdering$get(MemorySegment seg, long index) {
        return (int)_CRYPT_TIMESTAMP_INFO.fOrdering$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fOrdering$set(MemorySegment seg, long index, int x) {
        _CRYPT_TIMESTAMP_INFO.fOrdering$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Nonce$slice(MemorySegment seg) {
        return seg.asSlice(96, 16);
    }
    public static MemorySegment Tsa$slice(MemorySegment seg) {
        return seg.asSlice(112, 16);
    }
    static final VarHandle cExtension$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cExtension"));
    public static VarHandle cExtension$VH() {
        return _CRYPT_TIMESTAMP_INFO.cExtension$VH;
    }
    public static int cExtension$get(MemorySegment seg) {
        return (int)_CRYPT_TIMESTAMP_INFO.cExtension$VH.get(seg);
    }
    public static void cExtension$set( MemorySegment seg, int x) {
        _CRYPT_TIMESTAMP_INFO.cExtension$VH.set(seg, x);
    }
    public static int cExtension$get(MemorySegment seg, long index) {
        return (int)_CRYPT_TIMESTAMP_INFO.cExtension$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cExtension$set(MemorySegment seg, long index, int x) {
        _CRYPT_TIMESTAMP_INFO.cExtension$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgExtension$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgExtension"));
    public static VarHandle rgExtension$VH() {
        return _CRYPT_TIMESTAMP_INFO.rgExtension$VH;
    }
    public static MemoryAddress rgExtension$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_TIMESTAMP_INFO.rgExtension$VH.get(seg);
    }
    public static void rgExtension$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_TIMESTAMP_INFO.rgExtension$VH.set(seg, x);
    }
    public static MemoryAddress rgExtension$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_TIMESTAMP_INFO.rgExtension$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgExtension$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_TIMESTAMP_INFO.rgExtension$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


