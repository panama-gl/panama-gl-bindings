// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$162 {

    static final FunctionDescriptor ConnectNamedPipe$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ConnectNamedPipe$MH = RuntimeHelper.downcallHandle(
        "ConnectNamedPipe",
        constants$162.ConnectNamedPipe$FUNC
    );
    static final FunctionDescriptor DisconnectNamedPipe$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DisconnectNamedPipe$MH = RuntimeHelper.downcallHandle(
        "DisconnectNamedPipe",
        constants$162.DisconnectNamedPipe$FUNC
    );
    static final FunctionDescriptor SetNamedPipeHandleState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetNamedPipeHandleState$MH = RuntimeHelper.downcallHandle(
        "SetNamedPipeHandleState",
        constants$162.SetNamedPipeHandleState$FUNC
    );
    static final FunctionDescriptor PeekNamedPipe$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PeekNamedPipe$MH = RuntimeHelper.downcallHandle(
        "PeekNamedPipe",
        constants$162.PeekNamedPipe$FUNC
    );
    static final FunctionDescriptor TransactNamedPipe$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TransactNamedPipe$MH = RuntimeHelper.downcallHandle(
        "TransactNamedPipe",
        constants$162.TransactNamedPipe$FUNC
    );
    static final FunctionDescriptor CreateNamedPipeW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateNamedPipeW$MH = RuntimeHelper.downcallHandle(
        "CreateNamedPipeW",
        constants$162.CreateNamedPipeW$FUNC
    );
}


