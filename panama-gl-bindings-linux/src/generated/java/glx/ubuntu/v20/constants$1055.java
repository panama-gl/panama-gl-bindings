// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1055 {

    static final FunctionDescriptor PFNGLXBINDSWAPBARRIERSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLXBINDSWAPBARRIERSGIXPROC$MH = RuntimeHelper.downcallHandle(
        constants$1055.PFNGLXBINDSWAPBARRIERSGIXPROC$FUNC
    );
    static final FunctionDescriptor PFNGLXQUERYMAXSWAPBARRIERSSGIXPROC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLXQUERYMAXSWAPBARRIERSSGIXPROC$MH = RuntimeHelper.downcallHandle(
        constants$1055.PFNGLXQUERYMAXSWAPBARRIERSSGIXPROC$FUNC
    );
    static final FunctionDescriptor PFNGLXJOINSWAPGROUPSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle PFNGLXJOINSWAPGROUPSGIXPROC$MH = RuntimeHelper.downcallHandle(
        constants$1055.PFNGLXJOINSWAPGROUPSGIXPROC$FUNC
    );
    static final FunctionDescriptor PFNGLXBINDCHANNELTOWINDOWSGIXPROC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
}


