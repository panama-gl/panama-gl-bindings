// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1 {

    static final FunctionDescriptor _exception_code$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle _exception_code$MH = RuntimeHelper.downcallHandle(
        "_exception_code",
        constants$1._exception_code$FUNC
    );
    static final FunctionDescriptor _exception_info$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle _exception_info$MH = RuntimeHelper.downcallHandle(
        "_exception_info",
        constants$1._exception_info$FUNC
    );
    static final FunctionDescriptor _abnormal_termination$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle _abnormal_termination$MH = RuntimeHelper.downcallHandle(
        "_abnormal_termination",
        constants$1._abnormal_termination$FUNC
    );
    static final FunctionDescriptor _invalid_parameter_noinfo$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _invalid_parameter_noinfo$MH = RuntimeHelper.downcallHandle(
        "_invalid_parameter_noinfo",
        constants$1._invalid_parameter_noinfo$FUNC
    );
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
}


