// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$410 {

    static final FunctionDescriptor wglRealizeLayerPalette$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle wglRealizeLayerPalette$MH = RuntimeHelper.downcallHandle(
        "wglRealizeLayerPalette",
        constants$410.wglRealizeLayerPalette$FUNC
    );
    static final FunctionDescriptor wglSwapLayerBuffers$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle wglSwapLayerBuffers$MH = RuntimeHelper.downcallHandle(
        "wglSwapLayerBuffers",
        constants$410.wglSwapLayerBuffers$FUNC
    );
    static final FunctionDescriptor wglSwapMultipleBuffers$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglSwapMultipleBuffers$MH = RuntimeHelper.downcallHandle(
        "wglSwapMultipleBuffers",
        constants$410.wglSwapMultipleBuffers$FUNC
    );
    static final FunctionDescriptor WNDPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WNDPROC$MH = RuntimeHelper.downcallHandle(
        constants$410.WNDPROC$FUNC
    );
    static final FunctionDescriptor DLGPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
}


