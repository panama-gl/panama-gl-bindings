// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINDFRAGDATALOCATIONINDEXEDPROC {

    void apply(int program, int colorNumber, int index, java.lang.foreign.MemoryAddress name);
    static MemorySegment allocate(PFNGLBINDFRAGDATALOCATIONINDEXEDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINDFRAGDATALOCATIONINDEXEDPROC.class, fi, constants$270.PFNGLBINDFRAGDATALOCATIONINDEXEDPROC$FUNC, session);
    }
    static PFNGLBINDFRAGDATALOCATIONINDEXEDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _colorNumber, int _index, java.lang.foreign.MemoryAddress _name) -> {
            try {
                constants$270.PFNGLBINDFRAGDATALOCATIONINDEXEDPROC$MH.invokeExact((Addressable)symbol, _program, _colorNumber, _index, (java.lang.foreign.Addressable)_name);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

