// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$37 {

    static final FunctionDescriptor glWindowPos2fARB$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glWindowPos2fARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos2fARB",
        "(FF)V",
        constants$37.glWindowPos2fARB$FUNC, false
    );
    static final FunctionDescriptor glWindowPos2fvARB$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glWindowPos2fvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos2fvARB",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$37.glWindowPos2fvARB$FUNC, false
    );
    static final FunctionDescriptor glWindowPos2iARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glWindowPos2iARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos2iARB",
        "(II)V",
        constants$37.glWindowPos2iARB$FUNC, false
    );
    static final FunctionDescriptor glWindowPos2ivARB$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glWindowPos2ivARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos2ivARB",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$37.glWindowPos2ivARB$FUNC, false
    );
    static final FunctionDescriptor glWindowPos2sARB$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glWindowPos2sARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos2sARB",
        "(SS)V",
        constants$37.glWindowPos2sARB$FUNC, false
    );
    static final FunctionDescriptor glWindowPos2svARB$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glWindowPos2svARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos2svARB",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$37.glWindowPos2svARB$FUNC, false
    );
}


