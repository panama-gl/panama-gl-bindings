// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface _CoreCrtNonSecureSearchSortCompareFunction {

    int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
    static MemorySegment allocate(_CoreCrtNonSecureSearchSortCompareFunction fi, MemorySession session) {
        return RuntimeHelper.upcallStub(_CoreCrtNonSecureSearchSortCompareFunction.class, fi, constants$747._CoreCrtNonSecureSearchSortCompareFunction$FUNC, session);
    }
    static _CoreCrtNonSecureSearchSortCompareFunction ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
            try {
                return (int)constants$747._CoreCrtNonSecureSearchSortCompareFunction$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


