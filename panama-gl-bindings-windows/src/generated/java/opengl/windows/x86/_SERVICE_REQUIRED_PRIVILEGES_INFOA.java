// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SERVICE_REQUIRED_PRIVILEGES_INFOA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pmszRequiredPrivileges")
    ).withName("_SERVICE_REQUIRED_PRIVILEGES_INFOA");
    public static MemoryLayout $LAYOUT() {
        return _SERVICE_REQUIRED_PRIVILEGES_INFOA.$struct$LAYOUT;
    }
    static final VarHandle pmszRequiredPrivileges$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pmszRequiredPrivileges"));
    public static VarHandle pmszRequiredPrivileges$VH() {
        return _SERVICE_REQUIRED_PRIVILEGES_INFOA.pmszRequiredPrivileges$VH;
    }
    public static MemoryAddress pmszRequiredPrivileges$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_REQUIRED_PRIVILEGES_INFOA.pmszRequiredPrivileges$VH.get(seg);
    }
    public static void pmszRequiredPrivileges$set( MemorySegment seg, MemoryAddress x) {
        _SERVICE_REQUIRED_PRIVILEGES_INFOA.pmszRequiredPrivileges$VH.set(seg, x);
    }
    public static MemoryAddress pmszRequiredPrivileges$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_REQUIRED_PRIVILEGES_INFOA.pmszRequiredPrivileges$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pmszRequiredPrivileges$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVICE_REQUIRED_PRIVILEGES_INFOA.pmszRequiredPrivileges$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


