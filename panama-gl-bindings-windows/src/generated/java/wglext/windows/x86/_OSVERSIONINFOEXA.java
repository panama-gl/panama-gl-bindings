// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _OSVERSIONINFOEXA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwOSVersionInfoSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwMajorVersion"),
        Constants$root.C_LONG$LAYOUT.withName("dwMinorVersion"),
        Constants$root.C_LONG$LAYOUT.withName("dwBuildNumber"),
        Constants$root.C_LONG$LAYOUT.withName("dwPlatformId"),
        MemoryLayout.sequenceLayout(128, Constants$root.C_CHAR$LAYOUT).withName("szCSDVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("wServicePackMajor"),
        Constants$root.C_SHORT$LAYOUT.withName("wServicePackMinor"),
        Constants$root.C_SHORT$LAYOUT.withName("wSuiteMask"),
        Constants$root.C_CHAR$LAYOUT.withName("wProductType"),
        Constants$root.C_CHAR$LAYOUT.withName("wReserved")
    ).withName("_OSVERSIONINFOEXA");
    public static MemoryLayout $LAYOUT() {
        return _OSVERSIONINFOEXA.$struct$LAYOUT;
    }
    static final VarHandle dwOSVersionInfoSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwOSVersionInfoSize"));
    public static VarHandle dwOSVersionInfoSize$VH() {
        return _OSVERSIONINFOEXA.dwOSVersionInfoSize$VH;
    }
    public static int dwOSVersionInfoSize$get(MemorySegment seg) {
        return (int)_OSVERSIONINFOEXA.dwOSVersionInfoSize$VH.get(seg);
    }
    public static void dwOSVersionInfoSize$set( MemorySegment seg, int x) {
        _OSVERSIONINFOEXA.dwOSVersionInfoSize$VH.set(seg, x);
    }
    public static int dwOSVersionInfoSize$get(MemorySegment seg, long index) {
        return (int)_OSVERSIONINFOEXA.dwOSVersionInfoSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOSVersionInfoSize$set(MemorySegment seg, long index, int x) {
        _OSVERSIONINFOEXA.dwOSVersionInfoSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMajorVersion"));
    public static VarHandle dwMajorVersion$VH() {
        return _OSVERSIONINFOEXA.dwMajorVersion$VH;
    }
    public static int dwMajorVersion$get(MemorySegment seg) {
        return (int)_OSVERSIONINFOEXA.dwMajorVersion$VH.get(seg);
    }
    public static void dwMajorVersion$set( MemorySegment seg, int x) {
        _OSVERSIONINFOEXA.dwMajorVersion$VH.set(seg, x);
    }
    public static int dwMajorVersion$get(MemorySegment seg, long index) {
        return (int)_OSVERSIONINFOEXA.dwMajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMajorVersion$set(MemorySegment seg, long index, int x) {
        _OSVERSIONINFOEXA.dwMajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMinorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMinorVersion"));
    public static VarHandle dwMinorVersion$VH() {
        return _OSVERSIONINFOEXA.dwMinorVersion$VH;
    }
    public static int dwMinorVersion$get(MemorySegment seg) {
        return (int)_OSVERSIONINFOEXA.dwMinorVersion$VH.get(seg);
    }
    public static void dwMinorVersion$set( MemorySegment seg, int x) {
        _OSVERSIONINFOEXA.dwMinorVersion$VH.set(seg, x);
    }
    public static int dwMinorVersion$get(MemorySegment seg, long index) {
        return (int)_OSVERSIONINFOEXA.dwMinorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMinorVersion$set(MemorySegment seg, long index, int x) {
        _OSVERSIONINFOEXA.dwMinorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwBuildNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwBuildNumber"));
    public static VarHandle dwBuildNumber$VH() {
        return _OSVERSIONINFOEXA.dwBuildNumber$VH;
    }
    public static int dwBuildNumber$get(MemorySegment seg) {
        return (int)_OSVERSIONINFOEXA.dwBuildNumber$VH.get(seg);
    }
    public static void dwBuildNumber$set( MemorySegment seg, int x) {
        _OSVERSIONINFOEXA.dwBuildNumber$VH.set(seg, x);
    }
    public static int dwBuildNumber$get(MemorySegment seg, long index) {
        return (int)_OSVERSIONINFOEXA.dwBuildNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwBuildNumber$set(MemorySegment seg, long index, int x) {
        _OSVERSIONINFOEXA.dwBuildNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPlatformId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPlatformId"));
    public static VarHandle dwPlatformId$VH() {
        return _OSVERSIONINFOEXA.dwPlatformId$VH;
    }
    public static int dwPlatformId$get(MemorySegment seg) {
        return (int)_OSVERSIONINFOEXA.dwPlatformId$VH.get(seg);
    }
    public static void dwPlatformId$set( MemorySegment seg, int x) {
        _OSVERSIONINFOEXA.dwPlatformId$VH.set(seg, x);
    }
    public static int dwPlatformId$get(MemorySegment seg, long index) {
        return (int)_OSVERSIONINFOEXA.dwPlatformId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPlatformId$set(MemorySegment seg, long index, int x) {
        _OSVERSIONINFOEXA.dwPlatformId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szCSDVersion$slice(MemorySegment seg) {
        return seg.asSlice(20, 128);
    }
    static final VarHandle wServicePackMajor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wServicePackMajor"));
    public static VarHandle wServicePackMajor$VH() {
        return _OSVERSIONINFOEXA.wServicePackMajor$VH;
    }
    public static short wServicePackMajor$get(MemorySegment seg) {
        return (short)_OSVERSIONINFOEXA.wServicePackMajor$VH.get(seg);
    }
    public static void wServicePackMajor$set( MemorySegment seg, short x) {
        _OSVERSIONINFOEXA.wServicePackMajor$VH.set(seg, x);
    }
    public static short wServicePackMajor$get(MemorySegment seg, long index) {
        return (short)_OSVERSIONINFOEXA.wServicePackMajor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wServicePackMajor$set(MemorySegment seg, long index, short x) {
        _OSVERSIONINFOEXA.wServicePackMajor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wServicePackMinor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wServicePackMinor"));
    public static VarHandle wServicePackMinor$VH() {
        return _OSVERSIONINFOEXA.wServicePackMinor$VH;
    }
    public static short wServicePackMinor$get(MemorySegment seg) {
        return (short)_OSVERSIONINFOEXA.wServicePackMinor$VH.get(seg);
    }
    public static void wServicePackMinor$set( MemorySegment seg, short x) {
        _OSVERSIONINFOEXA.wServicePackMinor$VH.set(seg, x);
    }
    public static short wServicePackMinor$get(MemorySegment seg, long index) {
        return (short)_OSVERSIONINFOEXA.wServicePackMinor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wServicePackMinor$set(MemorySegment seg, long index, short x) {
        _OSVERSIONINFOEXA.wServicePackMinor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wSuiteMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wSuiteMask"));
    public static VarHandle wSuiteMask$VH() {
        return _OSVERSIONINFOEXA.wSuiteMask$VH;
    }
    public static short wSuiteMask$get(MemorySegment seg) {
        return (short)_OSVERSIONINFOEXA.wSuiteMask$VH.get(seg);
    }
    public static void wSuiteMask$set( MemorySegment seg, short x) {
        _OSVERSIONINFOEXA.wSuiteMask$VH.set(seg, x);
    }
    public static short wSuiteMask$get(MemorySegment seg, long index) {
        return (short)_OSVERSIONINFOEXA.wSuiteMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wSuiteMask$set(MemorySegment seg, long index, short x) {
        _OSVERSIONINFOEXA.wSuiteMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wProductType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wProductType"));
    public static VarHandle wProductType$VH() {
        return _OSVERSIONINFOEXA.wProductType$VH;
    }
    public static byte wProductType$get(MemorySegment seg) {
        return (byte)_OSVERSIONINFOEXA.wProductType$VH.get(seg);
    }
    public static void wProductType$set( MemorySegment seg, byte x) {
        _OSVERSIONINFOEXA.wProductType$VH.set(seg, x);
    }
    public static byte wProductType$get(MemorySegment seg, long index) {
        return (byte)_OSVERSIONINFOEXA.wProductType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wProductType$set(MemorySegment seg, long index, byte x) {
        _OSVERSIONINFOEXA.wProductType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wReserved"));
    public static VarHandle wReserved$VH() {
        return _OSVERSIONINFOEXA.wReserved$VH;
    }
    public static byte wReserved$get(MemorySegment seg) {
        return (byte)_OSVERSIONINFOEXA.wReserved$VH.get(seg);
    }
    public static void wReserved$set( MemorySegment seg, byte x) {
        _OSVERSIONINFOEXA.wReserved$VH.set(seg, x);
    }
    public static byte wReserved$get(MemorySegment seg, long index) {
        return (byte)_OSVERSIONINFOEXA.wReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved$set(MemorySegment seg, long index, byte x) {
        _OSVERSIONINFOEXA.wReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


