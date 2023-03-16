// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_OFFLOAD_READ_OUTPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("OffloadReadFlags"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("LengthProtected"),
        Constants$root.C_LONG$LAYOUT.withName("TokenLength"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("TokenType"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("Reserved"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("TokenIdLength"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.sequenceLayout(504, Constants$root.C_CHAR$LAYOUT).withName("Reserved2")
                ).withName("StorageOffloadZeroDataToken"),
                MemoryLayout.sequenceLayout(504, Constants$root.C_CHAR$LAYOUT).withName("Token")
            ).withName("$anon$0")
        ).withName("Token"),
        MemoryLayout.paddingLayout(32)
    ).withName("_STORAGE_OFFLOAD_READ_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_OFFLOAD_READ_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle OffloadReadFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OffloadReadFlags"));
    public static VarHandle OffloadReadFlags$VH() {
        return _STORAGE_OFFLOAD_READ_OUTPUT.OffloadReadFlags$VH;
    }
    public static int OffloadReadFlags$get(MemorySegment seg) {
        return (int)_STORAGE_OFFLOAD_READ_OUTPUT.OffloadReadFlags$VH.get(seg);
    }
    public static void OffloadReadFlags$set( MemorySegment seg, int x) {
        _STORAGE_OFFLOAD_READ_OUTPUT.OffloadReadFlags$VH.set(seg, x);
    }
    public static int OffloadReadFlags$get(MemorySegment seg, long index) {
        return (int)_STORAGE_OFFLOAD_READ_OUTPUT.OffloadReadFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OffloadReadFlags$set(MemorySegment seg, long index, int x) {
        _STORAGE_OFFLOAD_READ_OUTPUT.OffloadReadFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _STORAGE_OFFLOAD_READ_OUTPUT.Reserved$VH;
    }
    public static int Reserved$get(MemorySegment seg) {
        return (int)_STORAGE_OFFLOAD_READ_OUTPUT.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, int x) {
        _STORAGE_OFFLOAD_READ_OUTPUT.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_STORAGE_OFFLOAD_READ_OUTPUT.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _STORAGE_OFFLOAD_READ_OUTPUT.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LengthProtected$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LengthProtected"));
    public static VarHandle LengthProtected$VH() {
        return _STORAGE_OFFLOAD_READ_OUTPUT.LengthProtected$VH;
    }
    public static long LengthProtected$get(MemorySegment seg) {
        return (long)_STORAGE_OFFLOAD_READ_OUTPUT.LengthProtected$VH.get(seg);
    }
    public static void LengthProtected$set( MemorySegment seg, long x) {
        _STORAGE_OFFLOAD_READ_OUTPUT.LengthProtected$VH.set(seg, x);
    }
    public static long LengthProtected$get(MemorySegment seg, long index) {
        return (long)_STORAGE_OFFLOAD_READ_OUTPUT.LengthProtected$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LengthProtected$set(MemorySegment seg, long index, long x) {
        _STORAGE_OFFLOAD_READ_OUTPUT.LengthProtected$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TokenLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TokenLength"));
    public static VarHandle TokenLength$VH() {
        return _STORAGE_OFFLOAD_READ_OUTPUT.TokenLength$VH;
    }
    public static int TokenLength$get(MemorySegment seg) {
        return (int)_STORAGE_OFFLOAD_READ_OUTPUT.TokenLength$VH.get(seg);
    }
    public static void TokenLength$set( MemorySegment seg, int x) {
        _STORAGE_OFFLOAD_READ_OUTPUT.TokenLength$VH.set(seg, x);
    }
    public static int TokenLength$get(MemorySegment seg, long index) {
        return (int)_STORAGE_OFFLOAD_READ_OUTPUT.TokenLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TokenLength$set(MemorySegment seg, long index, int x) {
        _STORAGE_OFFLOAD_READ_OUTPUT.TokenLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Token$slice(MemorySegment seg) {
        return seg.asSlice(20, 512);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

