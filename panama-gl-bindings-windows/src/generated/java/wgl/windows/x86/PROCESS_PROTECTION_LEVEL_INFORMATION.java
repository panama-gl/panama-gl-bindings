// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class PROCESS_PROTECTION_LEVEL_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ProtectionLevel")
    ).withName("PROCESS_PROTECTION_LEVEL_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return PROCESS_PROTECTION_LEVEL_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle ProtectionLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProtectionLevel"));
    public static VarHandle ProtectionLevel$VH() {
        return PROCESS_PROTECTION_LEVEL_INFORMATION.ProtectionLevel$VH;
    }
    public static int ProtectionLevel$get(MemorySegment seg) {
        return (int)PROCESS_PROTECTION_LEVEL_INFORMATION.ProtectionLevel$VH.get(seg);
    }
    public static void ProtectionLevel$set( MemorySegment seg, int x) {
        PROCESS_PROTECTION_LEVEL_INFORMATION.ProtectionLevel$VH.set(seg, x);
    }
    public static int ProtectionLevel$get(MemorySegment seg, long index) {
        return (int)PROCESS_PROTECTION_LEVEL_INFORMATION.ProtectionLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProtectionLevel$set(MemorySegment seg, long index, int x) {
        PROCESS_PROTECTION_LEVEL_INFORMATION.ProtectionLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


