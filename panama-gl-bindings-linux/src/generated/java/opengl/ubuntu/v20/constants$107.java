// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$107 {

    static final FunctionDescriptor PFNGLGENQUERIESPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGENQUERIESPROC$MH = RuntimeHelper.downcallHandle(
        constants$107.PFNGLGENQUERIESPROC$FUNC
    );
    static final FunctionDescriptor PFNGLDELETEQUERIESPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLDELETEQUERIESPROC$MH = RuntimeHelper.downcallHandle(
        constants$107.PFNGLDELETEQUERIESPROC$FUNC
    );
    static final FunctionDescriptor PFNGLISQUERYPROC$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLISQUERYPROC$MH = RuntimeHelper.downcallHandle(
        constants$107.PFNGLISQUERYPROC$FUNC
    );
}


