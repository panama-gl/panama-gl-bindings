// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$737 {

    static final FunctionDescriptor PFNGLGETCONVOLUTIONPARAMETERIVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETCONVOLUTIONPARAMETERIVEXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$737.PFNGLGETCONVOLUTIONPARAMETERIVEXTPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETSEPARABLEFILTEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETSEPARABLEFILTEREXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$737.PFNGLGETSEPARABLEFILTEREXTPROC$FUNC
    );
    static final FunctionDescriptor PFNGLSEPARABLEFILTER2DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLSEPARABLEFILTER2DEXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$737.PFNGLSEPARABLEFILTER2DEXTPROC$FUNC
    );
    static final FunctionDescriptor glConvolutionFilter1DEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glConvolutionFilter1DEXT$MH = RuntimeHelper.downcallHandle(
        "glConvolutionFilter1DEXT",
        constants$737.glConvolutionFilter1DEXT$FUNC
    );
}


