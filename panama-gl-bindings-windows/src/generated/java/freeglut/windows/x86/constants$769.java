// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$769 {

    static final FunctionDescriptor strtof$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strtof$MH = RuntimeHelper.downcallHandle(
        "strtof",
        constants$769.strtof$FUNC
    );
    static final FunctionDescriptor _strtof_l$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _strtof_l$MH = RuntimeHelper.downcallHandle(
        "_strtof_l",
        constants$769._strtof_l$FUNC
    );
    static final FunctionDescriptor strtod$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strtod$MH = RuntimeHelper.downcallHandle(
        "strtod",
        constants$769.strtod$FUNC
    );
    static final FunctionDescriptor _strtod_l$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _strtod_l$MH = RuntimeHelper.downcallHandle(
        "_strtod_l",
        constants$769._strtod_l$FUNC
    );
    static final FunctionDescriptor strtol$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle strtol$MH = RuntimeHelper.downcallHandle(
        "strtol",
        constants$769.strtol$FUNC
    );
    static final FunctionDescriptor _strtol_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _strtol_l$MH = RuntimeHelper.downcallHandle(
        "_strtol_l",
        constants$769._strtol_l$FUNC
    );
}

