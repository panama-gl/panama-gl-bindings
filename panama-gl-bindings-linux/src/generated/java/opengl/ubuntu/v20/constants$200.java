// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$200 {

    static final FunctionDescriptor PFNGLMULTITEXCOORDP3UIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTITEXCOORDP3UIPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$200.PFNGLMULTITEXCOORDP3UIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORDP3UIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXCOORDP3UIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$200.PFNGLMULTITEXCOORDP3UIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORDP4UIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTITEXCOORDP4UIPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$200.PFNGLMULTITEXCOORDP4UIPROC$FUNC, false
    );
}


