// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBI4BVPROC {

    void apply(int index, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLVERTEXATTRIBI4BVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI4BVPROC.class, fi, constants$184.PFNGLVERTEXATTRIBI4BVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBI4BVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$185.PFNGLVERTEXATTRIBI4BVPROC$MH.invokeExact((Addressable)symbol, _index, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


