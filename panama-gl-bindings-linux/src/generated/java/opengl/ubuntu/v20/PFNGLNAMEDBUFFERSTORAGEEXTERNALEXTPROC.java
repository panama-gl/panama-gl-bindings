// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLNAMEDBUFFERSTORAGEEXTERNALEXTPROC {

    void apply(int x0, long x1, long x2, jdk.incubator.foreign.MemoryAddress x3, int x4);
    static MemoryAddress allocate(PFNGLNAMEDBUFFERSTORAGEEXTERNALEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDBUFFERSTORAGEEXTERNALEXTPROC.class, fi, constants$622.PFNGLNAMEDBUFFERSTORAGEEXTERNALEXTPROC$FUNC, "(IJJLjdk/incubator/foreign/MemoryAddress;I)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDBUFFERSTORAGEEXTERNALEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDBUFFERSTORAGEEXTERNALEXTPROC.class, fi, constants$622.PFNGLNAMEDBUFFERSTORAGEEXTERNALEXTPROC$FUNC, "(IJJLjdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static PFNGLNAMEDBUFFERSTORAGEEXTERNALEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, long x2, jdk.incubator.foreign.MemoryAddress x3, int x4) -> {
            try {
                constants$622.PFNGLNAMEDBUFFERSTORAGEEXTERNALEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


