// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLLIGHTXOESPROC {

    void apply(int light, int pname, int param);
    static MemorySegment allocate(PFNGLLIGHTXOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLLIGHTXOESPROC.class, fi, constants$418.PFNGLLIGHTXOESPROC$FUNC, session);
    }
    static PFNGLLIGHTXOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _light, int _pname, int _param) -> {
            try {
                constants$418.PFNGLLIGHTXOESPROC$MH.invokeExact((Addressable)symbol, _light, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


