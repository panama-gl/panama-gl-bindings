// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLAREPROGRAMSRESIDENTNVPROC {

    byte apply(int n, java.lang.foreign.MemoryAddress programs, java.lang.foreign.MemoryAddress residences);
    static MemorySegment allocate(PFNGLAREPROGRAMSRESIDENTNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLAREPROGRAMSRESIDENTNVPROC.class, fi, constants$1227.PFNGLAREPROGRAMSRESIDENTNVPROC$FUNC, session);
    }
    static PFNGLAREPROGRAMSRESIDENTNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, java.lang.foreign.MemoryAddress _programs, java.lang.foreign.MemoryAddress _residences) -> {
            try {
                return (byte)constants$1228.PFNGLAREPROGRAMSRESIDENTNVPROC$MH.invokeExact((Addressable)symbol, _n, (java.lang.foreign.Addressable)_programs, (java.lang.foreign.Addressable)_residences);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

