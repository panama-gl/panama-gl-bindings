// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$424 {

    static final FunctionDescriptor GetMessagePos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetMessagePos$MH = RuntimeHelper.downcallHandle(
        "GetMessagePos",
        constants$424.GetMessagePos$FUNC
    );
    static final FunctionDescriptor GetMessageTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetMessageTime$MH = RuntimeHelper.downcallHandle(
        "GetMessageTime",
        constants$424.GetMessageTime$FUNC
    );
    static final FunctionDescriptor GetMessageExtraInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle GetMessageExtraInfo$MH = RuntimeHelper.downcallHandle(
        "GetMessageExtraInfo",
        constants$424.GetMessageExtraInfo$FUNC
    );
    static final FunctionDescriptor GetUnpredictedMessagePos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetUnpredictedMessagePos$MH = RuntimeHelper.downcallHandle(
        "GetUnpredictedMessagePos",
        constants$424.GetUnpredictedMessagePos$FUNC
    );
    static final FunctionDescriptor IsWow64Message$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle IsWow64Message$MH = RuntimeHelper.downcallHandle(
        "IsWow64Message",
        constants$424.IsWow64Message$FUNC
    );
    static final FunctionDescriptor SetMessageExtraInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SetMessageExtraInfo$MH = RuntimeHelper.downcallHandle(
        "SetMessageExtraInfo",
        constants$424.SetMessageExtraInfo$FUNC
    );
}


