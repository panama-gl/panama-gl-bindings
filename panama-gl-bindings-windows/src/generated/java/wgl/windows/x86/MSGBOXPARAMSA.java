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
 * typedef struct tagMSGBOXPARAMSA {
 *     UINT cbSize;
 *     HWND hwndOwner;
 *     HINSTANCE hInstance;
 *     LPCSTR lpszText;
 *     LPCSTR lpszCaption;
 *     DWORD dwStyle;
 *     LPCSTR lpszIcon;
 *     DWORD_PTR dwContextHelpId;
 *     MSGBOXCALLBACK lpfnMsgBoxCallback;
 *     DWORD dwLanguageId;
 * } MSGBOXPARAMSA
 * }
 */
public class MSGBOXPARAMSA extends tagMSGBOXPARAMSA {

    MSGBOXPARAMSA() {
        // Should not be called directly
    }
}

