// Generated by jextract

package jawt.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$43 {

    static final FunctionDescriptor scanf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle scanf$MH = RuntimeHelper.downcallHandleVariadic(
        "scanf",
        constants$43.scanf$FUNC
    );
    static final FunctionDescriptor _scanf_s_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _scanf_s_l$MH = RuntimeHelper.downcallHandleVariadic(
        "_scanf_s_l",
        constants$43._scanf_s_l$FUNC
    );
    static final FunctionDescriptor scanf_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle scanf_s$MH = RuntimeHelper.downcallHandleVariadic(
        "scanf_s",
        constants$43.scanf_s$FUNC
    );
    static final FunctionDescriptor __stdio_common_vsprintf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __stdio_common_vsprintf$MH = RuntimeHelper.downcallHandle(
        "__stdio_common_vsprintf",
        constants$43.__stdio_common_vsprintf$FUNC
    );
    static final FunctionDescriptor __stdio_common_vsprintf_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __stdio_common_vsprintf_s$MH = RuntimeHelper.downcallHandle(
        "__stdio_common_vsprintf_s",
        constants$43.__stdio_common_vsprintf_s$FUNC
    );
    static final FunctionDescriptor __stdio_common_vsnprintf_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __stdio_common_vsnprintf_s$MH = RuntimeHelper.downcallHandle(
        "__stdio_common_vsnprintf_s",
        constants$43.__stdio_common_vsnprintf_s$FUNC
    );
}

