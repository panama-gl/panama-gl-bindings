// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCREATEPERFQUERYINTELPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLCREATEPERFQUERYINTELPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCREATEPERFQUERYINTELPROC.class, fi, constants$708.PFNGLCREATEPERFQUERYINTELPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCREATEPERFQUERYINTELPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCREATEPERFQUERYINTELPROC.class, fi, constants$708.PFNGLCREATEPERFQUERYINTELPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCREATEPERFQUERYINTELPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$708.PFNGLCREATEPERFQUERYINTELPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


