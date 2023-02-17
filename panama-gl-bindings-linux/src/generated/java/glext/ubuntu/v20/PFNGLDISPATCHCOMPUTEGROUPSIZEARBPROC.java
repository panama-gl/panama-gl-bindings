// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDISPATCHCOMPUTEGROUPSIZEARBPROC {

    void apply(int num_groups_x, int num_groups_y, int num_groups_z, int group_size_x, int group_size_y, int group_size_z);
    static MemorySegment allocate(PFNGLDISPATCHCOMPUTEGROUPSIZEARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDISPATCHCOMPUTEGROUPSIZEARBPROC.class, fi, constants$431.PFNGLDISPATCHCOMPUTEGROUPSIZEARBPROC$FUNC, session);
    }
    static PFNGLDISPATCHCOMPUTEGROUPSIZEARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _num_groups_x, int _num_groups_y, int _num_groups_z, int _group_size_x, int _group_size_y, int _group_size_z) -> {
            try {
                constants$432.PFNGLDISPATCHCOMPUTEGROUPSIZEARBPROC$MH.invokeExact((Addressable)symbol, _num_groups_x, _num_groups_y, _num_groups_z, _group_size_x, _group_size_y, _group_size_z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


