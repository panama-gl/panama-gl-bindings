// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$733 {

    static final FunctionDescriptor PFNGLUNLOCKARRAYSEXTPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLUNLOCKARRAYSEXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$733.PFNGLUNLOCKARRAYSEXTPROC$FUNC
    );
    static final FunctionDescriptor glLockArraysEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glLockArraysEXT$MH = RuntimeHelper.downcallHandle(
        "glLockArraysEXT",
        constants$733.glLockArraysEXT$FUNC
    );
    static final FunctionDescriptor glUnlockArraysEXT$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glUnlockArraysEXT$MH = RuntimeHelper.downcallHandle(
        "glUnlockArraysEXT",
        constants$733.glUnlockArraysEXT$FUNC
    );
    static final FunctionDescriptor PFNGLCONVOLUTIONFILTER1DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLCONVOLUTIONFILTER1DEXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$733.PFNGLCONVOLUTIONFILTER1DEXTPROC$FUNC
    );
    static final FunctionDescriptor PFNGLCONVOLUTIONFILTER2DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}

