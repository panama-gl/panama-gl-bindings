// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXPARAMETERIEXTPROC {

    void apply(int texunit, int target, int pname, int param);
    static MemorySegment allocate(PFNGLMULTITEXPARAMETERIEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXPARAMETERIEXTPROC.class, fi, constants$775.PFNGLMULTITEXPARAMETERIEXTPROC$FUNC, session);
    }
    static PFNGLMULTITEXPARAMETERIEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texunit, int _target, int _pname, int _param) -> {
            try {
                constants$775.PFNGLMULTITEXPARAMETERIEXTPROC$MH.invokeExact((Addressable)symbol, _texunit, _target, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

