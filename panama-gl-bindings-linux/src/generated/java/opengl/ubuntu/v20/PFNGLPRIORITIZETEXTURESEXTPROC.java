// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPRIORITIZETEXTURESEXTPROC {

    void apply(int n, java.lang.foreign.MemoryAddress textures, java.lang.foreign.MemoryAddress priorities);
    static MemorySegment allocate(PFNGLPRIORITIZETEXTURESEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPRIORITIZETEXTURESEXTPROC.class, fi, constants$672.PFNGLPRIORITIZETEXTURESEXTPROC$FUNC, session);
    }
    static PFNGLPRIORITIZETEXTURESEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, java.lang.foreign.MemoryAddress _textures, java.lang.foreign.MemoryAddress _priorities) -> {
            try {
                constants$672.PFNGLPRIORITIZETEXTURESEXTPROC$MH.invokeExact((Addressable)symbol, _n, (java.lang.foreign.Addressable)_textures, (java.lang.foreign.Addressable)_priorities);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


