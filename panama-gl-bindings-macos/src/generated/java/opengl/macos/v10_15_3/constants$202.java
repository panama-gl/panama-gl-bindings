// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$202 {

    static final FunctionDescriptor glutSolidOctahedron$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutSolidOctahedron$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutSolidOctahedron",
        "()V",
        constants$202.glutSolidOctahedron$FUNC, false
    );
    static final FunctionDescriptor glutWireTetrahedron$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutWireTetrahedron$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutWireTetrahedron",
        "()V",
        constants$202.glutWireTetrahedron$FUNC, false
    );
    static final FunctionDescriptor glutSolidTetrahedron$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutSolidTetrahedron$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutSolidTetrahedron",
        "()V",
        constants$202.glutSolidTetrahedron$FUNC, false
    );
    static final FunctionDescriptor glutWireIcosahedron$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutWireIcosahedron$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutWireIcosahedron",
        "()V",
        constants$202.glutWireIcosahedron$FUNC, false
    );
    static final FunctionDescriptor glutSolidIcosahedron$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutSolidIcosahedron$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutSolidIcosahedron",
        "()V",
        constants$202.glutSolidIcosahedron$FUNC, false
    );
    static final FunctionDescriptor glutVideoResizeGet$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle glutVideoResizeGet$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutVideoResizeGet",
        "(I)I",
        constants$202.glutVideoResizeGet$FUNC, false
    );
}


