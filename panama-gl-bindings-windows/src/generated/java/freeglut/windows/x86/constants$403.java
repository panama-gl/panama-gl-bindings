// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$403 {

    static final FunctionDescriptor ICMENUMPROCA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ICMENUMPROCA$MH = RuntimeHelper.downcallHandle(
        constants$403.ICMENUMPROCA$FUNC
    );
    static final FunctionDescriptor ICMENUMPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ICMENUMPROCW$MH = RuntimeHelper.downcallHandle(
        constants$403.ICMENUMPROCW$FUNC
    );
    static final FunctionDescriptor SetICMMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetICMMode$MH = RuntimeHelper.downcallHandle(
        "SetICMMode",
        constants$403.SetICMMode$FUNC
    );
    static final FunctionDescriptor CheckColorsInGamut$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CheckColorsInGamut$MH = RuntimeHelper.downcallHandle(
        "CheckColorsInGamut",
        constants$403.CheckColorsInGamut$FUNC
    );
}


