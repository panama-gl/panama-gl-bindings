// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CONSOLE_READCONSOLE_CONTROL {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("nLength"),
        Constants$root.C_LONG$LAYOUT.withName("nInitialChars"),
        Constants$root.C_LONG$LAYOUT.withName("dwCtrlWakeupMask"),
        Constants$root.C_LONG$LAYOUT.withName("dwControlKeyState")
    ).withName("_CONSOLE_READCONSOLE_CONTROL");
    public static MemoryLayout $LAYOUT() {
        return _CONSOLE_READCONSOLE_CONTROL.$struct$LAYOUT;
    }
    static final VarHandle nLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nLength"));
    public static VarHandle nLength$VH() {
        return _CONSOLE_READCONSOLE_CONTROL.nLength$VH;
    }
    public static int nLength$get(MemorySegment seg) {
        return (int)_CONSOLE_READCONSOLE_CONTROL.nLength$VH.get(seg);
    }
    public static void nLength$set( MemorySegment seg, int x) {
        _CONSOLE_READCONSOLE_CONTROL.nLength$VH.set(seg, x);
    }
    public static int nLength$get(MemorySegment seg, long index) {
        return (int)_CONSOLE_READCONSOLE_CONTROL.nLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nLength$set(MemorySegment seg, long index, int x) {
        _CONSOLE_READCONSOLE_CONTROL.nLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nInitialChars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nInitialChars"));
    public static VarHandle nInitialChars$VH() {
        return _CONSOLE_READCONSOLE_CONTROL.nInitialChars$VH;
    }
    public static int nInitialChars$get(MemorySegment seg) {
        return (int)_CONSOLE_READCONSOLE_CONTROL.nInitialChars$VH.get(seg);
    }
    public static void nInitialChars$set( MemorySegment seg, int x) {
        _CONSOLE_READCONSOLE_CONTROL.nInitialChars$VH.set(seg, x);
    }
    public static int nInitialChars$get(MemorySegment seg, long index) {
        return (int)_CONSOLE_READCONSOLE_CONTROL.nInitialChars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nInitialChars$set(MemorySegment seg, long index, int x) {
        _CONSOLE_READCONSOLE_CONTROL.nInitialChars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCtrlWakeupMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCtrlWakeupMask"));
    public static VarHandle dwCtrlWakeupMask$VH() {
        return _CONSOLE_READCONSOLE_CONTROL.dwCtrlWakeupMask$VH;
    }
    public static int dwCtrlWakeupMask$get(MemorySegment seg) {
        return (int)_CONSOLE_READCONSOLE_CONTROL.dwCtrlWakeupMask$VH.get(seg);
    }
    public static void dwCtrlWakeupMask$set( MemorySegment seg, int x) {
        _CONSOLE_READCONSOLE_CONTROL.dwCtrlWakeupMask$VH.set(seg, x);
    }
    public static int dwCtrlWakeupMask$get(MemorySegment seg, long index) {
        return (int)_CONSOLE_READCONSOLE_CONTROL.dwCtrlWakeupMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCtrlWakeupMask$set(MemorySegment seg, long index, int x) {
        _CONSOLE_READCONSOLE_CONTROL.dwCtrlWakeupMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwControlKeyState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwControlKeyState"));
    public static VarHandle dwControlKeyState$VH() {
        return _CONSOLE_READCONSOLE_CONTROL.dwControlKeyState$VH;
    }
    public static int dwControlKeyState$get(MemorySegment seg) {
        return (int)_CONSOLE_READCONSOLE_CONTROL.dwControlKeyState$VH.get(seg);
    }
    public static void dwControlKeyState$set( MemorySegment seg, int x) {
        _CONSOLE_READCONSOLE_CONTROL.dwControlKeyState$VH.set(seg, x);
    }
    public static int dwControlKeyState$get(MemorySegment seg, long index) {
        return (int)_CONSOLE_READCONSOLE_CONTROL.dwControlKeyState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwControlKeyState$set(MemorySegment seg, long index, int x) {
        _CONSOLE_READCONSOLE_CONTROL.dwControlKeyState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


