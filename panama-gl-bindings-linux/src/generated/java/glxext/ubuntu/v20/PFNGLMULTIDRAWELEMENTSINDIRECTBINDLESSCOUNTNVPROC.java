// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTIDRAWELEMENTSINDIRECTBINDLESSCOUNTNVPROC {

    void apply(int mode, int type, java.lang.foreign.MemoryAddress indirect, int drawCount, int maxDrawCount, int stride, int vertexBufferCount);
    static MemorySegment allocate(PFNGLMULTIDRAWELEMENTSINDIRECTBINDLESSCOUNTNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWELEMENTSINDIRECTBINDLESSCOUNTNVPROC.class, fi, constants$811.PFNGLMULTIDRAWELEMENTSINDIRECTBINDLESSCOUNTNVPROC$FUNC, session);
    }
    static PFNGLMULTIDRAWELEMENTSINDIRECTBINDLESSCOUNTNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, int _type, java.lang.foreign.MemoryAddress _indirect, int _drawCount, int _maxDrawCount, int _stride, int _vertexBufferCount) -> {
            try {
                constants$811.PFNGLMULTIDRAWELEMENTSINDIRECTBINDLESSCOUNTNVPROC$MH.invokeExact((Addressable)symbol, _mode, _type, (java.lang.foreign.Addressable)_indirect, _drawCount, _maxDrawCount, _stride, _vertexBufferCount);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


