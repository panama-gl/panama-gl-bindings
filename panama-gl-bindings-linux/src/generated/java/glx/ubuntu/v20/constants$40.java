// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$40 {

    static final FunctionDescriptor XHeightMMOfScreen$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XHeightMMOfScreen$MH = RuntimeHelper.downcallHandle(
        "XHeightMMOfScreen",
        constants$40.XHeightMMOfScreen$FUNC
    );
    static final FunctionDescriptor XHeightOfScreen$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XHeightOfScreen$MH = RuntimeHelper.downcallHandle(
        "XHeightOfScreen",
        constants$40.XHeightOfScreen$FUNC
    );
    static final FunctionDescriptor XIfEvent$x0$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XIfEvent$x0$MH = RuntimeHelper.downcallHandle(
        constants$40.XIfEvent$x0$FUNC
    );
    static final FunctionDescriptor XIfEvent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XIfEvent$MH = RuntimeHelper.downcallHandle(
        "XIfEvent",
        constants$40.XIfEvent$FUNC
    );
    static final FunctionDescriptor XImageByteOrder$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XImageByteOrder$MH = RuntimeHelper.downcallHandle(
        "XImageByteOrder",
        constants$40.XImageByteOrder$FUNC
    );
}


