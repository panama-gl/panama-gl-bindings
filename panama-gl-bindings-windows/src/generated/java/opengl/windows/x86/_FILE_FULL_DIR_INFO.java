// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_FULL_DIR_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NextEntryOffset"),
        Constants$root.C_LONG$LAYOUT.withName("FileIndex"),
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
        ).withName("EndOfFile"),
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
        ).withName("AllocationSize"),
        Constants$root.C_LONG$LAYOUT.withName("FileAttributes"),
        Constants$root.C_LONG$LAYOUT.withName("FileNameLength"),
        Constants$root.C_LONG$LAYOUT.withName("EaSize"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("FileName"),
        MemoryLayout.paddingLayout(16)
    ).withName("_FILE_FULL_DIR_INFO");
    public static MemoryLayout $LAYOUT() {
        return _FILE_FULL_DIR_INFO.$struct$LAYOUT;
    }
    static final VarHandle NextEntryOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NextEntryOffset"));
    public static VarHandle NextEntryOffset$VH() {
        return _FILE_FULL_DIR_INFO.NextEntryOffset$VH;
    }
    public static int NextEntryOffset$get(MemorySegment seg) {
        return (int)_FILE_FULL_DIR_INFO.NextEntryOffset$VH.get(seg);
    }
    public static void NextEntryOffset$set( MemorySegment seg, int x) {
        _FILE_FULL_DIR_INFO.NextEntryOffset$VH.set(seg, x);
    }
    public static int NextEntryOffset$get(MemorySegment seg, long index) {
        return (int)_FILE_FULL_DIR_INFO.NextEntryOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NextEntryOffset$set(MemorySegment seg, long index, int x) {
        _FILE_FULL_DIR_INFO.NextEntryOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FileIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileIndex"));
    public static VarHandle FileIndex$VH() {
        return _FILE_FULL_DIR_INFO.FileIndex$VH;
    }
    public static int FileIndex$get(MemorySegment seg) {
        return (int)_FILE_FULL_DIR_INFO.FileIndex$VH.get(seg);
    }
    public static void FileIndex$set( MemorySegment seg, int x) {
        _FILE_FULL_DIR_INFO.FileIndex$VH.set(seg, x);
    }
    public static int FileIndex$get(MemorySegment seg, long index) {
        return (int)_FILE_FULL_DIR_INFO.FileIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileIndex$set(MemorySegment seg, long index, int x) {
        _FILE_FULL_DIR_INFO.FileIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment CreationTime$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment LastAccessTime$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment LastWriteTime$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static MemorySegment ChangeTime$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    public static MemorySegment EndOfFile$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
    }
    public static MemorySegment AllocationSize$slice(MemorySegment seg) {
        return seg.asSlice(48, 8);
    }
    static final VarHandle FileAttributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileAttributes"));
    public static VarHandle FileAttributes$VH() {
        return _FILE_FULL_DIR_INFO.FileAttributes$VH;
    }
    public static int FileAttributes$get(MemorySegment seg) {
        return (int)_FILE_FULL_DIR_INFO.FileAttributes$VH.get(seg);
    }
    public static void FileAttributes$set( MemorySegment seg, int x) {
        _FILE_FULL_DIR_INFO.FileAttributes$VH.set(seg, x);
    }
    public static int FileAttributes$get(MemorySegment seg, long index) {
        return (int)_FILE_FULL_DIR_INFO.FileAttributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileAttributes$set(MemorySegment seg, long index, int x) {
        _FILE_FULL_DIR_INFO.FileAttributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FileNameLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileNameLength"));
    public static VarHandle FileNameLength$VH() {
        return _FILE_FULL_DIR_INFO.FileNameLength$VH;
    }
    public static int FileNameLength$get(MemorySegment seg) {
        return (int)_FILE_FULL_DIR_INFO.FileNameLength$VH.get(seg);
    }
    public static void FileNameLength$set( MemorySegment seg, int x) {
        _FILE_FULL_DIR_INFO.FileNameLength$VH.set(seg, x);
    }
    public static int FileNameLength$get(MemorySegment seg, long index) {
        return (int)_FILE_FULL_DIR_INFO.FileNameLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileNameLength$set(MemorySegment seg, long index, int x) {
        _FILE_FULL_DIR_INFO.FileNameLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EaSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EaSize"));
    public static VarHandle EaSize$VH() {
        return _FILE_FULL_DIR_INFO.EaSize$VH;
    }
    public static int EaSize$get(MemorySegment seg) {
        return (int)_FILE_FULL_DIR_INFO.EaSize$VH.get(seg);
    }
    public static void EaSize$set( MemorySegment seg, int x) {
        _FILE_FULL_DIR_INFO.EaSize$VH.set(seg, x);
    }
    public static int EaSize$get(MemorySegment seg, long index) {
        return (int)_FILE_FULL_DIR_INFO.EaSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EaSize$set(MemorySegment seg, long index, int x) {
        _FILE_FULL_DIR_INFO.EaSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileName$slice(MemorySegment seg) {
        return seg.asSlice(68, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


