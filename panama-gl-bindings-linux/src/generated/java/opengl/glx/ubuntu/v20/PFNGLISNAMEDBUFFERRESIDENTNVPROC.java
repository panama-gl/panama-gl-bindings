// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLISNAMEDBUFFERRESIDENTNVPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLISNAMEDBUFFERRESIDENTNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISNAMEDBUFFERRESIDENTNVPROC.class, fi, constants$906.PFNGLISNAMEDBUFFERRESIDENTNVPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLISNAMEDBUFFERRESIDENTNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISNAMEDBUFFERRESIDENTNVPROC.class, fi, constants$906.PFNGLISNAMEDBUFFERRESIDENTNVPROC$FUNC, "(I)B", scope);
    }
    static PFNGLISNAMEDBUFFERRESIDENTNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$906.PFNGLISNAMEDBUFFERRESIDENTNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

