// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETQUERYBUFFEROBJECTUIVPROC {

    void apply(int id, int buffer, int pname, long offset);
    static MemorySegment allocate(PFNGLGETQUERYBUFFEROBJECTUIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETQUERYBUFFEROBJECTUIVPROC.class, fi, constants$302.PFNGLGETQUERYBUFFEROBJECTUIVPROC$FUNC, session);
    }
    static PFNGLGETQUERYBUFFEROBJECTUIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id, int _buffer, int _pname, long _offset) -> {
            try {
                constants$302.PFNGLGETQUERYBUFFEROBJECTUIVPROC$MH.invokeExact((Addressable)symbol, _id, _buffer, _pname, _offset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


