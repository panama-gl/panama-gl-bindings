// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$78 {

    static final FunctionDescriptor XGetZoomHints$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetZoomHints$MH = RuntimeHelper.downcallHandle(
        "XGetZoomHints",
        constants$78.XGetZoomHints$FUNC
    );
    static final FunctionDescriptor XIntersectRegion$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XIntersectRegion$MH = RuntimeHelper.downcallHandle(
        "XIntersectRegion",
        constants$78.XIntersectRegion$FUNC
    );
    static final FunctionDescriptor XConvertCase$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XConvertCase$MH = RuntimeHelper.downcallHandle(
        "XConvertCase",
        constants$78.XConvertCase$FUNC
    );
    static final FunctionDescriptor XLookupString$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XLookupString$MH = RuntimeHelper.downcallHandle(
        "XLookupString",
        constants$78.XLookupString$FUNC
    );
    static final FunctionDescriptor XMatchVisualInfo$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XMatchVisualInfo$MH = RuntimeHelper.downcallHandle(
        "XMatchVisualInfo",
        constants$78.XMatchVisualInfo$FUNC
    );
    static final FunctionDescriptor XOffsetRegion$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XOffsetRegion$MH = RuntimeHelper.downcallHandle(
        "XOffsetRegion",
        constants$78.XOffsetRegion$FUNC
    );
}


