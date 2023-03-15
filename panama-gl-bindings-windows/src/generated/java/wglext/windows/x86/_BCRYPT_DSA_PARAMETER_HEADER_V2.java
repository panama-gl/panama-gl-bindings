// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _BCRYPT_DSA_PARAMETER_HEADER_V2 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbLength"),
        Constants$root.C_LONG$LAYOUT.withName("dwMagic"),
        Constants$root.C_LONG$LAYOUT.withName("cbKeyLength"),
        Constants$root.C_LONG$LAYOUT.withName("hashAlgorithm"),
        Constants$root.C_LONG$LAYOUT.withName("standardVersion"),
        Constants$root.C_LONG$LAYOUT.withName("cbSeedLength"),
        Constants$root.C_LONG$LAYOUT.withName("cbGroupSize"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("Count")
    ).withName("_BCRYPT_DSA_PARAMETER_HEADER_V2");
    public static MemoryLayout $LAYOUT() {
        return _BCRYPT_DSA_PARAMETER_HEADER_V2.$struct$LAYOUT;
    }
    static final VarHandle cbLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbLength"));
    public static VarHandle cbLength$VH() {
        return _BCRYPT_DSA_PARAMETER_HEADER_V2.cbLength$VH;
    }
    public static int cbLength$get(MemorySegment seg) {
        return (int)_BCRYPT_DSA_PARAMETER_HEADER_V2.cbLength$VH.get(seg);
    }
    public static void cbLength$set( MemorySegment seg, int x) {
        _BCRYPT_DSA_PARAMETER_HEADER_V2.cbLength$VH.set(seg, x);
    }
    public static int cbLength$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DSA_PARAMETER_HEADER_V2.cbLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbLength$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DSA_PARAMETER_HEADER_V2.cbLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMagic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMagic"));
    public static VarHandle dwMagic$VH() {
        return _BCRYPT_DSA_PARAMETER_HEADER_V2.dwMagic$VH;
    }
    public static int dwMagic$get(MemorySegment seg) {
        return (int)_BCRYPT_DSA_PARAMETER_HEADER_V2.dwMagic$VH.get(seg);
    }
    public static void dwMagic$set( MemorySegment seg, int x) {
        _BCRYPT_DSA_PARAMETER_HEADER_V2.dwMagic$VH.set(seg, x);
    }
    public static int dwMagic$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DSA_PARAMETER_HEADER_V2.dwMagic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMagic$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DSA_PARAMETER_HEADER_V2.dwMagic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbKeyLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbKeyLength"));
    public static VarHandle cbKeyLength$VH() {
        return _BCRYPT_DSA_PARAMETER_HEADER_V2.cbKeyLength$VH;
    }
    public static int cbKeyLength$get(MemorySegment seg) {
        return (int)_BCRYPT_DSA_PARAMETER_HEADER_V2.cbKeyLength$VH.get(seg);
    }
    public static void cbKeyLength$set( MemorySegment seg, int x) {
        _BCRYPT_DSA_PARAMETER_HEADER_V2.cbKeyLength$VH.set(seg, x);
    }
    public static int cbKeyLength$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DSA_PARAMETER_HEADER_V2.cbKeyLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbKeyLength$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DSA_PARAMETER_HEADER_V2.cbKeyLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hashAlgorithm$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hashAlgorithm"));
    public static VarHandle hashAlgorithm$VH() {
        return _BCRYPT_DSA_PARAMETER_HEADER_V2.hashAlgorithm$VH;
    }
    public static int hashAlgorithm$get(MemorySegment seg) {
        return (int)_BCRYPT_DSA_PARAMETER_HEADER_V2.hashAlgorithm$VH.get(seg);
    }
    public static void hashAlgorithm$set( MemorySegment seg, int x) {
        _BCRYPT_DSA_PARAMETER_HEADER_V2.hashAlgorithm$VH.set(seg, x);
    }
    public static int hashAlgorithm$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DSA_PARAMETER_HEADER_V2.hashAlgorithm$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hashAlgorithm$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DSA_PARAMETER_HEADER_V2.hashAlgorithm$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle standardVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("standardVersion"));
    public static VarHandle standardVersion$VH() {
        return _BCRYPT_DSA_PARAMETER_HEADER_V2.standardVersion$VH;
    }
    public static int standardVersion$get(MemorySegment seg) {
        return (int)_BCRYPT_DSA_PARAMETER_HEADER_V2.standardVersion$VH.get(seg);
    }
    public static void standardVersion$set( MemorySegment seg, int x) {
        _BCRYPT_DSA_PARAMETER_HEADER_V2.standardVersion$VH.set(seg, x);
    }
    public static int standardVersion$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DSA_PARAMETER_HEADER_V2.standardVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void standardVersion$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DSA_PARAMETER_HEADER_V2.standardVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbSeedLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSeedLength"));
    public static VarHandle cbSeedLength$VH() {
        return _BCRYPT_DSA_PARAMETER_HEADER_V2.cbSeedLength$VH;
    }
    public static int cbSeedLength$get(MemorySegment seg) {
        return (int)_BCRYPT_DSA_PARAMETER_HEADER_V2.cbSeedLength$VH.get(seg);
    }
    public static void cbSeedLength$set( MemorySegment seg, int x) {
        _BCRYPT_DSA_PARAMETER_HEADER_V2.cbSeedLength$VH.set(seg, x);
    }
    public static int cbSeedLength$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DSA_PARAMETER_HEADER_V2.cbSeedLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSeedLength$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DSA_PARAMETER_HEADER_V2.cbSeedLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbGroupSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbGroupSize"));
    public static VarHandle cbGroupSize$VH() {
        return _BCRYPT_DSA_PARAMETER_HEADER_V2.cbGroupSize$VH;
    }
    public static int cbGroupSize$get(MemorySegment seg) {
        return (int)_BCRYPT_DSA_PARAMETER_HEADER_V2.cbGroupSize$VH.get(seg);
    }
    public static void cbGroupSize$set( MemorySegment seg, int x) {
        _BCRYPT_DSA_PARAMETER_HEADER_V2.cbGroupSize$VH.set(seg, x);
    }
    public static int cbGroupSize$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DSA_PARAMETER_HEADER_V2.cbGroupSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbGroupSize$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DSA_PARAMETER_HEADER_V2.cbGroupSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Count$slice(MemorySegment seg) {
        return seg.asSlice(28, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


