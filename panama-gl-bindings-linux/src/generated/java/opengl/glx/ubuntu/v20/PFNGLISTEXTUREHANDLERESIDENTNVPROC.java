// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLISTEXTUREHANDLERESIDENTNVPROC {

    byte apply(long x0);
    static MemoryAddress allocate(PFNGLISTEXTUREHANDLERESIDENTNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISTEXTUREHANDLERESIDENTNVPROC.class, fi, constants$815.PFNGLISTEXTUREHANDLERESIDENTNVPROC$FUNC, "(J)B");
    }
    static MemoryAddress allocate(PFNGLISTEXTUREHANDLERESIDENTNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISTEXTUREHANDLERESIDENTNVPROC.class, fi, constants$815.PFNGLISTEXTUREHANDLERESIDENTNVPROC$FUNC, "(J)B", scope);
    }
    static PFNGLISTEXTUREHANDLERESIDENTNVPROC ofAddress(MemoryAddress addr) {
        return (long x0) -> {
            try {
                return (byte)constants$815.PFNGLISTEXTUREHANDLERESIDENTNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


