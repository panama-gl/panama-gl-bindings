// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$901 {

    static final FunctionDescriptor ReadPrinter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadPrinter$MH = RuntimeHelper.downcallHandle(
        "ReadPrinter",
        constants$901.ReadPrinter$FUNC
    );
    static final FunctionDescriptor EndDocPrinter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EndDocPrinter$MH = RuntimeHelper.downcallHandle(
        "EndDocPrinter",
        constants$901.EndDocPrinter$FUNC
    );
    static final FunctionDescriptor AddJobA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddJobA$MH = RuntimeHelper.downcallHandle(
        "AddJobA",
        constants$901.AddJobA$FUNC
    );
    static final FunctionDescriptor AddJobW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddJobW$MH = RuntimeHelper.downcallHandle(
        "AddJobW",
        constants$901.AddJobW$FUNC
    );
    static final FunctionDescriptor ScheduleJob$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ScheduleJob$MH = RuntimeHelper.downcallHandle(
        "ScheduleJob",
        constants$901.ScheduleJob$FUNC
    );
    static final FunctionDescriptor PrinterProperties$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PrinterProperties$MH = RuntimeHelper.downcallHandle(
        "PrinterProperties",
        constants$901.PrinterProperties$FUNC
    );
}


