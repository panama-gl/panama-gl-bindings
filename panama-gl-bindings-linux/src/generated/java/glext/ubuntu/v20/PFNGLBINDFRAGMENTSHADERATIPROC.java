// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINDFRAGMENTSHADERATIPROC {

    void apply(int id);
    static MemorySegment allocate(PFNGLBINDFRAGMENTSHADERATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINDFRAGMENTSHADERATIPROC.class, fi, constants$687.PFNGLBINDFRAGMENTSHADERATIPROC$FUNC, session);
    }
    static PFNGLBINDFRAGMENTSHADERATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id) -> {
            try {
                constants$687.PFNGLBINDFRAGMENTSHADERATIPROC$MH.invokeExact((Addressable)symbol, _id);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


