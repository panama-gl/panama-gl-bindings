// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$252 {

    static final FunctionDescriptor ConvertPerformanceCounterToAuxiliaryCounter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ConvertPerformanceCounterToAuxiliaryCounter$MH = RuntimeHelper.downcallHandle(
        "ConvertPerformanceCounterToAuxiliaryCounter",
        constants$252.ConvertPerformanceCounterToAuxiliaryCounter$FUNC
    );
    static final FunctionDescriptor PFIBER_START_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFIBER_START_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$252.PFIBER_START_ROUTINE$FUNC
    );
    static final FunctionDescriptor LPFIBER_START_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPFIBER_START_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$252.LPFIBER_START_ROUTINE$FUNC
    );
    static final FunctionDescriptor PFIBER_CALLOUT_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}

