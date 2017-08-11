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
	        compile 'com.github.meeej:debugz:v1.2.1'
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

