// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_TIMESTAMP_RESPONSE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwStatus"),
        Constants$root.C_LONG$LAYOUT.withName("cFreeText"),
        Constants$root.C_POINTER$LAYOUT.withName("rgFreeText"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData"),
            Constants$root.C_LONG$LAYOUT.withName("cUnusedBits"),
            MemoryLayout.paddingLayout(32)
        ).withName("FailureInfo"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("ContentInfo")
    ).withName("_CRYPT_TIMESTAMP_RESPONSE");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_TIMESTAMP_RESPONSE.$struct$LAYOUT;
    }
    static final VarHandle dwStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStatus"));
    public static VarHandle dwStatus$VH() {
        return _CRYPT_TIMESTAMP_RESPONSE.dwStatus$VH;
    }
    public static int dwStatus$get(MemorySegment seg) {
        return (int)_CRYPT_TIMESTAMP_RESPONSE.dwStatus$VH.get(seg);
    }
    public static void dwStatus$set( MemorySegment seg, int x) {
        _CRYPT_TIMESTAMP_RESPONSE.dwStatus$VH.set(seg, x);
    }
    public static int dwStatus$get(MemorySegment seg, long index) {
        return (int)_CRYPT_TIMESTAMP_RESPONSE.dwStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStatus$set(MemorySegment seg, long index, int x) {
        _CRYPT_TIMESTAMP_RESPONSE.dwStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cFreeText$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cFreeText"));
    public static VarHandle cFreeText$VH() {
        return _CRYPT_TIMESTAMP_RESPONSE.cFreeText$VH;
    }
    public static int cFreeText$get(MemorySegment seg) {
        return (int)_CRYPT_TIMESTAMP_RESPONSE.cFreeText$VH.get(seg);
    }
    public static void cFreeText$set( MemorySegment seg, int x) {
        _CRYPT_TIMESTAMP_RESPONSE.cFreeText$VH.set(seg, x);
    }
    public static int cFreeText$get(MemorySegment seg, long index) {
        return (int)_CRYPT_TIMESTAMP_RESPONSE.cFreeText$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cFreeText$set(MemorySegment seg, long index, int x) {
        _CRYPT_TIMESTAMP_RESPONSE.cFreeText$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgFreeText$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgFreeText"));
    public static VarHandle rgFreeText$VH() {
        return _CRYPT_TIMESTAMP_RESPONSE.rgFreeText$VH;
    }
    public static MemoryAddress rgFreeText$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_TIMESTAMP_RESPONSE.rgFreeText$VH.get(seg);
    }
    public static void rgFreeText$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_TIMESTAMP_RESPONSE.rgFreeText$VH.set(seg, x);
    }
    public static MemoryAddress rgFreeText$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_TIMESTAMP_RESPONSE.rgFreeText$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgFreeText$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_TIMESTAMP_RESPONSE.rgFreeText$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FailureInfo$slice(MemorySegment seg) {
        return seg.asSlice(16, 24);
    }
    public static MemorySegment ContentInfo$slice(MemorySegment seg) {
        return seg.asSlice(40, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


