// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$423 {

    static final FunctionDescriptor PFNGLGETTEXTUREHANDLEARBPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLGETTEXTUREHANDLEARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$423.PFNGLGETTEXTUREHANDLEARBPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETTEXTURESAMPLERHANDLEARBPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLGETTEXTURESAMPLERHANDLEARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$423.PFNGLGETTEXTURESAMPLERHANDLEARBPROC$FUNC
    );
    static final FunctionDescriptor PFNGLMAKETEXTUREHANDLERESIDENTARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle PFNGLMAKETEXTUREHANDLERESIDENTARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$423.PFNGLMAKETEXTUREHANDLERESIDENTARBPROC$FUNC
    );
    static final FunctionDescriptor PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT
    );
}


