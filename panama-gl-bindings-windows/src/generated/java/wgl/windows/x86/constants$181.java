// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$181 {

    static final FunctionDescriptor TlsSetValue$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TlsSetValue$MH = RuntimeHelper.downcallHandle(
        "TlsSetValue",
        constants$181.TlsSetValue$FUNC
    );
    static final FunctionDescriptor TlsFree$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle TlsFree$MH = RuntimeHelper.downcallHandle(
        "TlsFree",
        constants$181.TlsFree$FUNC
    );
    static final FunctionDescriptor CreateProcessA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateProcessA$MH = RuntimeHelper.downcallHandle(
        "CreateProcessA",
        constants$181.CreateProcessA$FUNC
    );
    static final FunctionDescriptor CreateProcessW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateProcessW$MH = RuntimeHelper.downcallHandle(
        "CreateProcessW",
        constants$181.CreateProcessW$FUNC
    );
    static final FunctionDescriptor SetProcessShutdownParameters$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetProcessShutdownParameters$MH = RuntimeHelper.downcallHandle(
        "SetProcessShutdownParameters",
        constants$181.SetProcessShutdownParameters$FUNC
    );
    static final FunctionDescriptor GetProcessVersion$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetProcessVersion$MH = RuntimeHelper.downcallHandle(
        "GetProcessVersion",
        constants$181.GetProcessVersion$FUNC
    );
}


