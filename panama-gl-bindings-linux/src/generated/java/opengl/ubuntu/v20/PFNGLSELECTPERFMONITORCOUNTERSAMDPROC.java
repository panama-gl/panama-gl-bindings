// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSELECTPERFMONITORCOUNTERSAMDPROC {

    void apply(int x0, byte x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLSELECTPERFMONITORCOUNTERSAMDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSELECTPERFMONITORCOUNTERSAMDPROC.class, fi, constants$471.PFNGLSELECTPERFMONITORCOUNTERSAMDPROC$FUNC, "(IBIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLSELECTPERFMONITORCOUNTERSAMDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSELECTPERFMONITORCOUNTERSAMDPROC.class, fi, constants$471.PFNGLSELECTPERFMONITORCOUNTERSAMDPROC$FUNC, "(IBIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLSELECTPERFMONITORCOUNTERSAMDPROC ofAddress(MemoryAddress addr) {
        return (int x0, byte x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$471.PFNGLSELECTPERFMONITORCOUNTERSAMDPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


