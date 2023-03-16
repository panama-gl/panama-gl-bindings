// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _NCRYPT_KEY_ATTEST_PADDING_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("magic"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pbKeyBlob"),
        Constants$root.C_LONG$LAYOUT.withName("cbKeyBlob"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pbKeyAuth"),
        Constants$root.C_LONG$LAYOUT.withName("cbKeyAuth"),
        MemoryLayout.paddingLayout(32)
    ).withName("_NCRYPT_KEY_ATTEST_PADDING_INFO");
    public static MemoryLayout $LAYOUT() {
        return _NCRYPT_KEY_ATTEST_PADDING_INFO.$struct$LAYOUT;
    }
    static final VarHandle magic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("magic"));
    public static VarHandle magic$VH() {
        return _NCRYPT_KEY_ATTEST_PADDING_INFO.magic$VH;
    }
    public static int magic$get(MemorySegment seg) {
        return (int)_NCRYPT_KEY_ATTEST_PADDING_INFO.magic$VH.get(seg);
    }
    public static void magic$set( MemorySegment seg, int x) {
        _NCRYPT_KEY_ATTEST_PADDING_INFO.magic$VH.set(seg, x);
    }
    public static int magic$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_KEY_ATTEST_PADDING_INFO.magic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void magic$set(MemorySegment seg, long index, int x) {
        _NCRYPT_KEY_ATTEST_PADDING_INFO.magic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbKeyBlob$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbKeyBlob"));
    public static VarHandle pbKeyBlob$VH() {
        return _NCRYPT_KEY_ATTEST_PADDING_INFO.pbKeyBlob$VH;
    }
    public static MemoryAddress pbKeyBlob$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_NCRYPT_KEY_ATTEST_PADDING_INFO.pbKeyBlob$VH.get(seg);
    }
    public static void pbKeyBlob$set( MemorySegment seg, MemoryAddress x) {
        _NCRYPT_KEY_ATTEST_PADDING_INFO.pbKeyBlob$VH.set(seg, x);
    }
    public static MemoryAddress pbKeyBlob$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_NCRYPT_KEY_ATTEST_PADDING_INFO.pbKeyBlob$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbKeyBlob$set(MemorySegment seg, long index, MemoryAddress x) {
        _NCRYPT_KEY_ATTEST_PADDING_INFO.pbKeyBlob$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbKeyBlob$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbKeyBlob"));
    public static VarHandle cbKeyBlob$VH() {
        return _NCRYPT_KEY_ATTEST_PADDING_INFO.cbKeyBlob$VH;
    }
    public static int cbKeyBlob$get(MemorySegment seg) {
        return (int)_NCRYPT_KEY_ATTEST_PADDING_INFO.cbKeyBlob$VH.get(seg);
    }
    public static void cbKeyBlob$set( MemorySegment seg, int x) {
        _NCRYPT_KEY_ATTEST_PADDING_INFO.cbKeyBlob$VH.set(seg, x);
    }
    public static int cbKeyBlob$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_KEY_ATTEST_PADDING_INFO.cbKeyBlob$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbKeyBlob$set(MemorySegment seg, long index, int x) {
        _NCRYPT_KEY_ATTEST_PADDING_INFO.cbKeyBlob$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbKeyAuth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbKeyAuth"));
    public static VarHandle pbKeyAuth$VH() {
        return _NCRYPT_KEY_ATTEST_PADDING_INFO.pbKeyAuth$VH;
    }
    public static MemoryAddress pbKeyAuth$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_NCRYPT_KEY_ATTEST_PADDING_INFO.pbKeyAuth$VH.get(seg);
    }
    public static void pbKeyAuth$set( MemorySegment seg, MemoryAddress x) {
        _NCRYPT_KEY_ATTEST_PADDING_INFO.pbKeyAuth$VH.set(seg, x);
    }
    public static MemoryAddress pbKeyAuth$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_NCRYPT_KEY_ATTEST_PADDING_INFO.pbKeyAuth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbKeyAuth$set(MemorySegment seg, long index, MemoryAddress x) {
        _NCRYPT_KEY_ATTEST_PADDING_INFO.pbKeyAuth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbKeyAuth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbKeyAuth"));
    public static VarHandle cbKeyAuth$VH() {
        return _NCRYPT_KEY_ATTEST_PADDING_INFO.cbKeyAuth$VH;
    }
    public static int cbKeyAuth$get(MemorySegment seg) {
        return (int)_NCRYPT_KEY_ATTEST_PADDING_INFO.cbKeyAuth$VH.get(seg);
    }
    public static void cbKeyAuth$set( MemorySegment seg, int x) {
        _NCRYPT_KEY_ATTEST_PADDING_INFO.cbKeyAuth$VH.set(seg, x);
    }
    public static int cbKeyAuth$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_KEY_ATTEST_PADDING_INFO.cbKeyAuth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbKeyAuth$set(MemorySegment seg, long index, int x) {
        _NCRYPT_KEY_ATTEST_PADDING_INFO.cbKeyAuth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


