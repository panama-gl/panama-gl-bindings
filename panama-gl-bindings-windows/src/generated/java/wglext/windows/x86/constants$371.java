// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$371 {

    static final FunctionDescriptor RectInRegion$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RectInRegion$MH = RuntimeHelper.downcallHandle(
        "RectInRegion",
        constants$371.RectInRegion$FUNC
    );
    static final FunctionDescriptor RectVisible$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RectVisible$MH = RuntimeHelper.downcallHandle(
        "RectVisible",
        constants$371.RectVisible$FUNC
    );
    static final FunctionDescriptor Rectangle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Rectangle$MH = RuntimeHelper.downcallHandle(
        "Rectangle",
        constants$371.Rectangle$FUNC
    );
    static final FunctionDescriptor RestoreDC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RestoreDC$MH = RuntimeHelper.downcallHandle(
        "RestoreDC",
        constants$371.RestoreDC$FUNC
    );
    static final FunctionDescriptor ResetDCA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ResetDCA$MH = RuntimeHelper.downcallHandle(
        "ResetDCA",
        constants$371.ResetDCA$FUNC
    );
    static final FunctionDescriptor ResetDCW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ResetDCW$MH = RuntimeHelper.downcallHandle(
        "ResetDCW",
        constants$371.ResetDCW$FUNC
    );
}


