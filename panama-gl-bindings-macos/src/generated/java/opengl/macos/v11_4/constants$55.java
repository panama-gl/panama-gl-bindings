// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$55 {

    static final FunctionDescriptor glSecondaryColor3ubvEXT$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glSecondaryColor3ubvEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSecondaryColor3ubvEXT",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$55.glSecondaryColor3ubvEXT$FUNC, false
    );
    static final FunctionDescriptor glSecondaryColor3uiEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glSecondaryColor3uiEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSecondaryColor3uiEXT",
        "(III)V",
        constants$55.glSecondaryColor3uiEXT$FUNC, false
    );
    static final FunctionDescriptor glSecondaryColor3uivEXT$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glSecondaryColor3uivEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSecondaryColor3uivEXT",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$55.glSecondaryColor3uivEXT$FUNC, false
    );
    static final FunctionDescriptor glSecondaryColor3usEXT$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glSecondaryColor3usEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSecondaryColor3usEXT",
        "(SSS)V",
        constants$55.glSecondaryColor3usEXT$FUNC, false
    );
    static final FunctionDescriptor glSecondaryColor3usvEXT$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glSecondaryColor3usvEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSecondaryColor3usvEXT",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$55.glSecondaryColor3usvEXT$FUNC, false
    );
    static final FunctionDescriptor glSecondaryColorPointerEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glSecondaryColorPointerEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSecondaryColorPointerEXT",
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$55.glSecondaryColorPointerEXT$FUNC, false
    );
}

