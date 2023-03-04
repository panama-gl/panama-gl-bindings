// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _INPUT_RECORD {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("EventType"),
        MemoryLayout.paddingLayout(16),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("bKeyDown"),
                Constants$root.C_SHORT$LAYOUT.withName("wRepeatCount"),
                Constants$root.C_SHORT$LAYOUT.withName("wVirtualKeyCode"),
                Constants$root.C_SHORT$LAYOUT.withName("wVirtualScanCode"),
                MemoryLayout.unionLayout(
                    Constants$root.C_SHORT$LAYOUT.withName("UnicodeChar"),
                    Constants$root.C_CHAR$LAYOUT.withName("AsciiChar")
                ).withName("uChar"),
                Constants$root.C_LONG$LAYOUT.withName("dwControlKeyState")
            ).withName("KeyEvent"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_SHORT$LAYOUT.withName("X"),
                    Constants$root.C_SHORT$LAYOUT.withName("Y")
                ).withName("dwMousePosition"),
                Constants$root.C_LONG$LAYOUT.withName("dwButtonState"),
                Constants$root.C_LONG$LAYOUT.withName("dwControlKeyState"),
                Constants$root.C_LONG$LAYOUT.withName("dwEventFlags")
            ).withName("MouseEvent"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_SHORT$LAYOUT.withName("X"),
                    Constants$root.C_SHORT$LAYOUT.withName("Y")
                ).withName("dwSize")
            ).withName("WindowBufferSizeEvent"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("dwCommandId")
            ).withName("MenuEvent"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("bSetFocus")
            ).withName("FocusEvent")
        ).withName("Event")
    ).withName("_INPUT_RECORD");
    public static MemoryLayout $LAYOUT() {
        return _INPUT_RECORD.$struct$LAYOUT;
    }
    static final VarHandle EventType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EventType"));
    public static VarHandle EventType$VH() {
        return _INPUT_RECORD.EventType$VH;
    }
    public static short EventType$get(MemorySegment seg) {
        return (short)_INPUT_RECORD.EventType$VH.get(seg);
    }
    public static void EventType$set( MemorySegment seg, short x) {
        _INPUT_RECORD.EventType$VH.set(seg, x);
    }
    public static short EventType$get(MemorySegment seg, long index) {
        return (short)_INPUT_RECORD.EventType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EventType$set(MemorySegment seg, long index, short x) {
        _INPUT_RECORD.EventType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class Event {

        static final  GroupLayout Event$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("bKeyDown"),
                Constants$root.C_SHORT$LAYOUT.withName("wRepeatCount"),
                Constants$root.C_SHORT$LAYOUT.withName("wVirtualKeyCode"),
                Constants$root.C_SHORT$LAYOUT.withName("wVirtualScanCode"),
                MemoryLayout.unionLayout(
                    Constants$root.C_SHORT$LAYOUT.withName("UnicodeChar"),
                    Constants$root.C_CHAR$LAYOUT.withName("AsciiChar")
                ).withName("uChar"),
                Constants$root.C_LONG$LAYOUT.withName("dwControlKeyState")
            ).withName("KeyEvent"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_SHORT$LAYOUT.withName("X"),
                    Constants$root.C_SHORT$LAYOUT.withName("Y")
                ).withName("dwMousePosition"),
                Constants$root.C_LONG$LAYOUT.withName("dwButtonState"),
                Constants$root.C_LONG$LAYOUT.withName("dwControlKeyState"),
                Constants$root.C_LONG$LAYOUT.withName("dwEventFlags")
            ).withName("MouseEvent"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_SHORT$LAYOUT.withName("X"),
                    Constants$root.C_SHORT$LAYOUT.withName("Y")
                ).withName("dwSize")
            ).withName("WindowBufferSizeEvent"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("dwCommandId")
            ).withName("MenuEvent"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("bSetFocus")
            ).withName("FocusEvent")
        );
        public static MemoryLayout $LAYOUT() {
            return Event.Event$union$LAYOUT;
        }
        public static MemorySegment KeyEvent$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static MemorySegment MouseEvent$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static MemorySegment WindowBufferSizeEvent$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static MemorySegment MenuEvent$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static MemorySegment FocusEvent$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment Event$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


