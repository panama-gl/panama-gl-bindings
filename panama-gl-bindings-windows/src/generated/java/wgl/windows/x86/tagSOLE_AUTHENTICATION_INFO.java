// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagSOLE_AUTHENTICATION_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwAuthnSvc"),
        Constants$root.C_LONG$LAYOUT.withName("dwAuthzSvc"),
        Constants$root.C_POINTER$LAYOUT.withName("pAuthInfo")
    ).withName("tagSOLE_AUTHENTICATION_INFO");
    public static MemoryLayout $LAYOUT() {
        return tagSOLE_AUTHENTICATION_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwAuthnSvc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAuthnSvc"));
    public static VarHandle dwAuthnSvc$VH() {
        return tagSOLE_AUTHENTICATION_INFO.dwAuthnSvc$VH;
    }
    public static int dwAuthnSvc$get(MemorySegment seg) {
        return (int)tagSOLE_AUTHENTICATION_INFO.dwAuthnSvc$VH.get(seg);
    }
    public static void dwAuthnSvc$set( MemorySegment seg, int x) {
        tagSOLE_AUTHENTICATION_INFO.dwAuthnSvc$VH.set(seg, x);
    }
    public static int dwAuthnSvc$get(MemorySegment seg, long index) {
        return (int)tagSOLE_AUTHENTICATION_INFO.dwAuthnSvc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAuthnSvc$set(MemorySegment seg, long index, int x) {
        tagSOLE_AUTHENTICATION_INFO.dwAuthnSvc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwAuthzSvc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAuthzSvc"));
    public static VarHandle dwAuthzSvc$VH() {
        return tagSOLE_AUTHENTICATION_INFO.dwAuthzSvc$VH;
    }
    public static int dwAuthzSvc$get(MemorySegment seg) {
        return (int)tagSOLE_AUTHENTICATION_INFO.dwAuthzSvc$VH.get(seg);
    }
    public static void dwAuthzSvc$set( MemorySegment seg, int x) {
        tagSOLE_AUTHENTICATION_INFO.dwAuthzSvc$VH.set(seg, x);
    }
    public static int dwAuthzSvc$get(MemorySegment seg, long index) {
        return (int)tagSOLE_AUTHENTICATION_INFO.dwAuthzSvc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAuthzSvc$set(MemorySegment seg, long index, int x) {
        tagSOLE_AUTHENTICATION_INFO.dwAuthzSvc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pAuthInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pAuthInfo"));
    public static VarHandle pAuthInfo$VH() {
        return tagSOLE_AUTHENTICATION_INFO.pAuthInfo$VH;
    }
    public static MemoryAddress pAuthInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagSOLE_AUTHENTICATION_INFO.pAuthInfo$VH.get(seg);
    }
    public static void pAuthInfo$set( MemorySegment seg, MemoryAddress x) {
        tagSOLE_AUTHENTICATION_INFO.pAuthInfo$VH.set(seg, x);
    }
    public static MemoryAddress pAuthInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagSOLE_AUTHENTICATION_INFO.pAuthInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pAuthInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        tagSOLE_AUTHENTICATION_INFO.pAuthInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


