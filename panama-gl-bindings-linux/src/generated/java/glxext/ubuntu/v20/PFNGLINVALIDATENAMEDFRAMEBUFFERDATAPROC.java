// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC {

    void apply(int framebuffer, int numAttachments, java.lang.foreign.MemoryAddress attachments);
    static MemorySegment allocate(PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC.class, fi, constants$365.PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC$FUNC, session);
    }
    static PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _framebuffer, int _numAttachments, java.lang.foreign.MemoryAddress _attachments) -> {
            try {
                constants$365.PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC$MH.invokeExact((Addressable)symbol, _framebuffer, _numAttachments, (java.lang.foreign.Addressable)_attachments);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


