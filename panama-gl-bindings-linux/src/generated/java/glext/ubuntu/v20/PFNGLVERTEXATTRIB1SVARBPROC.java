// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIB1SVARBPROC {

    void apply(int index, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLVERTEXATTRIB1SVARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB1SVARBPROC.class, fi, constants$386.PFNGLVERTEXATTRIB1SVARBPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIB1SVARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$386.PFNGLVERTEXATTRIB1SVARBPROC$MH.invokeExact((Addressable)symbol, _index, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


