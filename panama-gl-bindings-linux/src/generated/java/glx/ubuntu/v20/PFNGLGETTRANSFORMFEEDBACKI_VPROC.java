// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETTRANSFORMFEEDBACKI_VPROC {

    void apply(int xfb, int pname, int index, java.lang.foreign.MemoryAddress param);
    static MemorySegment allocate(PFNGLGETTRANSFORMFEEDBACKI_VPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETTRANSFORMFEEDBACKI_VPROC.class, fi, constants$357.PFNGLGETTRANSFORMFEEDBACKI_VPROC$FUNC, session);
    }
    static PFNGLGETTRANSFORMFEEDBACKI_VPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _xfb, int _pname, int _index, java.lang.foreign.MemoryAddress _param) -> {
            try {
                constants$357.PFNGLGETTRANSFORMFEEDBACKI_VPROC$MH.invokeExact((Addressable)symbol, _xfb, _pname, _index, (java.lang.foreign.Addressable)_param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


