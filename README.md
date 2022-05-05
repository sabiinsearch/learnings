
## Learnings

Include learning with videos, literature, and useful links in various fields

## Display Battery % on 20.04 ubuntu
   #### Single command to show battery percentage:

   For those familiar with Linux commands, this can be done via a single command.

   Press Ctrl+Alt+T to open terminal, copy the command (Ctrl+C) and paste (Ctrl+Shift+V) into terminal and hit run:

      '''' gsettings set org.gnome.desktop.interface           show-battery-percentage true ''''




## Installing Node.js and npm in Ubuntu

#### Step 1.  Installing Node.js
######  $ sudo apt-get install nodejs

#### Step 2. Installing npm type
###### sudo apt-get install -y npm


## Reset root password in Ubuntu
follow the link  https://www.tecmint.com/reset-forgotten-root-password-in-ubuntu/

## Getting ready with Rasberrypi

1.  Download the raspberrypi image file

2.  Download and install Etcher (Tool) for writting image to SD card

2.   After writing the OS image on the SD Card, keep it plugged in the memory card reader.Open the folder named "boot" from drives menu.Add a new text document, don't write anything in it. It has to be blank. But change the name of the document to _**'ssh'_** and save.safely remove the SD Card. Now SSH is enabled.

3.   To add/edit WiFi credentials add a file named _'wpa_supplicant.conf'_ in the boot folder of the SD Card. The content of that file are as follow:-

   country=IN
   ctrl_interface=DIR=/var/run/wpa_supplicant GROUP=netdev
   update_config=1

      network={
         ssid="home_1"
         psk="12345"
         key_mgmt=WPA-PSK
         priority=2
      }

      network={
         ssid="home_2"
         psk="12345"
         key_mgmt=WPA-PSK
         priority=1
}

## Bluetooth Not Working - Ubuntu 20.04
   try these commands
   
    sudo rmmod btusb
    sudo modprobe btusb

## Include libraries in PlatformIO project in VS Code

   1. Edit _includePath_ in c_cpp_properties.json file (Press _Ctr+P_ and write c_cpp_properties.json) 

   2. Use ** (wild card) to include sub folders
    
