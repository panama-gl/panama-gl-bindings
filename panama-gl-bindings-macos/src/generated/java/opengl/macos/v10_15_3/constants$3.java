// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$3 {

    static final FunctionDescriptor glCheckFramebufferStatus$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle glCheckFramebufferStatus$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCheckFramebufferStatus",
        "(I)I",
        constants$3.glCheckFramebufferStatus$FUNC, false
    );
    static final FunctionDescriptor glFramebufferTexture1D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glFramebufferTexture1D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFramebufferTexture1D",
        "(IIIII)V",
        constants$3.glFramebufferTexture1D$FUNC, false
    );
    static final FunctionDescriptor glFramebufferTexture2D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glFramebufferTexture2D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFramebufferTexture2D",
        "(IIIII)V",
        constants$3.glFramebufferTexture2D$FUNC, false
    );
    static final FunctionDescriptor glFramebufferTexture3D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glFramebufferTexture3D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFramebufferTexture3D",
        "(IIIIII)V",
        constants$3.glFramebufferTexture3D$FUNC, false
    );
    static final FunctionDescriptor glFramebufferRenderbuffer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glFramebufferRenderbuffer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFramebufferRenderbuffer",
        "(IIII)V",
        constants$3.glFramebufferRenderbuffer$FUNC, false
    );
    static final FunctionDescriptor glGetFramebufferAttachmentParameteriv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetFramebufferAttachmentParameteriv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetFramebufferAttachmentParameteriv",
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$3.glGetFramebufferAttachmentParameteriv$FUNC, false
    );
}


