// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNCOLORTABLEARBPROC {

    void apply(int target, int format, int type, int bufSize, java.lang.foreign.MemoryAddress table);
    static MemorySegment allocate(PFNGLGETNCOLORTABLEARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNCOLORTABLEARBPROC.class, fi, constants$483.PFNGLGETNCOLORTABLEARBPROC$FUNC, session);
    }
    static PFNGLGETNCOLORTABLEARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _format, int _type, int _bufSize, java.lang.foreign.MemoryAddress _table) -> {
            try {
                constants$483.PFNGLGETNCOLORTABLEARBPROC$MH.invokeExact((Addressable)symbol, _target, _format, _type, _bufSize, (java.lang.foreign.Addressable)_table);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


