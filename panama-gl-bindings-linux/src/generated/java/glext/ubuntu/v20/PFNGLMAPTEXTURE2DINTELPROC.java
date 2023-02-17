// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMAPTEXTURE2DINTELPROC {

    java.lang.foreign.Addressable apply(int texture, int level, int access, java.lang.foreign.MemoryAddress stride, java.lang.foreign.MemoryAddress layout);
    static MemorySegment allocate(PFNGLMAPTEXTURE2DINTELPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMAPTEXTURE2DINTELPROC.class, fi, constants$1012.PFNGLMAPTEXTURE2DINTELPROC$FUNC, session);
    }
    static PFNGLMAPTEXTURE2DINTELPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _level, int _access, java.lang.foreign.MemoryAddress _stride, java.lang.foreign.MemoryAddress _layout) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$1012.PFNGLMAPTEXTURE2DINTELPROC$MH.invokeExact((Addressable)symbol, _texture, _level, _access, (java.lang.foreign.Addressable)_stride, (java.lang.foreign.Addressable)_layout);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


