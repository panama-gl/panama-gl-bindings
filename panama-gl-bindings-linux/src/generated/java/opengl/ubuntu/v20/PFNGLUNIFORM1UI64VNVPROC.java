// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM1UI64VNVPROC {

    void apply(int location, int count, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLUNIFORM1UI64VNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM1UI64VNVPROC.class, fi, constants$459.PFNGLUNIFORM1UI64VNVPROC$FUNC, session);
    }
    static PFNGLUNIFORM1UI64VNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, int _count, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$459.PFNGLUNIFORM1UI64VNVPROC$MH.invokeExact((Addressable)symbol, _location, _count, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


