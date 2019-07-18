# Attractive-Custom-Dialogs-Library
This repository includes some custom dialogs for Android
## Gradle Setup
```
Coming soon as a Library
```


## Things to do:

:heavy_check_mark: Call any method available in <b>AttractiveCustomDialogs</b> (I am updating more methods, so more stylish dialogs) :relaxed: <br/>
:heavy_check_mark: Pass parameters 
<br/>&emsp;&emsp;&emsp;&emsp;
            1. Context
            <br/>&emsp;&emsp;&emsp;&emsp;
            2. interface (i.e. AttractiveCustomDialogInterface)


### 1. Camera and Gallery Dialog:
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
