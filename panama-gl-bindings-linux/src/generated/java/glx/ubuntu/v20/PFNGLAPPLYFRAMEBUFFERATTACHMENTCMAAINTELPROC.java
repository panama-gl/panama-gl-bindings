// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC {

    void apply();
    static MemorySegment allocate(PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC.class, fi, constants$790.PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC$FUNC, session);
    }
    static PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$790.PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


