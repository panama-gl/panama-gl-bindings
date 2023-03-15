// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_SYSTEM_STORE_RELOCATE_PARA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("hKeyBase"),
            Constants$root.C_POINTER$LAYOUT.withName("pvBase")
        ).withName("$anon$0"),
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pvSystemStore"),
            Constants$root.C_POINTER$LAYOUT.withName("pszSystemStore"),
            Constants$root.C_POINTER$LAYOUT.withName("pwszSystemStore")
        ).withName("$anon$1")
    ).withName("_CERT_SYSTEM_STORE_RELOCATE_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CERT_SYSTEM_STORE_RELOCATE_PARA.$struct$LAYOUT;
    }
    static final VarHandle hKeyBase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hKeyBase"));
    public static VarHandle hKeyBase$VH() {
        return _CERT_SYSTEM_STORE_RELOCATE_PARA.hKeyBase$VH;
    }
    public static MemoryAddress hKeyBase$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_SYSTEM_STORE_RELOCATE_PARA.hKeyBase$VH.get(seg);
    }
    public static void hKeyBase$set( MemorySegment seg, MemoryAddress x) {
        _CERT_SYSTEM_STORE_RELOCATE_PARA.hKeyBase$VH.set(seg, x);
    }
    public static MemoryAddress hKeyBase$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_SYSTEM_STORE_RELOCATE_PARA.hKeyBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hKeyBase$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_SYSTEM_STORE_RELOCATE_PARA.hKeyBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvBase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pvBase"));
    public static VarHandle pvBase$VH() {
        return _CERT_SYSTEM_STORE_RELOCATE_PARA.pvBase$VH;
    }
    public static MemoryAddress pvBase$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_SYSTEM_STORE_RELOCATE_PARA.pvBase$VH.get(seg);
    }
    public static void pvBase$set( MemorySegment seg, MemoryAddress x) {
        _CERT_SYSTEM_STORE_RELOCATE_PARA.pvBase$VH.set(seg, x);
    }
    public static MemoryAddress pvBase$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_SYSTEM_STORE_RELOCATE_PARA.pvBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvBase$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_SYSTEM_STORE_RELOCATE_PARA.pvBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvSystemStore$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("pvSystemStore"));
    public static VarHandle pvSystemStore$VH() {
        return _CERT_SYSTEM_STORE_RELOCATE_PARA.pvSystemStore$VH;
    }
    public static MemoryAddress pvSystemStore$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_SYSTEM_STORE_RELOCATE_PARA.pvSystemStore$VH.get(seg);
    }
    public static void pvSystemStore$set( MemorySegment seg, MemoryAddress x) {
        _CERT_SYSTEM_STORE_RELOCATE_PARA.pvSystemStore$VH.set(seg, x);
    }
    public static MemoryAddress pvSystemStore$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_SYSTEM_STORE_RELOCATE_PARA.pvSystemStore$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvSystemStore$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_SYSTEM_STORE_RELOCATE_PARA.pvSystemStore$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszSystemStore$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("pszSystemStore"));
    public static VarHandle pszSystemStore$VH() {
        return _CERT_SYSTEM_STORE_RELOCATE_PARA.pszSystemStore$VH;
    }
    public static MemoryAddress pszSystemStore$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_SYSTEM_STORE_RELOCATE_PARA.pszSystemStore$VH.get(seg);
    }
    public static void pszSystemStore$set( MemorySegment seg, MemoryAddress x) {
        _CERT_SYSTEM_STORE_RELOCATE_PARA.pszSystemStore$VH.set(seg, x);
    }
    public static MemoryAddress pszSystemStore$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_SYSTEM_STORE_RELOCATE_PARA.pszSystemStore$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszSystemStore$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_SYSTEM_STORE_RELOCATE_PARA.pszSystemStore$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszSystemStore$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("pwszSystemStore"));
    public static VarHandle pwszSystemStore$VH() {
        return _CERT_SYSTEM_STORE_RELOCATE_PARA.pwszSystemStore$VH;
    }
    public static MemoryAddress pwszSystemStore$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_SYSTEM_STORE_RELOCATE_PARA.pwszSystemStore$VH.get(seg);
    }
    public static void pwszSystemStore$set( MemorySegment seg, MemoryAddress x) {
        _CERT_SYSTEM_STORE_RELOCATE_PARA.pwszSystemStore$VH.set(seg, x);
    }
    public static MemoryAddress pwszSystemStore$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_SYSTEM_STORE_RELOCATE_PARA.pwszSystemStore$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszSystemStore$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_SYSTEM_STORE_RELOCATE_PARA.pwszSystemStore$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


