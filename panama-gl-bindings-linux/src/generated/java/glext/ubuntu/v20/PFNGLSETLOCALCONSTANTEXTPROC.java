// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSETLOCALCONSTANTEXTPROC {

    void apply(int id, int type, java.lang.foreign.MemoryAddress addr);
    static MemorySegment allocate(PFNGLSETLOCALCONSTANTEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSETLOCALCONSTANTEXTPROC.class, fi, constants$981.PFNGLSETLOCALCONSTANTEXTPROC$FUNC, session);
    }
    static PFNGLSETLOCALCONSTANTEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id, int _type, java.lang.foreign.MemoryAddress _addr) -> {
            try {
                constants$981.PFNGLSETLOCALCONSTANTEXTPROC$MH.invokeExact((Addressable)symbol, _id, _type, (java.lang.foreign.Addressable)_addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


