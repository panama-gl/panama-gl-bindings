// Generated by jextract

package wgl.windows.x86;

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
 * typedef struct _FILE_FULL_DIR_INFO {
 *     ULONG NextEntryOffset;
 *     ULONG FileIndex;
 *     LARGE_INTEGER CreationTime;
 *     LARGE_INTEGER LastAccessTime;
 *     LARGE_INTEGER LastWriteTime;
 *     LARGE_INTEGER ChangeTime;
 *     LARGE_INTEGER EndOfFile;
 *     LARGE_INTEGER AllocationSize;
 *     ULONG FileAttributes;
 *     ULONG FileNameLength;
 *     ULONG EaSize;
 *     WCHAR FileName[1];
 * } FILE_FULL_DIR_INFO
 * }
 */
public class FILE_FULL_DIR_INFO extends _FILE_FULL_DIR_INFO {

    FILE_FULL_DIR_INFO() {
        // Should not be called directly
    }
}

