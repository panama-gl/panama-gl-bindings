// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM3UI64VARBPROC {

    void apply(int location, int count, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLUNIFORM3UI64VARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM3UI64VARBPROC.class, fi, constants$454.PFNGLUNIFORM3UI64VARBPROC$FUNC, session);
    }
    static PFNGLUNIFORM3UI64VARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, int _count, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$455.PFNGLUNIFORM3UI64VARBPROC$MH.invokeExact((Addressable)symbol, _location, _count, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


