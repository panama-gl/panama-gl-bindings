// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDRAWELEMENTSINSTANCEDARBPROC {

    void apply(int mode, int count, int type, java.lang.foreign.MemoryAddress indices, int primcount);
    static MemorySegment allocate(PFNGLDRAWELEMENTSINSTANCEDARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDRAWELEMENTSINSTANCEDARBPROC.class, fi, constants$408.PFNGLDRAWELEMENTSINSTANCEDARBPROC$FUNC, session);
    }
    static PFNGLDRAWELEMENTSINSTANCEDARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, int _count, int _type, java.lang.foreign.MemoryAddress _indices, int _primcount) -> {
            try {
                constants$408.PFNGLDRAWELEMENTSINSTANCEDARBPROC$MH.invokeExact((Addressable)symbol, _mode, _count, _type, (java.lang.foreign.Addressable)_indices, _primcount);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

