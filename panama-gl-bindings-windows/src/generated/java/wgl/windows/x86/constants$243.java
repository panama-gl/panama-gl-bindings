// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$243 {

    static final FunctionDescriptor IsValidSecurityDescriptor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsValidSecurityDescriptor$MH = RuntimeHelper.downcallHandle(
        "IsValidSecurityDescriptor",
        constants$243.IsValidSecurityDescriptor$FUNC
    );
    static final FunctionDescriptor IsValidSid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsValidSid$MH = RuntimeHelper.downcallHandle(
        "IsValidSid",
        constants$243.IsValidSid$FUNC
    );
    static final FunctionDescriptor IsWellKnownSid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsWellKnownSid$MH = RuntimeHelper.downcallHandle(
        "IsWellKnownSid",
        constants$243.IsWellKnownSid$FUNC
    );
    static final FunctionDescriptor MakeAbsoluteSD$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MakeAbsoluteSD$MH = RuntimeHelper.downcallHandle(
        "MakeAbsoluteSD",
        constants$243.MakeAbsoluteSD$FUNC
    );
    static final FunctionDescriptor MakeSelfRelativeSD$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MakeSelfRelativeSD$MH = RuntimeHelper.downcallHandle(
        "MakeSelfRelativeSD",
        constants$243.MakeSelfRelativeSD$FUNC
    );
    static final FunctionDescriptor MapGenericMask$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MapGenericMask$MH = RuntimeHelper.downcallHandle(
        "MapGenericMask",
        constants$243.MapGenericMask$FUNC
    );
}

