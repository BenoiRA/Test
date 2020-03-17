# Test
<p style="color:#005f7f;">
  This is simply a test app for get stack trace to 'Android/your.package.name/files/logs/' folder.
  may be we can make it big.
</p>
<p>
we can just use this example to make
   a app without adb logcat
</p>
sample code for using report library is given below

Let's get started
=================

One of the important benefits of this lib is that you don't need to initialize object completely before getting any reports.
```java
   Thread.setDefaultUncaughtException(new Reporter(this,ExceptionListener));
```


