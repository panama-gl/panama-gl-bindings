// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$359 {

    static final FunctionDescriptor PFNGLSHADERSOURCEARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLSHADERSOURCEARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$359.PFNGLSHADERSOURCEARBPROC$FUNC
    );
    static final FunctionDescriptor PFNGLCOMPILESHADERARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLCOMPILESHADERARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$359.PFNGLCOMPILESHADERARBPROC$FUNC
    );
    static final FunctionDescriptor PFNGLCREATEPROGRAMOBJECTARBPROC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle PFNGLCREATEPROGRAMOBJECTARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$359.PFNGLCREATEPROGRAMOBJECTARBPROC$FUNC
    );
}


