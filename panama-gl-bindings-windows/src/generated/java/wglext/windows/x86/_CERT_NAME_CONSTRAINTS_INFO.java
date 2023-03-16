// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_NAME_CONSTRAINTS_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cPermittedSubtree"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgPermittedSubtree"),
        Constants$root.C_LONG$LAYOUT.withName("cExcludedSubtree"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgExcludedSubtree")
    ).withName("_CERT_NAME_CONSTRAINTS_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_NAME_CONSTRAINTS_INFO.$struct$LAYOUT;
    }
    static final VarHandle cPermittedSubtree$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cPermittedSubtree"));
    public static VarHandle cPermittedSubtree$VH() {
        return _CERT_NAME_CONSTRAINTS_INFO.cPermittedSubtree$VH;
    }
    public static int cPermittedSubtree$get(MemorySegment seg) {
        return (int)_CERT_NAME_CONSTRAINTS_INFO.cPermittedSubtree$VH.get(seg);
    }
    public static void cPermittedSubtree$set( MemorySegment seg, int x) {
        _CERT_NAME_CONSTRAINTS_INFO.cPermittedSubtree$VH.set(seg, x);
    }
    public static int cPermittedSubtree$get(MemorySegment seg, long index) {
        return (int)_CERT_NAME_CONSTRAINTS_INFO.cPermittedSubtree$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cPermittedSubtree$set(MemorySegment seg, long index, int x) {
        _CERT_NAME_CONSTRAINTS_INFO.cPermittedSubtree$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgPermittedSubtree$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgPermittedSubtree"));
    public static VarHandle rgPermittedSubtree$VH() {
        return _CERT_NAME_CONSTRAINTS_INFO.rgPermittedSubtree$VH;
    }
    public static MemoryAddress rgPermittedSubtree$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_NAME_CONSTRAINTS_INFO.rgPermittedSubtree$VH.get(seg);
    }
    public static void rgPermittedSubtree$set( MemorySegment seg, MemoryAddress x) {
        _CERT_NAME_CONSTRAINTS_INFO.rgPermittedSubtree$VH.set(seg, x);
    }
    public static MemoryAddress rgPermittedSubtree$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_NAME_CONSTRAINTS_INFO.rgPermittedSubtree$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgPermittedSubtree$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_NAME_CONSTRAINTS_INFO.rgPermittedSubtree$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cExcludedSubtree$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cExcludedSubtree"));
    public static VarHandle cExcludedSubtree$VH() {
        return _CERT_NAME_CONSTRAINTS_INFO.cExcludedSubtree$VH;
    }
    public static int cExcludedSubtree$get(MemorySegment seg) {
        return (int)_CERT_NAME_CONSTRAINTS_INFO.cExcludedSubtree$VH.get(seg);
    }
    public static void cExcludedSubtree$set( MemorySegment seg, int x) {
        _CERT_NAME_CONSTRAINTS_INFO.cExcludedSubtree$VH.set(seg, x);
    }
    public static int cExcludedSubtree$get(MemorySegment seg, long index) {
        return (int)_CERT_NAME_CONSTRAINTS_INFO.cExcludedSubtree$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cExcludedSubtree$set(MemorySegment seg, long index, int x) {
        _CERT_NAME_CONSTRAINTS_INFO.cExcludedSubtree$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgExcludedSubtree$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgExcludedSubtree"));
    public static VarHandle rgExcludedSubtree$VH() {
        return _CERT_NAME_CONSTRAINTS_INFO.rgExcludedSubtree$VH;
    }
    public static MemoryAddress rgExcludedSubtree$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_NAME_CONSTRAINTS_INFO.rgExcludedSubtree$VH.get(seg);
    }
    public static void rgExcludedSubtree$set( MemorySegment seg, MemoryAddress x) {
        _CERT_NAME_CONSTRAINTS_INFO.rgExcludedSubtree$VH.set(seg, x);
    }
    public static MemoryAddress rgExcludedSubtree$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_NAME_CONSTRAINTS_INFO.rgExcludedSubtree$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgExcludedSubtree$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_NAME_CONSTRAINTS_INFO.rgExcludedSubtree$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

