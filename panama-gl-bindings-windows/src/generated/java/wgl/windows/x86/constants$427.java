// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$427 {

    static final FunctionDescriptor RegisterDeviceNotificationA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterDeviceNotificationA$MH = RuntimeHelper.downcallHandle(
        "RegisterDeviceNotificationA",
        constants$427.RegisterDeviceNotificationA$FUNC
    );
    static final FunctionDescriptor RegisterDeviceNotificationW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterDeviceNotificationW$MH = RuntimeHelper.downcallHandle(
        "RegisterDeviceNotificationW",
        constants$427.RegisterDeviceNotificationW$FUNC
    );
    static final FunctionDescriptor UnregisterDeviceNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterDeviceNotification$MH = RuntimeHelper.downcallHandle(
        "UnregisterDeviceNotification",
        constants$427.UnregisterDeviceNotification$FUNC
    );
    static final FunctionDescriptor RegisterPowerSettingNotification$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterPowerSettingNotification$MH = RuntimeHelper.downcallHandle(
        "RegisterPowerSettingNotification",
        constants$427.RegisterPowerSettingNotification$FUNC
    );
    static final FunctionDescriptor UnregisterPowerSettingNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterPowerSettingNotification$MH = RuntimeHelper.downcallHandle(
        "UnregisterPowerSettingNotification",
        constants$427.UnregisterPowerSettingNotification$FUNC
    );
    static final FunctionDescriptor RegisterSuspendResumeNotification$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterSuspendResumeNotification$MH = RuntimeHelper.downcallHandle(
        "RegisterSuspendResumeNotification",
        constants$427.RegisterSuspendResumeNotification$FUNC
    );
}


