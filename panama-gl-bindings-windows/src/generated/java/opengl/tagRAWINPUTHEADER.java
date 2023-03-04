// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagRAWINPUTHEADER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwType"),
        Constants$root.C_LONG$LAYOUT.withName("dwSize"),
        Constants$root.C_POINTER$LAYOUT.withName("hDevice"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("wParam")
    ).withName("tagRAWINPUTHEADER");
    public static MemoryLayout $LAYOUT() {
        return tagRAWINPUTHEADER.$struct$LAYOUT;
    }
    static final VarHandle dwType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwType"));
    public static VarHandle dwType$VH() {
        return tagRAWINPUTHEADER.dwType$VH;
    }
    public static int dwType$get(MemorySegment seg) {
        return (int)tagRAWINPUTHEADER.dwType$VH.get(seg);
    }
    public static void dwType$set( MemorySegment seg, int x) {
        tagRAWINPUTHEADER.dwType$VH.set(seg, x);
    }
    public static int dwType$get(MemorySegment seg, long index) {
        return (int)tagRAWINPUTHEADER.dwType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwType$set(MemorySegment seg, long index, int x) {
        tagRAWINPUTHEADER.dwType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSize"));
    public static VarHandle dwSize$VH() {
        return tagRAWINPUTHEADER.dwSize$VH;
    }
    public static int dwSize$get(MemorySegment seg) {
        return (int)tagRAWINPUTHEADER.dwSize$VH.get(seg);
    }
    public static void dwSize$set( MemorySegment seg, int x) {
        tagRAWINPUTHEADER.dwSize$VH.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)tagRAWINPUTHEADER.dwSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        tagRAWINPUTHEADER.dwSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hDevice$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hDevice"));
    public static VarHandle hDevice$VH() {
        return tagRAWINPUTHEADER.hDevice$VH;
    }
    public static MemoryAddress hDevice$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagRAWINPUTHEADER.hDevice$VH.get(seg);
    }
    public static void hDevice$set( MemorySegment seg, MemoryAddress x) {
        tagRAWINPUTHEADER.hDevice$VH.set(seg, x);
    }
    public static MemoryAddress hDevice$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagRAWINPUTHEADER.hDevice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hDevice$set(MemorySegment seg, long index, MemoryAddress x) {
        tagRAWINPUTHEADER.hDevice$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wParam$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wParam"));
    public static VarHandle wParam$VH() {
        return tagRAWINPUTHEADER.wParam$VH;
    }
    public static long wParam$get(MemorySegment seg) {
        return (long)tagRAWINPUTHEADER.wParam$VH.get(seg);
    }
    public static void wParam$set( MemorySegment seg, long x) {
        tagRAWINPUTHEADER.wParam$VH.set(seg, x);
    }
    public static long wParam$get(MemorySegment seg, long index) {
        return (long)tagRAWINPUTHEADER.wParam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wParam$set(MemorySegment seg, long index, long x) {
        tagRAWINPUTHEADER.wParam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


