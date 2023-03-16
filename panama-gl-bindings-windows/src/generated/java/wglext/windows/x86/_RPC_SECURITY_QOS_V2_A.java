// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RPC_SECURITY_QOS_V2_A {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Capabilities"),
        Constants$root.C_LONG$LAYOUT.withName("IdentityTracking"),
        Constants$root.C_LONG$LAYOUT.withName("ImpersonationType"),
        Constants$root.C_LONG$LAYOUT.withName("AdditionalSecurityInfoType"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("HttpCredentials")
        ).withName("u")
    ).withName("_RPC_SECURITY_QOS_V2_A");
    public static MemoryLayout $LAYOUT() {
        return _RPC_SECURITY_QOS_V2_A.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _RPC_SECURITY_QOS_V2_A.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_RPC_SECURITY_QOS_V2_A.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _RPC_SECURITY_QOS_V2_A.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_RPC_SECURITY_QOS_V2_A.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _RPC_SECURITY_QOS_V2_A.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Capabilities$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Capabilities"));
    public static VarHandle Capabilities$VH() {
        return _RPC_SECURITY_QOS_V2_A.Capabilities$VH;
    }
    public static int Capabilities$get(MemorySegment seg) {
        return (int)_RPC_SECURITY_QOS_V2_A.Capabilities$VH.get(seg);
    }
    public static void Capabilities$set( MemorySegment seg, int x) {
        _RPC_SECURITY_QOS_V2_A.Capabilities$VH.set(seg, x);
    }
    public static int Capabilities$get(MemorySegment seg, long index) {
        return (int)_RPC_SECURITY_QOS_V2_A.Capabilities$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Capabilities$set(MemorySegment seg, long index, int x) {
        _RPC_SECURITY_QOS_V2_A.Capabilities$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IdentityTracking$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IdentityTracking"));
    public static VarHandle IdentityTracking$VH() {
        return _RPC_SECURITY_QOS_V2_A.IdentityTracking$VH;
    }
    public static int IdentityTracking$get(MemorySegment seg) {
        return (int)_RPC_SECURITY_QOS_V2_A.IdentityTracking$VH.get(seg);
    }
    public static void IdentityTracking$set( MemorySegment seg, int x) {
        _RPC_SECURITY_QOS_V2_A.IdentityTracking$VH.set(seg, x);
    }
    public static int IdentityTracking$get(MemorySegment seg, long index) {
        return (int)_RPC_SECURITY_QOS_V2_A.IdentityTracking$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IdentityTracking$set(MemorySegment seg, long index, int x) {
        _RPC_SECURITY_QOS_V2_A.IdentityTracking$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ImpersonationType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImpersonationType"));
    public static VarHandle ImpersonationType$VH() {
        return _RPC_SECURITY_QOS_V2_A.ImpersonationType$VH;
    }
    public static int ImpersonationType$get(MemorySegment seg) {
        return (int)_RPC_SECURITY_QOS_V2_A.ImpersonationType$VH.get(seg);
    }
    public static void ImpersonationType$set( MemorySegment seg, int x) {
        _RPC_SECURITY_QOS_V2_A.ImpersonationType$VH.set(seg, x);
    }
    public static int ImpersonationType$get(MemorySegment seg, long index) {
        return (int)_RPC_SECURITY_QOS_V2_A.ImpersonationType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImpersonationType$set(MemorySegment seg, long index, int x) {
        _RPC_SECURITY_QOS_V2_A.ImpersonationType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AdditionalSecurityInfoType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AdditionalSecurityInfoType"));
    public static VarHandle AdditionalSecurityInfoType$VH() {
        return _RPC_SECURITY_QOS_V2_A.AdditionalSecurityInfoType$VH;
    }
    public static int AdditionalSecurityInfoType$get(MemorySegment seg) {
        return (int)_RPC_SECURITY_QOS_V2_A.AdditionalSecurityInfoType$VH.get(seg);
    }
    public static void AdditionalSecurityInfoType$set( MemorySegment seg, int x) {
        _RPC_SECURITY_QOS_V2_A.AdditionalSecurityInfoType$VH.set(seg, x);
    }
    public static int AdditionalSecurityInfoType$get(MemorySegment seg, long index) {
        return (int)_RPC_SECURITY_QOS_V2_A.AdditionalSecurityInfoType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AdditionalSecurityInfoType$set(MemorySegment seg, long index, int x) {
        _RPC_SECURITY_QOS_V2_A.AdditionalSecurityInfoType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class u {

        static final  GroupLayout u$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("HttpCredentials")
        );
        public static MemoryLayout $LAYOUT() {
            return u.u$union$LAYOUT;
        }
        static final VarHandle HttpCredentials$VH = u$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HttpCredentials"));
        public static VarHandle HttpCredentials$VH() {
            return u.HttpCredentials$VH;
        }
        public static MemoryAddress HttpCredentials$get(MemorySegment seg) {
            return (java.lang.foreign.MemoryAddress)u.HttpCredentials$VH.get(seg);
        }
        public static void HttpCredentials$set( MemorySegment seg, MemoryAddress x) {
            u.HttpCredentials$VH.set(seg, x);
        }
        public static MemoryAddress HttpCredentials$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemoryAddress)u.HttpCredentials$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void HttpCredentials$set(MemorySegment seg, long index, MemoryAddress x) {
            u.HttpCredentials$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment u$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


