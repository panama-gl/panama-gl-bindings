// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$819 {

    static final FunctionDescriptor FreeEncryptedFileMetadata$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreeEncryptedFileMetadata$MH = RuntimeHelper.downcallHandle(
        "FreeEncryptedFileMetadata",
        constants$819.FreeEncryptedFileMetadata$FUNC
    );
    static final FunctionDescriptor I_RpcNsGetBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcNsGetBuffer$MH = RuntimeHelper.downcallHandle(
        "I_RpcNsGetBuffer",
        constants$819.I_RpcNsGetBuffer$FUNC
    );
    static final FunctionDescriptor I_RpcNsSendReceive$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcNsSendReceive$MH = RuntimeHelper.downcallHandle(
        "I_RpcNsSendReceive",
        constants$819.I_RpcNsSendReceive$FUNC
    );
    static final FunctionDescriptor I_RpcNsRaiseException$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle I_RpcNsRaiseException$MH = RuntimeHelper.downcallHandle(
        "I_RpcNsRaiseException",
        constants$819.I_RpcNsRaiseException$FUNC
    );
    static final FunctionDescriptor I_RpcReBindBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcReBindBuffer$MH = RuntimeHelper.downcallHandle(
        "I_RpcReBindBuffer",
        constants$819.I_RpcReBindBuffer$FUNC
    );
    static final FunctionDescriptor I_NsServerBindSearch$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle I_NsServerBindSearch$MH = RuntimeHelper.downcallHandle(
        "I_NsServerBindSearch",
        constants$819.I_NsServerBindSearch$FUNC
    );
}


