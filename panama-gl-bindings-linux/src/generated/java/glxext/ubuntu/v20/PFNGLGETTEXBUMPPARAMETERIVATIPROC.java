// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETTEXBUMPPARAMETERIVATIPROC {

    void apply(int pname, java.lang.foreign.MemoryAddress param);
    static MemorySegment allocate(PFNGLGETTEXBUMPPARAMETERIVATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXBUMPPARAMETERIVATIPROC.class, fi, constants$573.PFNGLGETTEXBUMPPARAMETERIVATIPROC$FUNC, session);
    }
    static PFNGLGETTEXBUMPPARAMETERIVATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pname, java.lang.foreign.MemoryAddress _param) -> {
            try {
                constants$573.PFNGLGETTEXBUMPPARAMETERIVATIPROC$MH.invokeExact((Addressable)symbol, _pname, (java.lang.foreign.Addressable)_param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

