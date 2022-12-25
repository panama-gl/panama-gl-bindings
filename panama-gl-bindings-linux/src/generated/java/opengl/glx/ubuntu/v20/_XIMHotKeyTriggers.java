// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.VarHandle;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
public class _XIMHotKeyTriggers {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("num_hot_key"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("key")
    ).withName("_XIMHotKeyTriggers");
    public static MemoryLayout $LAYOUT() {
        return _XIMHotKeyTriggers.$struct$LAYOUT;
    }
    static final VarHandle num_hot_key$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("num_hot_key"));
    public static VarHandle num_hot_key$VH() {
        return _XIMHotKeyTriggers.num_hot_key$VH;
    }
    public static int num_hot_key$get(MemorySegment seg) {
        return (int)_XIMHotKeyTriggers.num_hot_key$VH.get(seg);
    }
    public static void num_hot_key$set( MemorySegment seg, int x) {
        _XIMHotKeyTriggers.num_hot_key$VH.set(seg, x);
    }
    public static int num_hot_key$get(MemorySegment seg, long index) {
        return (int)_XIMHotKeyTriggers.num_hot_key$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void num_hot_key$set(MemorySegment seg, long index, int x) {
        _XIMHotKeyTriggers.num_hot_key$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle key$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("key")));
    public static VarHandle key$VH() {
        return _XIMHotKeyTriggers.key$VH;
    }
    public static MemoryAddress key$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_XIMHotKeyTriggers.key$VH.get(seg);
    }
    public static void key$set( MemorySegment seg, MemoryAddress x) {
        _XIMHotKeyTriggers.key$VH.set(seg, x);
    }
    public static MemoryAddress key$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_XIMHotKeyTriggers.key$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void key$set(MemorySegment seg, long index, MemoryAddress x) {
        _XIMHotKeyTriggers.key$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.ofScope(scope)); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.ofScope(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


