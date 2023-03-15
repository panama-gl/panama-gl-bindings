// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_NOTIFY_EXTENDED_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NextEntryOffset"),
        Constants$root.C_LONG$LAYOUT.withName("Action"),
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
        ).withName("LastModificationTime"),
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
        ).withName("LastChangeTime"),
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
        ).withName("AllocatedLength"),
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
        ).withName("FileSize"),
        Constants$root.C_LONG$LAYOUT.withName("FileAttributes"),
        Constants$root.C_LONG$LAYOUT.withName("ReparsePointTag"),
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
        ).withName("FileId"),
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
        ).withName("ParentFileId"),
        Constants$root.C_LONG$LAYOUT.withName("FileNameLength"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("FileName"),
        MemoryLayout.paddingLayout(16)
    ).withName("_FILE_NOTIFY_EXTENDED_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _FILE_NOTIFY_EXTENDED_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle NextEntryOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NextEntryOffset"));
    public static VarHandle NextEntryOffset$VH() {
        return _FILE_NOTIFY_EXTENDED_INFORMATION.NextEntryOffset$VH;
    }
    public static int NextEntryOffset$get(MemorySegment seg) {
        return (int)_FILE_NOTIFY_EXTENDED_INFORMATION.NextEntryOffset$VH.get(seg);
    }
    public static void NextEntryOffset$set( MemorySegment seg, int x) {
        _FILE_NOTIFY_EXTENDED_INFORMATION.NextEntryOffset$VH.set(seg, x);
    }
    public static int NextEntryOffset$get(MemorySegment seg, long index) {
        return (int)_FILE_NOTIFY_EXTENDED_INFORMATION.NextEntryOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NextEntryOffset$set(MemorySegment seg, long index, int x) {
        _FILE_NOTIFY_EXTENDED_INFORMATION.NextEntryOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Action$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Action"));
    public static VarHandle Action$VH() {
        return _FILE_NOTIFY_EXTENDED_INFORMATION.Action$VH;
    }
    public static int Action$get(MemorySegment seg) {
        return (int)_FILE_NOTIFY_EXTENDED_INFORMATION.Action$VH.get(seg);
    }
    public static void Action$set( MemorySegment seg, int x) {
        _FILE_NOTIFY_EXTENDED_INFORMATION.Action$VH.set(seg, x);
    }
    public static int Action$get(MemorySegment seg, long index) {
        return (int)_FILE_NOTIFY_EXTENDED_INFORMATION.Action$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Action$set(MemorySegment seg, long index, int x) {
        _FILE_NOTIFY_EXTENDED_INFORMATION.Action$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment CreationTime$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment LastModificationTime$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment LastChangeTime$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static MemorySegment LastAccessTime$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    public static MemorySegment AllocatedLength$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
    }
    public static MemorySegment FileSize$slice(MemorySegment seg) {
        return seg.asSlice(48, 8);
    }
    static final VarHandle FileAttributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileAttributes"));
    public static VarHandle FileAttributes$VH() {
        return _FILE_NOTIFY_EXTENDED_INFORMATION.FileAttributes$VH;
    }
    public static int FileAttributes$get(MemorySegment seg) {
        return (int)_FILE_NOTIFY_EXTENDED_INFORMATION.FileAttributes$VH.get(seg);
    }
    public static void FileAttributes$set( MemorySegment seg, int x) {
        _FILE_NOTIFY_EXTENDED_INFORMATION.FileAttributes$VH.set(seg, x);
    }
    public static int FileAttributes$get(MemorySegment seg, long index) {
        return (int)_FILE_NOTIFY_EXTENDED_INFORMATION.FileAttributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileAttributes$set(MemorySegment seg, long index, int x) {
        _FILE_NOTIFY_EXTENDED_INFORMATION.FileAttributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReparsePointTag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReparsePointTag"));
    public static VarHandle ReparsePointTag$VH() {
        return _FILE_NOTIFY_EXTENDED_INFORMATION.ReparsePointTag$VH;
    }
    public static int ReparsePointTag$get(MemorySegment seg) {
        return (int)_FILE_NOTIFY_EXTENDED_INFORMATION.ReparsePointTag$VH.get(seg);
    }
    public static void ReparsePointTag$set( MemorySegment seg, int x) {
        _FILE_NOTIFY_EXTENDED_INFORMATION.ReparsePointTag$VH.set(seg, x);
    }
    public static int ReparsePointTag$get(MemorySegment seg, long index) {
        return (int)_FILE_NOTIFY_EXTENDED_INFORMATION.ReparsePointTag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReparsePointTag$set(MemorySegment seg, long index, int x) {
        _FILE_NOTIFY_EXTENDED_INFORMATION.ReparsePointTag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileId$slice(MemorySegment seg) {
        return seg.asSlice(64, 8);
    }
    public static MemorySegment ParentFileId$slice(MemorySegment seg) {
        return seg.asSlice(72, 8);
    }
    static final VarHandle FileNameLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileNameLength"));
    public static VarHandle FileNameLength$VH() {
        return _FILE_NOTIFY_EXTENDED_INFORMATION.FileNameLength$VH;
    }
    public static int FileNameLength$get(MemorySegment seg) {
        return (int)_FILE_NOTIFY_EXTENDED_INFORMATION.FileNameLength$VH.get(seg);
    }
    public static void FileNameLength$set( MemorySegment seg, int x) {
        _FILE_NOTIFY_EXTENDED_INFORMATION.FileNameLength$VH.set(seg, x);
    }
    public static int FileNameLength$get(MemorySegment seg, long index) {
        return (int)_FILE_NOTIFY_EXTENDED_INFORMATION.FileNameLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileNameLength$set(MemorySegment seg, long index, int x) {
        _FILE_NOTIFY_EXTENDED_INFORMATION.FileNameLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileName$slice(MemorySegment seg) {
        return seg.asSlice(84, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


