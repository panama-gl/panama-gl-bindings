// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class __MIDL___MIDL_itf_wtypes_0000_0001_0001 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("tyspec"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Data1"),
                Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
            ).withName("clsid"),
            Constants$root.C_POINTER$LAYOUT.withName("pFileExt"),
            Constants$root.C_POINTER$LAYOUT.withName("pMimeType"),
            Constants$root.C_POINTER$LAYOUT.withName("pProgId"),
            Constants$root.C_POINTER$LAYOUT.withName("pFileName"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("pPackageName"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Data1"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                ).withName("PolicyId")
            ).withName("ByName"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Data1"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                ).withName("ObjectId"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Data1"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                ).withName("PolicyId")
            ).withName("ByObjectId")
        ).withName("tagged_union")
    ).withName("__MIDL___MIDL_itf_wtypes_0000_0001_0001");
    public static MemoryLayout $LAYOUT() {
        return __MIDL___MIDL_itf_wtypes_0000_0001_0001.$struct$LAYOUT;
    }
    static final VarHandle tyspec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tyspec"));
    public static VarHandle tyspec$VH() {
        return __MIDL___MIDL_itf_wtypes_0000_0001_0001.tyspec$VH;
    }
    public static int tyspec$get(MemorySegment seg) {
        return (int)__MIDL___MIDL_itf_wtypes_0000_0001_0001.tyspec$VH.get(seg);
    }
    public static void tyspec$set( MemorySegment seg, int x) {
        __MIDL___MIDL_itf_wtypes_0000_0001_0001.tyspec$VH.set(seg, x);
    }
    public static int tyspec$get(MemorySegment seg, long index) {
        return (int)__MIDL___MIDL_itf_wtypes_0000_0001_0001.tyspec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tyspec$set(MemorySegment seg, long index, int x) {
        __MIDL___MIDL_itf_wtypes_0000_0001_0001.tyspec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class __MIDL___MIDL_itf_wtypes_0000_0001_0005 {

        static final  GroupLayout __MIDL___MIDL_itf_wtypes_0000_0001_0005$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Data1"),
                Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
            ).withName("clsid"),
            Constants$root.C_POINTER$LAYOUT.withName("pFileExt"),
            Constants$root.C_POINTER$LAYOUT.withName("pMimeType"),
            Constants$root.C_POINTER$LAYOUT.withName("pProgId"),
            Constants$root.C_POINTER$LAYOUT.withName("pFileName"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("pPackageName"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Data1"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                ).withName("PolicyId")
            ).withName("ByName"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Data1"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                ).withName("ObjectId"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Data1"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                ).withName("PolicyId")
            ).withName("ByObjectId")
        ).withName("__MIDL___MIDL_itf_wtypes_0000_0001_0005");
        public static MemoryLayout $LAYOUT() {
            return __MIDL___MIDL_itf_wtypes_0000_0001_0005.__MIDL___MIDL_itf_wtypes_0000_0001_0005$union$LAYOUT;
        }
        public static MemorySegment clsid$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        static final VarHandle pFileExt$VH = __MIDL___MIDL_itf_wtypes_0000_0001_0005$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pFileExt"));
        public static VarHandle pFileExt$VH() {
            return __MIDL___MIDL_itf_wtypes_0000_0001_0005.pFileExt$VH;
        }
        public static MemoryAddress pFileExt$get(MemorySegment seg) {
            return (java.lang.foreign.MemoryAddress)__MIDL___MIDL_itf_wtypes_0000_0001_0005.pFileExt$VH.get(seg);
        }
        public static void pFileExt$set( MemorySegment seg, MemoryAddress x) {
            __MIDL___MIDL_itf_wtypes_0000_0001_0005.pFileExt$VH.set(seg, x);
        }
        public static MemoryAddress pFileExt$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemoryAddress)__MIDL___MIDL_itf_wtypes_0000_0001_0005.pFileExt$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void pFileExt$set(MemorySegment seg, long index, MemoryAddress x) {
            __MIDL___MIDL_itf_wtypes_0000_0001_0005.pFileExt$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle pMimeType$VH = __MIDL___MIDL_itf_wtypes_0000_0001_0005$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pMimeType"));
        public static VarHandle pMimeType$VH() {
            return __MIDL___MIDL_itf_wtypes_0000_0001_0005.pMimeType$VH;
        }
        public static MemoryAddress pMimeType$get(MemorySegment seg) {
            return (java.lang.foreign.MemoryAddress)__MIDL___MIDL_itf_wtypes_0000_0001_0005.pMimeType$VH.get(seg);
        }
        public static void pMimeType$set( MemorySegment seg, MemoryAddress x) {
            __MIDL___MIDL_itf_wtypes_0000_0001_0005.pMimeType$VH.set(seg, x);
        }
        public static MemoryAddress pMimeType$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemoryAddress)__MIDL___MIDL_itf_wtypes_0000_0001_0005.pMimeType$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void pMimeType$set(MemorySegment seg, long index, MemoryAddress x) {
            __MIDL___MIDL_itf_wtypes_0000_0001_0005.pMimeType$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle pProgId$VH = __MIDL___MIDL_itf_wtypes_0000_0001_0005$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pProgId"));
        public static VarHandle pProgId$VH() {
            return __MIDL___MIDL_itf_wtypes_0000_0001_0005.pProgId$VH;
        }
        public static MemoryAddress pProgId$get(MemorySegment seg) {
            return (java.lang.foreign.MemoryAddress)__MIDL___MIDL_itf_wtypes_0000_0001_0005.pProgId$VH.get(seg);
        }
        public static void pProgId$set( MemorySegment seg, MemoryAddress x) {
            __MIDL___MIDL_itf_wtypes_0000_0001_0005.pProgId$VH.set(seg, x);
        }
        public static MemoryAddress pProgId$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemoryAddress)__MIDL___MIDL_itf_wtypes_0000_0001_0005.pProgId$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void pProgId$set(MemorySegment seg, long index, MemoryAddress x) {
            __MIDL___MIDL_itf_wtypes_0000_0001_0005.pProgId$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle pFileName$VH = __MIDL___MIDL_itf_wtypes_0000_0001_0005$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pFileName"));
        public static VarHandle pFileName$VH() {
            return __MIDL___MIDL_itf_wtypes_0000_0001_0005.pFileName$VH;
        }
        public static MemoryAddress pFileName$get(MemorySegment seg) {
            return (java.lang.foreign.MemoryAddress)__MIDL___MIDL_itf_wtypes_0000_0001_0005.pFileName$VH.get(seg);
        }
        public static void pFileName$set( MemorySegment seg, MemoryAddress x) {
            __MIDL___MIDL_itf_wtypes_0000_0001_0005.pFileName$VH.set(seg, x);
        }
        public static MemoryAddress pFileName$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemoryAddress)__MIDL___MIDL_itf_wtypes_0000_0001_0005.pFileName$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void pFileName$set(MemorySegment seg, long index, MemoryAddress x) {
            __MIDL___MIDL_itf_wtypes_0000_0001_0005.pFileName$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static class ByName {

            static final  GroupLayout __MIDL___MIDL_itf_wtypes_0000_0001_0005$ByName$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("pPackageName"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Data1"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                ).withName("PolicyId")
            );
            public static MemoryLayout $LAYOUT() {
                return ByName.__MIDL___MIDL_itf_wtypes_0000_0001_0005$ByName$struct$LAYOUT;
            }
            static final VarHandle pPackageName$VH = __MIDL___MIDL_itf_wtypes_0000_0001_0005$ByName$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPackageName"));
            public static VarHandle pPackageName$VH() {
                return ByName.pPackageName$VH;
            }
            public static MemoryAddress pPackageName$get(MemorySegment seg) {
                return (java.lang.foreign.MemoryAddress)ByName.pPackageName$VH.get(seg);
            }
            public static void pPackageName$set( MemorySegment seg, MemoryAddress x) {
                ByName.pPackageName$VH.set(seg, x);
            }
            public static MemoryAddress pPackageName$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemoryAddress)ByName.pPackageName$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void pPackageName$set(MemorySegment seg, long index, MemoryAddress x) {
                ByName.pPackageName$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment PolicyId$slice(MemorySegment seg) {
                return seg.asSlice(8, 16);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment ByName$slice(MemorySegment seg) {
            return seg.asSlice(0, 24);
        }
        public static class ByObjectId {

            static final  GroupLayout __MIDL___MIDL_itf_wtypes_0000_0001_0005$ByObjectId$struct$LAYOUT = MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Data1"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                ).withName("ObjectId"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Data1"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                ).withName("PolicyId")
            );
            public static MemoryLayout $LAYOUT() {
                return ByObjectId.__MIDL___MIDL_itf_wtypes_0000_0001_0005$ByObjectId$struct$LAYOUT;
            }
            public static MemorySegment ObjectId$slice(MemorySegment seg) {
                return seg.asSlice(0, 16);
            }
            public static MemorySegment PolicyId$slice(MemorySegment seg) {
                return seg.asSlice(16, 16);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment ByObjectId$slice(MemorySegment seg) {
            return seg.asSlice(0, 32);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment tagged_union$slice(MemorySegment seg) {
        return seg.asSlice(8, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


