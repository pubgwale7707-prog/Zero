package top.Vspace.blackbox;

// ==================== TEST STUB - NOT THE REAL SDK ====================
// This is a compile-only NO-OP stub of the private VSpace BlackBox SDK.
// The real SDK (top.Vspace.blackbox + net_62v.external) is a licensed AAR
// that must be placed in app/libs/. See STUB_README.txt in this folder.
// With stubs, login/UI build & run, but game install/launch is disabled.
// ======================================================================

import android.content.Context;
import android.content.pm.ApplicationInfo;

import top.Vspace.blackbox.app.configuration.AppLifecycleCallback;
import top.Vspace.blackbox.app.configuration.ClientConfiguration;
import top.Vspace.blackbox.entity.pm.InstallResult;

public class BlackBoxCore {

    private static final BlackBoxCore sInstance = new BlackBoxCore();
    private static final BPackageManager sBPackageManager = new BPackageManager();

    public static BlackBoxCore get() {
        return sInstance;
    }

    public static BPackageManager getBPackageManager() {
        return sBPackageManager;
    }

    public void doAttachBaseContext(Context base, ClientConfiguration config) {
        // STUB: no-op
    }

    public void doCreate() {
        // STUB: no-op
    }

    public void addAppLifecycleCallback(AppLifecycleCallback callback) {
        // STUB: no-op
    }

    public void launchApk(String packageName, int userId) {
        // STUB: no-op (game launch disabled in test build)
    }

    public boolean isInstalled(String packageName, int userId) {
        return false;
    }

    public InstallResult installPackageAsUser(String sourceOrPackage, int userId) {
        InstallResult result = new InstallResult();
        result.success = false;
        return result;
    }

    public void uninstallPackageAsUser(String packageName, int userId) {
        // STUB: no-op
    }

    public void stopPackage(String packageName, int userId) {
        // STUB: no-op
    }

    /** Stub virtual package manager. */
    public static class BPackageManager {
        public ApplicationInfo getApplicationInfo(String packageName, int flags, int userId) {
            return null;
        }
    }
}
