// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$468 {

    static final FunctionDescriptor PFNGLGENNAMESAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGENNAMESAMDPROC$MH = RuntimeHelper.downcallHandle(
        constants$468.PFNGLGENNAMESAMDPROC$FUNC
    );
    static final FunctionDescriptor PFNGLDELETENAMESAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLDELETENAMESAMDPROC$MH = RuntimeHelper.downcallHandle(
        constants$468.PFNGLDELETENAMESAMDPROC$FUNC
    );
    static final FunctionDescriptor PFNGLISNAMEAMDPROC$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLISNAMEAMDPROC$MH = RuntimeHelper.downcallHandle(
        constants$468.PFNGLISNAMEAMDPROC$FUNC
    );
}


