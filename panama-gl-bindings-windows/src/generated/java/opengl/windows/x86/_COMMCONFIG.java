// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _COMMCONFIG {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwSize"),
        Constants$root.C_SHORT$LAYOUT.withName("wVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("wReserved"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("DCBlength"),
            Constants$root.C_LONG$LAYOUT.withName("BaudRate"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(1).withName("fBinary"),
                MemoryLayout.paddingLayout(1).withName("fParity"),
                MemoryLayout.paddingLayout(1).withName("fOutxCtsFlow"),
                MemoryLayout.paddingLayout(1).withName("fOutxDsrFlow"),
                MemoryLayout.paddingLayout(2).withName("fDtrControl"),
                MemoryLayout.paddingLayout(1).withName("fDsrSensitivity"),
                MemoryLayout.paddingLayout(1).withName("fTXContinueOnXoff"),
                MemoryLayout.paddingLayout(1).withName("fOutX"),
                MemoryLayout.paddingLayout(1).withName("fInX"),
                MemoryLayout.paddingLayout(1).withName("fErrorChar"),
                MemoryLayout.paddingLayout(1).withName("fNull"),
                MemoryLayout.paddingLayout(2).withName("fRtsControl"),
                MemoryLayout.paddingLayout(1).withName("fAbortOnError"),
                MemoryLayout.paddingLayout(17).withName("fDummy2")
            ),
            Constants$root.C_SHORT$LAYOUT.withName("wReserved"),
            Constants$root.C_SHORT$LAYOUT.withName("XonLim"),
            Constants$root.C_SHORT$LAYOUT.withName("XoffLim"),
            Constants$root.C_CHAR$LAYOUT.withName("ByteSize"),
            Constants$root.C_CHAR$LAYOUT.withName("Parity"),
            Constants$root.C_CHAR$LAYOUT.withName("StopBits"),
            Constants$root.C_CHAR$LAYOUT.withName("XonChar"),
            Constants$root.C_CHAR$LAYOUT.withName("XoffChar"),
            Constants$root.C_CHAR$LAYOUT.withName("ErrorChar"),
            Constants$root.C_CHAR$LAYOUT.withName("EofChar"),
            Constants$root.C_CHAR$LAYOUT.withName("EvtChar"),
            Constants$root.C_SHORT$LAYOUT.withName("wReserved1")
        ).withName("dcb"),
        Constants$root.C_LONG$LAYOUT.withName("dwProviderSubType"),
        Constants$root.C_LONG$LAYOUT.withName("dwProviderOffset"),
        Constants$root.C_LONG$LAYOUT.withName("dwProviderSize"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("wcProviderData"),
        MemoryLayout.paddingLayout(16)
    ).withName("_COMMCONFIG");
    public static MemoryLayout $LAYOUT() {
        return _COMMCONFIG.$struct$LAYOUT;
    }
    static final VarHandle dwSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSize"));
    public static VarHandle dwSize$VH() {
        return _COMMCONFIG.dwSize$VH;
    }
    public static int dwSize$get(MemorySegment seg) {
        return (int)_COMMCONFIG.dwSize$VH.get(seg);
    }
    public static void dwSize$set( MemorySegment seg, int x) {
        _COMMCONFIG.dwSize$VH.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)_COMMCONFIG.dwSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        _COMMCONFIG.dwSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wVersion"));
    public static VarHandle wVersion$VH() {
        return _COMMCONFIG.wVersion$VH;
    }
    public static short wVersion$get(MemorySegment seg) {
        return (short)_COMMCONFIG.wVersion$VH.get(seg);
    }
    public static void wVersion$set( MemorySegment seg, short x) {
        _COMMCONFIG.wVersion$VH.set(seg, x);
    }
    public static short wVersion$get(MemorySegment seg, long index) {
        return (short)_COMMCONFIG.wVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wVersion$set(MemorySegment seg, long index, short x) {
        _COMMCONFIG.wVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wReserved"));
    public static VarHandle wReserved$VH() {
        return _COMMCONFIG.wReserved$VH;
    }
    public static short wReserved$get(MemorySegment seg) {
        return (short)_COMMCONFIG.wReserved$VH.get(seg);
    }
    public static void wReserved$set( MemorySegment seg, short x) {
        _COMMCONFIG.wReserved$VH.set(seg, x);
    }
    public static short wReserved$get(MemorySegment seg, long index) {
        return (short)_COMMCONFIG.wReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved$set(MemorySegment seg, long index, short x) {
        _COMMCONFIG.wReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment dcb$slice(MemorySegment seg) {
        return seg.asSlice(8, 28);
    }
    static final VarHandle dwProviderSubType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwProviderSubType"));
    public static VarHandle dwProviderSubType$VH() {
        return _COMMCONFIG.dwProviderSubType$VH;
    }
    public static int dwProviderSubType$get(MemorySegment seg) {
        return (int)_COMMCONFIG.dwProviderSubType$VH.get(seg);
    }
    public static void dwProviderSubType$set( MemorySegment seg, int x) {
        _COMMCONFIG.dwProviderSubType$VH.set(seg, x);
    }
    public static int dwProviderSubType$get(MemorySegment seg, long index) {
        return (int)_COMMCONFIG.dwProviderSubType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProviderSubType$set(MemorySegment seg, long index, int x) {
        _COMMCONFIG.dwProviderSubType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProviderOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwProviderOffset"));
    public static VarHandle dwProviderOffset$VH() {
        return _COMMCONFIG.dwProviderOffset$VH;
    }
    public static int dwProviderOffset$get(MemorySegment seg) {
        return (int)_COMMCONFIG.dwProviderOffset$VH.get(seg);
    }
    public static void dwProviderOffset$set( MemorySegment seg, int x) {
        _COMMCONFIG.dwProviderOffset$VH.set(seg, x);
    }
    public static int dwProviderOffset$get(MemorySegment seg, long index) {
        return (int)_COMMCONFIG.dwProviderOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProviderOffset$set(MemorySegment seg, long index, int x) {
        _COMMCONFIG.dwProviderOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProviderSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwProviderSize"));
    public static VarHandle dwProviderSize$VH() {
        return _COMMCONFIG.dwProviderSize$VH;
    }
    public static int dwProviderSize$get(MemorySegment seg) {
        return (int)_COMMCONFIG.dwProviderSize$VH.get(seg);
    }
    public static void dwProviderSize$set( MemorySegment seg, int x) {
        _COMMCONFIG.dwProviderSize$VH.set(seg, x);
    }
    public static int dwProviderSize$get(MemorySegment seg, long index) {
        return (int)_COMMCONFIG.dwProviderSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProviderSize$set(MemorySegment seg, long index, int x) {
        _COMMCONFIG.dwProviderSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment wcProviderData$slice(MemorySegment seg) {
        return seg.asSlice(48, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


