// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$787 {

    static final FunctionDescriptor PFNGLFLUSHSTATICDATAIBMPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLFLUSHSTATICDATAIBMPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$787.PFNGLFLUSHSTATICDATAIBMPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOLORPOINTERLISTIBMPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLCOLORPOINTERLISTIBMPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$787.PFNGLCOLORPOINTERLISTIBMPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLORPOINTERLISTIBMPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLSECONDARYCOLORPOINTERLISTIBMPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$787.PFNGLSECONDARYCOLORPOINTERLISTIBMPROC$FUNC, false
    );
}

