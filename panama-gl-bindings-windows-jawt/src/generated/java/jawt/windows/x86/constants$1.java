// Generated by jextract

package jawt.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1 {

    static final FunctionDescriptor _invalid_parameter_noinfo_noreturn$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _invalid_parameter_noinfo_noreturn$MH = RuntimeHelper.downcallHandle(
        "_invalid_parameter_noinfo_noreturn",
        constants$1._invalid_parameter_noinfo_noreturn$FUNC
    );
    static final FunctionDescriptor _invoke_watson$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _invoke_watson$MH = RuntimeHelper.downcallHandle(
        "_invoke_watson",
        constants$1._invoke_watson$FUNC
    );
    static final FunctionDescriptor __local_stdio_printf_options$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __local_stdio_printf_options$MH = RuntimeHelper.downcallHandle(
        "__local_stdio_printf_options",
        constants$1.__local_stdio_printf_options$FUNC
    );
    static final FunctionDescriptor __local_stdio_scanf_options$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __local_stdio_scanf_options$MH = RuntimeHelper.downcallHandle(
        "__local_stdio_scanf_options",
        constants$1.__local_stdio_scanf_options$FUNC
    );
    static final FunctionDescriptor __acrt_iob_func$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle __acrt_iob_func$MH = RuntimeHelper.downcallHandle(
        "__acrt_iob_func",
        constants$1.__acrt_iob_func$FUNC
    );
    static final FunctionDescriptor fgetwc$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fgetwc$MH = RuntimeHelper.downcallHandle(
        "fgetwc",
        constants$1.fgetwc$FUNC
    );
}


