// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$1016 {

    static final FunctionDescriptor glXSwapBuffers$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG
    );
    static final MethodHandle glXSwapBuffers$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXSwapBuffers",
        "(Ljdk/incubator/foreign/MemoryAddress;J)V",
        constants$1016.glXSwapBuffers$FUNC, false
    );
    static final FunctionDescriptor glXCreateGLXPixmap$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle glXCreateGLXPixmap$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXCreateGLXPixmap",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)J",
        constants$1016.glXCreateGLXPixmap$FUNC, false
    );
    static final FunctionDescriptor glXDestroyGLXPixmap$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG
    );
    static final MethodHandle glXDestroyGLXPixmap$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXDestroyGLXPixmap",
        "(Ljdk/incubator/foreign/MemoryAddress;J)V",
        constants$1016.glXDestroyGLXPixmap$FUNC, false
    );
    static final FunctionDescriptor glXQueryExtension$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glXQueryExtension$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXQueryExtension",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1016.glXQueryExtension$FUNC, false
    );
    static final FunctionDescriptor glXQueryVersion$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glXQueryVersion$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXQueryVersion",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1016.glXQueryVersion$FUNC, false
    );
    static final FunctionDescriptor glXIsDirect$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glXIsDirect$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXIsDirect",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1016.glXIsDirect$FUNC, false
    );
}


