// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETMULTISAMPLEFVNVPROC {

    void apply(int pname, int index, java.lang.foreign.MemoryAddress val);
    static MemorySegment allocate(PFNGLGETMULTISAMPLEFVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETMULTISAMPLEFVNVPROC.class, fi, constants$831.PFNGLGETMULTISAMPLEFVNVPROC$FUNC, session);
    }
    static PFNGLGETMULTISAMPLEFVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pname, int _index, java.lang.foreign.MemoryAddress _val) -> {
            try {
                constants$831.PFNGLGETMULTISAMPLEFVNVPROC$MH.invokeExact((Addressable)symbol, _pname, _index, (java.lang.foreign.Addressable)_val);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


