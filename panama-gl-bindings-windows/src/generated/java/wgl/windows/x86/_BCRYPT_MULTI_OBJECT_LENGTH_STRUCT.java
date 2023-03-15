// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _BCRYPT_MULTI_OBJECT_LENGTH_STRUCT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbPerObject"),
        Constants$root.C_LONG$LAYOUT.withName("cbPerElement")
    ).withName("_BCRYPT_MULTI_OBJECT_LENGTH_STRUCT");
    public static MemoryLayout $LAYOUT() {
        return _BCRYPT_MULTI_OBJECT_LENGTH_STRUCT.$struct$LAYOUT;
    }
    static final VarHandle cbPerObject$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbPerObject"));
    public static VarHandle cbPerObject$VH() {
        return _BCRYPT_MULTI_OBJECT_LENGTH_STRUCT.cbPerObject$VH;
    }
    public static int cbPerObject$get(MemorySegment seg) {
        return (int)_BCRYPT_MULTI_OBJECT_LENGTH_STRUCT.cbPerObject$VH.get(seg);
    }
    public static void cbPerObject$set( MemorySegment seg, int x) {
        _BCRYPT_MULTI_OBJECT_LENGTH_STRUCT.cbPerObject$VH.set(seg, x);
    }
    public static int cbPerObject$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_MULTI_OBJECT_LENGTH_STRUCT.cbPerObject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbPerObject$set(MemorySegment seg, long index, int x) {
        _BCRYPT_MULTI_OBJECT_LENGTH_STRUCT.cbPerObject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbPerElement$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbPerElement"));
    public static VarHandle cbPerElement$VH() {
        return _BCRYPT_MULTI_OBJECT_LENGTH_STRUCT.cbPerElement$VH;
    }
    public static int cbPerElement$get(MemorySegment seg) {
        return (int)_BCRYPT_MULTI_OBJECT_LENGTH_STRUCT.cbPerElement$VH.get(seg);
    }
    public static void cbPerElement$set( MemorySegment seg, int x) {
        _BCRYPT_MULTI_OBJECT_LENGTH_STRUCT.cbPerElement$VH.set(seg, x);
    }
    public static int cbPerElement$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_MULTI_OBJECT_LENGTH_STRUCT.cbPerElement$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbPerElement$set(MemorySegment seg, long index, int x) {
        _BCRYPT_MULTI_OBJECT_LENGTH_STRUCT.cbPerElement$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


