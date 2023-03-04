// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ENUM_SERVICE_STATUS_PROCESSA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("lpServiceName"),
        Constants$root.C_POINTER$LAYOUT.withName("lpDisplayName"),
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
        ).withName("ServiceStatusProcess"),
        MemoryLayout.paddingLayout(32)
    ).withName("_ENUM_SERVICE_STATUS_PROCESSA");
    public static MemoryLayout $LAYOUT() {
        return _ENUM_SERVICE_STATUS_PROCESSA.$struct$LAYOUT;
    }
    static final VarHandle lpServiceName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpServiceName"));
    public static VarHandle lpServiceName$VH() {
        return _ENUM_SERVICE_STATUS_PROCESSA.lpServiceName$VH;
    }
    public static MemoryAddress lpServiceName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_ENUM_SERVICE_STATUS_PROCESSA.lpServiceName$VH.get(seg);
    }
    public static void lpServiceName$set( MemorySegment seg, MemoryAddress x) {
        _ENUM_SERVICE_STATUS_PROCESSA.lpServiceName$VH.set(seg, x);
    }
    public static MemoryAddress lpServiceName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_ENUM_SERVICE_STATUS_PROCESSA.lpServiceName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpServiceName$set(MemorySegment seg, long index, MemoryAddress x) {
        _ENUM_SERVICE_STATUS_PROCESSA.lpServiceName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpDisplayName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpDisplayName"));
    public static VarHandle lpDisplayName$VH() {
        return _ENUM_SERVICE_STATUS_PROCESSA.lpDisplayName$VH;
    }
    public static MemoryAddress lpDisplayName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_ENUM_SERVICE_STATUS_PROCESSA.lpDisplayName$VH.get(seg);
    }
    public static void lpDisplayName$set( MemorySegment seg, MemoryAddress x) {
        _ENUM_SERVICE_STATUS_PROCESSA.lpDisplayName$VH.set(seg, x);
    }
    public static MemoryAddress lpDisplayName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_ENUM_SERVICE_STATUS_PROCESSA.lpDisplayName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpDisplayName$set(MemorySegment seg, long index, MemoryAddress x) {
        _ENUM_SERVICE_STATUS_PROCESSA.lpDisplayName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ServiceStatusProcess$slice(MemorySegment seg) {
        return seg.asSlice(16, 36);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


