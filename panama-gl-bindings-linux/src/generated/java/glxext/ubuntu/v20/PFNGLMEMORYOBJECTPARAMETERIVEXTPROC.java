// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMEMORYOBJECTPARAMETERIVEXTPROC {

    void apply(int memoryObject, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLMEMORYOBJECTPARAMETERIVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMEMORYOBJECTPARAMETERIVEXTPROC.class, fi, constants$727.PFNGLMEMORYOBJECTPARAMETERIVEXTPROC$FUNC, session);
    }
    static PFNGLMEMORYOBJECTPARAMETERIVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _memoryObject, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$727.PFNGLMEMORYOBJECTPARAMETERIVEXTPROC$MH.invokeExact((Addressable)symbol, _memoryObject, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


