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
	        compile 'com.github.meeej:Debugz-Android:v1.0.0'
	}

```


## Usage

To log and get stack trace:
```
Debugz.out(this.getClass().getSimpleName(), "message", true);
```

Get StackTraceElement (Nullable)
```
StackTraceElement stackTraceElement = Debugz.getStackTraceElement();
```

Get list of StackTraceElement
```
StackTraceElement[] stackTraceElements = Debugz.getStackTraceElements();
```
