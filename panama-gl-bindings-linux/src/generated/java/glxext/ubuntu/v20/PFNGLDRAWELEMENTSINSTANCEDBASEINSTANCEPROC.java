// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROC {

    void apply(int mode, int count, int type, java.lang.foreign.MemoryAddress indices, int instancecount, int baseinstance);
    static MemorySegment allocate(PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROC.class, fi, constants$334.PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROC$FUNC, session);
    }
    static PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, int _count, int _type, java.lang.foreign.MemoryAddress _indices, int _instancecount, int _baseinstance) -> {
            try {
                constants$334.PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROC$MH.invokeExact((Addressable)symbol, _mode, _count, _type, (java.lang.foreign.Addressable)_indices, _instancecount, _baseinstance);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


