// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class ITypeLibRegistrationReader {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("lpVtbl")
    ).withName("ITypeLibRegistrationReader");
    public static MemoryLayout $LAYOUT() {
        return ITypeLibRegistrationReader.$struct$LAYOUT;
    }
    static final VarHandle lpVtbl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    public static VarHandle lpVtbl$VH() {
        return ITypeLibRegistrationReader.lpVtbl$VH;
    }
    public static MemoryAddress lpVtbl$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ITypeLibRegistrationReader.lpVtbl$VH.get(seg);
    }
    public static void lpVtbl$set( MemorySegment seg, MemoryAddress x) {
        ITypeLibRegistrationReader.lpVtbl$VH.set(seg, x);
    }
    public static MemoryAddress lpVtbl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ITypeLibRegistrationReader.lpVtbl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpVtbl$set(MemorySegment seg, long index, MemoryAddress x) {
        ITypeLibRegistrationReader.lpVtbl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

