// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$56 {

    static final FunctionDescriptor glDrawRangeElements$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glDrawRangeElements$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDrawRangeElements",
        "(IIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$56.glDrawRangeElements$FUNC, false
    );
    static final FunctionDescriptor glTexImage3D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glTexImage3D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexImage3D",
        "(IIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$56.glTexImage3D$FUNC, false
    );
    static final FunctionDescriptor glTexSubImage3D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glTexSubImage3D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexSubImage3D",
        "(IIIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$56.glTexSubImage3D$FUNC, false
    );
    static final FunctionDescriptor glCopyTexSubImage3D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glCopyTexSubImage3D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCopyTexSubImage3D",
        "(IIIIIIIII)V",
        constants$56.glCopyTexSubImage3D$FUNC, false
    );
    static final FunctionDescriptor PFNGLDRAWRANGEELEMENTSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDRAWRANGEELEMENTSPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$56.PFNGLDRAWRANGEELEMENTSPROC$FUNC, false
    );
}


