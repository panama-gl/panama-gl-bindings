// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOVERSTROKEPATHINSTANCEDNVPROC {

    void apply(int numPaths, int pathNameType, java.lang.foreign.MemoryAddress paths, int pathBase, int coverMode, int transformType, java.lang.foreign.MemoryAddress transformValues);
    static MemorySegment allocate(PFNGLCOVERSTROKEPATHINSTANCEDNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOVERSTROKEPATHINSTANCEDNVPROC.class, fi, constants$881.PFNGLCOVERSTROKEPATHINSTANCEDNVPROC$FUNC, session);
    }
    static PFNGLCOVERSTROKEPATHINSTANCEDNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _numPaths, int _pathNameType, java.lang.foreign.MemoryAddress _paths, int _pathBase, int _coverMode, int _transformType, java.lang.foreign.MemoryAddress _transformValues) -> {
            try {
                constants$881.PFNGLCOVERSTROKEPATHINSTANCEDNVPROC$MH.invokeExact((Addressable)symbol, _numPaths, _pathNameType, (java.lang.foreign.Addressable)_paths, _pathBase, _coverMode, _transformType, (java.lang.foreign.Addressable)_transformValues);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


