// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$199 {

    static final FunctionDescriptor glutBitmapWidth$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle glutBitmapWidth$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutBitmapWidth",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$199.glutBitmapWidth$FUNC, false
    );
    static final FunctionDescriptor glutStrokeCharacter$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT
    );
    static final MethodHandle glutStrokeCharacter$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutStrokeCharacter",
        "(Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$199.glutStrokeCharacter$FUNC, false
    );
    static final FunctionDescriptor glutStrokeWidth$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle glutStrokeWidth$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutStrokeWidth",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$199.glutStrokeWidth$FUNC, false
    );
    static final FunctionDescriptor glutBitmapLength$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glutBitmapLength$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutBitmapLength",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$199.glutBitmapLength$FUNC, false
    );
    static final FunctionDescriptor glutStrokeLength$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glutStrokeLength$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutStrokeLength",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$199.glutStrokeLength$FUNC, false
    );
    static final FunctionDescriptor glutWireSphere$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_INT,
        C_INT
    );
    static final MethodHandle glutWireSphere$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutWireSphere",
        "(DII)V",
        constants$199.glutWireSphere$FUNC, false
    );
}


