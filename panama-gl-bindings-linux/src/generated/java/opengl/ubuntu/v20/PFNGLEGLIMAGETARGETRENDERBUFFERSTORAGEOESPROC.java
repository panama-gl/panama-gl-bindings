// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC {

    void apply(int target, java.lang.foreign.MemoryAddress image);
    static MemorySegment allocate(PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC.class, fi, constants$929.PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC$FUNC, session);
    }
    static PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, java.lang.foreign.MemoryAddress _image) -> {
            try {
                constants$929.PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC$MH.invokeExact((Addressable)symbol, _target, (java.lang.foreign.Addressable)_image);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


