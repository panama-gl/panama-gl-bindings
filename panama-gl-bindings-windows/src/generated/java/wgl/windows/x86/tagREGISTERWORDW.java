// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagREGISTERWORDW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("lpReading"),
        Constants$root.C_POINTER$LAYOUT.withName("lpWord")
    ).withName("tagREGISTERWORDW");
    public static MemoryLayout $LAYOUT() {
        return tagREGISTERWORDW.$struct$LAYOUT;
    }
    static final VarHandle lpReading$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpReading"));
    public static VarHandle lpReading$VH() {
        return tagREGISTERWORDW.lpReading$VH;
    }
    public static MemoryAddress lpReading$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagREGISTERWORDW.lpReading$VH.get(seg);
    }
    public static void lpReading$set( MemorySegment seg, MemoryAddress x) {
        tagREGISTERWORDW.lpReading$VH.set(seg, x);
    }
    public static MemoryAddress lpReading$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagREGISTERWORDW.lpReading$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpReading$set(MemorySegment seg, long index, MemoryAddress x) {
        tagREGISTERWORDW.lpReading$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpWord$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpWord"));
    public static VarHandle lpWord$VH() {
        return tagREGISTERWORDW.lpWord$VH;
    }
    public static MemoryAddress lpWord$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagREGISTERWORDW.lpWord$VH.get(seg);
    }
    public static void lpWord$set( MemorySegment seg, MemoryAddress x) {
        tagREGISTERWORDW.lpWord$VH.set(seg, x);
    }
    public static MemoryAddress lpWord$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagREGISTERWORDW.lpWord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpWord$set(MemorySegment seg, long index, MemoryAddress x) {
        tagREGISTERWORDW.lpWord$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


