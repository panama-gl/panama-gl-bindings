// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$447 {

    static final FunctionDescriptor IsDlgButtonChecked$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsDlgButtonChecked$MH = RuntimeHelper.downcallHandle(
        "IsDlgButtonChecked",
        constants$447.IsDlgButtonChecked$FUNC
    );
    static final FunctionDescriptor SendDlgItemMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SendDlgItemMessageA$MH = RuntimeHelper.downcallHandle(
        "SendDlgItemMessageA",
        constants$447.SendDlgItemMessageA$FUNC
    );
    static final FunctionDescriptor SendDlgItemMessageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SendDlgItemMessageW$MH = RuntimeHelper.downcallHandle(
        "SendDlgItemMessageW",
        constants$447.SendDlgItemMessageW$FUNC
    );
    static final FunctionDescriptor GetNextDlgGroupItem$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetNextDlgGroupItem$MH = RuntimeHelper.downcallHandle(
        "GetNextDlgGroupItem",
        constants$447.GetNextDlgGroupItem$FUNC
    );
    static final FunctionDescriptor GetNextDlgTabItem$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetNextDlgTabItem$MH = RuntimeHelper.downcallHandle(
        "GetNextDlgTabItem",
        constants$447.GetNextDlgTabItem$FUNC
    );
    static final FunctionDescriptor GetDlgCtrlID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDlgCtrlID$MH = RuntimeHelper.downcallHandle(
        "GetDlgCtrlID",
        constants$447.GetDlgCtrlID$FUNC
    );
}

