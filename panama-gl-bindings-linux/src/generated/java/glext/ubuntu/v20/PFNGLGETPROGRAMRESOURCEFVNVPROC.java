// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETPROGRAMRESOURCEFVNVPROC {

    void apply(int program, int programInterface, int index, int propCount, java.lang.foreign.MemoryAddress props, int bufSize, java.lang.foreign.MemoryAddress length, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETPROGRAMRESOURCEFVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETPROGRAMRESOURCEFVNVPROC.class, fi, constants$1151.PFNGLGETPROGRAMRESOURCEFVNVPROC$FUNC, session);
    }
    static PFNGLGETPROGRAMRESOURCEFVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _programInterface, int _index, int _propCount, java.lang.foreign.MemoryAddress _props, int _bufSize, java.lang.foreign.MemoryAddress _length, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$1151.PFNGLGETPROGRAMRESOURCEFVNVPROC$MH.invokeExact((Addressable)symbol, _program, _programInterface, _index, _propCount, (java.lang.foreign.Addressable)_props, _bufSize, (java.lang.foreign.Addressable)_length, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


