// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINDTEXTURESPROC {

    void apply(int first, int count, java.lang.foreign.MemoryAddress textures);
    static MemorySegment allocate(PFNGLBINDTEXTURESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINDTEXTURESPROC.class, fi, constants$269.PFNGLBINDTEXTURESPROC$FUNC, session);
    }
    static PFNGLBINDTEXTURESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _first, int _count, java.lang.foreign.MemoryAddress _textures) -> {
            try {
                constants$269.PFNGLBINDTEXTURESPROC$MH.invokeExact((Addressable)symbol, _first, _count, (java.lang.foreign.Addressable)_textures);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


