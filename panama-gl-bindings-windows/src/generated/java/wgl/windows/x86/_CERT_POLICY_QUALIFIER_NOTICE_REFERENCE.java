// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_POLICY_QUALIFIER_NOTICE_REFERENCE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszOrganization"),
        Constants$root.C_LONG$LAYOUT.withName("cNoticeNumbers"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgNoticeNumbers")
    ).withName("_CERT_POLICY_QUALIFIER_NOTICE_REFERENCE");
    public static MemoryLayout $LAYOUT() {
        return _CERT_POLICY_QUALIFIER_NOTICE_REFERENCE.$struct$LAYOUT;
    }
    static final VarHandle pszOrganization$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszOrganization"));
    public static VarHandle pszOrganization$VH() {
        return _CERT_POLICY_QUALIFIER_NOTICE_REFERENCE.pszOrganization$VH;
    }
    public static MemoryAddress pszOrganization$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY_QUALIFIER_NOTICE_REFERENCE.pszOrganization$VH.get(seg);
    }
    public static void pszOrganization$set( MemorySegment seg, MemoryAddress x) {
        _CERT_POLICY_QUALIFIER_NOTICE_REFERENCE.pszOrganization$VH.set(seg, x);
    }
    public static MemoryAddress pszOrganization$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY_QUALIFIER_NOTICE_REFERENCE.pszOrganization$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszOrganization$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_POLICY_QUALIFIER_NOTICE_REFERENCE.pszOrganization$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cNoticeNumbers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cNoticeNumbers"));
    public static VarHandle cNoticeNumbers$VH() {
        return _CERT_POLICY_QUALIFIER_NOTICE_REFERENCE.cNoticeNumbers$VH;
    }
    public static int cNoticeNumbers$get(MemorySegment seg) {
        return (int)_CERT_POLICY_QUALIFIER_NOTICE_REFERENCE.cNoticeNumbers$VH.get(seg);
    }
    public static void cNoticeNumbers$set( MemorySegment seg, int x) {
        _CERT_POLICY_QUALIFIER_NOTICE_REFERENCE.cNoticeNumbers$VH.set(seg, x);
    }
    public static int cNoticeNumbers$get(MemorySegment seg, long index) {
        return (int)_CERT_POLICY_QUALIFIER_NOTICE_REFERENCE.cNoticeNumbers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cNoticeNumbers$set(MemorySegment seg, long index, int x) {
        _CERT_POLICY_QUALIFIER_NOTICE_REFERENCE.cNoticeNumbers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgNoticeNumbers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgNoticeNumbers"));
    public static VarHandle rgNoticeNumbers$VH() {
        return _CERT_POLICY_QUALIFIER_NOTICE_REFERENCE.rgNoticeNumbers$VH;
    }
    public static MemoryAddress rgNoticeNumbers$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY_QUALIFIER_NOTICE_REFERENCE.rgNoticeNumbers$VH.get(seg);
    }
    public static void rgNoticeNumbers$set( MemorySegment seg, MemoryAddress x) {
        _CERT_POLICY_QUALIFIER_NOTICE_REFERENCE.rgNoticeNumbers$VH.set(seg, x);
    }
    public static MemoryAddress rgNoticeNumbers$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY_QUALIFIER_NOTICE_REFERENCE.rgNoticeNumbers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgNoticeNumbers$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_POLICY_QUALIFIER_NOTICE_REFERENCE.rgNoticeNumbers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

