// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETACTIVESUBROUTINENAMEPROC {

    void apply(int program, int shadertype, int index, int bufsize, java.lang.foreign.MemoryAddress length, java.lang.foreign.MemoryAddress name);
    static MemorySegment allocate(PFNGLGETACTIVESUBROUTINENAMEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETACTIVESUBROUTINENAMEPROC.class, fi, constants$213.PFNGLGETACTIVESUBROUTINENAMEPROC$FUNC, session);
    }
    static PFNGLGETACTIVESUBROUTINENAMEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _shadertype, int _index, int _bufsize, java.lang.foreign.MemoryAddress _length, java.lang.foreign.MemoryAddress _name) -> {
            try {
                constants$213.PFNGLGETACTIVESUBROUTINENAMEPROC$MH.invokeExact((Addressable)symbol, _program, _shadertype, _index, _bufsize, (java.lang.foreign.Addressable)_length, (java.lang.foreign.Addressable)_name);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


