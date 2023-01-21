// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTUREIMAGE2DMULTISAMPLECOVERAGENVPROC {

    void apply(int texture, int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, byte fixedSampleLocations);
    static MemorySegment allocate(PFNGLTEXTUREIMAGE2DMULTISAMPLECOVERAGENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREIMAGE2DMULTISAMPLECOVERAGENVPROC.class, fi, constants$913.PFNGLTEXTUREIMAGE2DMULTISAMPLECOVERAGENVPROC$FUNC, session);
    }
    static PFNGLTEXTUREIMAGE2DMULTISAMPLECOVERAGENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _target, int _coverageSamples, int _colorSamples, int _internalFormat, int _width, int _height, byte _fixedSampleLocations) -> {
            try {
                constants$913.PFNGLTEXTUREIMAGE2DMULTISAMPLECOVERAGENVPROC$MH.invokeExact((Addressable)symbol, _texture, _target, _coverageSamples, _colorSamples, _internalFormat, _width, _height, _fixedSampleLocations);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

