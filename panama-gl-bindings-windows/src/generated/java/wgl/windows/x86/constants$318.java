// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$318 {

    static final FunctionDescriptor GetComputerNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetComputerNameA$MH = RuntimeHelper.downcallHandle(
        "GetComputerNameA",
        constants$318.GetComputerNameA$FUNC
    );
    static final FunctionDescriptor GetComputerNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetComputerNameW$MH = RuntimeHelper.downcallHandle(
        "GetComputerNameW",
        constants$318.GetComputerNameW$FUNC
    );
    static final FunctionDescriptor DnsHostnameToComputerNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DnsHostnameToComputerNameA$MH = RuntimeHelper.downcallHandle(
        "DnsHostnameToComputerNameA",
        constants$318.DnsHostnameToComputerNameA$FUNC
    );
    static final FunctionDescriptor DnsHostnameToComputerNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DnsHostnameToComputerNameW$MH = RuntimeHelper.downcallHandle(
        "DnsHostnameToComputerNameW",
        constants$318.DnsHostnameToComputerNameW$FUNC
    );
    static final FunctionDescriptor GetUserNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUserNameA$MH = RuntimeHelper.downcallHandle(
        "GetUserNameA",
        constants$318.GetUserNameA$FUNC
    );
    static final FunctionDescriptor GetUserNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUserNameW$MH = RuntimeHelper.downcallHandle(
        "GetUserNameW",
        constants$318.GetUserNameW$FUNC
    );
}

