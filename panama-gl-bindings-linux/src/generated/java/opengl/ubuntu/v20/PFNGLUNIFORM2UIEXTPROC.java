// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM2UIEXTPROC {

    void apply(int location, int v0, int v1);
    static MemorySegment allocate(PFNGLUNIFORM2UIEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM2UIEXTPROC.class, fi, constants$633.PFNGLUNIFORM2UIEXTPROC$FUNC, session);
    }
    static PFNGLUNIFORM2UIEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, int _v0, int _v1) -> {
            try {
                constants$633.PFNGLUNIFORM2UIEXTPROC$MH.invokeExact((Addressable)symbol, _location, _v0, _v1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


