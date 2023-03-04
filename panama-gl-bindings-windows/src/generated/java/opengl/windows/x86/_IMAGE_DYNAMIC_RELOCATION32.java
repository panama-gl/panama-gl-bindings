// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_DYNAMIC_RELOCATION32 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Symbol"),
        Constants$root.C_LONG$LAYOUT.withName("BaseRelocSize")
    ).withName("_IMAGE_DYNAMIC_RELOCATION32");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_DYNAMIC_RELOCATION32.$struct$LAYOUT;
    }
    static final VarHandle Symbol$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Symbol"));
    public static VarHandle Symbol$VH() {
        return _IMAGE_DYNAMIC_RELOCATION32.Symbol$VH;
    }
    public static int Symbol$get(MemorySegment seg) {
        return (int)_IMAGE_DYNAMIC_RELOCATION32.Symbol$VH.get(seg);
    }
    public static void Symbol$set( MemorySegment seg, int x) {
        _IMAGE_DYNAMIC_RELOCATION32.Symbol$VH.set(seg, x);
    }
    public static int Symbol$get(MemorySegment seg, long index) {
        return (int)_IMAGE_DYNAMIC_RELOCATION32.Symbol$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Symbol$set(MemorySegment seg, long index, int x) {
        _IMAGE_DYNAMIC_RELOCATION32.Symbol$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BaseRelocSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseRelocSize"));
    public static VarHandle BaseRelocSize$VH() {
        return _IMAGE_DYNAMIC_RELOCATION32.BaseRelocSize$VH;
    }
    public static int BaseRelocSize$get(MemorySegment seg) {
        return (int)_IMAGE_DYNAMIC_RELOCATION32.BaseRelocSize$VH.get(seg);
    }
    public static void BaseRelocSize$set( MemorySegment seg, int x) {
        _IMAGE_DYNAMIC_RELOCATION32.BaseRelocSize$VH.set(seg, x);
    }
    public static int BaseRelocSize$get(MemorySegment seg, long index) {
        return (int)_IMAGE_DYNAMIC_RELOCATION32.BaseRelocSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BaseRelocSize$set(MemorySegment seg, long index, int x) {
        _IMAGE_DYNAMIC_RELOCATION32.BaseRelocSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


