// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$223 {

    static final FunctionDescriptor PFNGLPROVOKINGVERTEXPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLPROVOKINGVERTEXPROC$MH = RuntimeHelper.downcallHandle(
        constants$223.PFNGLPROVOKINGVERTEXPROC$FUNC
    );
    static final FunctionDescriptor PFNGLFENCESYNCPROC$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLFENCESYNCPROC$MH = RuntimeHelper.downcallHandle(
        constants$223.PFNGLFENCESYNCPROC$FUNC
    );
    static final FunctionDescriptor PFNGLISSYNCPROC$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLISSYNCPROC$MH = RuntimeHelper.downcallHandle(
        constants$223.PFNGLISSYNCPROC$FUNC
    );
    static final FunctionDescriptor PFNGLDELETESYNCPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
}

