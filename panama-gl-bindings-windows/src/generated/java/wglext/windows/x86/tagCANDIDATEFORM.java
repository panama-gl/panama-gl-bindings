// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagCANDIDATEFORM {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwIndex"),
        Constants$root.C_LONG$LAYOUT.withName("dwStyle"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("ptCurrentPos"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rcArea")
    ).withName("tagCANDIDATEFORM");
    public static MemoryLayout $LAYOUT() {
        return tagCANDIDATEFORM.$struct$LAYOUT;
    }
    static final VarHandle dwIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwIndex"));
    public static VarHandle dwIndex$VH() {
        return tagCANDIDATEFORM.dwIndex$VH;
    }
    public static int dwIndex$get(MemorySegment seg) {
        return (int)tagCANDIDATEFORM.dwIndex$VH.get(seg);
    }
    public static void dwIndex$set( MemorySegment seg, int x) {
        tagCANDIDATEFORM.dwIndex$VH.set(seg, x);
    }
    public static int dwIndex$get(MemorySegment seg, long index) {
        return (int)tagCANDIDATEFORM.dwIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwIndex$set(MemorySegment seg, long index, int x) {
        tagCANDIDATEFORM.dwIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStyle"));
    public static VarHandle dwStyle$VH() {
        return tagCANDIDATEFORM.dwStyle$VH;
    }
    public static int dwStyle$get(MemorySegment seg) {
        return (int)tagCANDIDATEFORM.dwStyle$VH.get(seg);
    }
    public static void dwStyle$set( MemorySegment seg, int x) {
        tagCANDIDATEFORM.dwStyle$VH.set(seg, x);
    }
    public static int dwStyle$get(MemorySegment seg, long index) {
        return (int)tagCANDIDATEFORM.dwStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStyle$set(MemorySegment seg, long index, int x) {
        tagCANDIDATEFORM.dwStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ptCurrentPos$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment rcArea$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


