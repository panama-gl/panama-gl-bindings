// Generated by jextract

package jawt.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$53 {

    static final FunctionDescriptor flushall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle flushall$MH = RuntimeHelper.downcallHandle(
        "flushall",
        constants$53.flushall$FUNC
    );
    static final FunctionDescriptor fputchar$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle fputchar$MH = RuntimeHelper.downcallHandle(
        "fputchar",
        constants$53.fputchar$FUNC
    );
    static final FunctionDescriptor getw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getw$MH = RuntimeHelper.downcallHandle(
        "getw",
        constants$53.getw$FUNC
    );
    static final FunctionDescriptor putw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle putw$MH = RuntimeHelper.downcallHandle(
        "putw",
        constants$53.putw$FUNC
    );
    static final FunctionDescriptor rmtmp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle rmtmp$MH = RuntimeHelper.downcallHandle(
        "rmtmp",
        constants$53.rmtmp$FUNC
    );
    static final FunctionDescriptor JNI_GetDefaultJavaVMInitArgs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JNI_GetDefaultJavaVMInitArgs$MH = RuntimeHelper.downcallHandle(
        "JNI_GetDefaultJavaVMInitArgs",
        constants$53.JNI_GetDefaultJavaVMInitArgs$FUNC
    );
}


