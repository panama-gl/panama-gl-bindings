// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1258 {

    static final FunctionDescriptor LPCCHOOKPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPCCHOOKPROC$MH = RuntimeHelper.downcallHandle(
        constants$1258.LPCCHOOKPROC$FUNC
    );
    static final FunctionDescriptor ChooseColorA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ChooseColorA$MH = RuntimeHelper.downcallHandle(
        "ChooseColorA",
        constants$1258.ChooseColorA$FUNC
    );
    static final FunctionDescriptor ChooseColorW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ChooseColorW$MH = RuntimeHelper.downcallHandle(
        "ChooseColorW",
        constants$1258.ChooseColorW$FUNC
    );
    static final FunctionDescriptor LPFRHOOKPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPFRHOOKPROC$MH = RuntimeHelper.downcallHandle(
        constants$1258.LPFRHOOKPROC$FUNC
    );
}

