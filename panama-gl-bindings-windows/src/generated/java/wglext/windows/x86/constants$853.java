// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$853 {

    static final FunctionDescriptor NdrServerUnmarshall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrServerUnmarshall$MH = RuntimeHelper.downcallHandle(
        "NdrServerUnmarshall",
        constants$853.NdrServerUnmarshall$FUNC
    );
    static final FunctionDescriptor NdrServerMarshall$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrServerMarshall$MH = RuntimeHelper.downcallHandle(
        "NdrServerMarshall",
        constants$853.NdrServerMarshall$FUNC
    );
    static final FunctionDescriptor NdrMapCommAndFaultStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NdrMapCommAndFaultStatus$MH = RuntimeHelper.downcallHandle(
        "NdrMapCommAndFaultStatus",
        constants$853.NdrMapCommAndFaultStatus$FUNC
    );
    static final FunctionDescriptor RPC_CLIENT_ALLOC$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RPC_CLIENT_ALLOC$MH = RuntimeHelper.downcallHandle(
        constants$853.RPC_CLIENT_ALLOC$FUNC
    );
    static final FunctionDescriptor RPC_CLIENT_FREE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
}


