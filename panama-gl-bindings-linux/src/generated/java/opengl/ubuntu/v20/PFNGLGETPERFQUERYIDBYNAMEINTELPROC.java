// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETPERFQUERYIDBYNAMEINTELPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGETPERFQUERYIDBYNAMEINTELPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETPERFQUERYIDBYNAMEINTELPROC.class, fi, constants$710.PFNGLGETPERFQUERYIDBYNAMEINTELPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETPERFQUERYIDBYNAMEINTELPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETPERFQUERYIDBYNAMEINTELPROC.class, fi, constants$710.PFNGLGETPERFQUERYIDBYNAMEINTELPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETPERFQUERYIDBYNAMEINTELPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$710.PFNGLGETPERFQUERYIDBYNAMEINTELPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


