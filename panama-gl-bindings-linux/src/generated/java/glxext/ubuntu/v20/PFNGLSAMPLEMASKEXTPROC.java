// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSAMPLEMASKEXTPROC {

    void apply(float value, byte invert);
    static MemorySegment allocate(PFNGLSAMPLEMASKEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSAMPLEMASKEXTPROC.class, fi, constants$734.PFNGLSAMPLEMASKEXTPROC$FUNC, session);
    }
    static PFNGLSAMPLEMASKEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _value, byte _invert) -> {
            try {
                constants$734.PFNGLSAMPLEMASKEXTPROC$MH.invokeExact((Addressable)symbol, _value, _invert);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


