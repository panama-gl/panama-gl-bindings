// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM4UI64VNVPROC {

    void apply(int location, int count, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLUNIFORM4UI64VNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM4UI64VNVPROC.class, fi, constants$546.PFNGLUNIFORM4UI64VNVPROC$FUNC, session);
    }
    static PFNGLUNIFORM4UI64VNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, int _count, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$546.PFNGLUNIFORM4UI64VNVPROC$MH.invokeExact((Addressable)symbol, _location, _count, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


