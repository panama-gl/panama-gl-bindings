// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORDP1UIVPROC {

    void apply(int texture, int type, java.lang.foreign.MemoryAddress coords);
    static MemorySegment allocate(PFNGLMULTITEXCOORDP1UIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORDP1UIVPROC.class, fi, constants$245.PFNGLMULTITEXCOORDP1UIVPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORDP1UIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _type, java.lang.foreign.MemoryAddress _coords) -> {
            try {
                constants$245.PFNGLMULTITEXCOORDP1UIVPROC$MH.invokeExact((Addressable)symbol, _texture, _type, (java.lang.foreign.Addressable)_coords);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


