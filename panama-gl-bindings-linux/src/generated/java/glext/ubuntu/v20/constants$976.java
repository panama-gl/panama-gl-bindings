// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$976 {

    static final FunctionDescriptor glVertexAttribL4dvEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glVertexAttribL4dvEXT$MH = RuntimeHelper.downcallHandle(
        "glVertexAttribL4dvEXT",
        constants$976.glVertexAttribL4dvEXT$FUNC
    );
    static final FunctionDescriptor glVertexAttribLPointerEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glVertexAttribLPointerEXT$MH = RuntimeHelper.downcallHandle(
        "glVertexAttribLPointerEXT",
        constants$976.glVertexAttribLPointerEXT$FUNC
    );
    static final FunctionDescriptor glGetVertexAttribLdvEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetVertexAttribLdvEXT$MH = RuntimeHelper.downcallHandle(
        "glGetVertexAttribLdvEXT",
        constants$976.glGetVertexAttribLdvEXT$FUNC
    );
    static final FunctionDescriptor PFNGLBEGINVERTEXSHADEREXTPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLBEGINVERTEXSHADEREXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$976.PFNGLBEGINVERTEXSHADEREXTPROC$FUNC
    );
    static final FunctionDescriptor PFNGLENDVERTEXSHADEREXTPROC$FUNC = FunctionDescriptor.ofVoid();
}

