// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$938 {

    static final FunctionDescriptor gluScaleImage$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gluScaleImage$MH = RuntimeHelper.downcallHandle(
        "gluScaleImage",
        constants$938.gluScaleImage$FUNC
    );
    static final FunctionDescriptor gluSphere$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gluSphere$MH = RuntimeHelper.downcallHandle(
        "gluSphere",
        constants$938.gluSphere$FUNC
    );
    static final FunctionDescriptor gluTessBeginContour$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gluTessBeginContour$MH = RuntimeHelper.downcallHandle(
        "gluTessBeginContour",
        constants$938.gluTessBeginContour$FUNC
    );
    static final FunctionDescriptor gluTessBeginPolygon$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gluTessBeginPolygon$MH = RuntimeHelper.downcallHandle(
        "gluTessBeginPolygon",
        constants$938.gluTessBeginPolygon$FUNC
    );
    static final FunctionDescriptor gluTessCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gluTessCallback$MH = RuntimeHelper.downcallHandle(
        "gluTessCallback",
        constants$938.gluTessCallback$FUNC
    );
    static final FunctionDescriptor gluTessEndContour$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gluTessEndContour$MH = RuntimeHelper.downcallHandle(
        "gluTessEndContour",
        constants$938.gluTessEndContour$FUNC
    );
}


