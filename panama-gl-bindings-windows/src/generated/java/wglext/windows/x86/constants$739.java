// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$739 {

    static final FunctionDescriptor BCryptSetProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptSetProperty$MH = RuntimeHelper.downcallHandle(
        "BCryptSetProperty",
        constants$739.BCryptSetProperty$FUNC
    );
    static final FunctionDescriptor BCryptCloseAlgorithmProvider$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptCloseAlgorithmProvider$MH = RuntimeHelper.downcallHandle(
        "BCryptCloseAlgorithmProvider",
        constants$739.BCryptCloseAlgorithmProvider$FUNC
    );
    static final FunctionDescriptor BCryptFreeBuffer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BCryptFreeBuffer$MH = RuntimeHelper.downcallHandle(
        "BCryptFreeBuffer",
        constants$739.BCryptFreeBuffer$FUNC
    );
    static final FunctionDescriptor BCryptGenerateSymmetricKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptGenerateSymmetricKey$MH = RuntimeHelper.downcallHandle(
        "BCryptGenerateSymmetricKey",
        constants$739.BCryptGenerateSymmetricKey$FUNC
    );
    static final FunctionDescriptor BCryptGenerateKeyPair$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptGenerateKeyPair$MH = RuntimeHelper.downcallHandle(
        "BCryptGenerateKeyPair",
        constants$739.BCryptGenerateKeyPair$FUNC
    );
    static final FunctionDescriptor BCryptEncrypt$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptEncrypt$MH = RuntimeHelper.downcallHandle(
        "BCryptEncrypt",
        constants$739.BCryptEncrypt$FUNC
    );
}


