// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOMPILECOMMANDLISTNVPROC {

    void apply(int list);
    static MemorySegment allocate(PFNGLCOMPILECOMMANDLISTNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOMPILECOMMANDLISTNVPROC.class, fi, constants$737.PFNGLCOMPILECOMMANDLISTNVPROC$FUNC, session);
    }
    static PFNGLCOMPILECOMMANDLISTNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _list) -> {
            try {
                constants$737.PFNGLCOMPILECOMMANDLISTNVPROC$MH.invokeExact((Addressable)symbol, _list);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


