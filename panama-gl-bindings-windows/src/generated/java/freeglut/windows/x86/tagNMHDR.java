// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagNMHDR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hwndFrom"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("idFrom"),
        Constants$root.C_LONG$LAYOUT.withName("code"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagNMHDR");
    public static MemoryLayout $LAYOUT() {
        return tagNMHDR.$struct$LAYOUT;
    }
    static final VarHandle hwndFrom$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndFrom"));
    public static VarHandle hwndFrom$VH() {
        return tagNMHDR.hwndFrom$VH;
    }
    public static MemoryAddress hwndFrom$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagNMHDR.hwndFrom$VH.get(seg);
    }
    public static void hwndFrom$set( MemorySegment seg, MemoryAddress x) {
        tagNMHDR.hwndFrom$VH.set(seg, x);
    }
    public static MemoryAddress hwndFrom$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagNMHDR.hwndFrom$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndFrom$set(MemorySegment seg, long index, MemoryAddress x) {
        tagNMHDR.hwndFrom$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle idFrom$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("idFrom"));
    public static VarHandle idFrom$VH() {
        return tagNMHDR.idFrom$VH;
    }
    public static long idFrom$get(MemorySegment seg) {
        return (long)tagNMHDR.idFrom$VH.get(seg);
    }
    public static void idFrom$set( MemorySegment seg, long x) {
        tagNMHDR.idFrom$VH.set(seg, x);
    }
    public static long idFrom$get(MemorySegment seg, long index) {
        return (long)tagNMHDR.idFrom$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void idFrom$set(MemorySegment seg, long index, long x) {
        tagNMHDR.idFrom$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle code$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("code"));
    public static VarHandle code$VH() {
        return tagNMHDR.code$VH;
    }
    public static int code$get(MemorySegment seg) {
        return (int)tagNMHDR.code$VH.get(seg);
    }
    public static void code$set( MemorySegment seg, int x) {
        tagNMHDR.code$VH.set(seg, x);
    }
    public static int code$get(MemorySegment seg, long index) {
        return (int)tagNMHDR.code$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void code$set(MemorySegment seg, long index, int x) {
        tagNMHDR.code$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


