// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNAMEDSTRINGARBPROC {

    void apply(int namelen, java.lang.foreign.MemoryAddress name, int bufSize, java.lang.foreign.MemoryAddress stringlen, java.lang.foreign.MemoryAddress string);
    static MemorySegment allocate(PFNGLGETNAMEDSTRINGARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDSTRINGARBPROC.class, fi, constants$511.PFNGLGETNAMEDSTRINGARBPROC$FUNC, session);
    }
    static PFNGLGETNAMEDSTRINGARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _namelen, java.lang.foreign.MemoryAddress _name, int _bufSize, java.lang.foreign.MemoryAddress _stringlen, java.lang.foreign.MemoryAddress _string) -> {
            try {
                constants$511.PFNGLGETNAMEDSTRINGARBPROC$MH.invokeExact((Addressable)symbol, _namelen, (java.lang.foreign.Addressable)_name, _bufSize, (java.lang.foreign.Addressable)_stringlen, (java.lang.foreign.Addressable)_string);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

