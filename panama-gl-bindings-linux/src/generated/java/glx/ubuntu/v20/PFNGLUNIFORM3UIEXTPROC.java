// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM3UIEXTPROC {

    void apply(int location, int v0, int v1, int v2);
    static MemorySegment allocate(PFNGLUNIFORM3UIEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM3UIEXTPROC.class, fi, constants$719.PFNGLUNIFORM3UIEXTPROC$FUNC, session);
    }
    static PFNGLUNIFORM3UIEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, int _v0, int _v1, int _v2) -> {
            try {
                constants$719.PFNGLUNIFORM3UIEXTPROC$MH.invokeExact((Addressable)symbol, _location, _v0, _v1, _v2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

