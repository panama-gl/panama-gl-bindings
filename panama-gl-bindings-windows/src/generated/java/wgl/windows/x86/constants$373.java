// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$373 {

    static final FunctionDescriptor SelectClipRgn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SelectClipRgn$MH = RuntimeHelper.downcallHandle(
        "SelectClipRgn",
        constants$373.SelectClipRgn$FUNC
    );
    static final FunctionDescriptor ExtSelectClipRgn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ExtSelectClipRgn$MH = RuntimeHelper.downcallHandle(
        "ExtSelectClipRgn",
        constants$373.ExtSelectClipRgn$FUNC
    );
    static final FunctionDescriptor SetMetaRgn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetMetaRgn$MH = RuntimeHelper.downcallHandle(
        "SetMetaRgn",
        constants$373.SetMetaRgn$FUNC
    );
    static final FunctionDescriptor SelectObject$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SelectObject$MH = RuntimeHelper.downcallHandle(
        "SelectObject",
        constants$373.SelectObject$FUNC
    );
    static final FunctionDescriptor SelectPalette$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SelectPalette$MH = RuntimeHelper.downcallHandle(
        "SelectPalette",
        constants$373.SelectPalette$FUNC
    );
    static final FunctionDescriptor SetBkColor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetBkColor$MH = RuntimeHelper.downcallHandle(
        "SetBkColor",
        constants$373.SetBkColor$FUNC
    );
}

