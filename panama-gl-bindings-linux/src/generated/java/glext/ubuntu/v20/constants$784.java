// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$784 {

    static final FunctionDescriptor PFNGLENABLEINDEXEDEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLENABLEINDEXEDEXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$784.PFNGLENABLEINDEXEDEXTPROC$FUNC
    );
    static final FunctionDescriptor PFNGLDISABLEINDEXEDEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLDISABLEINDEXEDEXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$784.PFNGLDISABLEINDEXEDEXTPROC$FUNC
    );
    static final FunctionDescriptor PFNGLISENABLEDINDEXEDEXTPROC$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLISENABLEDINDEXEDEXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$784.PFNGLISENABLEDINDEXEDEXTPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETINTEGERINDEXEDVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


