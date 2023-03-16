// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_QC_STATEMENTS_EXT_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cStatement"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgStatement")
    ).withName("_CERT_QC_STATEMENTS_EXT_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_QC_STATEMENTS_EXT_INFO.$struct$LAYOUT;
    }
    static final VarHandle cStatement$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cStatement"));
    public static VarHandle cStatement$VH() {
        return _CERT_QC_STATEMENTS_EXT_INFO.cStatement$VH;
    }
    public static int cStatement$get(MemorySegment seg) {
        return (int)_CERT_QC_STATEMENTS_EXT_INFO.cStatement$VH.get(seg);
    }
    public static void cStatement$set( MemorySegment seg, int x) {
        _CERT_QC_STATEMENTS_EXT_INFO.cStatement$VH.set(seg, x);
    }
    public static int cStatement$get(MemorySegment seg, long index) {
        return (int)_CERT_QC_STATEMENTS_EXT_INFO.cStatement$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cStatement$set(MemorySegment seg, long index, int x) {
        _CERT_QC_STATEMENTS_EXT_INFO.cStatement$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgStatement$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgStatement"));
    public static VarHandle rgStatement$VH() {
        return _CERT_QC_STATEMENTS_EXT_INFO.rgStatement$VH;
    }
    public static MemoryAddress rgStatement$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_QC_STATEMENTS_EXT_INFO.rgStatement$VH.get(seg);
    }
    public static void rgStatement$set( MemorySegment seg, MemoryAddress x) {
        _CERT_QC_STATEMENTS_EXT_INFO.rgStatement$VH.set(seg, x);
    }
    public static MemoryAddress rgStatement$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_QC_STATEMENTS_EXT_INFO.rgStatement$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgStatement$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_QC_STATEMENTS_EXT_INFO.rgStatement$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

