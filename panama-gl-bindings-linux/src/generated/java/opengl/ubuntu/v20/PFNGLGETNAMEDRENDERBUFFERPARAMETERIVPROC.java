// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC {

    void apply(int renderbuffer, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC.class, fi, constants$284.PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC$FUNC, session);
    }
    static PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _renderbuffer, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$284.PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC$MH.invokeExact((Addressable)symbol, _renderbuffer, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


