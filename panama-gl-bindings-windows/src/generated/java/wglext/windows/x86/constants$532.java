// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$532 {

    static final FunctionDescriptor GetDisplayAutoRotationPreferences$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDisplayAutoRotationPreferences$MH = RuntimeHelper.downcallHandle(
        "GetDisplayAutoRotationPreferences",
        constants$532.GetDisplayAutoRotationPreferences$FUNC
    );
    static final FunctionDescriptor GetDisplayAutoRotationPreferencesByProcessId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDisplayAutoRotationPreferencesByProcessId$MH = RuntimeHelper.downcallHandle(
        "GetDisplayAutoRotationPreferencesByProcessId",
        constants$532.GetDisplayAutoRotationPreferencesByProcessId$FUNC
    );
    static final FunctionDescriptor SetDisplayAutoRotationPreferences$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetDisplayAutoRotationPreferences$MH = RuntimeHelper.downcallHandle(
        "SetDisplayAutoRotationPreferences",
        constants$532.SetDisplayAutoRotationPreferences$FUNC
    );
    static final FunctionDescriptor IsImmersiveProcess$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsImmersiveProcess$MH = RuntimeHelper.downcallHandle(
        "IsImmersiveProcess",
        constants$532.IsImmersiveProcess$FUNC
    );
    static final FunctionDescriptor SetProcessRestrictionExemption$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetProcessRestrictionExemption$MH = RuntimeHelper.downcallHandle(
        "SetProcessRestrictionExemption",
        constants$532.SetProcessRestrictionExemption$FUNC
    );
    static final FunctionDescriptor GetDateFormatA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetDateFormatA$MH = RuntimeHelper.downcallHandle(
        "GetDateFormatA",
        constants$532.GetDateFormatA$FUNC
    );
}

