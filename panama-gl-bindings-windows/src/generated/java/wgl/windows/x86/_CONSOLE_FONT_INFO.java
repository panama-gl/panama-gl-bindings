// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CONSOLE_FONT_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("nFont"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("dwFontSize")
    ).withName("_CONSOLE_FONT_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CONSOLE_FONT_INFO.$struct$LAYOUT;
    }
    static final VarHandle nFont$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nFont"));
    public static VarHandle nFont$VH() {
        return _CONSOLE_FONT_INFO.nFont$VH;
    }
    public static int nFont$get(MemorySegment seg) {
        return (int)_CONSOLE_FONT_INFO.nFont$VH.get(seg);
    }
    public static void nFont$set( MemorySegment seg, int x) {
        _CONSOLE_FONT_INFO.nFont$VH.set(seg, x);
    }
    public static int nFont$get(MemorySegment seg, long index) {
        return (int)_CONSOLE_FONT_INFO.nFont$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nFont$set(MemorySegment seg, long index, int x) {
        _CONSOLE_FONT_INFO.nFont$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment dwFontSize$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


