// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagENUMLOGFONTEXA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
    ).withName("tagENUMLOGFONTEXA");
    public static MemoryLayout $LAYOUT() {
        return tagENUMLOGFONTEXA.$struct$LAYOUT;
    }
    public static MemorySegment elfLogFont$slice(MemorySegment seg) {
        return seg.asSlice(0, 60);
    }
    public static MemorySegment elfFullName$slice(MemorySegment seg) {
        return seg.asSlice(60, 64);
    }
    public static MemorySegment elfStyle$slice(MemorySegment seg) {
        return seg.asSlice(124, 32);
    }
    public static MemorySegment elfScript$slice(MemorySegment seg) {
        return seg.asSlice(156, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


