// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_RETRIEVE_AUX_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pLastSyncTime"),
        Constants$root.C_LONG$LAYOUT.withName("dwMaxUrlRetrievalByteCount"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pPreFetchInfo"),
        Constants$root.C_POINTER$LAYOUT.withName("pFlushInfo"),
        Constants$root.C_POINTER$LAYOUT.withName("ppResponseInfo"),
        Constants$root.C_POINTER$LAYOUT.withName("pwszCacheFileNamePrefix"),
        Constants$root.C_POINTER$LAYOUT.withName("pftCacheResync"),
        Constants$root.C_LONG$LAYOUT.withName("fProxyCacheRetrieval"),
        Constants$root.C_LONG$LAYOUT.withName("dwHttpStatusCode"),
        Constants$root.C_POINTER$LAYOUT.withName("ppwszErrorResponseHeaders"),
        Constants$root.C_POINTER$LAYOUT.withName("ppErrorContentBlob")
    ).withName("_CRYPT_RETRIEVE_AUX_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_RETRIEVE_AUX_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CRYPT_RETRIEVE_AUX_INFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CRYPT_RETRIEVE_AUX_INFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CRYPT_RETRIEVE_AUX_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CRYPT_RETRIEVE_AUX_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CRYPT_RETRIEVE_AUX_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pLastSyncTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pLastSyncTime"));
    public static VarHandle pLastSyncTime$VH() {
        return _CRYPT_RETRIEVE_AUX_INFO.pLastSyncTime$VH;
    }
    public static MemoryAddress pLastSyncTime$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_RETRIEVE_AUX_INFO.pLastSyncTime$VH.get(seg);
    }
    public static void pLastSyncTime$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_RETRIEVE_AUX_INFO.pLastSyncTime$VH.set(seg, x);
    }
    public static MemoryAddress pLastSyncTime$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_RETRIEVE_AUX_INFO.pLastSyncTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pLastSyncTime$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_RETRIEVE_AUX_INFO.pLastSyncTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMaxUrlRetrievalByteCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMaxUrlRetrievalByteCount"));
    public static VarHandle dwMaxUrlRetrievalByteCount$VH() {
        return _CRYPT_RETRIEVE_AUX_INFO.dwMaxUrlRetrievalByteCount$VH;
    }
    public static int dwMaxUrlRetrievalByteCount$get(MemorySegment seg) {
        return (int)_CRYPT_RETRIEVE_AUX_INFO.dwMaxUrlRetrievalByteCount$VH.get(seg);
    }
    public static void dwMaxUrlRetrievalByteCount$set( MemorySegment seg, int x) {
        _CRYPT_RETRIEVE_AUX_INFO.dwMaxUrlRetrievalByteCount$VH.set(seg, x);
    }
    public static int dwMaxUrlRetrievalByteCount$get(MemorySegment seg, long index) {
        return (int)_CRYPT_RETRIEVE_AUX_INFO.dwMaxUrlRetrievalByteCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMaxUrlRetrievalByteCount$set(MemorySegment seg, long index, int x) {
        _CRYPT_RETRIEVE_AUX_INFO.dwMaxUrlRetrievalByteCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pPreFetchInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPreFetchInfo"));
    public static VarHandle pPreFetchInfo$VH() {
        return _CRYPT_RETRIEVE_AUX_INFO.pPreFetchInfo$VH;
    }
    public static MemoryAddress pPreFetchInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_RETRIEVE_AUX_INFO.pPreFetchInfo$VH.get(seg);
    }
    public static void pPreFetchInfo$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_RETRIEVE_AUX_INFO.pPreFetchInfo$VH.set(seg, x);
    }
    public static MemoryAddress pPreFetchInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_RETRIEVE_AUX_INFO.pPreFetchInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPreFetchInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_RETRIEVE_AUX_INFO.pPreFetchInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pFlushInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pFlushInfo"));
    public static VarHandle pFlushInfo$VH() {
        return _CRYPT_RETRIEVE_AUX_INFO.pFlushInfo$VH;
    }
    public static MemoryAddress pFlushInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_RETRIEVE_AUX_INFO.pFlushInfo$VH.get(seg);
    }
    public static void pFlushInfo$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_RETRIEVE_AUX_INFO.pFlushInfo$VH.set(seg, x);
    }
    public static MemoryAddress pFlushInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_RETRIEVE_AUX_INFO.pFlushInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pFlushInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_RETRIEVE_AUX_INFO.pFlushInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ppResponseInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ppResponseInfo"));
    public static VarHandle ppResponseInfo$VH() {
        return _CRYPT_RETRIEVE_AUX_INFO.ppResponseInfo$VH;
    }
    public static MemoryAddress ppResponseInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_RETRIEVE_AUX_INFO.ppResponseInfo$VH.get(seg);
    }
    public static void ppResponseInfo$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_RETRIEVE_AUX_INFO.ppResponseInfo$VH.set(seg, x);
    }
    public static MemoryAddress ppResponseInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_RETRIEVE_AUX_INFO.ppResponseInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ppResponseInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_RETRIEVE_AUX_INFO.ppResponseInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszCacheFileNamePrefix$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwszCacheFileNamePrefix"));
    public static VarHandle pwszCacheFileNamePrefix$VH() {
        return _CRYPT_RETRIEVE_AUX_INFO.pwszCacheFileNamePrefix$VH;
    }
    public static MemoryAddress pwszCacheFileNamePrefix$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_RETRIEVE_AUX_INFO.pwszCacheFileNamePrefix$VH.get(seg);
    }
    public static void pwszCacheFileNamePrefix$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_RETRIEVE_AUX_INFO.pwszCacheFileNamePrefix$VH.set(seg, x);
    }
    public static MemoryAddress pwszCacheFileNamePrefix$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_RETRIEVE_AUX_INFO.pwszCacheFileNamePrefix$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszCacheFileNamePrefix$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_RETRIEVE_AUX_INFO.pwszCacheFileNamePrefix$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pftCacheResync$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pftCacheResync"));
    public static VarHandle pftCacheResync$VH() {
        return _CRYPT_RETRIEVE_AUX_INFO.pftCacheResync$VH;
    }
    public static MemoryAddress pftCacheResync$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_RETRIEVE_AUX_INFO.pftCacheResync$VH.get(seg);
    }
    public static void pftCacheResync$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_RETRIEVE_AUX_INFO.pftCacheResync$VH.set(seg, x);
    }
    public static MemoryAddress pftCacheResync$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_RETRIEVE_AUX_INFO.pftCacheResync$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pftCacheResync$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_RETRIEVE_AUX_INFO.pftCacheResync$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fProxyCacheRetrieval$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fProxyCacheRetrieval"));
    public static VarHandle fProxyCacheRetrieval$VH() {
        return _CRYPT_RETRIEVE_AUX_INFO.fProxyCacheRetrieval$VH;
    }
    public static int fProxyCacheRetrieval$get(MemorySegment seg) {
        return (int)_CRYPT_RETRIEVE_AUX_INFO.fProxyCacheRetrieval$VH.get(seg);
    }
    public static void fProxyCacheRetrieval$set( MemorySegment seg, int x) {
        _CRYPT_RETRIEVE_AUX_INFO.fProxyCacheRetrieval$VH.set(seg, x);
    }
    public static int fProxyCacheRetrieval$get(MemorySegment seg, long index) {
        return (int)_CRYPT_RETRIEVE_AUX_INFO.fProxyCacheRetrieval$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fProxyCacheRetrieval$set(MemorySegment seg, long index, int x) {
        _CRYPT_RETRIEVE_AUX_INFO.fProxyCacheRetrieval$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwHttpStatusCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwHttpStatusCode"));
    public static VarHandle dwHttpStatusCode$VH() {
        return _CRYPT_RETRIEVE_AUX_INFO.dwHttpStatusCode$VH;
    }
    public static int dwHttpStatusCode$get(MemorySegment seg) {
        return (int)_CRYPT_RETRIEVE_AUX_INFO.dwHttpStatusCode$VH.get(seg);
    }
    public static void dwHttpStatusCode$set( MemorySegment seg, int x) {
        _CRYPT_RETRIEVE_AUX_INFO.dwHttpStatusCode$VH.set(seg, x);
    }
    public static int dwHttpStatusCode$get(MemorySegment seg, long index) {
        return (int)_CRYPT_RETRIEVE_AUX_INFO.dwHttpStatusCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwHttpStatusCode$set(MemorySegment seg, long index, int x) {
        _CRYPT_RETRIEVE_AUX_INFO.dwHttpStatusCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ppwszErrorResponseHeaders$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ppwszErrorResponseHeaders"));
    public static VarHandle ppwszErrorResponseHeaders$VH() {
        return _CRYPT_RETRIEVE_AUX_INFO.ppwszErrorResponseHeaders$VH;
    }
    public static MemoryAddress ppwszErrorResponseHeaders$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_RETRIEVE_AUX_INFO.ppwszErrorResponseHeaders$VH.get(seg);
    }
    public static void ppwszErrorResponseHeaders$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_RETRIEVE_AUX_INFO.ppwszErrorResponseHeaders$VH.set(seg, x);
    }
    public static MemoryAddress ppwszErrorResponseHeaders$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_RETRIEVE_AUX_INFO.ppwszErrorResponseHeaders$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ppwszErrorResponseHeaders$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_RETRIEVE_AUX_INFO.ppwszErrorResponseHeaders$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ppErrorContentBlob$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ppErrorContentBlob"));
    public static VarHandle ppErrorContentBlob$VH() {
        return _CRYPT_RETRIEVE_AUX_INFO.ppErrorContentBlob$VH;
    }
    public static MemoryAddress ppErrorContentBlob$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_RETRIEVE_AUX_INFO.ppErrorContentBlob$VH.get(seg);
    }
    public static void ppErrorContentBlob$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_RETRIEVE_AUX_INFO.ppErrorContentBlob$VH.set(seg, x);
    }
    public static MemoryAddress ppErrorContentBlob$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_RETRIEVE_AUX_INFO.ppErrorContentBlob$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ppErrorContentBlob$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_RETRIEVE_AUX_INFO.ppErrorContentBlob$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

