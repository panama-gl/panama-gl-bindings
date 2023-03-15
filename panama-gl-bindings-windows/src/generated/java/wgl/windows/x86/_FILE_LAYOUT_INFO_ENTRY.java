// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_LAYOUT_INFO_ENTRY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
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
            ).withName("CreationTime"),
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
            ).withName("LastAccessTime"),
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
            ).withName("LastWriteTime"),
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
            ).withName("ChangeTime"),
            Constants$root.C_LONG$LAYOUT.withName("FileAttributes"),
            MemoryLayout.paddingLayout(32)
        ).withName("BasicInformation"),
        Constants$root.C_LONG$LAYOUT.withName("OwnerId"),
        Constants$root.C_LONG$LAYOUT.withName("SecurityId"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Usn"),
        Constants$root.C_LONG$LAYOUT.withName("StorageReserveId"),
        MemoryLayout.paddingLayout(32)
    ).withName("_FILE_LAYOUT_INFO_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _FILE_LAYOUT_INFO_ENTRY.$struct$LAYOUT;
    }
    public static class BasicInformation {

        static final  GroupLayout BasicInformation$struct$LAYOUT = MemoryLayout.structLayout(
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
            ).withName("CreationTime"),
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
            ).withName("LastAccessTime"),
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
            ).withName("LastWriteTime"),
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
            ).withName("ChangeTime"),
            Constants$root.C_LONG$LAYOUT.withName("FileAttributes"),
            MemoryLayout.paddingLayout(32)
        );
        public static MemoryLayout $LAYOUT() {
            return BasicInformation.BasicInformation$struct$LAYOUT;
        }
        public static MemorySegment CreationTime$slice(MemorySegment seg) {
            return seg.asSlice(0, 8);
        }
        public static MemorySegment LastAccessTime$slice(MemorySegment seg) {
            return seg.asSlice(8, 8);
        }
        public static MemorySegment LastWriteTime$slice(MemorySegment seg) {
            return seg.asSlice(16, 8);
        }
        public static MemorySegment ChangeTime$slice(MemorySegment seg) {
            return seg.asSlice(24, 8);
        }
        static final VarHandle FileAttributes$VH = BasicInformation$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileAttributes"));
        public static VarHandle FileAttributes$VH() {
            return BasicInformation.FileAttributes$VH;
        }
        public static int FileAttributes$get(MemorySegment seg) {
            return (int)BasicInformation.FileAttributes$VH.get(seg);
        }
        public static void FileAttributes$set( MemorySegment seg, int x) {
            BasicInformation.FileAttributes$VH.set(seg, x);
        }
        public static int FileAttributes$get(MemorySegment seg, long index) {
            return (int)BasicInformation.FileAttributes$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void FileAttributes$set(MemorySegment seg, long index, int x) {
            BasicInformation.FileAttributes$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment BasicInformation$slice(MemorySegment seg) {
        return seg.asSlice(0, 40);
    }
    static final VarHandle OwnerId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OwnerId"));
    public static VarHandle OwnerId$VH() {
        return _FILE_LAYOUT_INFO_ENTRY.OwnerId$VH;
    }
    public static int OwnerId$get(MemorySegment seg) {
        return (int)_FILE_LAYOUT_INFO_ENTRY.OwnerId$VH.get(seg);
    }
    public static void OwnerId$set( MemorySegment seg, int x) {
        _FILE_LAYOUT_INFO_ENTRY.OwnerId$VH.set(seg, x);
    }
    public static int OwnerId$get(MemorySegment seg, long index) {
        return (int)_FILE_LAYOUT_INFO_ENTRY.OwnerId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OwnerId$set(MemorySegment seg, long index, int x) {
        _FILE_LAYOUT_INFO_ENTRY.OwnerId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SecurityId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SecurityId"));
    public static VarHandle SecurityId$VH() {
        return _FILE_LAYOUT_INFO_ENTRY.SecurityId$VH;
    }
    public static int SecurityId$get(MemorySegment seg) {
        return (int)_FILE_LAYOUT_INFO_ENTRY.SecurityId$VH.get(seg);
    }
    public static void SecurityId$set( MemorySegment seg, int x) {
        _FILE_LAYOUT_INFO_ENTRY.SecurityId$VH.set(seg, x);
    }
    public static int SecurityId$get(MemorySegment seg, long index) {
        return (int)_FILE_LAYOUT_INFO_ENTRY.SecurityId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SecurityId$set(MemorySegment seg, long index, int x) {
        _FILE_LAYOUT_INFO_ENTRY.SecurityId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Usn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Usn"));
    public static VarHandle Usn$VH() {
        return _FILE_LAYOUT_INFO_ENTRY.Usn$VH;
    }
    public static long Usn$get(MemorySegment seg) {
        return (long)_FILE_LAYOUT_INFO_ENTRY.Usn$VH.get(seg);
    }
    public static void Usn$set( MemorySegment seg, long x) {
        _FILE_LAYOUT_INFO_ENTRY.Usn$VH.set(seg, x);
    }
    public static long Usn$get(MemorySegment seg, long index) {
        return (long)_FILE_LAYOUT_INFO_ENTRY.Usn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Usn$set(MemorySegment seg, long index, long x) {
        _FILE_LAYOUT_INFO_ENTRY.Usn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StorageReserveId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StorageReserveId"));
    public static VarHandle StorageReserveId$VH() {
        return _FILE_LAYOUT_INFO_ENTRY.StorageReserveId$VH;
    }
    public static int StorageReserveId$get(MemorySegment seg) {
        return (int)_FILE_LAYOUT_INFO_ENTRY.StorageReserveId$VH.get(seg);
    }
    public static void StorageReserveId$set( MemorySegment seg, int x) {
        _FILE_LAYOUT_INFO_ENTRY.StorageReserveId$VH.set(seg, x);
    }
    public static int StorageReserveId$get(MemorySegment seg, long index) {
        return (int)_FILE_LAYOUT_INFO_ENTRY.StorageReserveId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StorageReserveId$set(MemorySegment seg, long index, int x) {
        _FILE_LAYOUT_INFO_ENTRY.StorageReserveId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


