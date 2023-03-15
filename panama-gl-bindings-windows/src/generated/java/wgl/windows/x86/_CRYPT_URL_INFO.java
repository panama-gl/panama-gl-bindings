// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_URL_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwSyncDeltaTime"),
        Constants$root.C_LONG$LAYOUT.withName("cGroup"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgcGroupEntry")
    ).withName("_CRYPT_URL_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_URL_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CRYPT_URL_INFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CRYPT_URL_INFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CRYPT_URL_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CRYPT_URL_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CRYPT_URL_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSyncDeltaTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSyncDeltaTime"));
    public static VarHandle dwSyncDeltaTime$VH() {
        return _CRYPT_URL_INFO.dwSyncDeltaTime$VH;
    }
    public static int dwSyncDeltaTime$get(MemorySegment seg) {
        return (int)_CRYPT_URL_INFO.dwSyncDeltaTime$VH.get(seg);
    }
    public static void dwSyncDeltaTime$set( MemorySegment seg, int x) {
        _CRYPT_URL_INFO.dwSyncDeltaTime$VH.set(seg, x);
    }
    public static int dwSyncDeltaTime$get(MemorySegment seg, long index) {
        return (int)_CRYPT_URL_INFO.dwSyncDeltaTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSyncDeltaTime$set(MemorySegment seg, long index, int x) {
        _CRYPT_URL_INFO.dwSyncDeltaTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cGroup$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cGroup"));
    public static VarHandle cGroup$VH() {
        return _CRYPT_URL_INFO.cGroup$VH;
    }
    public static int cGroup$get(MemorySegment seg) {
        return (int)_CRYPT_URL_INFO.cGroup$VH.get(seg);
    }
    public static void cGroup$set( MemorySegment seg, int x) {
        _CRYPT_URL_INFO.cGroup$VH.set(seg, x);
    }
    public static int cGroup$get(MemorySegment seg, long index) {
        return (int)_CRYPT_URL_INFO.cGroup$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cGroup$set(MemorySegment seg, long index, int x) {
        _CRYPT_URL_INFO.cGroup$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgcGroupEntry$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgcGroupEntry"));
    public static VarHandle rgcGroupEntry$VH() {
        return _CRYPT_URL_INFO.rgcGroupEntry$VH;
    }
    public static MemoryAddress rgcGroupEntry$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_URL_INFO.rgcGroupEntry$VH.get(seg);
    }
    public static void rgcGroupEntry$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_URL_INFO.rgcGroupEntry$VH.set(seg, x);
    }
    public static MemoryAddress rgcGroupEntry$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_URL_INFO.rgcGroupEntry$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgcGroupEntry$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_URL_INFO.rgcGroupEntry$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


