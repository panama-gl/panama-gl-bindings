// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$755 {

    static final FunctionDescriptor PFNGLMULTICASTCOPYIMAGESUBDATANVPROC$FUNC = FunctionDescriptor.ofVoid(
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
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTICASTCOPYIMAGESUBDATANVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIIIIIIIIII)V",
        constants$755.PFNGLMULTICASTCOPYIMAGESUBDATANVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTICASTBLITFRAMEBUFFERNVPROC$FUNC = FunctionDescriptor.ofVoid(
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
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTICASTBLITFRAMEBUFFERNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIIIII)V",
        constants$755.PFNGLMULTICASTBLITFRAMEBUFFERNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTICASTFRAMEBUFFERSAMPLELOCATIONSFVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTICASTFRAMEBUFFERSAMPLELOCATIONSFVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$755.PFNGLMULTICASTFRAMEBUFFERSAMPLELOCATIONSFVNVPROC$FUNC, false
    );
}


