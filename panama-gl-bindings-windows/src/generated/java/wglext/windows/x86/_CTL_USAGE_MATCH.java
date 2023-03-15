// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CTL_USAGE_MATCH {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwType"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cUsageIdentifier"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("rgpszUsageIdentifier")
        ).withName("Usage")
    ).withName("_CTL_USAGE_MATCH");
    public static MemoryLayout $LAYOUT() {
        return _CTL_USAGE_MATCH.$struct$LAYOUT;
    }
    static final VarHandle dwType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwType"));
    public static VarHandle dwType$VH() {
        return _CTL_USAGE_MATCH.dwType$VH;
    }
    public static int dwType$get(MemorySegment seg) {
        return (int)_CTL_USAGE_MATCH.dwType$VH.get(seg);
    }
    public static void dwType$set( MemorySegment seg, int x) {
        _CTL_USAGE_MATCH.dwType$VH.set(seg, x);
    }
    public static int dwType$get(MemorySegment seg, long index) {
        return (int)_CTL_USAGE_MATCH.dwType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwType$set(MemorySegment seg, long index, int x) {
        _CTL_USAGE_MATCH.dwType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Usage$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


