// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$916 {

    static final FunctionDescriptor PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC$MH = RuntimeHelper.downcallHandle(
        constants$916.PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC$FUNC
    );
    static final FunctionDescriptor PFNGLACTIVEVARYINGNVPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLACTIVEVARYINGNVPROC$MH = RuntimeHelper.downcallHandle(
        constants$916.PFNGLACTIVEVARYINGNVPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETVARYINGLOCATIONNVPROC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETVARYINGLOCATIONNVPROC$MH = RuntimeHelper.downcallHandle(
        constants$916.PFNGLGETVARYINGLOCATIONNVPROC$FUNC
    );
}

