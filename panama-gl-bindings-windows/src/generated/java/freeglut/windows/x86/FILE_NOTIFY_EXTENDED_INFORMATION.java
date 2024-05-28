// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef struct _FILE_NOTIFY_EXTENDED_INFORMATION {
 *     DWORD NextEntryOffset;
 *     DWORD Action;
 *     LARGE_INTEGER CreationTime;
 *     LARGE_INTEGER LastModificationTime;
 *     LARGE_INTEGER LastChangeTime;
 *     LARGE_INTEGER LastAccessTime;
 *     LARGE_INTEGER AllocatedLength;
 *     LARGE_INTEGER FileSize;
 *     DWORD FileAttributes;
 *     DWORD ReparsePointTag;
 *     LARGE_INTEGER FileId;
 *     LARGE_INTEGER ParentFileId;
 *     DWORD FileNameLength;
 *     WCHAR FileName[1];
 * } FILE_NOTIFY_EXTENDED_INFORMATION
 * }
 */
public class FILE_NOTIFY_EXTENDED_INFORMATION extends _FILE_NOTIFY_EXTENDED_INFORMATION {

    FILE_NOTIFY_EXTENDED_INFORMATION() {
        // Should not be called directly
    }
}

