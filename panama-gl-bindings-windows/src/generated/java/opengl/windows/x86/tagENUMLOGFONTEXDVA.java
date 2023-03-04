// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagENUMLOGFONTEXDVA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("lfHeight"),
                Constants$root.C_LONG$LAYOUT.withName("lfWidth"),
                Constants$root.C_LONG$LAYOUT.withName("lfEscapement"),
                Constants$root.C_LONG$LAYOUT.withName("lfOrientation"),
                Constants$root.C_LONG$LAYOUT.withName("lfWeight"),
                Constants$root.C_CHAR$LAYOUT.withName("lfItalic"),
                Constants$root.C_CHAR$LAYOUT.withName("lfUnderline"),
                Constants$root.C_CHAR$LAYOUT.withName("lfStrikeOut"),
                Constants$root.C_CHAR$LAYOUT.withName("lfCharSet"),
                Constants$root.C_CHAR$LAYOUT.withName("lfOutPrecision"),
                Constants$root.C_CHAR$LAYOUT.withName("lfClipPrecision"),
                Constants$root.C_CHAR$LAYOUT.withName("lfQuality"),
                Constants$root.C_CHAR$LAYOUT.withName("lfPitchAndFamily"),
                MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("lfFaceName")
            ).withName("elfLogFont"),
            MemoryLayout.sequenceLayout(64, Constants$root.C_CHAR$LAYOUT).withName("elfFullName"),
            MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("elfStyle"),
            MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("elfScript")
        ).withName("elfEnumLogfontEx"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dvReserved"),
            Constants$root.C_LONG$LAYOUT.withName("dvNumAxes"),
            MemoryLayout.sequenceLayout(16, Constants$root.C_LONG$LAYOUT).withName("dvValues")
        ).withName("elfDesignVector")
    ).withName("tagENUMLOGFONTEXDVA");
    public static MemoryLayout $LAYOUT() {
        return tagENUMLOGFONTEXDVA.$struct$LAYOUT;
    }
    public static MemorySegment elfEnumLogfontEx$slice(MemorySegment seg) {
        return seg.asSlice(0, 188);
    }
    public static MemorySegment elfDesignVector$slice(MemorySegment seg) {
        return seg.asSlice(188, 72);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


