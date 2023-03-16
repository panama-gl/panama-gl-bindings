// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_TIMESTAMP_ACCURACY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwSeconds"),
        Constants$root.C_LONG$LAYOUT.withName("dwMillis"),
        Constants$root.C_LONG$LAYOUT.withName("dwMicros")
    ).withName("_CRYPT_TIMESTAMP_ACCURACY");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_TIMESTAMP_ACCURACY.$struct$LAYOUT;
    }
    static final VarHandle dwSeconds$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSeconds"));
    public static VarHandle dwSeconds$VH() {
        return _CRYPT_TIMESTAMP_ACCURACY.dwSeconds$VH;
    }
    public static int dwSeconds$get(MemorySegment seg) {
        return (int)_CRYPT_TIMESTAMP_ACCURACY.dwSeconds$VH.get(seg);
    }
    public static void dwSeconds$set( MemorySegment seg, int x) {
        _CRYPT_TIMESTAMP_ACCURACY.dwSeconds$VH.set(seg, x);
    }
    public static int dwSeconds$get(MemorySegment seg, long index) {
        return (int)_CRYPT_TIMESTAMP_ACCURACY.dwSeconds$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSeconds$set(MemorySegment seg, long index, int x) {
        _CRYPT_TIMESTAMP_ACCURACY.dwSeconds$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMillis$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMillis"));
    public static VarHandle dwMillis$VH() {
        return _CRYPT_TIMESTAMP_ACCURACY.dwMillis$VH;
    }
    public static int dwMillis$get(MemorySegment seg) {
        return (int)_CRYPT_TIMESTAMP_ACCURACY.dwMillis$VH.get(seg);
    }
    public static void dwMillis$set( MemorySegment seg, int x) {
        _CRYPT_TIMESTAMP_ACCURACY.dwMillis$VH.set(seg, x);
    }
    public static int dwMillis$get(MemorySegment seg, long index) {
        return (int)_CRYPT_TIMESTAMP_ACCURACY.dwMillis$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMillis$set(MemorySegment seg, long index, int x) {
        _CRYPT_TIMESTAMP_ACCURACY.dwMillis$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMicros$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMicros"));
    public static VarHandle dwMicros$VH() {
        return _CRYPT_TIMESTAMP_ACCURACY.dwMicros$VH;
    }
    public static int dwMicros$get(MemorySegment seg) {
        return (int)_CRYPT_TIMESTAMP_ACCURACY.dwMicros$VH.get(seg);
    }
    public static void dwMicros$set( MemorySegment seg, int x) {
        _CRYPT_TIMESTAMP_ACCURACY.dwMicros$VH.set(seg, x);
    }
    public static int dwMicros$get(MemorySegment seg, long index) {
        return (int)_CRYPT_TIMESTAMP_ACCURACY.dwMicros$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMicros$set(MemorySegment seg, long index, int x) {
        _CRYPT_TIMESTAMP_ACCURACY.dwMicros$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


