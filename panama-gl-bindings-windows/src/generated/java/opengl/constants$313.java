// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$313 {

    static final FunctionDescriptor NotifyChangeEventLog$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NotifyChangeEventLog$MH = RuntimeHelper.downcallHandle(
        "NotifyChangeEventLog",
        constants$313.NotifyChangeEventLog$FUNC
    );
    static final FunctionDescriptor GetNumberOfEventLogRecords$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumberOfEventLogRecords$MH = RuntimeHelper.downcallHandle(
        "GetNumberOfEventLogRecords",
        constants$313.GetNumberOfEventLogRecords$FUNC
    );
    static final FunctionDescriptor GetOldestEventLogRecord$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetOldestEventLogRecord$MH = RuntimeHelper.downcallHandle(
        "GetOldestEventLogRecord",
        constants$313.GetOldestEventLogRecord$FUNC
    );
    static final FunctionDescriptor OpenEventLogA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenEventLogA$MH = RuntimeHelper.downcallHandle(
        "OpenEventLogA",
        constants$313.OpenEventLogA$FUNC
    );
    static final FunctionDescriptor OpenEventLogW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenEventLogW$MH = RuntimeHelper.downcallHandle(
        "OpenEventLogW",
        constants$313.OpenEventLogW$FUNC
    );
    static final FunctionDescriptor RegisterEventSourceA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterEventSourceA$MH = RuntimeHelper.downcallHandle(
        "RegisterEventSourceA",
        constants$313.RegisterEventSourceA$FUNC
    );
}


