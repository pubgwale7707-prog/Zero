TEST STUBS - VSpace BlackBox SDK (NOT the real SDK)
====================================================
The files under:
  app/src/main/java/top/Vspace/...
  app/src/main/java/net_62v/...
are compile-only NO-OP stubs. They let the project compile and the APK
install/run (splash, offline login, main UI), but game install/launch
inside the virtual container is DISABLED in this test build.

TO BUILD THE FULL (REAL) APK:
1. Delete the whole stub trees:
     app/src/main/java/top/
     app/src/main/java/net_62v/
2. Copy the real licensed VSpace SDK AAR file(s) into:
     app/libs/
   (app/build.gradle already includes: fileTree(dir: "libs", ...))
3. Re-run the CI workflow (push) or build locally:
     ./gradlew assembleRelease

DO NOT keep both stubs and the real AAR - that causes
"duplicate class" build errors.
