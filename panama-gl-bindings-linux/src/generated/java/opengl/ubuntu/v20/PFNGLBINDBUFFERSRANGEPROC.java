// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBINDBUFFERSRANGEPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5);
    static MemoryAddress allocate(PFNGLBINDBUFFERSRANGEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDBUFFERSRANGEPROC.class, fi, constants$268.PFNGLBINDBUFFERSRANGEPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLBINDBUFFERSRANGEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDBUFFERSRANGEPROC.class, fi, constants$268.PFNGLBINDBUFFERSRANGEPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLBINDBUFFERSRANGEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5) -> {
            try {
                constants$268.PFNGLBINDBUFFERSRANGEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


