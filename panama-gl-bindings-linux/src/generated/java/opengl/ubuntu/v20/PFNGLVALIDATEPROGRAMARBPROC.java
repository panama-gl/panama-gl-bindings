// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVALIDATEPROGRAMARBPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLVALIDATEPROGRAMARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVALIDATEPROGRAMARBPROC.class, fi, constants$361.PFNGLVALIDATEPROGRAMARBPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLVALIDATEPROGRAMARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVALIDATEPROGRAMARBPROC.class, fi, constants$361.PFNGLVALIDATEPROGRAMARBPROC$FUNC, "(I)V", scope);
    }
    static PFNGLVALIDATEPROGRAMARBPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$361.PFNGLVALIDATEPROGRAMARBPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

