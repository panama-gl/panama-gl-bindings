// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$46 {

    static final FunctionDescriptor glGetFramebufferAttachmentParameterivEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetFramebufferAttachmentParameterivEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetFramebufferAttachmentParameterivEXT",
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$46.glGetFramebufferAttachmentParameterivEXT$FUNC, false
    );
    static final FunctionDescriptor glGenerateMipmapEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glGenerateMipmapEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGenerateMipmapEXT",
        "(I)V",
        constants$46.glGenerateMipmapEXT$FUNC, false
    );
    static final FunctionDescriptor glProgramParameteriEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glProgramParameteriEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glProgramParameteriEXT",
        "(III)V",
        constants$46.glProgramParameteriEXT$FUNC, false
    );
    static final FunctionDescriptor glFramebufferTextureEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glFramebufferTextureEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFramebufferTextureEXT",
        "(IIII)V",
        constants$46.glFramebufferTextureEXT$FUNC, false
    );
    static final FunctionDescriptor glFramebufferTextureFaceEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glFramebufferTextureFaceEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFramebufferTextureFaceEXT",
        "(IIIII)V",
        constants$46.glFramebufferTextureFaceEXT$FUNC, false
    );
    static final FunctionDescriptor glFramebufferTextureLayerEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glFramebufferTextureLayerEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFramebufferTextureLayerEXT",
        "(IIIII)V",
        constants$46.glFramebufferTextureLayerEXT$FUNC, false
    );
}


