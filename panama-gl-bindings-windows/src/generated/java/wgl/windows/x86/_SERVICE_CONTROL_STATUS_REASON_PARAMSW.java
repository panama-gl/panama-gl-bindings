// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SERVICE_CONTROL_STATUS_REASON_PARAMSW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwReason"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pszComment"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwServiceType"),
            Constants$root.C_LONG$LAYOUT.withName("dwCurrentState"),
            Constants$root.C_LONG$LAYOUT.withName("dwControlsAccepted"),
            Constants$root.C_LONG$LAYOUT.withName("dwWin32ExitCode"),
            Constants$root.C_LONG$LAYOUT.withName("dwServiceSpecificExitCode"),
            Constants$root.C_LONG$LAYOUT.withName("dwCheckPoint"),
            Constants$root.C_LONG$LAYOUT.withName("dwWaitHint"),
            Constants$root.C_LONG$LAYOUT.withName("dwProcessId"),
            Constants$root.C_LONG$LAYOUT.withName("dwServiceFlags")
        ).withName("ServiceStatus"),
        MemoryLayout.paddingLayout(32)
    ).withName("_SERVICE_CONTROL_STATUS_REASON_PARAMSW");
    public static MemoryLayout $LAYOUT() {
        return _SERVICE_CONTROL_STATUS_REASON_PARAMSW.$struct$LAYOUT;
    }
    static final VarHandle dwReason$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReason"));
    public static VarHandle dwReason$VH() {
        return _SERVICE_CONTROL_STATUS_REASON_PARAMSW.dwReason$VH;
    }
    public static int dwReason$get(MemorySegment seg) {
        return (int)_SERVICE_CONTROL_STATUS_REASON_PARAMSW.dwReason$VH.get(seg);
    }
    public static void dwReason$set( MemorySegment seg, int x) {
        _SERVICE_CONTROL_STATUS_REASON_PARAMSW.dwReason$VH.set(seg, x);
    }
    public static int dwReason$get(MemorySegment seg, long index) {
        return (int)_SERVICE_CONTROL_STATUS_REASON_PARAMSW.dwReason$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReason$set(MemorySegment seg, long index, int x) {
        _SERVICE_CONTROL_STATUS_REASON_PARAMSW.dwReason$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszComment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszComment"));
    public static VarHandle pszComment$VH() {
        return _SERVICE_CONTROL_STATUS_REASON_PARAMSW.pszComment$VH;
    }
    public static MemoryAddress pszComment$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_CONTROL_STATUS_REASON_PARAMSW.pszComment$VH.get(seg);
    }
    public static void pszComment$set( MemorySegment seg, MemoryAddress x) {
        _SERVICE_CONTROL_STATUS_REASON_PARAMSW.pszComment$VH.set(seg, x);
    }
    public static MemoryAddress pszComment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_CONTROL_STATUS_REASON_PARAMSW.pszComment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszComment$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVICE_CONTROL_STATUS_REASON_PARAMSW.pszComment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ServiceStatus$slice(MemorySegment seg) {
        return seg.asSlice(16, 36);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


