// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1151 {

    static final  OfAddress __MIDL_itf_urlmon_0000_0015_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0015_v0_0_c_ifspec$VH = constants$1151.__MIDL_itf_urlmon_0000_0015_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0015_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0015_v0_0_c_ifspec", constants$1151.__MIDL_itf_urlmon_0000_0015_v0_0_c_ifspec$LAYOUT);
    static final  OfAddress __MIDL_itf_urlmon_0000_0015_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0015_v0_0_s_ifspec$VH = constants$1151.__MIDL_itf_urlmon_0000_0015_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0015_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0015_v0_0_s_ifspec", constants$1151.__MIDL_itf_urlmon_0000_0015_v0_0_s_ifspec$LAYOUT);
    static final  GroupLayout IID_IUriContainer$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IUriContainer$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IUriContainer", constants$1151.IID_IUriContainer$LAYOUT);
    static final  GroupLayout IID_IUriBuilder$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IUriBuilder$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IUriBuilder", constants$1151.IID_IUriBuilder$LAYOUT);
    static final  GroupLayout IID_IUriBuilderFactory$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IUriBuilderFactory$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IUriBuilderFactory", constants$1151.IID_IUriBuilderFactory$LAYOUT);
    static final FunctionDescriptor CreateIUriBuilder$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateIUriBuilder$MH = RuntimeHelper.downcallHandle(
        "CreateIUriBuilder",
        constants$1151.CreateIUriBuilder$FUNC
    );
}


