// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$475 {

    static final FunctionDescriptor PFNGLGETQUERYOBJECTUIVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETQUERYOBJECTUIVARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$475.PFNGLGETQUERYOBJECTUIVARBPROC$FUNC
    );
    static final FunctionDescriptor glGenQueriesARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGenQueriesARB$MH = RuntimeHelper.downcallHandle(
        "glGenQueriesARB",
        constants$475.glGenQueriesARB$FUNC
    );
    static final FunctionDescriptor glDeleteQueriesARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDeleteQueriesARB$MH = RuntimeHelper.downcallHandle(
        "glDeleteQueriesARB",
        constants$475.glDeleteQueriesARB$FUNC
    );
    static final FunctionDescriptor glIsQueryARB$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsQueryARB$MH = RuntimeHelper.downcallHandle(
        "glIsQueryARB",
        constants$475.glIsQueryARB$FUNC
    );
    static final FunctionDescriptor glBeginQueryARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBeginQueryARB$MH = RuntimeHelper.downcallHandle(
        "glBeginQueryARB",
        constants$475.glBeginQueryARB$FUNC
    );
}


