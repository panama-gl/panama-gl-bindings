// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTIDRAWELEMENTSEXTPROC {

    void apply(int mode, java.lang.foreign.MemoryAddress count, int type, java.lang.foreign.MemoryAddress indices, int primcount);
    static MemorySegment allocate(PFNGLMULTIDRAWELEMENTSEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWELEMENTSEXTPROC.class, fi, constants$733.PFNGLMULTIDRAWELEMENTSEXTPROC$FUNC, session);
    }
    static PFNGLMULTIDRAWELEMENTSEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, java.lang.foreign.MemoryAddress _count, int _type, java.lang.foreign.MemoryAddress _indices, int _primcount) -> {
            try {
                constants$733.PFNGLMULTIDRAWELEMENTSEXTPROC$MH.invokeExact((Addressable)symbol, _mode, (java.lang.foreign.Addressable)_count, _type, (java.lang.foreign.Addressable)_indices, _primcount);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

