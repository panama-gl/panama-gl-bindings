// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$704 {

    static final FunctionDescriptor glVertexAttribArrayObjectATI$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glVertexAttribArrayObjectATI$MH = RuntimeHelper.downcallHandle(
        "glVertexAttribArrayObjectATI",
        constants$704.glVertexAttribArrayObjectATI$FUNC
    );
    static final FunctionDescriptor glGetVertexAttribArrayObjectfvATI$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetVertexAttribArrayObjectfvATI$MH = RuntimeHelper.downcallHandle(
        "glGetVertexAttribArrayObjectfvATI",
        constants$704.glGetVertexAttribArrayObjectfvATI$FUNC
    );
    static final FunctionDescriptor glGetVertexAttribArrayObjectivATI$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetVertexAttribArrayObjectivATI$MH = RuntimeHelper.downcallHandle(
        "glGetVertexAttribArrayObjectivATI",
        constants$704.glGetVertexAttribArrayObjectivATI$FUNC
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM1SATIPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle PFNGLVERTEXSTREAM1SATIPROC$MH = RuntimeHelper.downcallHandle(
        constants$704.PFNGLVERTEXSTREAM1SATIPROC$FUNC
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM1SVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}

