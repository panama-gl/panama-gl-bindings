// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$33 {

    static final FunctionDescriptor XEnableAccessControl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XEnableAccessControl$MH = RuntimeHelper.downcallHandle(
        "XEnableAccessControl",
        constants$33.XEnableAccessControl$FUNC
    );
    static final FunctionDescriptor XEventsQueued$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XEventsQueued$MH = RuntimeHelper.downcallHandle(
        "XEventsQueued",
        constants$33.XEventsQueued$FUNC
    );
    static final FunctionDescriptor XFetchName$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XFetchName$MH = RuntimeHelper.downcallHandle(
        "XFetchName",
        constants$33.XFetchName$FUNC
    );
    static final FunctionDescriptor XFillArc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XFillArc$MH = RuntimeHelper.downcallHandle(
        "XFillArc",
        constants$33.XFillArc$FUNC
    );
    static final FunctionDescriptor XFillArcs$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XFillArcs$MH = RuntimeHelper.downcallHandle(
        "XFillArcs",
        constants$33.XFillArcs$FUNC
    );
    static final FunctionDescriptor XFillPolygon$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XFillPolygon$MH = RuntimeHelper.downcallHandle(
        "XFillPolygon",
        constants$33.XFillPolygon$FUNC
    );
}


