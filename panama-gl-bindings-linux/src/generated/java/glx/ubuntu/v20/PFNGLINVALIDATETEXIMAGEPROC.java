// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLINVALIDATETEXIMAGEPROC {

    void apply(int texture, int level);
    static MemorySegment allocate(PFNGLINVALIDATETEXIMAGEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLINVALIDATETEXIMAGEPROC.class, fi, constants$341.PFNGLINVALIDATETEXIMAGEPROC$FUNC, session);
    }
    static PFNGLINVALIDATETEXIMAGEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _level) -> {
            try {
                constants$341.PFNGLINVALIDATETEXIMAGEPROC$MH.invokeExact((Addressable)symbol, _texture, _level);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

