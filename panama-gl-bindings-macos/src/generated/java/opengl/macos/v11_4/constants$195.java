// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$195 {

    static final FunctionDescriptor glutOverlayDisplayFunc$func$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutOverlayDisplayFunc$func$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$195.glutOverlayDisplayFunc$func$FUNC, false
    );
    static final FunctionDescriptor glutOverlayDisplayFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutOverlayDisplayFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutOverlayDisplayFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$195.glutOverlayDisplayFunc$FUNC, false
    );
    static final FunctionDescriptor glutWindowStatusFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glutWindowStatusFunc$func$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$195.glutWindowStatusFunc$func$FUNC, false
    );
    static final FunctionDescriptor glutWindowStatusFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutWindowStatusFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutWindowStatusFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$195.glutWindowStatusFunc$FUNC, false
    );
    static final FunctionDescriptor glutKeyboardUpFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_INT,
        C_INT
    );
}


