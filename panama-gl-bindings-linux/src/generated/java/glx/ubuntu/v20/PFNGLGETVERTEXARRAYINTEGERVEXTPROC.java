// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETVERTEXARRAYINTEGERVEXTPROC {

    void apply(int vaobj, int pname, java.lang.foreign.MemoryAddress param);
    static MemorySegment allocate(PFNGLGETVERTEXARRAYINTEGERVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETVERTEXARRAYINTEGERVEXTPROC.class, fi, constants$692.PFNGLGETVERTEXARRAYINTEGERVEXTPROC$FUNC, session);
    }
    static PFNGLGETVERTEXARRAYINTEGERVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _vaobj, int _pname, java.lang.foreign.MemoryAddress _param) -> {
            try {
                constants$692.PFNGLGETVERTEXARRAYINTEGERVEXTPROC$MH.invokeExact((Addressable)symbol, _vaobj, _pname, (java.lang.foreign.Addressable)_param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


