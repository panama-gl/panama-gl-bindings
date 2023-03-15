// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _QUERY_SERVICE_CONFIGA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwServiceType"),
        Constants$root.C_LONG$LAYOUT.withName("dwStartType"),
        Constants$root.C_LONG$LAYOUT.withName("dwErrorControl"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpBinaryPathName"),
        Constants$root.C_POINTER$LAYOUT.withName("lpLoadOrderGroup"),
        Constants$root.C_LONG$LAYOUT.withName("dwTagId"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpDependencies"),
        Constants$root.C_POINTER$LAYOUT.withName("lpServiceStartName"),
        Constants$root.C_POINTER$LAYOUT.withName("lpDisplayName")
    ).withName("_QUERY_SERVICE_CONFIGA");
    public static MemoryLayout $LAYOUT() {
        return _QUERY_SERVICE_CONFIGA.$struct$LAYOUT;
    }
    static final VarHandle dwServiceType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwServiceType"));
    public static VarHandle dwServiceType$VH() {
        return _QUERY_SERVICE_CONFIGA.dwServiceType$VH;
    }
    public static int dwServiceType$get(MemorySegment seg) {
        return (int)_QUERY_SERVICE_CONFIGA.dwServiceType$VH.get(seg);
    }
    public static void dwServiceType$set( MemorySegment seg, int x) {
        _QUERY_SERVICE_CONFIGA.dwServiceType$VH.set(seg, x);
    }
    public static int dwServiceType$get(MemorySegment seg, long index) {
        return (int)_QUERY_SERVICE_CONFIGA.dwServiceType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwServiceType$set(MemorySegment seg, long index, int x) {
        _QUERY_SERVICE_CONFIGA.dwServiceType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwStartType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStartType"));
    public static VarHandle dwStartType$VH() {
        return _QUERY_SERVICE_CONFIGA.dwStartType$VH;
    }
    public static int dwStartType$get(MemorySegment seg) {
        return (int)_QUERY_SERVICE_CONFIGA.dwStartType$VH.get(seg);
    }
    public static void dwStartType$set( MemorySegment seg, int x) {
        _QUERY_SERVICE_CONFIGA.dwStartType$VH.set(seg, x);
    }
    public static int dwStartType$get(MemorySegment seg, long index) {
        return (int)_QUERY_SERVICE_CONFIGA.dwStartType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStartType$set(MemorySegment seg, long index, int x) {
        _QUERY_SERVICE_CONFIGA.dwStartType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwErrorControl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwErrorControl"));
    public static VarHandle dwErrorControl$VH() {
        return _QUERY_SERVICE_CONFIGA.dwErrorControl$VH;
    }
    public static int dwErrorControl$get(MemorySegment seg) {
        return (int)_QUERY_SERVICE_CONFIGA.dwErrorControl$VH.get(seg);
    }
    public static void dwErrorControl$set( MemorySegment seg, int x) {
        _QUERY_SERVICE_CONFIGA.dwErrorControl$VH.set(seg, x);
    }
    public static int dwErrorControl$get(MemorySegment seg, long index) {
        return (int)_QUERY_SERVICE_CONFIGA.dwErrorControl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwErrorControl$set(MemorySegment seg, long index, int x) {
        _QUERY_SERVICE_CONFIGA.dwErrorControl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpBinaryPathName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpBinaryPathName"));
    public static VarHandle lpBinaryPathName$VH() {
        return _QUERY_SERVICE_CONFIGA.lpBinaryPathName$VH;
    }
    public static MemoryAddress lpBinaryPathName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_QUERY_SERVICE_CONFIGA.lpBinaryPathName$VH.get(seg);
    }
    public static void lpBinaryPathName$set( MemorySegment seg, MemoryAddress x) {
        _QUERY_SERVICE_CONFIGA.lpBinaryPathName$VH.set(seg, x);
    }
    public static MemoryAddress lpBinaryPathName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_QUERY_SERVICE_CONFIGA.lpBinaryPathName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpBinaryPathName$set(MemorySegment seg, long index, MemoryAddress x) {
        _QUERY_SERVICE_CONFIGA.lpBinaryPathName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpLoadOrderGroup$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpLoadOrderGroup"));
    public static VarHandle lpLoadOrderGroup$VH() {
        return _QUERY_SERVICE_CONFIGA.lpLoadOrderGroup$VH;
    }
    public static MemoryAddress lpLoadOrderGroup$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_QUERY_SERVICE_CONFIGA.lpLoadOrderGroup$VH.get(seg);
    }
    public static void lpLoadOrderGroup$set( MemorySegment seg, MemoryAddress x) {
        _QUERY_SERVICE_CONFIGA.lpLoadOrderGroup$VH.set(seg, x);
    }
    public static MemoryAddress lpLoadOrderGroup$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_QUERY_SERVICE_CONFIGA.lpLoadOrderGroup$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpLoadOrderGroup$set(MemorySegment seg, long index, MemoryAddress x) {
        _QUERY_SERVICE_CONFIGA.lpLoadOrderGroup$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTagId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTagId"));
    public static VarHandle dwTagId$VH() {
        return _QUERY_SERVICE_CONFIGA.dwTagId$VH;
    }
    public static int dwTagId$get(MemorySegment seg) {
        return (int)_QUERY_SERVICE_CONFIGA.dwTagId$VH.get(seg);
    }
    public static void dwTagId$set( MemorySegment seg, int x) {
        _QUERY_SERVICE_CONFIGA.dwTagId$VH.set(seg, x);
    }
    public static int dwTagId$get(MemorySegment seg, long index) {
        return (int)_QUERY_SERVICE_CONFIGA.dwTagId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTagId$set(MemorySegment seg, long index, int x) {
        _QUERY_SERVICE_CONFIGA.dwTagId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpDependencies$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpDependencies"));
    public static VarHandle lpDependencies$VH() {
        return _QUERY_SERVICE_CONFIGA.lpDependencies$VH;
    }
    public static MemoryAddress lpDependencies$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_QUERY_SERVICE_CONFIGA.lpDependencies$VH.get(seg);
    }
    public static void lpDependencies$set( MemorySegment seg, MemoryAddress x) {
        _QUERY_SERVICE_CONFIGA.lpDependencies$VH.set(seg, x);
    }
    public static MemoryAddress lpDependencies$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_QUERY_SERVICE_CONFIGA.lpDependencies$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpDependencies$set(MemorySegment seg, long index, MemoryAddress x) {
        _QUERY_SERVICE_CONFIGA.lpDependencies$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpServiceStartName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpServiceStartName"));
    public static VarHandle lpServiceStartName$VH() {
        return _QUERY_SERVICE_CONFIGA.lpServiceStartName$VH;
    }
    public static MemoryAddress lpServiceStartName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_QUERY_SERVICE_CONFIGA.lpServiceStartName$VH.get(seg);
    }
    public static void lpServiceStartName$set( MemorySegment seg, MemoryAddress x) {
        _QUERY_SERVICE_CONFIGA.lpServiceStartName$VH.set(seg, x);
    }
    public static MemoryAddress lpServiceStartName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_QUERY_SERVICE_CONFIGA.lpServiceStartName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpServiceStartName$set(MemorySegment seg, long index, MemoryAddress x) {
        _QUERY_SERVICE_CONFIGA.lpServiceStartName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpDisplayName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpDisplayName"));
    public static VarHandle lpDisplayName$VH() {
        return _QUERY_SERVICE_CONFIGA.lpDisplayName$VH;
    }
    public static MemoryAddress lpDisplayName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_QUERY_SERVICE_CONFIGA.lpDisplayName$VH.get(seg);
    }
    public static void lpDisplayName$set( MemorySegment seg, MemoryAddress x) {
        _QUERY_SERVICE_CONFIGA.lpDisplayName$VH.set(seg, x);
    }
    public static MemoryAddress lpDisplayName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_QUERY_SERVICE_CONFIGA.lpDisplayName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpDisplayName$set(MemorySegment seg, long index, MemoryAddress x) {
        _QUERY_SERVICE_CONFIGA.lpDisplayName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


