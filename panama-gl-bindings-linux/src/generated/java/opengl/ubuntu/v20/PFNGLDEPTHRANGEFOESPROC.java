// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDEPTHRANGEFOESPROC {

    void apply(float n, float f);
    static MemorySegment allocate(PFNGLDEPTHRANGEFOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDEPTHRANGEFOESPROC.class, fi, constants$449.PFNGLDEPTHRANGEFOESPROC$FUNC, session);
    }
    static PFNGLDEPTHRANGEFOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _n, float _f) -> {
            try {
                constants$449.PFNGLDEPTHRANGEFOESPROC$MH.invokeExact((Addressable)symbol, _n, _f);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


