// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1152 {

    static final  OfAddress __MIDL_itf_urlmon_0000_0018_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0018_v0_0_c_ifspec$VH = constants$1152.__MIDL_itf_urlmon_0000_0018_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0018_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0018_v0_0_c_ifspec", constants$1152.__MIDL_itf_urlmon_0000_0018_v0_0_c_ifspec$LAYOUT);
    static final  OfAddress __MIDL_itf_urlmon_0000_0018_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0018_v0_0_s_ifspec$VH = constants$1152.__MIDL_itf_urlmon_0000_0018_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0018_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0018_v0_0_s_ifspec", constants$1152.__MIDL_itf_urlmon_0000_0018_v0_0_s_ifspec$LAYOUT);
    static final  GroupLayout IID_IWinInetInfo$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IWinInetInfo$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IWinInetInfo", constants$1152.IID_IWinInetInfo$LAYOUT);
    static final FunctionDescriptor IWinInetInfo_RemoteQueryOption_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IWinInetInfo_RemoteQueryOption_Proxy$MH = RuntimeHelper.downcallHandle(
        "IWinInetInfo_RemoteQueryOption_Proxy",
        constants$1152.IWinInetInfo_RemoteQueryOption_Proxy$FUNC
    );
    static final FunctionDescriptor IWinInetInfo_RemoteQueryOption_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IWinInetInfo_RemoteQueryOption_Stub$MH = RuntimeHelper.downcallHandle(
        "IWinInetInfo_RemoteQueryOption_Stub",
        constants$1152.IWinInetInfo_RemoteQueryOption_Stub$FUNC
    );
    static final  OfAddress __MIDL_itf_urlmon_0000_0019_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0019_v0_0_c_ifspec$VH = constants$1152.__MIDL_itf_urlmon_0000_0019_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0019_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0019_v0_0_c_ifspec", constants$1152.__MIDL_itf_urlmon_0000_0019_v0_0_c_ifspec$LAYOUT);
}


