// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISNAMEAMDPROC {

    byte apply(int identifier, int name);
    static MemorySegment allocate(PFNGLISNAMEAMDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISNAMEAMDPROC.class, fi, constants$468.PFNGLISNAMEAMDPROC$FUNC, session);
    }
    static PFNGLISNAMEAMDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _identifier, int _name) -> {
            try {
                return (byte)constants$468.PFNGLISNAMEAMDPROC$MH.invokeExact((Addressable)symbol, _identifier, _name);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


