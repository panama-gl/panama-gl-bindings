// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLCREATEPBUFFERARBPROC {

    java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress hDC, int iPixelFormat, int iWidth, int iHeight, java.lang.foreign.MemoryAddress piAttribList);
    static MemorySegment allocate(PFNWGLCREATEPBUFFERARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLCREATEPBUFFERARBPROC.class, fi, constants$1371.PFNWGLCREATEPBUFFERARBPROC$FUNC, session);
    }
    static PFNWGLCREATEPBUFFERARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hDC, int _iPixelFormat, int _iWidth, int _iHeight, java.lang.foreign.MemoryAddress _piAttribList) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$1371.PFNWGLCREATEPBUFFERARBPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hDC, _iPixelFormat, _iWidth, _iHeight, (java.lang.foreign.Addressable)_piAttribList);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


