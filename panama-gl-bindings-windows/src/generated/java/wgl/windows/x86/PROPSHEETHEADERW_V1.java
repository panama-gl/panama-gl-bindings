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
 * typedef struct _PROPSHEETHEADERW_V1 {
 *     DWORD dwSize;
 *     DWORD dwFlags;
 *     HWND hwndParent;
 *     HINSTANCE hInstance;
 *     union {
 *         HICON hIcon;
 *         LPCWSTR pszIcon;
 *     };
 *     LPCWSTR pszCaption;
 *     UINT nPages;
 *     union {
 *         UINT nStartPage;
 *         LPCWSTR pStartPage;
 *     };
 *     union {
 *         LPCPROPSHEETPAGEW ppsp;
 *         HPROPSHEETPAGE *phpage;
 *     };
 *     PFNPROPSHEETCALLBACK pfnCallback;
 * } PROPSHEETHEADERW_V1
 * }
 */
public class PROPSHEETHEADERW_V1 extends _PROPSHEETHEADERW_V1 {

    PROPSHEETHEADERW_V1() {
        // Should not be called directly
    }
}

