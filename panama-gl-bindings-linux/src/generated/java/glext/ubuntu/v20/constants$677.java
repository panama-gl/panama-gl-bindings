// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$677 {

    static final FunctionDescriptor PFNGLISVERTEXARRAYAPPLEPROC$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLISVERTEXARRAYAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        constants$677.PFNGLISVERTEXARRAYAPPLEPROC$FUNC
    );
    static final FunctionDescriptor glBindVertexArrayAPPLE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBindVertexArrayAPPLE$MH = RuntimeHelper.downcallHandle(
        "glBindVertexArrayAPPLE",
        constants$677.glBindVertexArrayAPPLE$FUNC
    );
    static final FunctionDescriptor glDeleteVertexArraysAPPLE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDeleteVertexArraysAPPLE$MH = RuntimeHelper.downcallHandle(
        "glDeleteVertexArraysAPPLE",
        constants$677.glDeleteVertexArraysAPPLE$FUNC
    );
    static final FunctionDescriptor glGenVertexArraysAPPLE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGenVertexArraysAPPLE$MH = RuntimeHelper.downcallHandle(
        "glGenVertexArraysAPPLE",
        constants$677.glGenVertexArraysAPPLE$FUNC
    );
    static final FunctionDescriptor glIsVertexArrayAPPLE$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsVertexArrayAPPLE$MH = RuntimeHelper.downcallHandle(
        "glIsVertexArrayAPPLE",
        constants$677.glIsVertexArrayAPPLE$FUNC
    );
}

