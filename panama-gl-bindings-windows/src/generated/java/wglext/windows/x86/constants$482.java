// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$482 {

    static final FunctionDescriptor InvalidateRgn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InvalidateRgn$MH = RuntimeHelper.downcallHandle(
        "InvalidateRgn",
        constants$482.InvalidateRgn$FUNC
    );
    static final FunctionDescriptor ValidateRgn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ValidateRgn$MH = RuntimeHelper.downcallHandle(
        "ValidateRgn",
        constants$482.ValidateRgn$FUNC
    );
    static final FunctionDescriptor RedrawWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RedrawWindow$MH = RuntimeHelper.downcallHandle(
        "RedrawWindow",
        constants$482.RedrawWindow$FUNC
    );
    static final FunctionDescriptor LockWindowUpdate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LockWindowUpdate$MH = RuntimeHelper.downcallHandle(
        "LockWindowUpdate",
        constants$482.LockWindowUpdate$FUNC
    );
    static final FunctionDescriptor ScrollWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ScrollWindow$MH = RuntimeHelper.downcallHandle(
        "ScrollWindow",
        constants$482.ScrollWindow$FUNC
    );
    static final FunctionDescriptor ScrollDC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ScrollDC$MH = RuntimeHelper.downcallHandle(
        "ScrollDC",
        constants$482.ScrollDC$FUNC
    );
}

