// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$49 {

    static final FunctionDescriptor glAreTexturesResident$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glAreTexturesResident$MH = RuntimeHelper.downcallHandle(
        "glAreTexturesResident",
        constants$49.glAreTexturesResident$FUNC
    );
    static final FunctionDescriptor glIsTexture$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsTexture$MH = RuntimeHelper.downcallHandle(
        "glIsTexture",
        constants$49.glIsTexture$FUNC
    );
    static final FunctionDescriptor glTexSubImage1D$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glTexSubImage1D$MH = RuntimeHelper.downcallHandle(
        "glTexSubImage1D",
        constants$49.glTexSubImage1D$FUNC
    );
    static final FunctionDescriptor glTexSubImage2D$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glTexSubImage2D$MH = RuntimeHelper.downcallHandle(
        "glTexSubImage2D",
        constants$49.glTexSubImage2D$FUNC
    );
    static final FunctionDescriptor glCopyTexImage1D$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glCopyTexImage1D$MH = RuntimeHelper.downcallHandle(
        "glCopyTexImage1D",
        constants$49.glCopyTexImage1D$FUNC
    );
    static final FunctionDescriptor glCopyTexImage2D$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glCopyTexImage2D$MH = RuntimeHelper.downcallHandle(
        "glCopyTexImage2D",
        constants$49.glCopyTexImage2D$FUNC
    );
}

