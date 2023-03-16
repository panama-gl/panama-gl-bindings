// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMRPIXELFORMAT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("nSize"),
            Constants$root.C_SHORT$LAYOUT.withName("nVersion"),
            Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
            Constants$root.C_CHAR$LAYOUT.withName("iPixelType"),
            Constants$root.C_CHAR$LAYOUT.withName("cColorBits"),
            Constants$root.C_CHAR$LAYOUT.withName("cRedBits"),
            Constants$root.C_CHAR$LAYOUT.withName("cRedShift"),
            Constants$root.C_CHAR$LAYOUT.withName("cGreenBits"),
            Constants$root.C_CHAR$LAYOUT.withName("cGreenShift"),
            Constants$root.C_CHAR$LAYOUT.withName("cBlueBits"),
            Constants$root.C_CHAR$LAYOUT.withName("cBlueShift"),
            Constants$root.C_CHAR$LAYOUT.withName("cAlphaBits"),
            Constants$root.C_CHAR$LAYOUT.withName("cAlphaShift"),
            Constants$root.C_CHAR$LAYOUT.withName("cAccumBits"),
            Constants$root.C_CHAR$LAYOUT.withName("cAccumRedBits"),
            Constants$root.C_CHAR$LAYOUT.withName("cAccumGreenBits"),
            Constants$root.C_CHAR$LAYOUT.withName("cAccumBlueBits"),
            Constants$root.C_CHAR$LAYOUT.withName("cAccumAlphaBits"),
            Constants$root.C_CHAR$LAYOUT.withName("cDepthBits"),
            Constants$root.C_CHAR$LAYOUT.withName("cStencilBits"),
            Constants$root.C_CHAR$LAYOUT.withName("cAuxBuffers"),
            Constants$root.C_CHAR$LAYOUT.withName("iLayerType"),
            Constants$root.C_CHAR$LAYOUT.withName("bReserved"),
            Constants$root.C_LONG$LAYOUT.withName("dwLayerMask"),
            Constants$root.C_LONG$LAYOUT.withName("dwVisibleMask"),
            Constants$root.C_LONG$LAYOUT.withName("dwDamageMask")
        ).withName("pfd")
    ).withName("tagEMRPIXELFORMAT");
    public static MemoryLayout $LAYOUT() {
        return tagEMRPIXELFORMAT.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment pfd$slice(MemorySegment seg) {
        return seg.asSlice(8, 40);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


