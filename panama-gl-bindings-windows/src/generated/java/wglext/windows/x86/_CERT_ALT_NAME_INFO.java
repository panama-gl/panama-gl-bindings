// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_ALT_NAME_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cAltEntry"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgAltEntry")
    ).withName("_CERT_ALT_NAME_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_ALT_NAME_INFO.$struct$LAYOUT;
    }
    static final VarHandle cAltEntry$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAltEntry"));
    public static VarHandle cAltEntry$VH() {
        return _CERT_ALT_NAME_INFO.cAltEntry$VH;
    }
    public static int cAltEntry$get(MemorySegment seg) {
        return (int)_CERT_ALT_NAME_INFO.cAltEntry$VH.get(seg);
    }
    public static void cAltEntry$set( MemorySegment seg, int x) {
        _CERT_ALT_NAME_INFO.cAltEntry$VH.set(seg, x);
    }
    public static int cAltEntry$get(MemorySegment seg, long index) {
        return (int)_CERT_ALT_NAME_INFO.cAltEntry$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAltEntry$set(MemorySegment seg, long index, int x) {
        _CERT_ALT_NAME_INFO.cAltEntry$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgAltEntry$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgAltEntry"));
    public static VarHandle rgAltEntry$VH() {
        return _CERT_ALT_NAME_INFO.rgAltEntry$VH;
    }
    public static MemoryAddress rgAltEntry$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_ALT_NAME_INFO.rgAltEntry$VH.get(seg);
    }
    public static void rgAltEntry$set( MemorySegment seg, MemoryAddress x) {
        _CERT_ALT_NAME_INFO.rgAltEntry$VH.set(seg, x);
    }
    public static MemoryAddress rgAltEntry$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_ALT_NAME_INFO.rgAltEntry$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgAltEntry$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_ALT_NAME_INFO.rgAltEntry$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


