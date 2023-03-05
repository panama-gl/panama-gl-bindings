// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SERVERSILO_BASIC_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ServiceSessionId"),
        Constants$root.C_LONG$LAYOUT.withName("State"),
        Constants$root.C_LONG$LAYOUT.withName("ExitStatus"),
        Constants$root.C_CHAR$LAYOUT.withName("IsDownlevelContainer"),
        MemoryLayout.paddingLayout(24),
        Constants$root.C_POINTER$LAYOUT.withName("ApiSetSchema"),
        Constants$root.C_POINTER$LAYOUT.withName("HostApiSetSchema")
    ).withName("_SERVERSILO_BASIC_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _SERVERSILO_BASIC_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle ServiceSessionId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ServiceSessionId"));
    public static VarHandle ServiceSessionId$VH() {
        return _SERVERSILO_BASIC_INFORMATION.ServiceSessionId$VH;
    }
    public static int ServiceSessionId$get(MemorySegment seg) {
        return (int)_SERVERSILO_BASIC_INFORMATION.ServiceSessionId$VH.get(seg);
    }
    public static void ServiceSessionId$set( MemorySegment seg, int x) {
        _SERVERSILO_BASIC_INFORMATION.ServiceSessionId$VH.set(seg, x);
    }
    public static int ServiceSessionId$get(MemorySegment seg, long index) {
        return (int)_SERVERSILO_BASIC_INFORMATION.ServiceSessionId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ServiceSessionId$set(MemorySegment seg, long index, int x) {
        _SERVERSILO_BASIC_INFORMATION.ServiceSessionId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle State$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("State"));
    public static VarHandle State$VH() {
        return _SERVERSILO_BASIC_INFORMATION.State$VH;
    }
    public static int State$get(MemorySegment seg) {
        return (int)_SERVERSILO_BASIC_INFORMATION.State$VH.get(seg);
    }
    public static void State$set( MemorySegment seg, int x) {
        _SERVERSILO_BASIC_INFORMATION.State$VH.set(seg, x);
    }
    public static int State$get(MemorySegment seg, long index) {
        return (int)_SERVERSILO_BASIC_INFORMATION.State$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void State$set(MemorySegment seg, long index, int x) {
        _SERVERSILO_BASIC_INFORMATION.State$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ExitStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExitStatus"));
    public static VarHandle ExitStatus$VH() {
        return _SERVERSILO_BASIC_INFORMATION.ExitStatus$VH;
    }
    public static int ExitStatus$get(MemorySegment seg) {
        return (int)_SERVERSILO_BASIC_INFORMATION.ExitStatus$VH.get(seg);
    }
    public static void ExitStatus$set( MemorySegment seg, int x) {
        _SERVERSILO_BASIC_INFORMATION.ExitStatus$VH.set(seg, x);
    }
    public static int ExitStatus$get(MemorySegment seg, long index) {
        return (int)_SERVERSILO_BASIC_INFORMATION.ExitStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExitStatus$set(MemorySegment seg, long index, int x) {
        _SERVERSILO_BASIC_INFORMATION.ExitStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IsDownlevelContainer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsDownlevelContainer"));
    public static VarHandle IsDownlevelContainer$VH() {
        return _SERVERSILO_BASIC_INFORMATION.IsDownlevelContainer$VH;
    }
    public static byte IsDownlevelContainer$get(MemorySegment seg) {
        return (byte)_SERVERSILO_BASIC_INFORMATION.IsDownlevelContainer$VH.get(seg);
    }
    public static void IsDownlevelContainer$set( MemorySegment seg, byte x) {
        _SERVERSILO_BASIC_INFORMATION.IsDownlevelContainer$VH.set(seg, x);
    }
    public static byte IsDownlevelContainer$get(MemorySegment seg, long index) {
        return (byte)_SERVERSILO_BASIC_INFORMATION.IsDownlevelContainer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsDownlevelContainer$set(MemorySegment seg, long index, byte x) {
        _SERVERSILO_BASIC_INFORMATION.IsDownlevelContainer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ApiSetSchema$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ApiSetSchema"));
    public static VarHandle ApiSetSchema$VH() {
        return _SERVERSILO_BASIC_INFORMATION.ApiSetSchema$VH;
    }
    public static MemoryAddress ApiSetSchema$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SERVERSILO_BASIC_INFORMATION.ApiSetSchema$VH.get(seg);
    }
    public static void ApiSetSchema$set( MemorySegment seg, MemoryAddress x) {
        _SERVERSILO_BASIC_INFORMATION.ApiSetSchema$VH.set(seg, x);
    }
    public static MemoryAddress ApiSetSchema$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SERVERSILO_BASIC_INFORMATION.ApiSetSchema$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ApiSetSchema$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVERSILO_BASIC_INFORMATION.ApiSetSchema$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HostApiSetSchema$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HostApiSetSchema"));
    public static VarHandle HostApiSetSchema$VH() {
        return _SERVERSILO_BASIC_INFORMATION.HostApiSetSchema$VH;
    }
    public static MemoryAddress HostApiSetSchema$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SERVERSILO_BASIC_INFORMATION.HostApiSetSchema$VH.get(seg);
    }
    public static void HostApiSetSchema$set( MemorySegment seg, MemoryAddress x) {
        _SERVERSILO_BASIC_INFORMATION.HostApiSetSchema$VH.set(seg, x);
    }
    public static MemoryAddress HostApiSetSchema$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SERVERSILO_BASIC_INFORMATION.HostApiSetSchema$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HostApiSetSchema$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVERSILO_BASIC_INFORMATION.HostApiSetSchema$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


