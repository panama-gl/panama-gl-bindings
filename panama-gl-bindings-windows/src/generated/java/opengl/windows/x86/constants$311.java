// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$311 {

    static final FunctionDescriptor GetNamedPipeServerProcessId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNamedPipeServerProcessId$MH = RuntimeHelper.downcallHandle(
        "GetNamedPipeServerProcessId",
        constants$311.GetNamedPipeServerProcessId$FUNC
    );
    static final FunctionDescriptor GetNamedPipeServerSessionId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNamedPipeServerSessionId$MH = RuntimeHelper.downcallHandle(
        "GetNamedPipeServerSessionId",
        constants$311.GetNamedPipeServerSessionId$FUNC
    );
    static final FunctionDescriptor SetVolumeLabelA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetVolumeLabelA$MH = RuntimeHelper.downcallHandle(
        "SetVolumeLabelA",
        constants$311.SetVolumeLabelA$FUNC
    );
    static final FunctionDescriptor SetVolumeLabelW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetVolumeLabelW$MH = RuntimeHelper.downcallHandle(
        "SetVolumeLabelW",
        constants$311.SetVolumeLabelW$FUNC
    );
    static final FunctionDescriptor SetFileBandwidthReservation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetFileBandwidthReservation$MH = RuntimeHelper.downcallHandle(
        "SetFileBandwidthReservation",
        constants$311.SetFileBandwidthReservation$FUNC
    );
    static final FunctionDescriptor GetFileBandwidthReservation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFileBandwidthReservation$MH = RuntimeHelper.downcallHandle(
        "GetFileBandwidthReservation",
        constants$311.GetFileBandwidthReservation$FUNC
    );
}


