// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$756 {

    static final FunctionDescriptor CryptRegisterOIDFunction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptRegisterOIDFunction$MH = RuntimeHelper.downcallHandle(
        "CryptRegisterOIDFunction",
        constants$756.CryptRegisterOIDFunction$FUNC
    );
    static final FunctionDescriptor CryptUnregisterOIDFunction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptUnregisterOIDFunction$MH = RuntimeHelper.downcallHandle(
        "CryptUnregisterOIDFunction",
        constants$756.CryptUnregisterOIDFunction$FUNC
    );
    static final FunctionDescriptor CryptRegisterDefaultOIDFunction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptRegisterDefaultOIDFunction$MH = RuntimeHelper.downcallHandle(
        "CryptRegisterDefaultOIDFunction",
        constants$756.CryptRegisterDefaultOIDFunction$FUNC
    );
    static final FunctionDescriptor CryptUnregisterDefaultOIDFunction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptUnregisterDefaultOIDFunction$MH = RuntimeHelper.downcallHandle(
        "CryptUnregisterDefaultOIDFunction",
        constants$756.CryptUnregisterDefaultOIDFunction$FUNC
    );
    static final FunctionDescriptor CryptSetOIDFunctionValue$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptSetOIDFunctionValue$MH = RuntimeHelper.downcallHandle(
        "CryptSetOIDFunctionValue",
        constants$756.CryptSetOIDFunctionValue$FUNC
    );
    static final FunctionDescriptor CryptGetOIDFunctionValue$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGetOIDFunctionValue$MH = RuntimeHelper.downcallHandle(
        "CryptGetOIDFunctionValue",
        constants$756.CryptGetOIDFunctionValue$FUNC
    );
}


