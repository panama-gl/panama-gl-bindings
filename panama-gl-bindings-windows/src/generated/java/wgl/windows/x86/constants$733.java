// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$733 {

    static final FunctionDescriptor CryptSetHashParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptSetHashParam$MH = RuntimeHelper.downcallHandle(
        "CryptSetHashParam",
        constants$733.CryptSetHashParam$FUNC
    );
    static final FunctionDescriptor CryptGetHashParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptGetHashParam$MH = RuntimeHelper.downcallHandle(
        "CryptGetHashParam",
        constants$733.CryptGetHashParam$FUNC
    );
    static final FunctionDescriptor CryptSetProvParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptSetProvParam$MH = RuntimeHelper.downcallHandle(
        "CryptSetProvParam",
        constants$733.CryptSetProvParam$FUNC
    );
    static final FunctionDescriptor CryptGetProvParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptGetProvParam$MH = RuntimeHelper.downcallHandle(
        "CryptGetProvParam",
        constants$733.CryptGetProvParam$FUNC
    );
    static final FunctionDescriptor CryptGenRandom$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGenRandom$MH = RuntimeHelper.downcallHandle(
        "CryptGenRandom",
        constants$733.CryptGenRandom$FUNC
    );
    static final FunctionDescriptor CryptGetUserKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGetUserKey$MH = RuntimeHelper.downcallHandle(
        "CryptGetUserKey",
        constants$733.CryptGetUserKey$FUNC
    );
}


