// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXWEIGHTHNVPROC {

    void apply(short weight);
    static MemorySegment allocate(PFNGLVERTEXWEIGHTHNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXWEIGHTHNVPROC.class, fi, constants$860.PFNGLVERTEXWEIGHTHNVPROC$FUNC, session);
    }
    static PFNGLVERTEXWEIGHTHNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (short _weight) -> {
            try {
                constants$860.PFNGLVERTEXWEIGHTHNVPROC$MH.invokeExact((Addressable)symbol, _weight);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


