// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$91 {

    static final FunctionDescriptor glPopAttrib$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glPopAttrib$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glPopAttrib",
        "()V",
        constants$91.glPopAttrib$FUNC, false
    );
    static final FunctionDescriptor glPushClientAttrib$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glPushClientAttrib$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glPushClientAttrib",
        "(I)V",
        constants$91.glPushClientAttrib$FUNC, false
    );
    static final FunctionDescriptor glPopClientAttrib$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glPopClientAttrib$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glPopClientAttrib",
        "()V",
        constants$91.glPopClientAttrib$FUNC, false
    );
    static final FunctionDescriptor glRenderMode$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle glRenderMode$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glRenderMode",
        "(I)I",
        constants$91.glRenderMode$FUNC, false
    );
    static final FunctionDescriptor glGetError$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle glGetError$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glGetError",
        "()I",
        constants$91.glGetError$FUNC, false
    );
    static final FunctionDescriptor glGetString$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT
    );
    static final MethodHandle glGetString$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glGetString",
        "(I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$91.glGetString$FUNC, false
    );
}

