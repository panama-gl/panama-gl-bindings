// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNAMEDPROGRAMSTRINGEXTPROC {

    void apply(int program, int target, int pname, java.lang.foreign.MemoryAddress string);
    static MemorySegment allocate(PFNGLGETNAMEDPROGRAMSTRINGEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDPROGRAMSTRINGEXTPROC.class, fi, constants$594.PFNGLGETNAMEDPROGRAMSTRINGEXTPROC$FUNC, session);
    }
    static PFNGLGETNAMEDPROGRAMSTRINGEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _target, int _pname, java.lang.foreign.MemoryAddress _string) -> {
            try {
                constants$594.PFNGLGETNAMEDPROGRAMSTRINGEXTPROC$MH.invokeExact((Addressable)symbol, _program, _target, _pname, (java.lang.foreign.Addressable)_string);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


