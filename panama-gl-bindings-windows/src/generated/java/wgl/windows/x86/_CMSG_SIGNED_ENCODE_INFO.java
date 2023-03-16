// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CMSG_SIGNED_ENCODE_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("cSigners"),
        Constants$root.C_POINTER$LAYOUT.withName("rgSigners"),
        Constants$root.C_LONG$LAYOUT.withName("cCertEncoded"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgCertEncoded"),
        Constants$root.C_LONG$LAYOUT.withName("cCrlEncoded"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgCrlEncoded")
    ).withName("_CMSG_SIGNED_ENCODE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_SIGNED_ENCODE_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CMSG_SIGNED_ENCODE_INFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CMSG_SIGNED_ENCODE_INFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CMSG_SIGNED_ENCODE_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CMSG_SIGNED_ENCODE_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CMSG_SIGNED_ENCODE_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cSigners$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cSigners"));
    public static VarHandle cSigners$VH() {
        return _CMSG_SIGNED_ENCODE_INFO.cSigners$VH;
    }
    public static int cSigners$get(MemorySegment seg) {
        return (int)_CMSG_SIGNED_ENCODE_INFO.cSigners$VH.get(seg);
    }
    public static void cSigners$set( MemorySegment seg, int x) {
        _CMSG_SIGNED_ENCODE_INFO.cSigners$VH.set(seg, x);
    }
    public static int cSigners$get(MemorySegment seg, long index) {
        return (int)_CMSG_SIGNED_ENCODE_INFO.cSigners$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cSigners$set(MemorySegment seg, long index, int x) {
        _CMSG_SIGNED_ENCODE_INFO.cSigners$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgSigners$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgSigners"));
    public static VarHandle rgSigners$VH() {
        return _CMSG_SIGNED_ENCODE_INFO.rgSigners$VH;
    }
    public static MemoryAddress rgSigners$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_SIGNED_ENCODE_INFO.rgSigners$VH.get(seg);
    }
    public static void rgSigners$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_SIGNED_ENCODE_INFO.rgSigners$VH.set(seg, x);
    }
    public static MemoryAddress rgSigners$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_SIGNED_ENCODE_INFO.rgSigners$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgSigners$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_SIGNED_ENCODE_INFO.rgSigners$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cCertEncoded$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cCertEncoded"));
    public static VarHandle cCertEncoded$VH() {
        return _CMSG_SIGNED_ENCODE_INFO.cCertEncoded$VH;
    }
    public static int cCertEncoded$get(MemorySegment seg) {
        return (int)_CMSG_SIGNED_ENCODE_INFO.cCertEncoded$VH.get(seg);
    }
    public static void cCertEncoded$set( MemorySegment seg, int x) {
        _CMSG_SIGNED_ENCODE_INFO.cCertEncoded$VH.set(seg, x);
    }
    public static int cCertEncoded$get(MemorySegment seg, long index) {
        return (int)_CMSG_SIGNED_ENCODE_INFO.cCertEncoded$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cCertEncoded$set(MemorySegment seg, long index, int x) {
        _CMSG_SIGNED_ENCODE_INFO.cCertEncoded$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgCertEncoded$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgCertEncoded"));
    public static VarHandle rgCertEncoded$VH() {
        return _CMSG_SIGNED_ENCODE_INFO.rgCertEncoded$VH;
    }
    public static MemoryAddress rgCertEncoded$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_SIGNED_ENCODE_INFO.rgCertEncoded$VH.get(seg);
    }
    public static void rgCertEncoded$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_SIGNED_ENCODE_INFO.rgCertEncoded$VH.set(seg, x);
    }
    public static MemoryAddress rgCertEncoded$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_SIGNED_ENCODE_INFO.rgCertEncoded$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgCertEncoded$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_SIGNED_ENCODE_INFO.rgCertEncoded$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cCrlEncoded$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cCrlEncoded"));
    public static VarHandle cCrlEncoded$VH() {
        return _CMSG_SIGNED_ENCODE_INFO.cCrlEncoded$VH;
    }
    public static int cCrlEncoded$get(MemorySegment seg) {
        return (int)_CMSG_SIGNED_ENCODE_INFO.cCrlEncoded$VH.get(seg);
    }
    public static void cCrlEncoded$set( MemorySegment seg, int x) {
        _CMSG_SIGNED_ENCODE_INFO.cCrlEncoded$VH.set(seg, x);
    }
    public static int cCrlEncoded$get(MemorySegment seg, long index) {
        return (int)_CMSG_SIGNED_ENCODE_INFO.cCrlEncoded$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cCrlEncoded$set(MemorySegment seg, long index, int x) {
        _CMSG_SIGNED_ENCODE_INFO.cCrlEncoded$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgCrlEncoded$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgCrlEncoded"));
    public static VarHandle rgCrlEncoded$VH() {
        return _CMSG_SIGNED_ENCODE_INFO.rgCrlEncoded$VH;
    }
    public static MemoryAddress rgCrlEncoded$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_SIGNED_ENCODE_INFO.rgCrlEncoded$VH.get(seg);
    }
    public static void rgCrlEncoded$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_SIGNED_ENCODE_INFO.rgCrlEncoded$VH.set(seg, x);
    }
    public static MemoryAddress rgCrlEncoded$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_SIGNED_ENCODE_INFO.rgCrlEncoded$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgCrlEncoded$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_SIGNED_ENCODE_INFO.rgCrlEncoded$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

