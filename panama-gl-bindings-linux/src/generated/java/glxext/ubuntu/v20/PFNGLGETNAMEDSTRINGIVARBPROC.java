// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNAMEDSTRINGIVARBPROC {

    void apply(int namelen, java.lang.foreign.MemoryAddress name, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETNAMEDSTRINGIVARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDSTRINGIVARBPROC.class, fi, constants$457.PFNGLGETNAMEDSTRINGIVARBPROC$FUNC, session);
    }
    static PFNGLGETNAMEDSTRINGIVARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _namelen, java.lang.foreign.MemoryAddress _name, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$457.PFNGLGETNAMEDSTRINGIVARBPROC$MH.invokeExact((Addressable)symbol, _namelen, (java.lang.foreign.Addressable)_name, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


