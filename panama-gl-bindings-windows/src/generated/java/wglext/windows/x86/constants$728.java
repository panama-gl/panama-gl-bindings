// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$728 {

    static final FunctionDescriptor getprotobynumber$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle getprotobynumber$MH = RuntimeHelper.downcallHandle(
        "getprotobynumber",
        constants$728.getprotobynumber$FUNC
    );
    static final FunctionDescriptor getprotobyname$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getprotobyname$MH = RuntimeHelper.downcallHandle(
        "getprotobyname",
        constants$728.getprotobyname$FUNC
    );
    static final FunctionDescriptor WSAStartup$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WSAStartup$MH = RuntimeHelper.downcallHandle(
        "WSAStartup",
        constants$728.WSAStartup$FUNC
    );
    static final FunctionDescriptor WSACleanup$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle WSACleanup$MH = RuntimeHelper.downcallHandle(
        "WSACleanup",
        constants$728.WSACleanup$FUNC
    );
    static final FunctionDescriptor WSASetLastError$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSASetLastError$MH = RuntimeHelper.downcallHandle(
        "WSASetLastError",
        constants$728.WSASetLastError$FUNC
    );
    static final FunctionDescriptor WSAGetLastError$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle WSAGetLastError$MH = RuntimeHelper.downcallHandle(
        "WSAGetLastError",
        constants$728.WSAGetLastError$FUNC
    );
}


