
## Learnings - Internet Of Things (IoT)

### Tools used for Internet Of Things

### Blender (3D Desining open source software application)

The Blender 3D application is a popular, free and open-source toolset for creating and editing 3D computer graphics. These include high-definition animated films, visual effects, 3D models, and interactive 3D applications such as video games.

It can be intalled and launched  Ubuntu through:

    The Official Blender website (https://www.blender.org/download/)
    The Ubuntu Software Manager (UI based installation)
    Through Snap, and through PPA repository (command-line based installation)
**_Refer_** - https://vitux.com/how-to-install-blender-3d-on-ubuntu/


## Importing EasyEda designs

  1.   Export final designed file as EasyEda json file and upload it to https://wokwi.com/easyeda2kicad
  2.   Save it and open it in KiCad pcb editor

## Uploading code to Blue pill (Stm32f103C8T6)

  1.  First install Stm32CubeProgrammer  https://askubuntu.com/questions/1195872/how-to-install-stm32cubeprogrammer-in-linux

##  stm32
######    STM32_Programmer_CLI -c port=swd mode=UR -fwupgrade stm32wb5x_FUS_fw_for_fus_0_5_3.bin 0x080EC000 firstinstall=0

######    STM32_Programmer_CLI -c port=swd mode=UR -fwupgrade stm32wb5x_FUS_fw_for_fus_0_5_3.bin 0x080EC000 firstinstall=0

1.   First Upgrade FUS Firmware (step by step) @ 0x080EC000

2.   then Wireless stack stm32wb5x_BLE_Stack_full_extended_fw.bin @ 0x080C7000  (check for version 1.13)

##  Nrf52840
  1.  Download nrfconnect-launcher for Desktop (nrfconnect-3.11.0-x86_64.AppImage)
     https://github.com/NordicSemiconductor/pc-nrfconnect-launcher/releases

  2.  Right click the downloaded file and set executable properties under permissions

## To learning BLE with nrf52840 dongle
  1.  click  https://www.novelbits.io/nrf52840-usb-dongle-tutorial-3/

  2.  To generate UUIDs refer  https://www.guidgenerator.com/online-guid-generator.aspx

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
