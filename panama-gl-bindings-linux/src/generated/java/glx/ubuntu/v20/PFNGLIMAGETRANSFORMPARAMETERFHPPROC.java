// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLIMAGETRANSFORMPARAMETERFHPPROC {

    void apply(int target, int pname, float param);
    static MemorySegment allocate(PFNGLIMAGETRANSFORMPARAMETERFHPPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLIMAGETRANSFORMPARAMETERFHPPROC.class, fi, constants$784.PFNGLIMAGETRANSFORMPARAMETERFHPPROC$FUNC, session);
    }
    static PFNGLIMAGETRANSFORMPARAMETERFHPPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _pname, float _param) -> {
            try {
                constants$784.PFNGLIMAGETRANSFORMPARAMETERFHPPROC$MH.invokeExact((Addressable)symbol, _target, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


