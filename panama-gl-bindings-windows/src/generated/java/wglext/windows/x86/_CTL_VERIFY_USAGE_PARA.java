// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CTL_VERIFY_USAGE_PARA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("ListIdentifier"),
        Constants$root.C_LONG$LAYOUT.withName("cCtlStore"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rghCtlStore"),
        Constants$root.C_LONG$LAYOUT.withName("cSignerStore"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rghSignerStore")
    ).withName("_CTL_VERIFY_USAGE_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CTL_VERIFY_USAGE_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CTL_VERIFY_USAGE_PARA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CTL_VERIFY_USAGE_PARA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CTL_VERIFY_USAGE_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CTL_VERIFY_USAGE_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CTL_VERIFY_USAGE_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ListIdentifier$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    static final VarHandle cCtlStore$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cCtlStore"));
    public static VarHandle cCtlStore$VH() {
        return _CTL_VERIFY_USAGE_PARA.cCtlStore$VH;
    }
    public static int cCtlStore$get(MemorySegment seg) {
        return (int)_CTL_VERIFY_USAGE_PARA.cCtlStore$VH.get(seg);
    }
    public static void cCtlStore$set( MemorySegment seg, int x) {
        _CTL_VERIFY_USAGE_PARA.cCtlStore$VH.set(seg, x);
    }
    public static int cCtlStore$get(MemorySegment seg, long index) {
        return (int)_CTL_VERIFY_USAGE_PARA.cCtlStore$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cCtlStore$set(MemorySegment seg, long index, int x) {
        _CTL_VERIFY_USAGE_PARA.cCtlStore$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rghCtlStore$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rghCtlStore"));
    public static VarHandle rghCtlStore$VH() {
        return _CTL_VERIFY_USAGE_PARA.rghCtlStore$VH;
    }
    public static MemoryAddress rghCtlStore$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CTL_VERIFY_USAGE_PARA.rghCtlStore$VH.get(seg);
    }
    public static void rghCtlStore$set( MemorySegment seg, MemoryAddress x) {
        _CTL_VERIFY_USAGE_PARA.rghCtlStore$VH.set(seg, x);
    }
    public static MemoryAddress rghCtlStore$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CTL_VERIFY_USAGE_PARA.rghCtlStore$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rghCtlStore$set(MemorySegment seg, long index, MemoryAddress x) {
        _CTL_VERIFY_USAGE_PARA.rghCtlStore$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cSignerStore$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cSignerStore"));
    public static VarHandle cSignerStore$VH() {
        return _CTL_VERIFY_USAGE_PARA.cSignerStore$VH;
    }
    public static int cSignerStore$get(MemorySegment seg) {
        return (int)_CTL_VERIFY_USAGE_PARA.cSignerStore$VH.get(seg);
    }
    public static void cSignerStore$set( MemorySegment seg, int x) {
        _CTL_VERIFY_USAGE_PARA.cSignerStore$VH.set(seg, x);
    }
    public static int cSignerStore$get(MemorySegment seg, long index) {
        return (int)_CTL_VERIFY_USAGE_PARA.cSignerStore$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cSignerStore$set(MemorySegment seg, long index, int x) {
        _CTL_VERIFY_USAGE_PARA.cSignerStore$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rghSignerStore$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rghSignerStore"));
    public static VarHandle rghSignerStore$VH() {
        return _CTL_VERIFY_USAGE_PARA.rghSignerStore$VH;
    }
    public static MemoryAddress rghSignerStore$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CTL_VERIFY_USAGE_PARA.rghSignerStore$VH.get(seg);
    }
    public static void rghSignerStore$set( MemorySegment seg, MemoryAddress x) {
        _CTL_VERIFY_USAGE_PARA.rghSignerStore$VH.set(seg, x);
    }
    public static MemoryAddress rghSignerStore$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CTL_VERIFY_USAGE_PARA.rghSignerStore$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rghSignerStore$set(MemorySegment seg, long index, MemoryAddress x) {
        _CTL_VERIFY_USAGE_PARA.rghSignerStore$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


