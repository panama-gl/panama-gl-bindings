// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$198 {

    static final FunctionDescriptor GetTickCount64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle GetTickCount64$MH = RuntimeHelper.downcallHandle(
        "GetTickCount64",
        constants$198.GetTickCount64$FUNC
    );
    static final FunctionDescriptor GetSystemTimeAdjustment$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemTimeAdjustment$MH = RuntimeHelper.downcallHandle(
        "GetSystemTimeAdjustment",
        constants$198.GetSystemTimeAdjustment$FUNC
    );
    static final FunctionDescriptor GetSystemTimeAdjustmentPrecise$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemTimeAdjustmentPrecise$MH = RuntimeHelper.downcallHandle(
        "GetSystemTimeAdjustmentPrecise",
        constants$198.GetSystemTimeAdjustmentPrecise$FUNC
    );
    static final FunctionDescriptor GetSystemDirectoryA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSystemDirectoryA$MH = RuntimeHelper.downcallHandle(
        "GetSystemDirectoryA",
        constants$198.GetSystemDirectoryA$FUNC
    );
    static final FunctionDescriptor GetSystemDirectoryW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSystemDirectoryW$MH = RuntimeHelper.downcallHandle(
        "GetSystemDirectoryW",
        constants$198.GetSystemDirectoryW$FUNC
    );
    static final FunctionDescriptor GetWindowsDirectoryA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetWindowsDirectoryA$MH = RuntimeHelper.downcallHandle(
        "GetWindowsDirectoryA",
        constants$198.GetWindowsDirectoryA$FUNC
    );
}


