// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$388 {

    static final FunctionDescriptor PFNGLGETQUERYBUFFEROBJECTUIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLGETQUERYBUFFEROBJECTUIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIJ)V",
        constants$388.PFNGLGETQUERYBUFFEROBJECTUIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMEMORYBARRIERBYREGIONPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLMEMORYBARRIERBYREGIONPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$388.PFNGLMEMORYBARRIERBYREGIONPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETTEXTURESUBIMAGEPROC$FUNC = FunctionDescriptor.ofVoid(
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
        C_POINTER
    );
    static final MethodHandle PFNGLGETTEXTURESUBIMAGEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$388.PFNGLGETTEXTURESUBIMAGEPROC$FUNC, false
    );
}

