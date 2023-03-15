// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _BCRYPT_DH_KEY_BLOB {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwMagic"),
        Constants$root.C_LONG$LAYOUT.withName("cbKey")
    ).withName("_BCRYPT_DH_KEY_BLOB");
    public static MemoryLayout $LAYOUT() {
        return _BCRYPT_DH_KEY_BLOB.$struct$LAYOUT;
    }
    static final VarHandle dwMagic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMagic"));
    public static VarHandle dwMagic$VH() {
        return _BCRYPT_DH_KEY_BLOB.dwMagic$VH;
    }
    public static int dwMagic$get(MemorySegment seg) {
        return (int)_BCRYPT_DH_KEY_BLOB.dwMagic$VH.get(seg);
    }
    public static void dwMagic$set( MemorySegment seg, int x) {
        _BCRYPT_DH_KEY_BLOB.dwMagic$VH.set(seg, x);
    }
    public static int dwMagic$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DH_KEY_BLOB.dwMagic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMagic$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DH_KEY_BLOB.dwMagic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbKey"));
    public static VarHandle cbKey$VH() {
        return _BCRYPT_DH_KEY_BLOB.cbKey$VH;
    }
    public static int cbKey$get(MemorySegment seg) {
        return (int)_BCRYPT_DH_KEY_BLOB.cbKey$VH.get(seg);
    }
    public static void cbKey$set( MemorySegment seg, int x) {
        _BCRYPT_DH_KEY_BLOB.cbKey$VH.set(seg, x);
    }
    public static int cbKey$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DH_KEY_BLOB.cbKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbKey$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DH_KEY_BLOB.cbKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


