// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$968 {

    static final FunctionDescriptor IStream_RemoteSeek_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IStream_RemoteSeek_Stub$MH = RuntimeHelper.downcallHandle(
        "IStream_RemoteSeek_Stub",
        constants$968.IStream_RemoteSeek_Stub$FUNC
    );
    static final FunctionDescriptor IStream_RemoteCopyTo_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("_ULARGE_INTEGER"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IStream_RemoteCopyTo_Proxy$MH = RuntimeHelper.downcallHandle(
        "IStream_RemoteCopyTo_Proxy",
        constants$968.IStream_RemoteCopyTo_Proxy$FUNC
    );
    static final FunctionDescriptor IStream_RemoteCopyTo_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IStream_RemoteCopyTo_Stub$MH = RuntimeHelper.downcallHandle(
        "IStream_RemoteCopyTo_Stub",
        constants$968.IStream_RemoteCopyTo_Stub$FUNC
    );
    static final  GroupLayout IID_IRpcChannelBuffer$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IRpcChannelBuffer$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IRpcChannelBuffer", constants$968.IID_IRpcChannelBuffer$LAYOUT);
    static final  OfAddress __MIDL_itf_objidlbase_0000_0015_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidlbase_0000_0015_v0_0_c_ifspec$VH = constants$968.__MIDL_itf_objidlbase_0000_0015_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidlbase_0000_0015_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidlbase_0000_0015_v0_0_c_ifspec", constants$968.__MIDL_itf_objidlbase_0000_0015_v0_0_c_ifspec$LAYOUT);
    static final  OfAddress __MIDL_itf_objidlbase_0000_0015_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidlbase_0000_0015_v0_0_s_ifspec$VH = constants$968.__MIDL_itf_objidlbase_0000_0015_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidlbase_0000_0015_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidlbase_0000_0015_v0_0_s_ifspec", constants$968.__MIDL_itf_objidlbase_0000_0015_v0_0_s_ifspec$LAYOUT);
}


