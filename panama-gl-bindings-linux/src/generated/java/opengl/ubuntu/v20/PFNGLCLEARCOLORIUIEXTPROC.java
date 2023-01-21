// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCLEARCOLORIUIEXTPROC {

    void apply(int red, int green, int blue, int alpha);
    static MemorySegment allocate(PFNGLCLEARCOLORIUIEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCLEARCOLORIUIEXTPROC.class, fi, constants$670.PFNGLCLEARCOLORIUIEXTPROC$FUNC, session);
    }
    static PFNGLCLEARCOLORIUIEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _red, int _green, int _blue, int _alpha) -> {
            try {
                constants$670.PFNGLCLEARCOLORIUIEXTPROC$MH.invokeExact((Addressable)symbol, _red, _green, _blue, _alpha);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


