// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$828 {

    static final FunctionDescriptor CS_TYPE_TO_NETCS_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CS_TYPE_TO_NETCS_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$828.CS_TYPE_TO_NETCS_ROUTINE$FUNC
    );
    static final FunctionDescriptor CS_TYPE_FROM_NETCS_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CS_TYPE_FROM_NETCS_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$828.CS_TYPE_FROM_NETCS_ROUTINE$FUNC
    );
    static final FunctionDescriptor CS_TAG_GETTING_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CS_TAG_GETTING_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$828.CS_TAG_GETTING_ROUTINE$FUNC
    );
    static final FunctionDescriptor RpcCsGetTags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcCsGetTags$MH = RuntimeHelper.downcallHandle(
        "RpcCsGetTags",
        constants$828.RpcCsGetTags$FUNC
    );
}


