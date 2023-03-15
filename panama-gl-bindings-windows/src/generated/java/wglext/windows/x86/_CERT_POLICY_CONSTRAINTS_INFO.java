// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_POLICY_CONSTRAINTS_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("fRequireExplicitPolicy"),
        Constants$root.C_LONG$LAYOUT.withName("dwRequireExplicitPolicySkipCerts"),
        Constants$root.C_LONG$LAYOUT.withName("fInhibitPolicyMapping"),
        Constants$root.C_LONG$LAYOUT.withName("dwInhibitPolicyMappingSkipCerts")
    ).withName("_CERT_POLICY_CONSTRAINTS_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_POLICY_CONSTRAINTS_INFO.$struct$LAYOUT;
    }
    static final VarHandle fRequireExplicitPolicy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fRequireExplicitPolicy"));
    public static VarHandle fRequireExplicitPolicy$VH() {
        return _CERT_POLICY_CONSTRAINTS_INFO.fRequireExplicitPolicy$VH;
    }
    public static int fRequireExplicitPolicy$get(MemorySegment seg) {
        return (int)_CERT_POLICY_CONSTRAINTS_INFO.fRequireExplicitPolicy$VH.get(seg);
    }
    public static void fRequireExplicitPolicy$set( MemorySegment seg, int x) {
        _CERT_POLICY_CONSTRAINTS_INFO.fRequireExplicitPolicy$VH.set(seg, x);
    }
    public static int fRequireExplicitPolicy$get(MemorySegment seg, long index) {
        return (int)_CERT_POLICY_CONSTRAINTS_INFO.fRequireExplicitPolicy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fRequireExplicitPolicy$set(MemorySegment seg, long index, int x) {
        _CERT_POLICY_CONSTRAINTS_INFO.fRequireExplicitPolicy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwRequireExplicitPolicySkipCerts$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwRequireExplicitPolicySkipCerts"));
    public static VarHandle dwRequireExplicitPolicySkipCerts$VH() {
        return _CERT_POLICY_CONSTRAINTS_INFO.dwRequireExplicitPolicySkipCerts$VH;
    }
    public static int dwRequireExplicitPolicySkipCerts$get(MemorySegment seg) {
        return (int)_CERT_POLICY_CONSTRAINTS_INFO.dwRequireExplicitPolicySkipCerts$VH.get(seg);
    }
    public static void dwRequireExplicitPolicySkipCerts$set( MemorySegment seg, int x) {
        _CERT_POLICY_CONSTRAINTS_INFO.dwRequireExplicitPolicySkipCerts$VH.set(seg, x);
    }
    public static int dwRequireExplicitPolicySkipCerts$get(MemorySegment seg, long index) {
        return (int)_CERT_POLICY_CONSTRAINTS_INFO.dwRequireExplicitPolicySkipCerts$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRequireExplicitPolicySkipCerts$set(MemorySegment seg, long index, int x) {
        _CERT_POLICY_CONSTRAINTS_INFO.dwRequireExplicitPolicySkipCerts$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fInhibitPolicyMapping$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fInhibitPolicyMapping"));
    public static VarHandle fInhibitPolicyMapping$VH() {
        return _CERT_POLICY_CONSTRAINTS_INFO.fInhibitPolicyMapping$VH;
    }
    public static int fInhibitPolicyMapping$get(MemorySegment seg) {
        return (int)_CERT_POLICY_CONSTRAINTS_INFO.fInhibitPolicyMapping$VH.get(seg);
    }
    public static void fInhibitPolicyMapping$set( MemorySegment seg, int x) {
        _CERT_POLICY_CONSTRAINTS_INFO.fInhibitPolicyMapping$VH.set(seg, x);
    }
    public static int fInhibitPolicyMapping$get(MemorySegment seg, long index) {
        return (int)_CERT_POLICY_CONSTRAINTS_INFO.fInhibitPolicyMapping$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fInhibitPolicyMapping$set(MemorySegment seg, long index, int x) {
        _CERT_POLICY_CONSTRAINTS_INFO.fInhibitPolicyMapping$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwInhibitPolicyMappingSkipCerts$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwInhibitPolicyMappingSkipCerts"));
    public static VarHandle dwInhibitPolicyMappingSkipCerts$VH() {
        return _CERT_POLICY_CONSTRAINTS_INFO.dwInhibitPolicyMappingSkipCerts$VH;
    }
    public static int dwInhibitPolicyMappingSkipCerts$get(MemorySegment seg) {
        return (int)_CERT_POLICY_CONSTRAINTS_INFO.dwInhibitPolicyMappingSkipCerts$VH.get(seg);
    }
    public static void dwInhibitPolicyMappingSkipCerts$set( MemorySegment seg, int x) {
        _CERT_POLICY_CONSTRAINTS_INFO.dwInhibitPolicyMappingSkipCerts$VH.set(seg, x);
    }
    public static int dwInhibitPolicyMappingSkipCerts$get(MemorySegment seg, long index) {
        return (int)_CERT_POLICY_CONSTRAINTS_INFO.dwInhibitPolicyMappingSkipCerts$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwInhibitPolicyMappingSkipCerts$set(MemorySegment seg, long index, int x) {
        _CERT_POLICY_CONSTRAINTS_INFO.dwInhibitPolicyMappingSkipCerts$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


