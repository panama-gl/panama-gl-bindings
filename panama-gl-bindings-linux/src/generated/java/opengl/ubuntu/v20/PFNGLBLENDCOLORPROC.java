// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBLENDCOLORPROC {

    void apply(float red, float green, float blue, float alpha);
    static MemorySegment allocate(PFNGLBLENDCOLORPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBLENDCOLORPROC.class, fi, constants$106.PFNGLBLENDCOLORPROC$FUNC, session);
    }
    static PFNGLBLENDCOLORPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _red, float _green, float _blue, float _alpha) -> {
            try {
                constants$106.PFNGLBLENDCOLORPROC$MH.invokeExact((Addressable)symbol, _red, _green, _blue, _alpha);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


