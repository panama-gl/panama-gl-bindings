// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$791 {

    static final FunctionDescriptor PFNGLUNMAPTEXTURE2DINTELPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLUNMAPTEXTURE2DINTELPROC$MH = RuntimeHelper.downcallHandle(
        constants$791.PFNGLUNMAPTEXTURE2DINTELPROC$FUNC
    );
    static final FunctionDescriptor PFNGLMAPTEXTURE2DINTELPROC$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLMAPTEXTURE2DINTELPROC$MH = RuntimeHelper.downcallHandle(
        constants$791.PFNGLMAPTEXTURE2DINTELPROC$FUNC
    );
    static final FunctionDescriptor PFNGLVERTEXPOINTERVINTELPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLVERTEXPOINTERVINTELPROC$MH = RuntimeHelper.downcallHandle(
        constants$791.PFNGLVERTEXPOINTERVINTELPROC$FUNC
    );
}

