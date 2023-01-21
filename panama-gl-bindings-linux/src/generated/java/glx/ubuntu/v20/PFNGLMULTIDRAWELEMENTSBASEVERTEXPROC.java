// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC {

    void apply(int mode, java.lang.foreign.MemoryAddress count, int type, java.lang.foreign.MemoryAddress indices, int drawcount, java.lang.foreign.MemoryAddress basevertex);
    static MemorySegment allocate(PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC.class, fi, constants$264.PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC$FUNC, session);
    }
    static PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, java.lang.foreign.MemoryAddress _count, int _type, java.lang.foreign.MemoryAddress _indices, int _drawcount, java.lang.foreign.MemoryAddress _basevertex) -> {
            try {
                constants$264.PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC$MH.invokeExact((Addressable)symbol, _mode, (java.lang.foreign.Addressable)_count, _type, (java.lang.foreign.Addressable)_indices, _drawcount, (java.lang.foreign.Addressable)_basevertex);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


