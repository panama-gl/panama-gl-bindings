// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETLOCALCONSTANTFLOATVEXTPROC {

    void apply(int id, int value, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(PFNGLGETLOCALCONSTANTFLOATVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETLOCALCONSTANTFLOATVEXTPROC.class, fi, constants$781.PFNGLGETLOCALCONSTANTFLOATVEXTPROC$FUNC, session);
    }
    static PFNGLGETLOCALCONSTANTFLOATVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id, int _value, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$781.PFNGLGETLOCALCONSTANTFLOATVEXTPROC$MH.invokeExact((Addressable)symbol, _id, _value, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


