// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETMULTITEXIMAGEEXTPROC {

    void apply(int texunit, int target, int level, int format, int type, java.lang.foreign.MemoryAddress pixels);
    static MemorySegment allocate(PFNGLGETMULTITEXIMAGEEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETMULTITEXIMAGEEXTPROC.class, fi, constants$779.PFNGLGETMULTITEXIMAGEEXTPROC$FUNC, session);
    }
    static PFNGLGETMULTITEXIMAGEEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texunit, int _target, int _level, int _format, int _type, java.lang.foreign.MemoryAddress _pixels) -> {
            try {
                constants$779.PFNGLGETMULTITEXIMAGEEXTPROC$MH.invokeExact((Addressable)symbol, _texunit, _target, _level, _format, _type, (java.lang.foreign.Addressable)_pixels);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


