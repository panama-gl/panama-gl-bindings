// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$906 {

    static final FunctionDescriptor DeletePrinterKeyW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeletePrinterKeyW$MH = RuntimeHelper.downcallHandle(
        "DeletePrinterKeyW",
        constants$906.DeletePrinterKeyW$FUNC
    );
    static final FunctionDescriptor WaitForPrinterChange$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitForPrinterChange$MH = RuntimeHelper.downcallHandle(
        "WaitForPrinterChange",
        constants$906.WaitForPrinterChange$FUNC
    );
    static final FunctionDescriptor FindFirstPrinterChangeNotification$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindFirstPrinterChangeNotification$MH = RuntimeHelper.downcallHandle(
        "FindFirstPrinterChangeNotification",
        constants$906.FindFirstPrinterChangeNotification$FUNC
    );
    static final FunctionDescriptor FindNextPrinterChangeNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindNextPrinterChangeNotification$MH = RuntimeHelper.downcallHandle(
        "FindNextPrinterChangeNotification",
        constants$906.FindNextPrinterChangeNotification$FUNC
    );
    static final FunctionDescriptor FreePrinterNotifyInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreePrinterNotifyInfo$MH = RuntimeHelper.downcallHandle(
        "FreePrinterNotifyInfo",
        constants$906.FreePrinterNotifyInfo$FUNC
    );
    static final FunctionDescriptor FindClosePrinterChangeNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindClosePrinterChangeNotification$MH = RuntimeHelper.downcallHandle(
        "FindClosePrinterChangeNotification",
        constants$906.FindClosePrinterChangeNotification$FUNC
    );
}


