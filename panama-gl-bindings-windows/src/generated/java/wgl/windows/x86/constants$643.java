// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$643 {

    static final FunctionDescriptor mixerGetLineControlsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle mixerGetLineControlsW$MH = RuntimeHelper.downcallHandle(
        "mixerGetLineControlsW",
        constants$643.mixerGetLineControlsW$FUNC
    );
    static final FunctionDescriptor mixerGetControlDetailsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle mixerGetControlDetailsA$MH = RuntimeHelper.downcallHandle(
        "mixerGetControlDetailsA",
        constants$643.mixerGetControlDetailsA$FUNC
    );
    static final FunctionDescriptor mixerGetControlDetailsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle mixerGetControlDetailsW$MH = RuntimeHelper.downcallHandle(
        "mixerGetControlDetailsW",
        constants$643.mixerGetControlDetailsW$FUNC
    );
    static final FunctionDescriptor mixerSetControlDetails$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle mixerSetControlDetails$MH = RuntimeHelper.downcallHandle(
        "mixerSetControlDetails",
        constants$643.mixerSetControlDetails$FUNC
    );
    static final FunctionDescriptor timeGetSystemTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle timeGetSystemTime$MH = RuntimeHelper.downcallHandle(
        "timeGetSystemTime",
        constants$643.timeGetSystemTime$FUNC
    );
    static final FunctionDescriptor timeGetTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle timeGetTime$MH = RuntimeHelper.downcallHandle(
        "timeGetTime",
        constants$643.timeGetTime$FUNC
    );
}


