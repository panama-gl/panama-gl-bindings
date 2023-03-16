// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_REGISTRY_STORE_CLIENT_GPT_PARA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hKeyBase"),
        Constants$root.C_POINTER$LAYOUT.withName("pwszRegPath")
    ).withName("_CERT_REGISTRY_STORE_CLIENT_GPT_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CERT_REGISTRY_STORE_CLIENT_GPT_PARA.$struct$LAYOUT;
    }
    static final VarHandle hKeyBase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hKeyBase"));
    public static VarHandle hKeyBase$VH() {
        return _CERT_REGISTRY_STORE_CLIENT_GPT_PARA.hKeyBase$VH;
    }
    public static MemoryAddress hKeyBase$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_REGISTRY_STORE_CLIENT_GPT_PARA.hKeyBase$VH.get(seg);
    }
    public static void hKeyBase$set( MemorySegment seg, MemoryAddress x) {
        _CERT_REGISTRY_STORE_CLIENT_GPT_PARA.hKeyBase$VH.set(seg, x);
    }
    public static MemoryAddress hKeyBase$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_REGISTRY_STORE_CLIENT_GPT_PARA.hKeyBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hKeyBase$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_REGISTRY_STORE_CLIENT_GPT_PARA.hKeyBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszRegPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwszRegPath"));
    public static VarHandle pwszRegPath$VH() {
        return _CERT_REGISTRY_STORE_CLIENT_GPT_PARA.pwszRegPath$VH;
    }
    public static MemoryAddress pwszRegPath$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_REGISTRY_STORE_CLIENT_GPT_PARA.pwszRegPath$VH.get(seg);
    }
    public static void pwszRegPath$set( MemorySegment seg, MemoryAddress x) {
        _CERT_REGISTRY_STORE_CLIENT_GPT_PARA.pwszRegPath$VH.set(seg, x);
    }
    public static MemoryAddress pwszRegPath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_REGISTRY_STORE_CLIENT_GPT_PARA.pwszRegPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszRegPath$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_REGISTRY_STORE_CLIENT_GPT_PARA.pwszRegPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


