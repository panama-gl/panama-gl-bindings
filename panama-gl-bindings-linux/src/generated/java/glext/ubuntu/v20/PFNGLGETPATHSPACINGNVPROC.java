// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETPATHSPACINGNVPROC {

    void apply(int pathListMode, int numPaths, int pathNameType, java.lang.foreign.MemoryAddress paths, int pathBase, float advanceScale, float kerningScale, int transformType, java.lang.foreign.MemoryAddress returnedSpacing);
    static MemorySegment allocate(PFNGLGETPATHSPACINGNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETPATHSPACINGNVPROC.class, fi, constants$1145.PFNGLGETPATHSPACINGNVPROC$FUNC, session);
    }
    static PFNGLGETPATHSPACINGNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pathListMode, int _numPaths, int _pathNameType, java.lang.foreign.MemoryAddress _paths, int _pathBase, float _advanceScale, float _kerningScale, int _transformType, java.lang.foreign.MemoryAddress _returnedSpacing) -> {
            try {
                constants$1145.PFNGLGETPATHSPACINGNVPROC$MH.invokeExact((Addressable)symbol, _pathListMode, _numPaths, _pathNameType, (java.lang.foreign.Addressable)_paths, _pathBase, _advanceScale, _kerningScale, _transformType, (java.lang.foreign.Addressable)_returnedSpacing);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


