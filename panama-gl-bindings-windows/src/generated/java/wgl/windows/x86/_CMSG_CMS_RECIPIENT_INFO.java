// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CMSG_CMS_RECIPIENT_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwRecipientChoice"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pKeyTrans"),
            Constants$root.C_POINTER$LAYOUT.withName("pKeyAgree"),
            Constants$root.C_POINTER$LAYOUT.withName("pMailList")
        ).withName("$anon$0")
    ).withName("_CMSG_CMS_RECIPIENT_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_CMS_RECIPIENT_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwRecipientChoice$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwRecipientChoice"));
    public static VarHandle dwRecipientChoice$VH() {
        return _CMSG_CMS_RECIPIENT_INFO.dwRecipientChoice$VH;
    }
    public static int dwRecipientChoice$get(MemorySegment seg) {
        return (int)_CMSG_CMS_RECIPIENT_INFO.dwRecipientChoice$VH.get(seg);
    }
    public static void dwRecipientChoice$set( MemorySegment seg, int x) {
        _CMSG_CMS_RECIPIENT_INFO.dwRecipientChoice$VH.set(seg, x);
    }
    public static int dwRecipientChoice$get(MemorySegment seg, long index) {
        return (int)_CMSG_CMS_RECIPIENT_INFO.dwRecipientChoice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRecipientChoice$set(MemorySegment seg, long index, int x) {
        _CMSG_CMS_RECIPIENT_INFO.dwRecipientChoice$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pKeyTrans$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pKeyTrans"));
    public static VarHandle pKeyTrans$VH() {
        return _CMSG_CMS_RECIPIENT_INFO.pKeyTrans$VH;
    }
    public static MemoryAddress pKeyTrans$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CMS_RECIPIENT_INFO.pKeyTrans$VH.get(seg);
    }
    public static void pKeyTrans$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_CMS_RECIPIENT_INFO.pKeyTrans$VH.set(seg, x);
    }
    public static MemoryAddress pKeyTrans$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CMS_RECIPIENT_INFO.pKeyTrans$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pKeyTrans$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_CMS_RECIPIENT_INFO.pKeyTrans$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pKeyAgree$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pKeyAgree"));
    public static VarHandle pKeyAgree$VH() {
        return _CMSG_CMS_RECIPIENT_INFO.pKeyAgree$VH;
    }
    public static MemoryAddress pKeyAgree$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CMS_RECIPIENT_INFO.pKeyAgree$VH.get(seg);
    }
    public static void pKeyAgree$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_CMS_RECIPIENT_INFO.pKeyAgree$VH.set(seg, x);
    }
    public static MemoryAddress pKeyAgree$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CMS_RECIPIENT_INFO.pKeyAgree$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pKeyAgree$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_CMS_RECIPIENT_INFO.pKeyAgree$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pMailList$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pMailList"));
    public static VarHandle pMailList$VH() {
        return _CMSG_CMS_RECIPIENT_INFO.pMailList$VH;
    }
    public static MemoryAddress pMailList$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CMS_RECIPIENT_INFO.pMailList$VH.get(seg);
    }
    public static void pMailList$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_CMS_RECIPIENT_INFO.pMailList$VH.set(seg, x);
    }
    public static MemoryAddress pMailList$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CMS_RECIPIENT_INFO.pMailList$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pMailList$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_CMS_RECIPIENT_INFO.pMailList$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


