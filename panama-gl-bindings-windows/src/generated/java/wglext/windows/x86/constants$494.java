// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$494 {

    static final FunctionDescriptor ChildWindowFromPoint$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT")
    );
    static final MethodHandle ChildWindowFromPoint$MH = RuntimeHelper.downcallHandle(
        "ChildWindowFromPoint",
        constants$494.ChildWindowFromPoint$FUNC
    );
    static final FunctionDescriptor ClipCursor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ClipCursor$MH = RuntimeHelper.downcallHandle(
        "ClipCursor",
        constants$494.ClipCursor$FUNC
    );
    static final FunctionDescriptor ChildWindowFromPointEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT"),
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ChildWindowFromPointEx$MH = RuntimeHelper.downcallHandle(
        "ChildWindowFromPointEx",
        constants$494.ChildWindowFromPointEx$FUNC
    );
    static final FunctionDescriptor GetSysColor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSysColor$MH = RuntimeHelper.downcallHandle(
        "GetSysColor",
        constants$494.GetSysColor$FUNC
    );
    static final FunctionDescriptor GetSysColorBrush$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSysColorBrush$MH = RuntimeHelper.downcallHandle(
        "GetSysColorBrush",
        constants$494.GetSysColorBrush$FUNC
    );
    static final FunctionDescriptor SetSysColors$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetSysColors$MH = RuntimeHelper.downcallHandle(
        "SetSysColors",
        constants$494.SetSysColors$FUNC
    );
}


