// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$730 {

    static final FunctionDescriptor WSAAsyncGetProtoByName$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAAsyncGetProtoByName$MH = RuntimeHelper.downcallHandle(
        "WSAAsyncGetProtoByName",
        constants$730.WSAAsyncGetProtoByName$FUNC
    );
    static final FunctionDescriptor WSAAsyncGetProtoByNumber$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAAsyncGetProtoByNumber$MH = RuntimeHelper.downcallHandle(
        "WSAAsyncGetProtoByNumber",
        constants$730.WSAAsyncGetProtoByNumber$FUNC
    );
    static final FunctionDescriptor WSAAsyncGetHostByName$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAAsyncGetHostByName$MH = RuntimeHelper.downcallHandle(
        "WSAAsyncGetHostByName",
        constants$730.WSAAsyncGetHostByName$FUNC
    );
    static final FunctionDescriptor WSAAsyncGetHostByAddr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAAsyncGetHostByAddr$MH = RuntimeHelper.downcallHandle(
        "WSAAsyncGetHostByAddr",
        constants$730.WSAAsyncGetHostByAddr$FUNC
    );
    static final FunctionDescriptor WSACancelAsyncRequest$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WSACancelAsyncRequest$MH = RuntimeHelper.downcallHandle(
        "WSACancelAsyncRequest",
        constants$730.WSACancelAsyncRequest$FUNC
    );
    static final FunctionDescriptor WSAAsyncSelect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAAsyncSelect$MH = RuntimeHelper.downcallHandle(
        "WSAAsyncSelect",
        constants$730.WSAAsyncSelect$FUNC
    );
}


