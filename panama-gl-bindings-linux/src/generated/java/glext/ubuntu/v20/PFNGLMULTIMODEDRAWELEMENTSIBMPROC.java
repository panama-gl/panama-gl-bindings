// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTIMODEDRAWELEMENTSIBMPROC {

    void apply(java.lang.foreign.MemoryAddress mode, java.lang.foreign.MemoryAddress count, int type, java.lang.foreign.MemoryAddress indices, int primcount, int modestride);
    static MemorySegment allocate(PFNGLMULTIMODEDRAWELEMENTSIBMPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTIMODEDRAWELEMENTSIBMPROC.class, fi, constants$701.PFNGLMULTIMODEDRAWELEMENTSIBMPROC$FUNC, session);
    }
    static PFNGLMULTIMODEDRAWELEMENTSIBMPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _mode, java.lang.foreign.MemoryAddress _count, int _type, java.lang.foreign.MemoryAddress _indices, int _primcount, int _modestride) -> {
            try {
                constants$701.PFNGLMULTIMODEDRAWELEMENTSIBMPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_mode, (java.lang.foreign.Addressable)_count, _type, (java.lang.foreign.Addressable)_indices, _primcount, _modestride);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


