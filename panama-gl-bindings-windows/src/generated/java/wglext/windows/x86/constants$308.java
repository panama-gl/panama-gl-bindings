// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$308 {

    static final FunctionDescriptor GetOldestEventLogRecord$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetOldestEventLogRecord$MH = RuntimeHelper.downcallHandle(
        "GetOldestEventLogRecord",
        constants$308.GetOldestEventLogRecord$FUNC
    );
    static final FunctionDescriptor OpenEventLogA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenEventLogA$MH = RuntimeHelper.downcallHandle(
        "OpenEventLogA",
        constants$308.OpenEventLogA$FUNC
    );
    static final FunctionDescriptor OpenEventLogW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenEventLogW$MH = RuntimeHelper.downcallHandle(
        "OpenEventLogW",
        constants$308.OpenEventLogW$FUNC
    );
    static final FunctionDescriptor RegisterEventSourceA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterEventSourceA$MH = RuntimeHelper.downcallHandle(
        "RegisterEventSourceA",
        constants$308.RegisterEventSourceA$FUNC
    );
    static final FunctionDescriptor RegisterEventSourceW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterEventSourceW$MH = RuntimeHelper.downcallHandle(
        "RegisterEventSourceW",
        constants$308.RegisterEventSourceW$FUNC
    );
    static final FunctionDescriptor OpenBackupEventLogA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenBackupEventLogA$MH = RuntimeHelper.downcallHandle(
        "OpenBackupEventLogA",
        constants$308.OpenBackupEventLogA$FUNC
    );
}

