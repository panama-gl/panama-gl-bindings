// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PORT_INFO_3A {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwStatus"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pszStatus"),
        Constants$root.C_LONG$LAYOUT.withName("dwSeverity"),
        MemoryLayout.paddingLayout(32)
    ).withName("_PORT_INFO_3A");
    public static MemoryLayout $LAYOUT() {
        return _PORT_INFO_3A.$struct$LAYOUT;
    }
    static final VarHandle dwStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStatus"));
    public static VarHandle dwStatus$VH() {
        return _PORT_INFO_3A.dwStatus$VH;
    }
    public static int dwStatus$get(MemorySegment seg) {
        return (int)_PORT_INFO_3A.dwStatus$VH.get(seg);
    }
    public static void dwStatus$set( MemorySegment seg, int x) {
        _PORT_INFO_3A.dwStatus$VH.set(seg, x);
    }
    public static int dwStatus$get(MemorySegment seg, long index) {
        return (int)_PORT_INFO_3A.dwStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStatus$set(MemorySegment seg, long index, int x) {
        _PORT_INFO_3A.dwStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszStatus"));
    public static VarHandle pszStatus$VH() {
        return _PORT_INFO_3A.pszStatus$VH;
    }
    public static MemoryAddress pszStatus$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PORT_INFO_3A.pszStatus$VH.get(seg);
    }
    public static void pszStatus$set( MemorySegment seg, MemoryAddress x) {
        _PORT_INFO_3A.pszStatus$VH.set(seg, x);
    }
    public static MemoryAddress pszStatus$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PORT_INFO_3A.pszStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszStatus$set(MemorySegment seg, long index, MemoryAddress x) {
        _PORT_INFO_3A.pszStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSeverity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSeverity"));
    public static VarHandle dwSeverity$VH() {
        return _PORT_INFO_3A.dwSeverity$VH;
    }
    public static int dwSeverity$get(MemorySegment seg) {
        return (int)_PORT_INFO_3A.dwSeverity$VH.get(seg);
    }
    public static void dwSeverity$set( MemorySegment seg, int x) {
        _PORT_INFO_3A.dwSeverity$VH.set(seg, x);
    }
    public static int dwSeverity$get(MemorySegment seg, long index) {
        return (int)_PORT_INFO_3A.dwSeverity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSeverity$set(MemorySegment seg, long index, int x) {
        _PORT_INFO_3A.dwSeverity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


