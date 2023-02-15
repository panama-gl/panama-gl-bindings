// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPRIMITIVEBOUNDINGBOXARBPROC {

    void apply(float minX, float minY, float minZ, float minW, float maxX, float maxY, float maxZ, float maxW);
    static MemorySegment allocate(PFNGLPRIMITIVEBOUNDINGBOXARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPRIMITIVEBOUNDINGBOXARBPROC.class, fi, constants$397.PFNGLPRIMITIVEBOUNDINGBOXARBPROC$FUNC, session);
    }
    static PFNGLPRIMITIVEBOUNDINGBOXARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _minX, float _minY, float _minZ, float _minW, float _maxX, float _maxY, float _maxZ, float _maxW) -> {
            try {
                constants$397.PFNGLPRIMITIVEBOUNDINGBOXARBPROC$MH.invokeExact((Addressable)symbol, _minX, _minY, _minZ, _minW, _maxX, _maxY, _maxZ, _maxW);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


