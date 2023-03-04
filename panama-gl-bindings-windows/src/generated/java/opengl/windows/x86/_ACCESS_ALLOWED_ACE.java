// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ACCESS_ALLOWED_ACE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("AceType"),
            Constants$root.C_CHAR$LAYOUT.withName("AceFlags"),
            Constants$root.C_SHORT$LAYOUT.withName("AceSize")
        ).withName("Header"),
        Constants$root.C_LONG$LAYOUT.withName("Mask"),
        Constants$root.C_LONG$LAYOUT.withName("SidStart")
    ).withName("_ACCESS_ALLOWED_ACE");
    public static MemoryLayout $LAYOUT() {
        return _ACCESS_ALLOWED_ACE.$struct$LAYOUT;
    }
    public static MemorySegment Header$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    static final VarHandle Mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Mask"));
    public static VarHandle Mask$VH() {
        return _ACCESS_ALLOWED_ACE.Mask$VH;
    }
    public static int Mask$get(MemorySegment seg) {
        return (int)_ACCESS_ALLOWED_ACE.Mask$VH.get(seg);
    }
    public static void Mask$set( MemorySegment seg, int x) {
        _ACCESS_ALLOWED_ACE.Mask$VH.set(seg, x);
    }
    public static int Mask$get(MemorySegment seg, long index) {
        return (int)_ACCESS_ALLOWED_ACE.Mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Mask$set(MemorySegment seg, long index, int x) {
        _ACCESS_ALLOWED_ACE.Mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SidStart$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SidStart"));
    public static VarHandle SidStart$VH() {
        return _ACCESS_ALLOWED_ACE.SidStart$VH;
    }
    public static int SidStart$get(MemorySegment seg) {
        return (int)_ACCESS_ALLOWED_ACE.SidStart$VH.get(seg);
    }
    public static void SidStart$set( MemorySegment seg, int x) {
        _ACCESS_ALLOWED_ACE.SidStart$VH.set(seg, x);
    }
    public static int SidStart$get(MemorySegment seg, long index) {
        return (int)_ACCESS_ALLOWED_ACE.SidStart$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SidStart$set(MemorySegment seg, long index, int x) {
        _ACCESS_ALLOWED_ACE.SidStart$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


