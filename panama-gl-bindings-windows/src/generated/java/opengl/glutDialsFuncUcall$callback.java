// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutDialsFuncUcall$callback {

    void apply(int _x0, int _x1, java.lang.foreign.MemoryAddress _x2);
    static MemorySegment allocate(glutDialsFuncUcall$callback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutDialsFuncUcall$callback.class, fi, constants$810.glutDialsFuncUcall$callback$FUNC, session);
    }
    static glutDialsFuncUcall$callback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0, int __x1, java.lang.foreign.MemoryAddress __x2) -> {
            try {
                constants$811.glutDialsFuncUcall$callback$MH.invokeExact((Addressable)symbol, __x0, __x1, (java.lang.foreign.Addressable)__x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


