// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETQUERYOBJECTUI64VEXTPROC {

    void apply(int id, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETQUERYOBJECTUI64VEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETQUERYOBJECTUI64VEXTPROC.class, fi, constants$673.PFNGLGETQUERYOBJECTUI64VEXTPROC$FUNC, session);
    }
    static PFNGLGETQUERYOBJECTUI64VEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$673.PFNGLGETQUERYOBJECTUI64VEXTPROC$MH.invokeExact((Addressable)symbol, _id, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


