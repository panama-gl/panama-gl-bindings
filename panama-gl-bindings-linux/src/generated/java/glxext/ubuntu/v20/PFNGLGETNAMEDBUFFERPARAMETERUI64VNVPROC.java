// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC {

    void apply(int buffer, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC.class, fi, constants$907.PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC$FUNC, session);
    }
    static PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _buffer, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$907.PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC$MH.invokeExact((Addressable)symbol, _buffer, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

