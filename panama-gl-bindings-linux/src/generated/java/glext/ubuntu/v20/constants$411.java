// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$411 {

    static final FunctionDescriptor glTextureParameteriv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glTextureParameteriv$MH = RuntimeHelper.downcallHandle(
        "glTextureParameteriv",
        constants$411.glTextureParameteriv$FUNC
    );
    static final FunctionDescriptor glGenerateTextureMipmap$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glGenerateTextureMipmap$MH = RuntimeHelper.downcallHandle(
        "glGenerateTextureMipmap",
        constants$411.glGenerateTextureMipmap$FUNC
    );
    static final FunctionDescriptor glBindTextureUnit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBindTextureUnit$MH = RuntimeHelper.downcallHandle(
        "glBindTextureUnit",
        constants$411.glBindTextureUnit$FUNC
    );
    static final FunctionDescriptor glGetTextureImage$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetTextureImage$MH = RuntimeHelper.downcallHandle(
        "glGetTextureImage",
        constants$411.glGetTextureImage$FUNC
    );
    static final FunctionDescriptor glGetCompressedTextureImage$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetCompressedTextureImage$MH = RuntimeHelper.downcallHandle(
        "glGetCompressedTextureImage",
        constants$411.glGetCompressedTextureImage$FUNC
    );
    static final FunctionDescriptor glGetTextureLevelParameterfv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetTextureLevelParameterfv$MH = RuntimeHelper.downcallHandle(
        "glGetTextureLevelParameterfv",
        constants$411.glGetTextureLevelParameterfv$FUNC
    );
}


