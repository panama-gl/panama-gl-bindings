// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$314 {

    static final FunctionDescriptor PFNGLGETIMAGEHANDLEARBPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLGETIMAGEHANDLEARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$314.PFNGLGETIMAGEHANDLEARBPROC$FUNC
    );
    static final FunctionDescriptor PFNGLMAKEIMAGEHANDLERESIDENTARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLMAKEIMAGEHANDLERESIDENTARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$314.PFNGLMAKEIMAGEHANDLERESIDENTARBPROC$FUNC
    );
    static final FunctionDescriptor PFNGLMAKEIMAGEHANDLENONRESIDENTARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle PFNGLMAKEIMAGEHANDLENONRESIDENTARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$314.PFNGLMAKEIMAGEHANDLENONRESIDENTARBPROC$FUNC
    );
}


