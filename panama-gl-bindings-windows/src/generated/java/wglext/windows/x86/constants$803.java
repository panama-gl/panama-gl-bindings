// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$803 {

    static final FunctionDescriptor PFN_CRYPT_ASYNC_PARAM_FREE_FUNC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_ASYNC_PARAM_FREE_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$803.PFN_CRYPT_ASYNC_PARAM_FREE_FUNC$FUNC
    );
    static final FunctionDescriptor CryptCreateAsyncHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptCreateAsyncHandle$MH = RuntimeHelper.downcallHandle(
        "CryptCreateAsyncHandle",
        constants$803.CryptCreateAsyncHandle$FUNC
    );
    static final FunctionDescriptor CryptSetAsyncParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptSetAsyncParam$MH = RuntimeHelper.downcallHandle(
        "CryptSetAsyncParam",
        constants$803.CryptSetAsyncParam$FUNC
    );
    static final FunctionDescriptor CryptGetAsyncParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGetAsyncParam$MH = RuntimeHelper.downcallHandle(
        "CryptGetAsyncParam",
        constants$803.CryptGetAsyncParam$FUNC
    );
    static final FunctionDescriptor CryptCloseAsyncHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptCloseAsyncHandle$MH = RuntimeHelper.downcallHandle(
        "CryptCloseAsyncHandle",
        constants$803.CryptCloseAsyncHandle$FUNC
    );
}


