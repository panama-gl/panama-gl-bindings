// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOMBINERINPUTNVPROC {

    void apply(int stage, int portion, int variable, int input, int mapping, int componentUsage);
    static MemorySegment allocate(PFNGLCOMBINERINPUTNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOMBINERINPUTNVPROC.class, fi, constants$899.PFNGLCOMBINERINPUTNVPROC$FUNC, session);
    }
    static PFNGLCOMBINERINPUTNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _stage, int _portion, int _variable, int _input, int _mapping, int _componentUsage) -> {
            try {
                constants$899.PFNGLCOMBINERINPUTNVPROC$MH.invokeExact((Addressable)symbol, _stage, _portion, _variable, _input, _mapping, _componentUsage);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


