// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$248 {

    static final FunctionDescriptor InitializeAcl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InitializeAcl$MH = RuntimeHelper.downcallHandle(
        "InitializeAcl",
        constants$248.InitializeAcl$FUNC
    );
    static final FunctionDescriptor InitializeSecurityDescriptor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InitializeSecurityDescriptor$MH = RuntimeHelper.downcallHandle(
        "InitializeSecurityDescriptor",
        constants$248.InitializeSecurityDescriptor$FUNC
    );
    static final FunctionDescriptor InitializeSid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle InitializeSid$MH = RuntimeHelper.downcallHandle(
        "InitializeSid",
        constants$248.InitializeSid$FUNC
    );
    static final FunctionDescriptor IsTokenRestricted$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsTokenRestricted$MH = RuntimeHelper.downcallHandle(
        "IsTokenRestricted",
        constants$248.IsTokenRestricted$FUNC
    );
    static final FunctionDescriptor IsValidAcl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsValidAcl$MH = RuntimeHelper.downcallHandle(
        "IsValidAcl",
        constants$248.IsValidAcl$FUNC
    );
    static final FunctionDescriptor IsValidSecurityDescriptor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsValidSecurityDescriptor$MH = RuntimeHelper.downcallHandle(
        "IsValidSecurityDescriptor",
        constants$248.IsValidSecurityDescriptor$FUNC
    );
}

