// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$654 {

    static final FunctionDescriptor PFNGLVERTEXATTRIBPARAMETERIAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLVERTEXATTRIBPARAMETERIAMDPROC$MH = RuntimeHelper.downcallHandle(
        constants$654.PFNGLVERTEXATTRIBPARAMETERIAMDPROC$FUNC
    );
    static final FunctionDescriptor glVertexAttribParameteriAMD$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glVertexAttribParameteriAMD$MH = RuntimeHelper.downcallHandle(
        "glVertexAttribParameteriAMD",
        constants$654.glVertexAttribParameteriAMD$FUNC
    );
    static final FunctionDescriptor PFNGLMULTIDRAWARRAYSINDIRECTAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLMULTIDRAWARRAYSINDIRECTAMDPROC$MH = RuntimeHelper.downcallHandle(
        constants$654.PFNGLMULTIDRAWARRAYSINDIRECTAMDPROC$FUNC
    );
    static final FunctionDescriptor PFNGLMULTIDRAWELEMENTSINDIRECTAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
}


