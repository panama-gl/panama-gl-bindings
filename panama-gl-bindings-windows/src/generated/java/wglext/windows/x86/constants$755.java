// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$755 {

    static final FunctionDescriptor CryptInstallOIDFunctionAddress$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptInstallOIDFunctionAddress$MH = RuntimeHelper.downcallHandle(
        "CryptInstallOIDFunctionAddress",
        constants$755.CryptInstallOIDFunctionAddress$FUNC
    );
    static final FunctionDescriptor CryptInitOIDFunctionSet$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptInitOIDFunctionSet$MH = RuntimeHelper.downcallHandle(
        "CryptInitOIDFunctionSet",
        constants$755.CryptInitOIDFunctionSet$FUNC
    );
    static final FunctionDescriptor CryptGetOIDFunctionAddress$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGetOIDFunctionAddress$MH = RuntimeHelper.downcallHandle(
        "CryptGetOIDFunctionAddress",
        constants$755.CryptGetOIDFunctionAddress$FUNC
    );
    static final FunctionDescriptor CryptGetDefaultOIDDllList$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGetDefaultOIDDllList$MH = RuntimeHelper.downcallHandle(
        "CryptGetDefaultOIDDllList",
        constants$755.CryptGetDefaultOIDDllList$FUNC
    );
    static final FunctionDescriptor CryptGetDefaultOIDFunctionAddress$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGetDefaultOIDFunctionAddress$MH = RuntimeHelper.downcallHandle(
        "CryptGetDefaultOIDFunctionAddress",
        constants$755.CryptGetDefaultOIDFunctionAddress$FUNC
    );
    static final FunctionDescriptor CryptFreeOIDFunctionAddress$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptFreeOIDFunctionAddress$MH = RuntimeHelper.downcallHandle(
        "CryptFreeOIDFunctionAddress",
        constants$755.CryptFreeOIDFunctionAddress$FUNC
    );
}

