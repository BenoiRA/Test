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

To get report of stack trace just initialize the  code in your application.java or activity.java
```java
   Thread.setDefaultUncaughtException(new Reporter(this,ExceptionListener));
```
Enjoy find errors without computers

