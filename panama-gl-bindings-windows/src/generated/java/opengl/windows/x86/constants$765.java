// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$765 {

    static final FunctionDescriptor _byteswap_uint64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _byteswap_uint64$MH = RuntimeHelper.downcallHandle(
        "_byteswap_uint64",
        constants$765._byteswap_uint64$FUNC
    );
    static final FunctionDescriptor div$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("quot"),
        Constants$root.C_LONG$LAYOUT.withName("rem")
    ).withName("_div_t"),
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle div$MH = RuntimeHelper.downcallHandle(
        "div",
        constants$765.div$FUNC
    );
    static final FunctionDescriptor ldiv$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("quot"),
        Constants$root.C_LONG$LAYOUT.withName("rem")
    ).withName("_ldiv_t"),
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ldiv$MH = RuntimeHelper.downcallHandle(
        "ldiv",
        constants$765.ldiv$FUNC
    );
    static final FunctionDescriptor lldiv$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("quot"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("rem")
    ).withName("_lldiv_t"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle lldiv$MH = RuntimeHelper.downcallHandle(
        "lldiv",
        constants$765.lldiv$FUNC
    );
    static final FunctionDescriptor _lrotl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _lrotl$MH = RuntimeHelper.downcallHandle(
        "_lrotl",
        constants$765._lrotl$FUNC
    );
    static final FunctionDescriptor _lrotr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _lrotr$MH = RuntimeHelper.downcallHandle(
        "_lrotr",
        constants$765._lrotr$FUNC
    );
}


