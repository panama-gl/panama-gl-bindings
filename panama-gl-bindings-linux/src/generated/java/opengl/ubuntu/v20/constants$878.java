// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$878 {

    static final FunctionDescriptor PFNGLGETVERTEXATTRIBIIVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXATTRIBIIVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$878.PFNGLGETVERTEXATTRIBIIVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETVERTEXATTRIBIUIVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXATTRIBIUIVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$878.PFNGLGETVERTEXATTRIBIUIVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBEGINVIDEOCAPTURENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLBEGINVIDEOCAPTURENVPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$878.PFNGLBEGINVIDEOCAPTURENVPROC$FUNC, false
    );
}


