// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1019 {

    static final FunctionDescriptor glXGetFBConfigs$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glXGetFBConfigs$MH = RuntimeHelper.downcallHandle(
        "glXGetFBConfigs",
        constants$1019.glXGetFBConfigs$FUNC
    );
    static final FunctionDescriptor glXGetVisualFromFBConfig$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glXGetVisualFromFBConfig$MH = RuntimeHelper.downcallHandle(
        "glXGetVisualFromFBConfig",
        constants$1019.glXGetVisualFromFBConfig$FUNC
    );
    static final FunctionDescriptor glXCreateWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glXCreateWindow$MH = RuntimeHelper.downcallHandle(
        "glXCreateWindow",
        constants$1019.glXCreateWindow$FUNC
    );
    static final FunctionDescriptor glXDestroyWindow$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle glXDestroyWindow$MH = RuntimeHelper.downcallHandle(
        "glXDestroyWindow",
        constants$1019.glXDestroyWindow$FUNC
    );
    static final FunctionDescriptor glXCreatePixmap$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glXCreatePixmap$MH = RuntimeHelper.downcallHandle(
        "glXCreatePixmap",
        constants$1019.glXCreatePixmap$FUNC
    );
    static final FunctionDescriptor glXDestroyPixmap$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle glXDestroyPixmap$MH = RuntimeHelper.downcallHandle(
        "glXDestroyPixmap",
        constants$1019.glXDestroyPixmap$FUNC
    );
}

