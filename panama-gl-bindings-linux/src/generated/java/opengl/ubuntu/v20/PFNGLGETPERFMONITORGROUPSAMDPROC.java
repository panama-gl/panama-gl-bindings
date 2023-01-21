// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETPERFMONITORGROUPSAMDPROC {

    void apply(java.lang.foreign.MemoryAddress numGroups, int groupsSize, java.lang.foreign.MemoryAddress groups);
    static MemorySegment allocate(PFNGLGETPERFMONITORGROUPSAMDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETPERFMONITORGROUPSAMDPROC.class, fi, constants$469.PFNGLGETPERFMONITORGROUPSAMDPROC$FUNC, session);
    }
    static PFNGLGETPERFMONITORGROUPSAMDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _numGroups, int _groupsSize, java.lang.foreign.MemoryAddress _groups) -> {
            try {
                constants$469.PFNGLGETPERFMONITORGROUPSAMDPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_numGroups, _groupsSize, (java.lang.foreign.Addressable)_groups);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


