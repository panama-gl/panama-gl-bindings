// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$729 {

    static final FunctionDescriptor WSAIsBlocking$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle WSAIsBlocking$MH = RuntimeHelper.downcallHandle(
        "WSAIsBlocking",
        constants$729.WSAIsBlocking$FUNC
    );
    static final FunctionDescriptor WSAUnhookBlockingHook$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle WSAUnhookBlockingHook$MH = RuntimeHelper.downcallHandle(
        "WSAUnhookBlockingHook",
        constants$729.WSAUnhookBlockingHook$FUNC
    );
    static final FunctionDescriptor WSASetBlockingHook$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WSASetBlockingHook$MH = RuntimeHelper.downcallHandle(
        "WSASetBlockingHook",
        constants$729.WSASetBlockingHook$FUNC
    );
    static final FunctionDescriptor WSACancelBlockingCall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle WSACancelBlockingCall$MH = RuntimeHelper.downcallHandle(
        "WSACancelBlockingCall",
        constants$729.WSACancelBlockingCall$FUNC
    );
    static final FunctionDescriptor WSAAsyncGetServByName$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAAsyncGetServByName$MH = RuntimeHelper.downcallHandle(
        "WSAAsyncGetServByName",
        constants$729.WSAAsyncGetServByName$FUNC
    );
    static final FunctionDescriptor WSAAsyncGetServByPort$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAAsyncGetServByPort$MH = RuntimeHelper.downcallHandle(
        "WSAAsyncGetServByPort",
        constants$729.WSAAsyncGetServByPort$FUNC
    );
}

