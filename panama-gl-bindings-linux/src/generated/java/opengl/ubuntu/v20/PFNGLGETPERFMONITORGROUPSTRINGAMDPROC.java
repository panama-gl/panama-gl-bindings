// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETPERFMONITORGROUPSTRINGAMDPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLGETPERFMONITORGROUPSTRINGAMDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETPERFMONITORGROUPSTRINGAMDPROC.class, fi, constants$470.PFNGLGETPERFMONITORGROUPSTRINGAMDPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETPERFMONITORGROUPSTRINGAMDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETPERFMONITORGROUPSTRINGAMDPROC.class, fi, constants$470.PFNGLGETPERFMONITORGROUPSTRINGAMDPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETPERFMONITORGROUPSTRINGAMDPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$470.PFNGLGETPERFMONITORGROUPSTRINGAMDPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


