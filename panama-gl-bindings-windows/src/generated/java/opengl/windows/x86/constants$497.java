// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$497 {

    static final FunctionDescriptor SetCaretBlinkTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetCaretBlinkTime$MH = RuntimeHelper.downcallHandle(
        "SetCaretBlinkTime",
        constants$497.SetCaretBlinkTime$FUNC
    );
    static final FunctionDescriptor DestroyCaret$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle DestroyCaret$MH = RuntimeHelper.downcallHandle(
        "DestroyCaret",
        constants$497.DestroyCaret$FUNC
    );
    static final FunctionDescriptor HideCaret$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HideCaret$MH = RuntimeHelper.downcallHandle(
        "HideCaret",
        constants$497.HideCaret$FUNC
    );
    static final FunctionDescriptor ShowCaret$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ShowCaret$MH = RuntimeHelper.downcallHandle(
        "ShowCaret",
        constants$497.ShowCaret$FUNC
    );
    static final FunctionDescriptor SetCaretPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetCaretPos$MH = RuntimeHelper.downcallHandle(
        "SetCaretPos",
        constants$497.SetCaretPos$FUNC
    );
    static final FunctionDescriptor GetCaretPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCaretPos$MH = RuntimeHelper.downcallHandle(
        "GetCaretPos",
        constants$497.GetCaretPos$FUNC
    );
}


