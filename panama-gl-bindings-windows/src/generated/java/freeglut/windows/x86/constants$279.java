// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$279 {

    static final FunctionDescriptor DosDateTimeToFileTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DosDateTimeToFileTime$MH = RuntimeHelper.downcallHandle(
        "DosDateTimeToFileTime",
        constants$279.DosDateTimeToFileTime$FUNC
    );
    static final FunctionDescriptor FormatMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FormatMessageA$MH = RuntimeHelper.downcallHandle(
        "FormatMessageA",
        constants$279.FormatMessageA$FUNC
    );
    static final FunctionDescriptor FormatMessageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FormatMessageW$MH = RuntimeHelper.downcallHandle(
        "FormatMessageW",
        constants$279.FormatMessageW$FUNC
    );
    static final FunctionDescriptor CreateMailslotA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateMailslotA$MH = RuntimeHelper.downcallHandle(
        "CreateMailslotA",
        constants$279.CreateMailslotA$FUNC
    );
    static final FunctionDescriptor CreateMailslotW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateMailslotW$MH = RuntimeHelper.downcallHandle(
        "CreateMailslotW",
        constants$279.CreateMailslotW$FUNC
    );
    static final FunctionDescriptor GetMailslotInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMailslotInfo$MH = RuntimeHelper.downcallHandle(
        "GetMailslotInfo",
        constants$279.GetMailslotInfo$FUNC
    );
}


