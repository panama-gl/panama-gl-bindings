// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _NOTIFYICONDATAW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hWnd"),
        Constants$root.C_LONG$LAYOUT.withName("uID"),
        Constants$root.C_LONG$LAYOUT.withName("uFlags"),
        Constants$root.C_LONG$LAYOUT.withName("uCallbackMessage"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hIcon"),
        MemoryLayout.sequenceLayout(128, Constants$root.C_SHORT$LAYOUT).withName("szTip"),
        Constants$root.C_LONG$LAYOUT.withName("dwState"),
        Constants$root.C_LONG$LAYOUT.withName("dwStateMask"),
        MemoryLayout.sequenceLayout(256, Constants$root.C_SHORT$LAYOUT).withName("szInfo"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("uTimeout"),
            Constants$root.C_LONG$LAYOUT.withName("uVersion")
        ).withName("$anon$0"),
        MemoryLayout.sequenceLayout(64, Constants$root.C_SHORT$LAYOUT).withName("szInfoTitle"),
        Constants$root.C_LONG$LAYOUT.withName("dwInfoFlags"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("guidItem"),
        Constants$root.C_POINTER$LAYOUT.withName("hBalloonIcon")
    ).withName("_NOTIFYICONDATAW");
    public static MemoryLayout $LAYOUT() {
        return _NOTIFYICONDATAW.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _NOTIFYICONDATAW.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_NOTIFYICONDATAW.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _NOTIFYICONDATAW.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_NOTIFYICONDATAW.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _NOTIFYICONDATAW.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hWnd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hWnd"));
    public static VarHandle hWnd$VH() {
        return _NOTIFYICONDATAW.hWnd$VH;
    }
    public static MemoryAddress hWnd$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_NOTIFYICONDATAW.hWnd$VH.get(seg);
    }
    public static void hWnd$set( MemorySegment seg, MemoryAddress x) {
        _NOTIFYICONDATAW.hWnd$VH.set(seg, x);
    }
    public static MemoryAddress hWnd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_NOTIFYICONDATAW.hWnd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hWnd$set(MemorySegment seg, long index, MemoryAddress x) {
        _NOTIFYICONDATAW.hWnd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uID"));
    public static VarHandle uID$VH() {
        return _NOTIFYICONDATAW.uID$VH;
    }
    public static int uID$get(MemorySegment seg) {
        return (int)_NOTIFYICONDATAW.uID$VH.get(seg);
    }
    public static void uID$set( MemorySegment seg, int x) {
        _NOTIFYICONDATAW.uID$VH.set(seg, x);
    }
    public static int uID$get(MemorySegment seg, long index) {
        return (int)_NOTIFYICONDATAW.uID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uID$set(MemorySegment seg, long index, int x) {
        _NOTIFYICONDATAW.uID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uFlags"));
    public static VarHandle uFlags$VH() {
        return _NOTIFYICONDATAW.uFlags$VH;
    }
    public static int uFlags$get(MemorySegment seg) {
        return (int)_NOTIFYICONDATAW.uFlags$VH.get(seg);
    }
    public static void uFlags$set( MemorySegment seg, int x) {
        _NOTIFYICONDATAW.uFlags$VH.set(seg, x);
    }
    public static int uFlags$get(MemorySegment seg, long index) {
        return (int)_NOTIFYICONDATAW.uFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uFlags$set(MemorySegment seg, long index, int x) {
        _NOTIFYICONDATAW.uFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uCallbackMessage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uCallbackMessage"));
    public static VarHandle uCallbackMessage$VH() {
        return _NOTIFYICONDATAW.uCallbackMessage$VH;
    }
    public static int uCallbackMessage$get(MemorySegment seg) {
        return (int)_NOTIFYICONDATAW.uCallbackMessage$VH.get(seg);
    }
    public static void uCallbackMessage$set( MemorySegment seg, int x) {
        _NOTIFYICONDATAW.uCallbackMessage$VH.set(seg, x);
    }
    public static int uCallbackMessage$get(MemorySegment seg, long index) {
        return (int)_NOTIFYICONDATAW.uCallbackMessage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uCallbackMessage$set(MemorySegment seg, long index, int x) {
        _NOTIFYICONDATAW.uCallbackMessage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hIcon$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hIcon"));
    public static VarHandle hIcon$VH() {
        return _NOTIFYICONDATAW.hIcon$VH;
    }
    public static MemoryAddress hIcon$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_NOTIFYICONDATAW.hIcon$VH.get(seg);
    }
    public static void hIcon$set( MemorySegment seg, MemoryAddress x) {
        _NOTIFYICONDATAW.hIcon$VH.set(seg, x);
    }
    public static MemoryAddress hIcon$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_NOTIFYICONDATAW.hIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hIcon$set(MemorySegment seg, long index, MemoryAddress x) {
        _NOTIFYICONDATAW.hIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szTip$slice(MemorySegment seg) {
        return seg.asSlice(40, 256);
    }
    static final VarHandle dwState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwState"));
    public static VarHandle dwState$VH() {
        return _NOTIFYICONDATAW.dwState$VH;
    }
    public static int dwState$get(MemorySegment seg) {
        return (int)_NOTIFYICONDATAW.dwState$VH.get(seg);
    }
    public static void dwState$set( MemorySegment seg, int x) {
        _NOTIFYICONDATAW.dwState$VH.set(seg, x);
    }
    public static int dwState$get(MemorySegment seg, long index) {
        return (int)_NOTIFYICONDATAW.dwState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwState$set(MemorySegment seg, long index, int x) {
        _NOTIFYICONDATAW.dwState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwStateMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStateMask"));
    public static VarHandle dwStateMask$VH() {
        return _NOTIFYICONDATAW.dwStateMask$VH;
    }
    public static int dwStateMask$get(MemorySegment seg) {
        return (int)_NOTIFYICONDATAW.dwStateMask$VH.get(seg);
    }
    public static void dwStateMask$set( MemorySegment seg, int x) {
        _NOTIFYICONDATAW.dwStateMask$VH.set(seg, x);
    }
    public static int dwStateMask$get(MemorySegment seg, long index) {
        return (int)_NOTIFYICONDATAW.dwStateMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStateMask$set(MemorySegment seg, long index, int x) {
        _NOTIFYICONDATAW.dwStateMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szInfo$slice(MemorySegment seg) {
        return seg.asSlice(304, 512);
    }
    static final VarHandle uTimeout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("uTimeout"));
    public static VarHandle uTimeout$VH() {
        return _NOTIFYICONDATAW.uTimeout$VH;
    }
    public static int uTimeout$get(MemorySegment seg) {
        return (int)_NOTIFYICONDATAW.uTimeout$VH.get(seg);
    }
    public static void uTimeout$set( MemorySegment seg, int x) {
        _NOTIFYICONDATAW.uTimeout$VH.set(seg, x);
    }
    public static int uTimeout$get(MemorySegment seg, long index) {
        return (int)_NOTIFYICONDATAW.uTimeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uTimeout$set(MemorySegment seg, long index, int x) {
        _NOTIFYICONDATAW.uTimeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("uVersion"));
    public static VarHandle uVersion$VH() {
        return _NOTIFYICONDATAW.uVersion$VH;
    }
    public static int uVersion$get(MemorySegment seg) {
        return (int)_NOTIFYICONDATAW.uVersion$VH.get(seg);
    }
    public static void uVersion$set( MemorySegment seg, int x) {
        _NOTIFYICONDATAW.uVersion$VH.set(seg, x);
    }
    public static int uVersion$get(MemorySegment seg, long index) {
        return (int)_NOTIFYICONDATAW.uVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uVersion$set(MemorySegment seg, long index, int x) {
        _NOTIFYICONDATAW.uVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szInfoTitle$slice(MemorySegment seg) {
        return seg.asSlice(820, 128);
    }
    static final VarHandle dwInfoFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwInfoFlags"));
    public static VarHandle dwInfoFlags$VH() {
        return _NOTIFYICONDATAW.dwInfoFlags$VH;
    }
    public static int dwInfoFlags$get(MemorySegment seg) {
        return (int)_NOTIFYICONDATAW.dwInfoFlags$VH.get(seg);
    }
    public static void dwInfoFlags$set( MemorySegment seg, int x) {
        _NOTIFYICONDATAW.dwInfoFlags$VH.set(seg, x);
    }
    public static int dwInfoFlags$get(MemorySegment seg, long index) {
        return (int)_NOTIFYICONDATAW.dwInfoFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwInfoFlags$set(MemorySegment seg, long index, int x) {
        _NOTIFYICONDATAW.dwInfoFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment guidItem$slice(MemorySegment seg) {
        return seg.asSlice(952, 16);
    }
    static final VarHandle hBalloonIcon$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hBalloonIcon"));
    public static VarHandle hBalloonIcon$VH() {
        return _NOTIFYICONDATAW.hBalloonIcon$VH;
    }
    public static MemoryAddress hBalloonIcon$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_NOTIFYICONDATAW.hBalloonIcon$VH.get(seg);
    }
    public static void hBalloonIcon$set( MemorySegment seg, MemoryAddress x) {
        _NOTIFYICONDATAW.hBalloonIcon$VH.set(seg, x);
    }
    public static MemoryAddress hBalloonIcon$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_NOTIFYICONDATAW.hBalloonIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hBalloonIcon$set(MemorySegment seg, long index, MemoryAddress x) {
        _NOTIFYICONDATAW.hBalloonIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


