// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLLIGHTMODELXOESPROC {

    void apply(int pname, int param);
    static MemorySegment allocate(PFNGLLIGHTMODELXOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLLIGHTMODELXOESPROC.class, fi, constants$418.PFNGLLIGHTMODELXOESPROC$FUNC, session);
    }
    static PFNGLLIGHTMODELXOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pname, int _param) -> {
            try {
                constants$418.PFNGLLIGHTMODELXOESPROC$MH.invokeExact((Addressable)symbol, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


