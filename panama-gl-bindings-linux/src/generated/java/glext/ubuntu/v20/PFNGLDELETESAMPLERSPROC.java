// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDELETESAMPLERSPROC {

    void apply(int count, java.lang.foreign.MemoryAddress samplers);
    static MemorySegment allocate(PFNGLDELETESAMPLERSPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDELETESAMPLERSPROC.class, fi, constants$232.PFNGLDELETESAMPLERSPROC$FUNC, session);
    }
    static PFNGLDELETESAMPLERSPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _count, java.lang.foreign.MemoryAddress _samplers) -> {
            try {
                constants$232.PFNGLDELETESAMPLERSPROC$MH.invokeExact((Addressable)symbol, _count, (java.lang.foreign.Addressable)_samplers);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


