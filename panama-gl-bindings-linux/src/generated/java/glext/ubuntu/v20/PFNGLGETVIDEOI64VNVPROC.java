// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETVIDEOI64VNVPROC {

    void apply(int video_slot, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETVIDEOI64VNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETVIDEOI64VNVPROC.class, fi, constants$1168.PFNGLGETVIDEOI64VNVPROC$FUNC, session);
    }
    static PFNGLGETVIDEOI64VNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _video_slot, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$1168.PFNGLGETVIDEOI64VNVPROC$MH.invokeExact((Addressable)symbol, _video_slot, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


