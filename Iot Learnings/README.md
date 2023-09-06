
# Learnings - Internet Of Things (IoT)

## Tools used for Internet Of Things

### Blender (3D Desining open source software application)

The Blender 3D application is a popular, free and open-source toolset for creating and editing 3D computer graphics. These include high-definition animated films, visual effects, 3D models, and interactive 3D applications such as video games.

It can be intalled and launched  Ubuntu through:

    The Official Blender website (https://www.blender.org/download/)
    The Ubuntu Software Manager (UI based installation)
    Through Snap, and through PPA repository (command-line based installation)
**_Refer_** - https://vitux.com/how-to-install-blender-3d-on-ubuntu/


### Importing EasyEda designs

  1.   Export final designed file as EasyEda json file and upload it to https://wokwi.com/easyeda2kicad
  2.   Save it and open it in KiCad pcb editor

### Uploading code to Blue pill (Stm32f103C8T6)

  1.  First install Stm32CubeProgrammer  https://askubuntu.com/questions/1195872/how-to-install-stm32cubeprogrammer-in-linux

##  stm32
######    STM32_Programmer_CLI -c port=swd mode=UR -fwupgrade stm32wb5x_FUS_fw_for_fus_0_5_3.bin 0x080EC000 firstinstall=0

######    STM32_Programmer_CLI -c port=swd mode=UR -fwupgrade stm32wb5x_FUS_fw_for_fus_0_5_3.bin 0x080EC000 firstinstall=0

1.   First Upgrade FUS Firmware (step by step) @ 0x080EC000

2.   then Wireless stack stm32wb5x_BLE_Stack_full_extended_fw.bin @ 0x080C7000  (check for version 1.13)

##  Nrf52840

  1.  Download nrfconnect-launcher for Desktop (****nrfconnect-3.11.0-x86_64.AppImage****)
     https://github.com/NordicSemiconductor/pc-nrfconnect-launcher/releases

  2.  Right click the downloaded file and check mark executable properties under permissions

  **Note**
      Ubuntu 22.04 will no longer ship with the libfuse2 package by default. The AppImage distribution (and more generally, all existing AppImage's) are built expecting libfuse2 support. This means that AppImage's will not run on Ubuntu 22.04 by default

    The user would have to manually run:

    sudo apt install libfuse2*

    prior to executing any AppImage.


## To learning BLE with nrf52840 dongle

  1.  click https://www.youtube.com/watch?v=2cv_jjqk5hg 
  
  2.  click  https://www.novelbits.io/nrf52840-usb-dongle-tutorial-3/

  3.  To generate UUIDs refer  https://www.guidgenerator.com/online-guid-generator.aspx

## West Command not found - after install
   try 
      echo 'export PATH=$PATH:~/.local/bin' >> ${HOME}/.bashrc
      source ${HOME}/.bashrc

## nrfjprog - v giving error

    1.  Download nrf-command-line-tools-10.15.4_linux-amd64.tar.gz (for Linux)
    
    2.  Extract it and from its contents Install JLink_Linux_V758b_x86_64.deb with Software Install
    
##   Use nRF SDK with VS code
    Refer https://makerdiary.com/blogs/news/how-to-use-nrf5-sdk-with-arm-gcc 
    for downloading GCC toolchain and editing makefile.posix 

##  For Custom GATT Service and Characterstics

  -  ## Create own service header as

     1. First, the usual conditional #define  needed to avoid duplicate #include of the same header file.

          ''''
               #ifndef SIMPLE_SERVICE_H
               #define SIMPLE_SERVICE_H
          ''''
     2. Then we include the files needed.

     3. The source code used to define a macro that can be used to instantiate the our custom service.(a brief Macro for defining a ble_simple_service_t instance.)

     4. Next, we define the events that we want to report back to the application. These events are ones that we need to act upon at the application level. For example, to turn on/off an LED or record the occurrence of an event (such as in the case of notifications being enabled/disabled). It is good practice to leave these kinds of decisions and actions to happen at the application level. We want to have the service be as dumb as possible so that it can be reused by other applications without having to change the service’s implementation.

     5.  Then define a custom data structure that will hold an event tied to a specific connection (via the unique connection handle variable conn_handle ).

## Installing MQTT in ubuntu
  1.  Submit the following commands in the terminal of ubuntu

          - sudo apt-add-repository ppa:mosquitto-dev/mosquitto-ppa

          - sudo apt-get update

          - sudo apt-get install mosquitto

          - sudo apt-get install mosquitto-clients

          - sudo apt clean 

  2.  Command to Subscribe
       
          mosquitto_sub -_h_ broker.hivemq.com -_p_ 1883 -_t_ iot-2/evt/status/fmt/json

          (where -h _for host_, -p _for port_, and -t _for Topic_)
  
  3.  Command to Publish 

          mosquitto_pub -h localhost -t kitchen/coffeemaker -m "on" -q 1
          
          (where -h _for_ -t _for topoic_ -m _for message_ and -q _for Quality of service_)
          
## Installing and usingh Segger J-Link
    for J-link refer https://wiki.segger.com/J-Link_cannot_connect_to_the_CPU

## Installing USB-Serial Driver (CH340) in some boards
  
  Watch the video on https://www.youtube.com/watch?v=PZrsAmvMtwA
  and Follow the link https://diode-laser-wiki.com/documentation/setting-up-the-software/

## Save Data to Flash Permanently using Preferences Library

  *_Using Preference.h library_*
    Click https://microcontrollerslab.com/save-data-esp32-flash-permanently-preferences-library/  

## Learning ArduinoJson6 
    https://arduinojson.org/v6/doc/upgrade/


