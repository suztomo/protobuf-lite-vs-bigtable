To produce runtime error caused by incompatibility between
`io.grpc:grpc-protobuf-lite` and `com.google.cloud:google-cloud-bigtable`:

```
protobuf-lite-vs-bigtable$ mvn exec:java -Dexec.mainClass=suztomo.App
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] Building protobuf-lite-vs-bigtable 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- exec-maven-plugin:1.6.0:java (default-cli) @ protobuf-lite-vs-bigtable ---
[WARNING] 
java.lang.NoSuchMethodError: com.google.protobuf.UnsafeByteOperations.unsafeWrap([B)Lcom/google/protobuf/ByteString;
    at com.google.cloud.bigtable.data.v2.models.Range$ByteStringRange.prefix (Range.java:363)
    at com.google.cloud.bigtable.data.v2.models.Range$ByteStringRange.prefix (Range.java:336)
    at suztomo.App.main (App.java:14)
    at sun.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:498)
    at org.codehaus.mojo.exec.ExecJavaMojo$1.run (ExecJavaMojo.java:282)
    at java.lang.Thread.run (Thread.java:748)
 ```
