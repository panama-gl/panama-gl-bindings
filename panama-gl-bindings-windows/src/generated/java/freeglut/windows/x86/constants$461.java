// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$461 {

    static final FunctionDescriptor VkKeyScanExA$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VkKeyScanExA$MH = RuntimeHelper.downcallHandle(
        "VkKeyScanExA",
        constants$461.VkKeyScanExA$FUNC
    );
    static final FunctionDescriptor VkKeyScanExW$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VkKeyScanExW$MH = RuntimeHelper.downcallHandle(
        "VkKeyScanExW",
        constants$461.VkKeyScanExW$FUNC
    );
    static final FunctionDescriptor keybd_event$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle keybd_event$MH = RuntimeHelper.downcallHandle(
        "keybd_event",
        constants$461.keybd_event$FUNC
    );
    static final FunctionDescriptor mouse_event$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mouse_event$MH = RuntimeHelper.downcallHandle(
        "mouse_event",
        constants$461.mouse_event$FUNC
    );
    static final FunctionDescriptor SendInput$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SendInput$MH = RuntimeHelper.downcallHandle(
        "SendInput",
        constants$461.SendInput$FUNC
    );
    static final FunctionDescriptor GetTouchInputInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetTouchInputInfo$MH = RuntimeHelper.downcallHandle(
        "GetTouchInputInfo",
        constants$461.GetTouchInputInfo$FUNC
    );
}

