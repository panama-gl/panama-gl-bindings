// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$134 {

    static final FunctionDescriptor glBindTexture$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBindTexture$MH = RuntimeHelper.downcallHandle(
        "glBindTexture",
        constants$134.glBindTexture$FUNC
    );
    static final FunctionDescriptor glPrioritizeTextures$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glPrioritizeTextures$MH = RuntimeHelper.downcallHandle(
        "glPrioritizeTextures",
        constants$134.glPrioritizeTextures$FUNC
    );
    static final FunctionDescriptor glAreTexturesResident$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glAreTexturesResident$MH = RuntimeHelper.downcallHandle(
        "glAreTexturesResident",
        constants$134.glAreTexturesResident$FUNC
    );
    static final FunctionDescriptor glIsTexture$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsTexture$MH = RuntimeHelper.downcallHandle(
        "glIsTexture",
        constants$134.glIsTexture$FUNC
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
        constants$134.glTexSubImage1D$FUNC
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
        constants$134.glTexSubImage2D$FUNC
    );
}

