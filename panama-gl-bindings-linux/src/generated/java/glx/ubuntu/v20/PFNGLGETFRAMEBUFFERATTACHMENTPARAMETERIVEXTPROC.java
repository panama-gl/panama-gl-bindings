// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC {

    void apply(int target, int attachment, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC.class, fi, constants$715.PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC$FUNC, session);
    }
    static PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _attachment, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$715.PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC$MH.invokeExact((Addressable)symbol, _target, _attachment, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

