// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTURECOLORMASKSGISPROC {

    void apply(byte red, byte green, byte blue, byte alpha);
    static MemorySegment allocate(PFNGLTEXTURECOLORMASKSGISPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURECOLORMASKSGISPROC.class, fi, constants$889.PFNGLTEXTURECOLORMASKSGISPROC$FUNC, session);
    }
    static PFNGLTEXTURECOLORMASKSGISPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (byte _red, byte _green, byte _blue, byte _alpha) -> {
            try {
                constants$889.PFNGLTEXTURECOLORMASKSGISPROC$MH.invokeExact((Addressable)symbol, _red, _green, _blue, _alpha);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


