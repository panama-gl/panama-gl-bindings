// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagPARAMDATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("szName"),
        Constants$root.C_SHORT$LAYOUT.withName("vt"),
        MemoryLayout.paddingLayout(48)
    ).withName("tagPARAMDATA");
    public static MemoryLayout $LAYOUT() {
        return tagPARAMDATA.$struct$LAYOUT;
    }
    static final VarHandle szName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("szName"));
    public static VarHandle szName$VH() {
        return tagPARAMDATA.szName$VH;
    }
    public static MemoryAddress szName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPARAMDATA.szName$VH.get(seg);
    }
    public static void szName$set( MemorySegment seg, MemoryAddress x) {
        tagPARAMDATA.szName$VH.set(seg, x);
    }
    public static MemoryAddress szName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPARAMDATA.szName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void szName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPARAMDATA.szName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle vt$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vt"));
    public static VarHandle vt$VH() {
        return tagPARAMDATA.vt$VH;
    }
    public static short vt$get(MemorySegment seg) {
        return (short)tagPARAMDATA.vt$VH.get(seg);
    }
    public static void vt$set( MemorySegment seg, short x) {
        tagPARAMDATA.vt$VH.set(seg, x);
    }
    public static short vt$get(MemorySegment seg, long index) {
        return (short)tagPARAMDATA.vt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vt$set(MemorySegment seg, long index, short x) {
        tagPARAMDATA.vt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


