// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLIMAGETRANSFORMPARAMETERIHPPROC {

    void apply(int target, int pname, int param);
    static MemorySegment allocate(PFNGLIMAGETRANSFORMPARAMETERIHPPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLIMAGETRANSFORMPARAMETERIHPPROC.class, fi, constants$1002.PFNGLIMAGETRANSFORMPARAMETERIHPPROC$FUNC, session);
    }
    static PFNGLIMAGETRANSFORMPARAMETERIHPPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _pname, int _param) -> {
            try {
                constants$1002.PFNGLIMAGETRANSFORMPARAMETERIHPPROC$MH.invokeExact((Addressable)symbol, _target, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


