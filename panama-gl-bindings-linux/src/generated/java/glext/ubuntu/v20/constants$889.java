// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$889 {

    static final FunctionDescriptor PFNGLFOGCOORDDVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLFOGCOORDDVEXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$889.PFNGLFOGCOORDDVEXTPROC$FUNC
    );
    static final FunctionDescriptor PFNGLFOGCOORDPOINTEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLFOGCOORDPOINTEREXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$889.PFNGLFOGCOORDPOINTEREXTPROC$FUNC
    );
    static final FunctionDescriptor glFogCoordfEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glFogCoordfEXT$MH = RuntimeHelper.downcallHandle(
        "glFogCoordfEXT",
        constants$889.glFogCoordfEXT$FUNC
    );
    static final FunctionDescriptor glFogCoordfvEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glFogCoordfvEXT$MH = RuntimeHelper.downcallHandle(
        "glFogCoordfvEXT",
        constants$889.glFogCoordfvEXT$FUNC
    );
}

