// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class XModifierKeymap {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("max_keypermod"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("modifiermap")
    );
    public static MemoryLayout $LAYOUT() {
        return XModifierKeymap.$struct$LAYOUT;
    }
    static final VarHandle max_keypermod$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_keypermod"));
    public static VarHandle max_keypermod$VH() {
        return XModifierKeymap.max_keypermod$VH;
    }
    public static int max_keypermod$get(MemorySegment seg) {
        return (int)XModifierKeymap.max_keypermod$VH.get(seg);
    }
    public static void max_keypermod$set( MemorySegment seg, int x) {
        XModifierKeymap.max_keypermod$VH.set(seg, x);
    }
    public static int max_keypermod$get(MemorySegment seg, long index) {
        return (int)XModifierKeymap.max_keypermod$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_keypermod$set(MemorySegment seg, long index, int x) {
        XModifierKeymap.max_keypermod$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle modifiermap$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("modifiermap"));
    public static VarHandle modifiermap$VH() {
        return XModifierKeymap.modifiermap$VH;
    }
    public static MemoryAddress modifiermap$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)XModifierKeymap.modifiermap$VH.get(seg);
    }
    public static void modifiermap$set( MemorySegment seg, MemoryAddress x) {
        XModifierKeymap.modifiermap$VH.set(seg, x);
    }
    public static MemoryAddress modifiermap$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)XModifierKeymap.modifiermap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void modifiermap$set(MemorySegment seg, long index, MemoryAddress x) {
        XModifierKeymap.modifiermap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


