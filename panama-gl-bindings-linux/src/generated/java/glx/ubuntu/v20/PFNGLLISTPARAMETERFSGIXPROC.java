// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLLISTPARAMETERFSGIXPROC {

    void apply(int list, int pname, float param);
    static MemorySegment allocate(PFNGLLISTPARAMETERFSGIXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLLISTPARAMETERFSGIXPROC.class, fi, constants$987.PFNGLLISTPARAMETERFSGIXPROC$FUNC, session);
    }
    static PFNGLLISTPARAMETERFSGIXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _list, int _pname, float _param) -> {
            try {
                constants$987.PFNGLLISTPARAMETERFSGIXPROC$MH.invokeExact((Addressable)symbol, _list, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

