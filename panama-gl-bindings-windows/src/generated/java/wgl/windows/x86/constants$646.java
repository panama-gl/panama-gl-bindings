// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$646 {

    static final FunctionDescriptor joyConfigChanged$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joyConfigChanged$MH = RuntimeHelper.downcallHandle(
        "joyConfigChanged",
        constants$646.joyConfigChanged$FUNC
    );
    static final FunctionDescriptor Netbios$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Netbios$MH = RuntimeHelper.downcallHandle(
        "Netbios",
        constants$646.Netbios$FUNC
    );
    static final FunctionDescriptor RPC_OBJECT_INQ_FN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RPC_OBJECT_INQ_FN$MH = RuntimeHelper.downcallHandle(
        constants$646.RPC_OBJECT_INQ_FN$FUNC
    );
    static final FunctionDescriptor RPC_IF_CALLBACK_FN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RPC_IF_CALLBACK_FN$MH = RuntimeHelper.downcallHandle(
        constants$646.RPC_IF_CALLBACK_FN$FUNC
    );
}


