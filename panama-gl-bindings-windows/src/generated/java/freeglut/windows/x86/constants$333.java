// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$333 {

    static final FunctionDescriptor FindFirstVolumeMountPointA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindFirstVolumeMountPointA$MH = RuntimeHelper.downcallHandle(
        "FindFirstVolumeMountPointA",
        constants$333.FindFirstVolumeMountPointA$FUNC
    );
    static final FunctionDescriptor FindFirstVolumeMountPointW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindFirstVolumeMountPointW$MH = RuntimeHelper.downcallHandle(
        "FindFirstVolumeMountPointW",
        constants$333.FindFirstVolumeMountPointW$FUNC
    );
    static final FunctionDescriptor FindNextVolumeMountPointA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindNextVolumeMountPointA$MH = RuntimeHelper.downcallHandle(
        "FindNextVolumeMountPointA",
        constants$333.FindNextVolumeMountPointA$FUNC
    );
    static final FunctionDescriptor FindNextVolumeMountPointW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindNextVolumeMountPointW$MH = RuntimeHelper.downcallHandle(
        "FindNextVolumeMountPointW",
        constants$333.FindNextVolumeMountPointW$FUNC
    );
    static final FunctionDescriptor FindVolumeMountPointClose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindVolumeMountPointClose$MH = RuntimeHelper.downcallHandle(
        "FindVolumeMountPointClose",
        constants$333.FindVolumeMountPointClose$FUNC
    );
    static final FunctionDescriptor SetVolumeMountPointA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetVolumeMountPointA$MH = RuntimeHelper.downcallHandle(
        "SetVolumeMountPointA",
        constants$333.SetVolumeMountPointA$FUNC
    );
}


