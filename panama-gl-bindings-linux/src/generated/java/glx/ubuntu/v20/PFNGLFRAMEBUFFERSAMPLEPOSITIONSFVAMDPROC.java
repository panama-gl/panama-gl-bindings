// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC {

    void apply(int target, int numsamples, int pixelindex, java.lang.foreign.MemoryAddress values);
    static MemorySegment allocate(PFNGLFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC.class, fi, constants$539.PFNGLFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC$FUNC, session);
    }
    static PFNGLFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _numsamples, int _pixelindex, java.lang.foreign.MemoryAddress _values) -> {
            try {
                constants$539.PFNGLFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC$MH.invokeExact((Addressable)symbol, _target, _numsamples, _pixelindex, (java.lang.foreign.Addressable)_values);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


