// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SERVICE_PREFERRED_NODE_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("usPreferredNode"),
        Constants$root.C_CHAR$LAYOUT.withName("fDelete"),
        MemoryLayout.paddingLayout(8)
    ).withName("_SERVICE_PREFERRED_NODE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _SERVICE_PREFERRED_NODE_INFO.$struct$LAYOUT;
    }
    static final VarHandle usPreferredNode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("usPreferredNode"));
    public static VarHandle usPreferredNode$VH() {
        return _SERVICE_PREFERRED_NODE_INFO.usPreferredNode$VH;
    }
    public static short usPreferredNode$get(MemorySegment seg) {
        return (short)_SERVICE_PREFERRED_NODE_INFO.usPreferredNode$VH.get(seg);
    }
    public static void usPreferredNode$set( MemorySegment seg, short x) {
        _SERVICE_PREFERRED_NODE_INFO.usPreferredNode$VH.set(seg, x);
    }
    public static short usPreferredNode$get(MemorySegment seg, long index) {
        return (short)_SERVICE_PREFERRED_NODE_INFO.usPreferredNode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void usPreferredNode$set(MemorySegment seg, long index, short x) {
        _SERVICE_PREFERRED_NODE_INFO.usPreferredNode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fDelete$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fDelete"));
    public static VarHandle fDelete$VH() {
        return _SERVICE_PREFERRED_NODE_INFO.fDelete$VH;
    }
    public static byte fDelete$get(MemorySegment seg) {
        return (byte)_SERVICE_PREFERRED_NODE_INFO.fDelete$VH.get(seg);
    }
    public static void fDelete$set( MemorySegment seg, byte x) {
        _SERVICE_PREFERRED_NODE_INFO.fDelete$VH.set(seg, x);
    }
    public static byte fDelete$get(MemorySegment seg, long index) {
        return (byte)_SERVICE_PREFERRED_NODE_INFO.fDelete$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fDelete$set(MemorySegment seg, long index, byte x) {
        _SERVICE_PREFERRED_NODE_INFO.fDelete$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


