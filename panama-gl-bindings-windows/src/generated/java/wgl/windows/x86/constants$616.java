// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$616 {

    static final FunctionDescriptor mciGetCreatorTask$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle mciGetCreatorTask$MH = RuntimeHelper.downcallHandle(
        "mciGetCreatorTask",
        constants$616.mciGetCreatorTask$FUNC
    );
    static final FunctionDescriptor mciGetYieldProc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mciGetYieldProc$MH = RuntimeHelper.downcallHandle(
        "mciGetYieldProc",
        constants$616.mciGetYieldProc$FUNC
    );
    static final FunctionDescriptor mciGetDriverData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle mciGetDriverData$MH = RuntimeHelper.downcallHandle(
        "mciGetDriverData",
        constants$616.mciGetDriverData$FUNC
    );
    static final FunctionDescriptor mciLoadCommandResource$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle mciLoadCommandResource$MH = RuntimeHelper.downcallHandle(
        "mciLoadCommandResource",
        constants$616.mciLoadCommandResource$FUNC
    );
    static final FunctionDescriptor mciSetDriverData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mciSetDriverData$MH = RuntimeHelper.downcallHandle(
        "mciSetDriverData",
        constants$616.mciSetDriverData$FUNC
    );
    static final FunctionDescriptor mciDriverYield$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle mciDriverYield$MH = RuntimeHelper.downcallHandle(
        "mciDriverYield",
        constants$616.mciDriverYield$FUNC
    );
}


