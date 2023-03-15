// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_TEMPLATE_EXT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
        Constants$root.C_LONG$LAYOUT.withName("dwMajorVersion"),
        Constants$root.C_LONG$LAYOUT.withName("fMinorVersion"),
        Constants$root.C_LONG$LAYOUT.withName("dwMinorVersion"),
        MemoryLayout.paddingLayout(32)
    ).withName("_CERT_TEMPLATE_EXT");
    public static MemoryLayout $LAYOUT() {
        return _CERT_TEMPLATE_EXT.$struct$LAYOUT;
    }
    static final VarHandle pszObjId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszObjId"));
    public static VarHandle pszObjId$VH() {
        return _CERT_TEMPLATE_EXT.pszObjId$VH;
    }
    public static MemoryAddress pszObjId$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_TEMPLATE_EXT.pszObjId$VH.get(seg);
    }
    public static void pszObjId$set( MemorySegment seg, MemoryAddress x) {
        _CERT_TEMPLATE_EXT.pszObjId$VH.set(seg, x);
    }
    public static MemoryAddress pszObjId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_TEMPLATE_EXT.pszObjId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszObjId$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_TEMPLATE_EXT.pszObjId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMajorVersion"));
    public static VarHandle dwMajorVersion$VH() {
        return _CERT_TEMPLATE_EXT.dwMajorVersion$VH;
    }
    public static int dwMajorVersion$get(MemorySegment seg) {
        return (int)_CERT_TEMPLATE_EXT.dwMajorVersion$VH.get(seg);
    }
    public static void dwMajorVersion$set( MemorySegment seg, int x) {
        _CERT_TEMPLATE_EXT.dwMajorVersion$VH.set(seg, x);
    }
    public static int dwMajorVersion$get(MemorySegment seg, long index) {
        return (int)_CERT_TEMPLATE_EXT.dwMajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMajorVersion$set(MemorySegment seg, long index, int x) {
        _CERT_TEMPLATE_EXT.dwMajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fMinorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fMinorVersion"));
    public static VarHandle fMinorVersion$VH() {
        return _CERT_TEMPLATE_EXT.fMinorVersion$VH;
    }
    public static int fMinorVersion$get(MemorySegment seg) {
        return (int)_CERT_TEMPLATE_EXT.fMinorVersion$VH.get(seg);
    }
    public static void fMinorVersion$set( MemorySegment seg, int x) {
        _CERT_TEMPLATE_EXT.fMinorVersion$VH.set(seg, x);
    }
    public static int fMinorVersion$get(MemorySegment seg, long index) {
        return (int)_CERT_TEMPLATE_EXT.fMinorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fMinorVersion$set(MemorySegment seg, long index, int x) {
        _CERT_TEMPLATE_EXT.fMinorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMinorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMinorVersion"));
    public static VarHandle dwMinorVersion$VH() {
        return _CERT_TEMPLATE_EXT.dwMinorVersion$VH;
    }
    public static int dwMinorVersion$get(MemorySegment seg) {
        return (int)_CERT_TEMPLATE_EXT.dwMinorVersion$VH.get(seg);
    }
    public static void dwMinorVersion$set( MemorySegment seg, int x) {
        _CERT_TEMPLATE_EXT.dwMinorVersion$VH.set(seg, x);
    }
    public static int dwMinorVersion$get(MemorySegment seg, long index) {
        return (int)_CERT_TEMPLATE_EXT.dwMinorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMinorVersion$set(MemorySegment seg, long index, int x) {
        _CERT_TEMPLATE_EXT.dwMinorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


