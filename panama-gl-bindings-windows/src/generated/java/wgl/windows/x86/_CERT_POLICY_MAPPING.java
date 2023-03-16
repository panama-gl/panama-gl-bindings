// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_POLICY_MAPPING {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszIssuerDomainPolicy"),
        Constants$root.C_POINTER$LAYOUT.withName("pszSubjectDomainPolicy")
    ).withName("_CERT_POLICY_MAPPING");
    public static MemoryLayout $LAYOUT() {
        return _CERT_POLICY_MAPPING.$struct$LAYOUT;
    }
    static final VarHandle pszIssuerDomainPolicy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszIssuerDomainPolicy"));
    public static VarHandle pszIssuerDomainPolicy$VH() {
        return _CERT_POLICY_MAPPING.pszIssuerDomainPolicy$VH;
    }
    public static MemoryAddress pszIssuerDomainPolicy$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY_MAPPING.pszIssuerDomainPolicy$VH.get(seg);
    }
    public static void pszIssuerDomainPolicy$set( MemorySegment seg, MemoryAddress x) {
        _CERT_POLICY_MAPPING.pszIssuerDomainPolicy$VH.set(seg, x);
    }
    public static MemoryAddress pszIssuerDomainPolicy$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY_MAPPING.pszIssuerDomainPolicy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszIssuerDomainPolicy$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_POLICY_MAPPING.pszIssuerDomainPolicy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszSubjectDomainPolicy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszSubjectDomainPolicy"));
    public static VarHandle pszSubjectDomainPolicy$VH() {
        return _CERT_POLICY_MAPPING.pszSubjectDomainPolicy$VH;
    }
    public static MemoryAddress pszSubjectDomainPolicy$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY_MAPPING.pszSubjectDomainPolicy$VH.get(seg);
    }
    public static void pszSubjectDomainPolicy$set( MemorySegment seg, MemoryAddress x) {
        _CERT_POLICY_MAPPING.pszSubjectDomainPolicy$VH.set(seg, x);
    }
    public static MemoryAddress pszSubjectDomainPolicy$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY_MAPPING.pszSubjectDomainPolicy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszSubjectDomainPolicy$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_POLICY_MAPPING.pszSubjectDomainPolicy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

