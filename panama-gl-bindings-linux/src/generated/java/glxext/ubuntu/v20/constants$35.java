// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$35 {

    static final FunctionDescriptor XFreeColors$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XFreeColors$MH = RuntimeHelper.downcallHandle(
        "XFreeColors",
        constants$35.XFreeColors$FUNC
    );
    static final FunctionDescriptor XFreeCursor$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XFreeCursor$MH = RuntimeHelper.downcallHandle(
        "XFreeCursor",
        constants$35.XFreeCursor$FUNC
    );
    static final FunctionDescriptor XFreeExtensionList$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XFreeExtensionList$MH = RuntimeHelper.downcallHandle(
        "XFreeExtensionList",
        constants$35.XFreeExtensionList$FUNC
    );
    static final FunctionDescriptor XFreeFont$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XFreeFont$MH = RuntimeHelper.downcallHandle(
        "XFreeFont",
        constants$35.XFreeFont$FUNC
    );
    static final FunctionDescriptor XFreeFontInfo$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XFreeFontInfo$MH = RuntimeHelper.downcallHandle(
        "XFreeFontInfo",
        constants$35.XFreeFontInfo$FUNC
    );
    static final FunctionDescriptor XFreeFontNames$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XFreeFontNames$MH = RuntimeHelper.downcallHandle(
        "XFreeFontNames",
        constants$35.XFreeFontNames$FUNC
    );
}


