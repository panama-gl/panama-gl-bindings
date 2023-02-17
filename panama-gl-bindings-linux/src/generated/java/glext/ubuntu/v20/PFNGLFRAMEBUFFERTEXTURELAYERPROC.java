// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFRAMEBUFFERTEXTURELAYERPROC {

    void apply(int target, int attachment, int texture, int level, int layer);
    static MemorySegment allocate(PFNGLFRAMEBUFFERTEXTURELAYERPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERTEXTURELAYERPROC.class, fi, constants$199.PFNGLFRAMEBUFFERTEXTURELAYERPROC$FUNC, session);
    }
    static PFNGLFRAMEBUFFERTEXTURELAYERPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _attachment, int _texture, int _level, int _layer) -> {
            try {
                constants$199.PFNGLFRAMEBUFFERTEXTURELAYERPROC$MH.invokeExact((Addressable)symbol, _target, _attachment, _texture, _level, _layer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


