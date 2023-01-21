// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPATHGLYPHSNVPROC {

    void apply(int firstPathName, int fontTarget, java.lang.foreign.MemoryAddress fontName, int fontStyle, int numGlyphs, int type, java.lang.foreign.MemoryAddress charcodes, int handleMissingGlyphs, int pathParameterTemplate, float emScale);
    static MemorySegment allocate(PFNGLPATHGLYPHSNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPATHGLYPHSNVPROC.class, fi, constants$874.PFNGLPATHGLYPHSNVPROC$FUNC, session);
    }
    static PFNGLPATHGLYPHSNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _firstPathName, int _fontTarget, java.lang.foreign.MemoryAddress _fontName, int _fontStyle, int _numGlyphs, int _type, java.lang.foreign.MemoryAddress _charcodes, int _handleMissingGlyphs, int _pathParameterTemplate, float _emScale) -> {
            try {
                constants$874.PFNGLPATHGLYPHSNVPROC$MH.invokeExact((Addressable)symbol, _firstPathName, _fontTarget, (java.lang.foreign.Addressable)_fontName, _fontStyle, _numGlyphs, _type, (java.lang.foreign.Addressable)_charcodes, _handleMissingGlyphs, _pathParameterTemplate, _emScale);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

