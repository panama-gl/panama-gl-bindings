// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETTEXTURESAMPLERHANDLENVPROC {

    long apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLGETTEXTURESAMPLERHANDLENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTURESAMPLERHANDLENVPROC.class, fi, constants$727.PFNGLGETTEXTURESAMPLERHANDLENVPROC$FUNC, "(II)J");
    }
    static MemoryAddress allocate(PFNGLGETTEXTURESAMPLERHANDLENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTURESAMPLERHANDLENVPROC.class, fi, constants$727.PFNGLGETTEXTURESAMPLERHANDLENVPROC$FUNC, "(II)J", scope);
    }
    static PFNGLGETTEXTURESAMPLERHANDLENVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                return (long)constants$727.PFNGLGETTEXTURESAMPLERHANDLENVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


