// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STARTUPINFOW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cb"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpReserved"),
        Constants$root.C_POINTER$LAYOUT.withName("lpDesktop"),
        Constants$root.C_POINTER$LAYOUT.withName("lpTitle"),
        Constants$root.C_LONG$LAYOUT.withName("dwX"),
        Constants$root.C_LONG$LAYOUT.withName("dwY"),
        Constants$root.C_LONG$LAYOUT.withName("dwXSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwYSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwXCountChars"),
        Constants$root.C_LONG$LAYOUT.withName("dwYCountChars"),
        Constants$root.C_LONG$LAYOUT.withName("dwFillAttribute"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_SHORT$LAYOUT.withName("wShowWindow"),
        Constants$root.C_SHORT$LAYOUT.withName("cbReserved2"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpReserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("hStdInput"),
        Constants$root.C_POINTER$LAYOUT.withName("hStdOutput"),
        Constants$root.C_POINTER$LAYOUT.withName("hStdError")
    ).withName("_STARTUPINFOW");
    public static MemoryLayout $LAYOUT() {
        return _STARTUPINFOW.$struct$LAYOUT;
    }
    static final VarHandle cb$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cb"));
    public static VarHandle cb$VH() {
        return _STARTUPINFOW.cb$VH;
    }
    public static int cb$get(MemorySegment seg) {
        return (int)_STARTUPINFOW.cb$VH.get(seg);
    }
    public static void cb$set( MemorySegment seg, int x) {
        _STARTUPINFOW.cb$VH.set(seg, x);
    }
    public static int cb$get(MemorySegment seg, long index) {
        return (int)_STARTUPINFOW.cb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cb$set(MemorySegment seg, long index, int x) {
        _STARTUPINFOW.cb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpReserved"));
    public static VarHandle lpReserved$VH() {
        return _STARTUPINFOW.lpReserved$VH;
    }
    public static MemoryAddress lpReserved$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_STARTUPINFOW.lpReserved$VH.get(seg);
    }
    public static void lpReserved$set( MemorySegment seg, MemoryAddress x) {
        _STARTUPINFOW.lpReserved$VH.set(seg, x);
    }
    public static MemoryAddress lpReserved$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_STARTUPINFOW.lpReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpReserved$set(MemorySegment seg, long index, MemoryAddress x) {
        _STARTUPINFOW.lpReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpDesktop$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpDesktop"));
    public static VarHandle lpDesktop$VH() {
        return _STARTUPINFOW.lpDesktop$VH;
    }
    public static MemoryAddress lpDesktop$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_STARTUPINFOW.lpDesktop$VH.get(seg);
    }
    public static void lpDesktop$set( MemorySegment seg, MemoryAddress x) {
        _STARTUPINFOW.lpDesktop$VH.set(seg, x);
    }
    public static MemoryAddress lpDesktop$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_STARTUPINFOW.lpDesktop$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpDesktop$set(MemorySegment seg, long index, MemoryAddress x) {
        _STARTUPINFOW.lpDesktop$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpTitle"));
    public static VarHandle lpTitle$VH() {
        return _STARTUPINFOW.lpTitle$VH;
    }
    public static MemoryAddress lpTitle$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_STARTUPINFOW.lpTitle$VH.get(seg);
    }
    public static void lpTitle$set( MemorySegment seg, MemoryAddress x) {
        _STARTUPINFOW.lpTitle$VH.set(seg, x);
    }
    public static MemoryAddress lpTitle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_STARTUPINFOW.lpTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpTitle$set(MemorySegment seg, long index, MemoryAddress x) {
        _STARTUPINFOW.lpTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwX$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwX"));
    public static VarHandle dwX$VH() {
        return _STARTUPINFOW.dwX$VH;
    }
    public static int dwX$get(MemorySegment seg) {
        return (int)_STARTUPINFOW.dwX$VH.get(seg);
    }
    public static void dwX$set( MemorySegment seg, int x) {
        _STARTUPINFOW.dwX$VH.set(seg, x);
    }
    public static int dwX$get(MemorySegment seg, long index) {
        return (int)_STARTUPINFOW.dwX$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwX$set(MemorySegment seg, long index, int x) {
        _STARTUPINFOW.dwX$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwY$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwY"));
    public static VarHandle dwY$VH() {
        return _STARTUPINFOW.dwY$VH;
    }
    public static int dwY$get(MemorySegment seg) {
        return (int)_STARTUPINFOW.dwY$VH.get(seg);
    }
    public static void dwY$set( MemorySegment seg, int x) {
        _STARTUPINFOW.dwY$VH.set(seg, x);
    }
    public static int dwY$get(MemorySegment seg, long index) {
        return (int)_STARTUPINFOW.dwY$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwY$set(MemorySegment seg, long index, int x) {
        _STARTUPINFOW.dwY$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwXSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwXSize"));
    public static VarHandle dwXSize$VH() {
        return _STARTUPINFOW.dwXSize$VH;
    }
    public static int dwXSize$get(MemorySegment seg) {
        return (int)_STARTUPINFOW.dwXSize$VH.get(seg);
    }
    public static void dwXSize$set( MemorySegment seg, int x) {
        _STARTUPINFOW.dwXSize$VH.set(seg, x);
    }
    public static int dwXSize$get(MemorySegment seg, long index) {
        return (int)_STARTUPINFOW.dwXSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwXSize$set(MemorySegment seg, long index, int x) {
        _STARTUPINFOW.dwXSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwYSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwYSize"));
    public static VarHandle dwYSize$VH() {
        return _STARTUPINFOW.dwYSize$VH;
    }
    public static int dwYSize$get(MemorySegment seg) {
        return (int)_STARTUPINFOW.dwYSize$VH.get(seg);
    }
    public static void dwYSize$set( MemorySegment seg, int x) {
        _STARTUPINFOW.dwYSize$VH.set(seg, x);
    }
    public static int dwYSize$get(MemorySegment seg, long index) {
        return (int)_STARTUPINFOW.dwYSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwYSize$set(MemorySegment seg, long index, int x) {
        _STARTUPINFOW.dwYSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwXCountChars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwXCountChars"));
    public static VarHandle dwXCountChars$VH() {
        return _STARTUPINFOW.dwXCountChars$VH;
    }
    public static int dwXCountChars$get(MemorySegment seg) {
        return (int)_STARTUPINFOW.dwXCountChars$VH.get(seg);
    }
    public static void dwXCountChars$set( MemorySegment seg, int x) {
        _STARTUPINFOW.dwXCountChars$VH.set(seg, x);
    }
    public static int dwXCountChars$get(MemorySegment seg, long index) {
        return (int)_STARTUPINFOW.dwXCountChars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwXCountChars$set(MemorySegment seg, long index, int x) {
        _STARTUPINFOW.dwXCountChars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwYCountChars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwYCountChars"));
    public static VarHandle dwYCountChars$VH() {
        return _STARTUPINFOW.dwYCountChars$VH;
    }
    public static int dwYCountChars$get(MemorySegment seg) {
        return (int)_STARTUPINFOW.dwYCountChars$VH.get(seg);
    }
    public static void dwYCountChars$set( MemorySegment seg, int x) {
        _STARTUPINFOW.dwYCountChars$VH.set(seg, x);
    }
    public static int dwYCountChars$get(MemorySegment seg, long index) {
        return (int)_STARTUPINFOW.dwYCountChars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwYCountChars$set(MemorySegment seg, long index, int x) {
        _STARTUPINFOW.dwYCountChars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFillAttribute$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFillAttribute"));
    public static VarHandle dwFillAttribute$VH() {
        return _STARTUPINFOW.dwFillAttribute$VH;
    }
    public static int dwFillAttribute$get(MemorySegment seg) {
        return (int)_STARTUPINFOW.dwFillAttribute$VH.get(seg);
    }
    public static void dwFillAttribute$set( MemorySegment seg, int x) {
        _STARTUPINFOW.dwFillAttribute$VH.set(seg, x);
    }
    public static int dwFillAttribute$get(MemorySegment seg, long index) {
        return (int)_STARTUPINFOW.dwFillAttribute$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFillAttribute$set(MemorySegment seg, long index, int x) {
        _STARTUPINFOW.dwFillAttribute$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _STARTUPINFOW.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_STARTUPINFOW.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _STARTUPINFOW.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_STARTUPINFOW.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _STARTUPINFOW.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wShowWindow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wShowWindow"));
    public static VarHandle wShowWindow$VH() {
        return _STARTUPINFOW.wShowWindow$VH;
    }
    public static short wShowWindow$get(MemorySegment seg) {
        return (short)_STARTUPINFOW.wShowWindow$VH.get(seg);
    }
    public static void wShowWindow$set( MemorySegment seg, short x) {
        _STARTUPINFOW.wShowWindow$VH.set(seg, x);
    }
    public static short wShowWindow$get(MemorySegment seg, long index) {
        return (short)_STARTUPINFOW.wShowWindow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wShowWindow$set(MemorySegment seg, long index, short x) {
        _STARTUPINFOW.wShowWindow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbReserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbReserved2"));
    public static VarHandle cbReserved2$VH() {
        return _STARTUPINFOW.cbReserved2$VH;
    }
    public static short cbReserved2$get(MemorySegment seg) {
        return (short)_STARTUPINFOW.cbReserved2$VH.get(seg);
    }
    public static void cbReserved2$set( MemorySegment seg, short x) {
        _STARTUPINFOW.cbReserved2$VH.set(seg, x);
    }
    public static short cbReserved2$get(MemorySegment seg, long index) {
        return (short)_STARTUPINFOW.cbReserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbReserved2$set(MemorySegment seg, long index, short x) {
        _STARTUPINFOW.cbReserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpReserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpReserved2"));
    public static VarHandle lpReserved2$VH() {
        return _STARTUPINFOW.lpReserved2$VH;
    }
    public static MemoryAddress lpReserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_STARTUPINFOW.lpReserved2$VH.get(seg);
    }
    public static void lpReserved2$set( MemorySegment seg, MemoryAddress x) {
        _STARTUPINFOW.lpReserved2$VH.set(seg, x);
    }
    public static MemoryAddress lpReserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_STARTUPINFOW.lpReserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpReserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _STARTUPINFOW.lpReserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hStdInput$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hStdInput"));
    public static VarHandle hStdInput$VH() {
        return _STARTUPINFOW.hStdInput$VH;
    }
    public static MemoryAddress hStdInput$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_STARTUPINFOW.hStdInput$VH.get(seg);
    }
    public static void hStdInput$set( MemorySegment seg, MemoryAddress x) {
        _STARTUPINFOW.hStdInput$VH.set(seg, x);
    }
    public static MemoryAddress hStdInput$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_STARTUPINFOW.hStdInput$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hStdInput$set(MemorySegment seg, long index, MemoryAddress x) {
        _STARTUPINFOW.hStdInput$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hStdOutput$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hStdOutput"));
    public static VarHandle hStdOutput$VH() {
        return _STARTUPINFOW.hStdOutput$VH;
    }
    public static MemoryAddress hStdOutput$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_STARTUPINFOW.hStdOutput$VH.get(seg);
    }
    public static void hStdOutput$set( MemorySegment seg, MemoryAddress x) {
        _STARTUPINFOW.hStdOutput$VH.set(seg, x);
    }
    public static MemoryAddress hStdOutput$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_STARTUPINFOW.hStdOutput$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hStdOutput$set(MemorySegment seg, long index, MemoryAddress x) {
        _STARTUPINFOW.hStdOutput$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hStdError$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hStdError"));
    public static VarHandle hStdError$VH() {
        return _STARTUPINFOW.hStdError$VH;
    }
    public static MemoryAddress hStdError$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_STARTUPINFOW.hStdError$VH.get(seg);
    }
    public static void hStdError$set( MemorySegment seg, MemoryAddress x) {
        _STARTUPINFOW.hStdError$VH.set(seg, x);
    }
    public static MemoryAddress hStdError$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_STARTUPINFOW.hStdError$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hStdError$set(MemorySegment seg, long index, MemoryAddress x) {
        _STARTUPINFOW.hStdError$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


