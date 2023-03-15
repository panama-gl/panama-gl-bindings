// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_GENERAL_SUBTREE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwAltNameChoice"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.unionLayout(
                Constants$root.C_POINTER$LAYOUT.withName("pOtherName"),
                Constants$root.C_POINTER$LAYOUT.withName("pwszRfc822Name"),
                Constants$root.C_POINTER$LAYOUT.withName("pwszDNSName"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("cbData"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_POINTER$LAYOUT.withName("pbData")
                ).withName("DirectoryName"),
                Constants$root.C_POINTER$LAYOUT.withName("pwszURL"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("cbData"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_POINTER$LAYOUT.withName("pbData")
                ).withName("IPAddress"),
                Constants$root.C_POINTER$LAYOUT.withName("pszRegisteredID")
            ).withName("$anon$0")
        ).withName("Base"),
        Constants$root.C_LONG$LAYOUT.withName("dwMinimum"),
        Constants$root.C_LONG$LAYOUT.withName("fMaximum"),
        Constants$root.C_LONG$LAYOUT.withName("dwMaximum"),
        MemoryLayout.paddingLayout(32)
    ).withName("_CERT_GENERAL_SUBTREE");
    public static MemoryLayout $LAYOUT() {
        return _CERT_GENERAL_SUBTREE.$struct$LAYOUT;
    }
    public static MemorySegment Base$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    static final VarHandle dwMinimum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMinimum"));
    public static VarHandle dwMinimum$VH() {
        return _CERT_GENERAL_SUBTREE.dwMinimum$VH;
    }
    public static int dwMinimum$get(MemorySegment seg) {
        return (int)_CERT_GENERAL_SUBTREE.dwMinimum$VH.get(seg);
    }
    public static void dwMinimum$set( MemorySegment seg, int x) {
        _CERT_GENERAL_SUBTREE.dwMinimum$VH.set(seg, x);
    }
    public static int dwMinimum$get(MemorySegment seg, long index) {
        return (int)_CERT_GENERAL_SUBTREE.dwMinimum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMinimum$set(MemorySegment seg, long index, int x) {
        _CERT_GENERAL_SUBTREE.dwMinimum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fMaximum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fMaximum"));
    public static VarHandle fMaximum$VH() {
        return _CERT_GENERAL_SUBTREE.fMaximum$VH;
    }
    public static int fMaximum$get(MemorySegment seg) {
        return (int)_CERT_GENERAL_SUBTREE.fMaximum$VH.get(seg);
    }
    public static void fMaximum$set( MemorySegment seg, int x) {
        _CERT_GENERAL_SUBTREE.fMaximum$VH.set(seg, x);
    }
    public static int fMaximum$get(MemorySegment seg, long index) {
        return (int)_CERT_GENERAL_SUBTREE.fMaximum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fMaximum$set(MemorySegment seg, long index, int x) {
        _CERT_GENERAL_SUBTREE.fMaximum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMaximum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMaximum"));
    public static VarHandle dwMaximum$VH() {
        return _CERT_GENERAL_SUBTREE.dwMaximum$VH;
    }
    public static int dwMaximum$get(MemorySegment seg) {
        return (int)_CERT_GENERAL_SUBTREE.dwMaximum$VH.get(seg);
    }
    public static void dwMaximum$set( MemorySegment seg, int x) {
        _CERT_GENERAL_SUBTREE.dwMaximum$VH.set(seg, x);
    }
    public static int dwMaximum$get(MemorySegment seg, long index) {
        return (int)_CERT_GENERAL_SUBTREE.dwMaximum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMaximum$set(MemorySegment seg, long index, int x) {
        _CERT_GENERAL_SUBTREE.dwMaximum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


