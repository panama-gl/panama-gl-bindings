// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$118 {

    static final FunctionDescriptor glTexCoord2iv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glTexCoord2iv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexCoord2iv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$118.glTexCoord2iv$FUNC, false
    );
    static final FunctionDescriptor glTexCoord2s$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glTexCoord2s$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexCoord2s",
        "(SS)V",
        constants$118.glTexCoord2s$FUNC, false
    );
    static final FunctionDescriptor glTexCoord2sv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glTexCoord2sv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexCoord2sv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$118.glTexCoord2sv$FUNC, false
    );
    static final FunctionDescriptor glTexCoord3d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glTexCoord3d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexCoord3d",
        "(DDD)V",
        constants$118.glTexCoord3d$FUNC, false
    );
    static final FunctionDescriptor glTexCoord3dv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glTexCoord3dv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexCoord3dv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$118.glTexCoord3dv$FUNC, false
    );
    static final FunctionDescriptor glTexCoord3f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glTexCoord3f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexCoord3f",
        "(FFF)V",
        constants$118.glTexCoord3f$FUNC, false
    );
}


