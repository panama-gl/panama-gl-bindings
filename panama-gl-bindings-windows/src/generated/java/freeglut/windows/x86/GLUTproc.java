// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GLUTproc {

    void apply();
    static MemorySegment allocate(GLUTproc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GLUTproc.class, fi, constants$792.GLUTproc$FUNC, session);
    }
    static GLUTproc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$792.GLUTproc$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


