// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$725 {

    static final FunctionDescriptor inet_addr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle inet_addr$MH = RuntimeHelper.downcallHandle(
        "inet_addr",
        constants$725.inet_addr$FUNC
    );
    static final FunctionDescriptor inet_ntoa$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_CHAR$LAYOUT.withName("s_b1"),
                    Constants$root.C_CHAR$LAYOUT.withName("s_b2"),
                    Constants$root.C_CHAR$LAYOUT.withName("s_b3"),
                    Constants$root.C_CHAR$LAYOUT.withName("s_b4")
                ).withName("S_un_b"),
                MemoryLayout.structLayout(
                    Constants$root.C_SHORT$LAYOUT.withName("s_w1"),
                    Constants$root.C_SHORT$LAYOUT.withName("s_w2")
                ).withName("S_un_w"),
                Constants$root.C_LONG$LAYOUT.withName("S_addr")
            ).withName("S_un")
        ).withName("in_addr")
    );
    static final MethodHandle inet_ntoa$MH = RuntimeHelper.downcallHandle(
        "inet_ntoa",
        constants$725.inet_ntoa$FUNC
    );
    static final FunctionDescriptor listen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle listen$MH = RuntimeHelper.downcallHandle(
        "listen",
        constants$725.listen$FUNC
    );
    static final FunctionDescriptor ntohl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ntohl$MH = RuntimeHelper.downcallHandle(
        "ntohl",
        constants$725.ntohl$FUNC
    );
    static final FunctionDescriptor ntohs$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle ntohs$MH = RuntimeHelper.downcallHandle(
        "ntohs",
        constants$725.ntohs$FUNC
    );
    static final FunctionDescriptor recv$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle recv$MH = RuntimeHelper.downcallHandle(
        "recv",
        constants$725.recv$FUNC
    );
}


