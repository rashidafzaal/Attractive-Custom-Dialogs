# Attractive-Custom-Dialogs-Library
This repository includes some custom dialogs for Android
## Gradle Setup
```
Coming soon as a Library
```


## Things to do:

:heavy_check_mark: Call any method available in <b>AttractiveCustomDialogs</b> (I am updating more methods, so more stylish dialogs) :relaxed: <br/>
:heavy_check_mark: Each Dialog has its separate interface, so implement according to that<br/>



## 1. Camera and Gallery Dialog:
:heavy_check_mark: Pass parameters 
<br/>&emsp;&emsp;&emsp;&emsp;
            1. Context
            <br/>&emsp;&emsp;&emsp;&emsp;
            2. interface (i.e. AttractiveCustomDialogInterface)
```java
AttractiveCustomDialogs.cameraGalleryDialog(MainActivity.this, new AttractiveCustomDialogInterface() {
            @Override
            public void onCameraClick() {
                Toast.makeText(MainActivity.this, "Camera Clicked", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onGalleryClick() {
                Toast.makeText(MainActivity.this, "Gallery Clicked", Toast.LENGTH_SHORT).show();
            }
        });
``` 
<br/>
<img src="https://raw.githubusercontent.com/rashidafzaal/Attractive-Custom-Dialogs-Library/master/screenshots/1.jpg" height="380" data-canonical-src="https://raw.githubusercontent.com/rashidafzaal/Attractive-Custom-Dialogs-Library/master/screenshots/1.jpg" style="max-width:100%;">

## 2. Privacy and Terms Dialog:
:heavy_check_mark: Pass parameters 
<br/>&emsp;&emsp;&emsp;&emsp;
            1. Context
            <br/>&emsp;&emsp;&emsp;&emsp;
            2. bodyText (policy text to be displayed in popup)
            <br/>&emsp;&emsp;&emsp;&emsp;
            3. title (to be displayed on popup title)
            <br/>&emsp;&emsp;&emsp;&emsp;
            4. interface (i.e. PrivacyTermsInterface)
```java
AttractiveCustomDialogs.privacyTermsDialog(this,
                getResources().getString(R.string.terms),
                "Privacy Policy",
                new PrivacyTermsInterface() {
            @Override
            public void onButtonClick() {
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
``` 
<br/>
<img src="https://raw.githubusercontent.com/rashidafzaal/Attractive-Custom-Dialogs-Library/master/screenshots/2.jpg" height="380" data-canonical-src="https://raw.githubusercontent.com/rashidafzaal/Attractive-Custom-Dialogs-Library/master/screenshots/2.jpg" style="max-width:100%;">

## 3. Custom Toast:
:heavy_check_mark: Pass parameters 
<br/>&emsp;&emsp;&emsp;&emsp;
            1. Context
            <br/>&emsp;&emsp;&emsp;&emsp;
            2. message (text to be displayed)
```java
AttractiveCustomDialogs.showCustomToast(this, "A White text with Black background");
``` 
<br/>
<img src="https://raw.githubusercontent.com/rashidafzaal/Attractive-Custom-Dialogs-Library/master/screenshots/3.jpg" height="200" data-canonical-src="https://raw.githubusercontent.com/rashidafzaal/Attractive-Custom-Dialogs-Library/master/screenshots/3.jpg" style="max-width:35%;">
