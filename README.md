# Debugz-Android
Library to log and print stack trace or get StackTraceElement anywhere


## Install

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```


```
	dependencies {
	        compile 'com.github.meeej:Debugz-Android:v1.2.0'
	}
```


## Usage

To Enable/Disable Debugz.out()
```
Debugz.setEnable(true);
```

To log and get stack trace:
```
Debugz.out(this.getClass().getSimpleName(), "message", true);
```

Get list of StackTraceElement
```
StackTraceElement[] stackTraceElements = Debugz.getStackTraceElements();
```

## API
```
public static void out(String tag)
```
```
public static void out(String tag, String message)
```
```
public static void out(String tag, String message, boolean showStackTrace)
```
```
public static void out(String tag, String message, Type type)
```
```
public static void out(String tag, String message, boolean showStackTrace, Type type)
```
```
public static StackTraceElement[] getStackTraceElements()
```

