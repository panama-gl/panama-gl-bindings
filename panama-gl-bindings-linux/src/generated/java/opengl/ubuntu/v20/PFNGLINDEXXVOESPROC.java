// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLINDEXXVOESPROC {

    void apply(java.lang.foreign.MemoryAddress component);
    static MemorySegment allocate(PFNGLINDEXXVOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLINDEXXVOESPROC.class, fi, constants$433.PFNGLINDEXXVOESPROC$FUNC, session);
    }
    static PFNGLINDEXXVOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _component) -> {
            try {
                constants$433.PFNGLINDEXXVOESPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_component);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


