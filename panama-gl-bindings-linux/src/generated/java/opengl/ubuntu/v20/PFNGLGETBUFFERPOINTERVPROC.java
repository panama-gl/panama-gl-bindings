// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETBUFFERPOINTERVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETBUFFERPOINTERVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETBUFFERPOINTERVPROC.class, fi, constants$113.PFNGLGETBUFFERPOINTERVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETBUFFERPOINTERVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETBUFFERPOINTERVPROC.class, fi, constants$113.PFNGLGETBUFFERPOINTERVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETBUFFERPOINTERVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$113.PFNGLGETBUFFERPOINTERVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


