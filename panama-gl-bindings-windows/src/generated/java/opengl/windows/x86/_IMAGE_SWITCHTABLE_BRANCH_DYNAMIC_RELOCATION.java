// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_SWITCHTABLE_BRANCH_DYNAMIC_RELOCATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(12).withName("PageRelativeOffset"),
            MemoryLayout.paddingLayout(4).withName("RegisterNumber")
        )
    ).withName("_IMAGE_SWITCHTABLE_BRANCH_DYNAMIC_RELOCATION");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_SWITCHTABLE_BRANCH_DYNAMIC_RELOCATION.$struct$LAYOUT;
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


