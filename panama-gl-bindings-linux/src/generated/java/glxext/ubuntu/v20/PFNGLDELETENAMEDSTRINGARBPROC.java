// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDELETENAMEDSTRINGARBPROC {

    void apply(int namelen, java.lang.foreign.MemoryAddress name);
    static MemorySegment allocate(PFNGLDELETENAMEDSTRINGARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDELETENAMEDSTRINGARBPROC.class, fi, constants$456.PFNGLDELETENAMEDSTRINGARBPROC$FUNC, session);
    }
    static PFNGLDELETENAMEDSTRINGARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _namelen, java.lang.foreign.MemoryAddress _name) -> {
            try {
                constants$456.PFNGLDELETENAMEDSTRINGARBPROC$MH.invokeExact((Addressable)symbol, _namelen, (java.lang.foreign.Addressable)_name);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


