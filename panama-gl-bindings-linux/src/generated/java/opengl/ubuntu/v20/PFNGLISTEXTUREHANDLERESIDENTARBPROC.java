// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLISTEXTUREHANDLERESIDENTARBPROC {

    byte apply(long x0);
    static MemoryAddress allocate(PFNGLISTEXTUREHANDLERESIDENTARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISTEXTUREHANDLERESIDENTARBPROC.class, fi, constants$316.PFNGLISTEXTUREHANDLERESIDENTARBPROC$FUNC, "(J)B");
    }
    static MemoryAddress allocate(PFNGLISTEXTUREHANDLERESIDENTARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISTEXTUREHANDLERESIDENTARBPROC.class, fi, constants$316.PFNGLISTEXTUREHANDLERESIDENTARBPROC$FUNC, "(J)B", scope);
    }
    static PFNGLISTEXTUREHANDLERESIDENTARBPROC ofAddress(MemoryAddress addr) {
        return (long x0) -> {
            try {
                return (byte)constants$316.PFNGLISTEXTUREHANDLERESIDENTARBPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


