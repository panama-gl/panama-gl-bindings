// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _HTTPSPolicyCallbackData {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbStruct"),
            Constants$root.C_LONG$LAYOUT.withName("cbSize")
        ).withName("$anon$0"),
        Constants$root.C_LONG$LAYOUT.withName("dwAuthType"),
        Constants$root.C_LONG$LAYOUT.withName("fdwChecks"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pwszServerName")
    ).withName("_HTTPSPolicyCallbackData");
    public static MemoryLayout $LAYOUT() {
        return _HTTPSPolicyCallbackData.$struct$LAYOUT;
    }
    static final VarHandle cbStruct$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("cbStruct"));
    public static VarHandle cbStruct$VH() {
        return _HTTPSPolicyCallbackData.cbStruct$VH;
    }
    public static int cbStruct$get(MemorySegment seg) {
        return (int)_HTTPSPolicyCallbackData.cbStruct$VH.get(seg);
    }
    public static void cbStruct$set( MemorySegment seg, int x) {
        _HTTPSPolicyCallbackData.cbStruct$VH.set(seg, x);
    }
    public static int cbStruct$get(MemorySegment seg, long index) {
        return (int)_HTTPSPolicyCallbackData.cbStruct$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbStruct$set(MemorySegment seg, long index, int x) {
        _HTTPSPolicyCallbackData.cbStruct$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _HTTPSPolicyCallbackData.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_HTTPSPolicyCallbackData.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _HTTPSPolicyCallbackData.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_HTTPSPolicyCallbackData.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _HTTPSPolicyCallbackData.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwAuthType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAuthType"));
    public static VarHandle dwAuthType$VH() {
        return _HTTPSPolicyCallbackData.dwAuthType$VH;
    }
    public static int dwAuthType$get(MemorySegment seg) {
        return (int)_HTTPSPolicyCallbackData.dwAuthType$VH.get(seg);
    }
    public static void dwAuthType$set( MemorySegment seg, int x) {
        _HTTPSPolicyCallbackData.dwAuthType$VH.set(seg, x);
    }
    public static int dwAuthType$get(MemorySegment seg, long index) {
        return (int)_HTTPSPolicyCallbackData.dwAuthType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAuthType$set(MemorySegment seg, long index, int x) {
        _HTTPSPolicyCallbackData.dwAuthType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fdwChecks$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fdwChecks"));
    public static VarHandle fdwChecks$VH() {
        return _HTTPSPolicyCallbackData.fdwChecks$VH;
    }
    public static int fdwChecks$get(MemorySegment seg) {
        return (int)_HTTPSPolicyCallbackData.fdwChecks$VH.get(seg);
    }
    public static void fdwChecks$set( MemorySegment seg, int x) {
        _HTTPSPolicyCallbackData.fdwChecks$VH.set(seg, x);
    }
    public static int fdwChecks$get(MemorySegment seg, long index) {
        return (int)_HTTPSPolicyCallbackData.fdwChecks$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fdwChecks$set(MemorySegment seg, long index, int x) {
        _HTTPSPolicyCallbackData.fdwChecks$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszServerName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwszServerName"));
    public static VarHandle pwszServerName$VH() {
        return _HTTPSPolicyCallbackData.pwszServerName$VH;
    }
    public static MemoryAddress pwszServerName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_HTTPSPolicyCallbackData.pwszServerName$VH.get(seg);
    }
    public static void pwszServerName$set( MemorySegment seg, MemoryAddress x) {
        _HTTPSPolicyCallbackData.pwszServerName$VH.set(seg, x);
    }
    public static MemoryAddress pwszServerName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_HTTPSPolicyCallbackData.pwszServerName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszServerName$set(MemorySegment seg, long index, MemoryAddress x) {
        _HTTPSPolicyCallbackData.pwszServerName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


