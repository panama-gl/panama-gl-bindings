// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagHW_PROFILE_INFOW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwDockInfo"),
        MemoryLayout.sequenceLayout(39, Constants$root.C_SHORT$LAYOUT).withName("szHwProfileGuid"),
        MemoryLayout.sequenceLayout(80, Constants$root.C_SHORT$LAYOUT).withName("szHwProfileName"),
        MemoryLayout.paddingLayout(16)
    ).withName("tagHW_PROFILE_INFOW");
    public static MemoryLayout $LAYOUT() {
        return tagHW_PROFILE_INFOW.$struct$LAYOUT;
    }
    static final VarHandle dwDockInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDockInfo"));
    public static VarHandle dwDockInfo$VH() {
        return tagHW_PROFILE_INFOW.dwDockInfo$VH;
    }
    public static int dwDockInfo$get(MemorySegment seg) {
        return (int)tagHW_PROFILE_INFOW.dwDockInfo$VH.get(seg);
    }
    public static void dwDockInfo$set( MemorySegment seg, int x) {
        tagHW_PROFILE_INFOW.dwDockInfo$VH.set(seg, x);
    }
    public static int dwDockInfo$get(MemorySegment seg, long index) {
        return (int)tagHW_PROFILE_INFOW.dwDockInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDockInfo$set(MemorySegment seg, long index, int x) {
        tagHW_PROFILE_INFOW.dwDockInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szHwProfileGuid$slice(MemorySegment seg) {
        return seg.asSlice(4, 78);
    }
    public static MemorySegment szHwProfileName$slice(MemorySegment seg) {
        return seg.asSlice(82, 160);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


