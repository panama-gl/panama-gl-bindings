// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBINORMAL3BEXTPROC {

    void apply(byte x0, byte x1, byte x2);
    static MemoryAddress allocate(PFNGLBINORMAL3BEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINORMAL3BEXTPROC.class, fi, constants$527.PFNGLBINORMAL3BEXTPROC$FUNC, "(BBB)V");
    }
    static MemoryAddress allocate(PFNGLBINORMAL3BEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINORMAL3BEXTPROC.class, fi, constants$527.PFNGLBINORMAL3BEXTPROC$FUNC, "(BBB)V", scope);
    }
    static PFNGLBINORMAL3BEXTPROC ofAddress(MemoryAddress addr) {
        return (byte x0, byte x1, byte x2) -> {
            try {
                constants$527.PFNGLBINORMAL3BEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


