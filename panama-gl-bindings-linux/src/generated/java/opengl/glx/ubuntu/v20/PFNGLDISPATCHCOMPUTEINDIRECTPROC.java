// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDISPATCHCOMPUTEINDIRECTPROC {

    void apply(long x0);
    static MemoryAddress allocate(PFNGLDISPATCHCOMPUTEINDIRECTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDISPATCHCOMPUTEINDIRECTPROC.class, fi, constants$339.PFNGLDISPATCHCOMPUTEINDIRECTPROC$FUNC, "(J)V");
    }
    static MemoryAddress allocate(PFNGLDISPATCHCOMPUTEINDIRECTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDISPATCHCOMPUTEINDIRECTPROC.class, fi, constants$339.PFNGLDISPATCHCOMPUTEINDIRECTPROC$FUNC, "(J)V", scope);
    }
    static PFNGLDISPATCHCOMPUTEINDIRECTPROC ofAddress(MemoryAddress addr) {
        return (long x0) -> {
            try {
                constants$339.PFNGLDISPATCHCOMPUTEINDIRECTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


