// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$849 {

    static final FunctionDescriptor NdrClientInitializeNew$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NdrClientInitializeNew$MH = RuntimeHelper.downcallHandle(
        "NdrClientInitializeNew",
        constants$849.NdrClientInitializeNew$FUNC
    );
    static final FunctionDescriptor NdrServerInitializeNew$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrServerInitializeNew$MH = RuntimeHelper.downcallHandle(
        "NdrServerInitializeNew",
        constants$849.NdrServerInitializeNew$FUNC
    );
    static final FunctionDescriptor NdrServerInitializePartial$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NdrServerInitializePartial$MH = RuntimeHelper.downcallHandle(
        "NdrServerInitializePartial",
        constants$849.NdrServerInitializePartial$FUNC
    );
    static final FunctionDescriptor NdrClientInitialize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NdrClientInitialize$MH = RuntimeHelper.downcallHandle(
        "NdrClientInitialize",
        constants$849.NdrClientInitialize$FUNC
    );
    static final FunctionDescriptor NdrServerInitialize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrServerInitialize$MH = RuntimeHelper.downcallHandle(
        "NdrServerInitialize",
        constants$849.NdrServerInitialize$FUNC
    );
    static final FunctionDescriptor NdrServerInitializeUnmarshall$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrServerInitializeUnmarshall$MH = RuntimeHelper.downcallHandle(
        "NdrServerInitializeUnmarshall",
        constants$849.NdrServerInitializeUnmarshall$FUNC
    );
}


