// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$45 {

    static final FunctionDescriptor glGenFramebuffersEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGenFramebuffersEXT$MH = RuntimeHelper.downcallHandle(
        "glGenFramebuffersEXT",
        constants$45.glGenFramebuffersEXT$FUNC
    );
    static final FunctionDescriptor glCheckFramebufferStatusEXT$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glCheckFramebufferStatusEXT$MH = RuntimeHelper.downcallHandle(
        "glCheckFramebufferStatusEXT",
        constants$45.glCheckFramebufferStatusEXT$FUNC
    );
    static final FunctionDescriptor glFramebufferTexture1DEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glFramebufferTexture1DEXT$MH = RuntimeHelper.downcallHandle(
        "glFramebufferTexture1DEXT",
        constants$45.glFramebufferTexture1DEXT$FUNC
    );
    static final FunctionDescriptor glFramebufferTexture2DEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glFramebufferTexture2DEXT$MH = RuntimeHelper.downcallHandle(
        "glFramebufferTexture2DEXT",
        constants$45.glFramebufferTexture2DEXT$FUNC
    );
    static final FunctionDescriptor glFramebufferTexture3DEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glFramebufferTexture3DEXT$MH = RuntimeHelper.downcallHandle(
        "glFramebufferTexture3DEXT",
        constants$45.glFramebufferTexture3DEXT$FUNC
    );
    static final FunctionDescriptor glFramebufferRenderbufferEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glFramebufferRenderbufferEXT$MH = RuntimeHelper.downcallHandle(
        "glFramebufferRenderbufferEXT",
        constants$45.glFramebufferRenderbufferEXT$FUNC
    );
}

