// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETHISTOGRAMEXTPROC {

    void apply(int target, byte reset, int format, int type, java.lang.foreign.MemoryAddress values);
    static MemorySegment allocate(PFNGLGETHISTOGRAMEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETHISTOGRAMEXTPROC.class, fi, constants$721.PFNGLGETHISTOGRAMEXTPROC$FUNC, session);
    }
    static PFNGLGETHISTOGRAMEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, byte _reset, int _format, int _type, java.lang.foreign.MemoryAddress _values) -> {
            try {
                constants$721.PFNGLGETHISTOGRAMEXTPROC$MH.invokeExact((Addressable)symbol, _target, _reset, _format, _type, (java.lang.foreign.Addressable)_values);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


