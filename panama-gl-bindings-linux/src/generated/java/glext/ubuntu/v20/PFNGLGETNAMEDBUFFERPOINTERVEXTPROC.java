// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNAMEDBUFFERPOINTERVEXTPROC {

    void apply(int buffer, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETNAMEDBUFFERPOINTERVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDBUFFERPOINTERVEXTPROC.class, fi, constants$793.PFNGLGETNAMEDBUFFERPOINTERVEXTPROC$FUNC, session);
    }
    static PFNGLGETNAMEDBUFFERPOINTERVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _buffer, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$793.PFNGLGETNAMEDBUFFERPOINTERVEXTPROC$MH.invokeExact((Addressable)symbol, _buffer, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


