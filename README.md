## Learnings

## Installing Docker in Ubuntu(OS)
   #### Step 1: Update Your System
     
     sudo apt update
     sudo apt upgrade -y
   #### Step 2: Install Prerequisites
      
      sudo apt install apt-transport-https ca-certificates curl software-properties-common -y

   #### Step 3: Add Docker's Official GPG Key
   
      curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /usr/share/keyrings/docker-archive-keyring.gpg
      
   #### Step 4: Add the Docker Repository
   
      echo "deb [arch=$(dpkg --print-architecture) signed-by=/usr/share/keyrings/docker-archive-keyring.gpg] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null   

   #### Step 5: Install Docker Engine
   
     sudo apt update
     sudo apt install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin -y
     
   #### Step 6: Verify the Installation
     
     sudo docker run hello-world
   #### (Highly Recommended) Post-Installation Step: Run Docker without sudo

     Add your user to the docker group:

    sudo usermod -aG docker ${USER}
    
        (The ${USER} variable will automatically be replaced with your current username).
   #### IMPORTANT: For this change to take effect, you must log out and log back in, or reboot your system. A simpler way is to activate the changes for your current terminal session with this command:

       newgrp docker    

       
# Learning Docker

      Summary (TL;DR)
## Create Network:

      docker network create my-sql-net

## Run Server:

      docker run --name mysql-server --network my-sql-net -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql:8.0
      
## Run Client:

      docker run -it --rm --network my-sql-net mysql:8.0 mysql -h mysql-server -u root -p

## My Prompts for Google AI Studio

      -   Help me to install and create Docker container for MySQL 

      -   Help me create CRUD (Create, Delete, Update and Delete) operations using Java Spring framework and my sql at backend
      

## Adding reposiory to git

##  Git Problems (Solution)  

   -   Git: Could not resolve host github.com error while cloning remote repository in git  (refer https://stackoverflow.com/questions/20370294/git-could-not-resolve-host-github-com-error-while-cloning-remote-repository-in)  

Include learning with videos, literature, and useful links in various fields

## Display Battery % on 20.04 ubuntu
   #### Single command to show battery percentage:

   For those familiar with Linux commands, this can be done via a single command.

   Press Ctrl+Alt+T to open terminal, copy the command (Ctrl+C) and paste (Ctrl+Shift+V) into terminal and hit run:

       gsettings set org.gnome.desktop.interface show-battery-percentage true

##  USB not accessed for uploading code to ESP32
   Open the terminal and wtite
      
   1. **Temporary Solution**

       ######      $ sudo chmod a+rw /dev/ttyUSB0     

   2. **Permanent Solution**
       ######     $ sudo usermod -a -G dialout $USER
       ######     $ reboot

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

#  Learn  "**_Make_**"
   follow the link https://makefiletutorial.com/ to learn

##  ESP Rainmaker - 
       https://microcontrollerslab.com/esp-rainmaker-tutorial-esp32-arduino-ide/

##  ESP-IDF  -
   to learn about **ESP-IDF** click https://my-esp-idf.readthedocs.io/en/latest/get-started/index.html
    
## Open Thread

   Refer https://www.youtube.com/watch?v=xCyzNzYSG4U&t=966s for OTBR running on raspberry pi with nrf dongle as RCP 
   from scratch..

   ## Running OTBR using Docker on Raspberry pi

   ### For complete set up 
      go to https://developer.nordicsemi.com/nRF_Connect_SDK/doc/latest/nrf/ug_thread_tools.html
   
   ### To Start the OpenThread Border Router container use the following commands:

            $ sudo modprobe ip6table_filter

            $  sudo docker run -it --rm --privileged --name otbr --network otbr -p 8080:80 \
            --sysctl "net.ipv6.conf.all.disable_ipv6=0 net.ipv4.conf.all.forwarding=1 net.ipv6.conf.all.forwarding=1" \
            --volume /dev/ttyACM0:/dev/radio nrfconnect/otbr:1813352 --radio-url spinel+hdlc+uart:///dev/radio?uart-baudrate=1000000

   #### and form the Thread network
   
   open the http:// address of pi:8080 address in a web browser and choose ***Form*** from the menu         

   ## making RCP with nrf52840 dongle
   click https://developer.nordicsemi.com/nRF_Connect_SDK/doc/2.0.0/matter/openthread_rcp_nrf_dongle.html 

   #### other references - 
   click https://openthread.io/guides/border-router/raspberry-pi  

## Chip-tool
   1.   Go to www.github.com/nrfconnect
   
   2.   find and click **sdk-connectedhomeip** repository 
   
   3.   Click ***Release*** on the right side of the page and from the next page download 
        **chip-tool-python_linux_release.zip** 
   4.   Unzip by command
        #### $ unzip <\path to the dowonloaded file>/chip-tool-python_linux_release.zip
   5.   Install using 
        #### $ python3 -m pip install chip-0.0-cp37-abi3-linux_x86_64.whl
   6.   Run using  
        #### $ chip-device-ctl    

   ## Serial Bootloader (SBL) on cc2652 or cc1352
      - click for more reference https://ptvo.info/zigbee-configurable-firmware-features/serial-bootloader-sbl-on-cc2652/  
 
 ## Custom Board with cc2652R7 chip
   1.   Refer schematic diagram for circuit and PCB (https://github.com/sabiinsearch/References/blob/main/cc2652R7_DesignFiles/Schematic/mcu075a_LP-CC2652R7_schematic.pdf) and then 

   2.   Connect it using Segger J-Link (***version 9***)  
        https://www.amazon.in/gp/product/B07XTMFDZR/ref=ppx_yo_dt_b_asin_title_o04_s00?ie=UTF8&psc=1 

                 Refer connection diagramm (images)

                           - https://github.com/sabiinsearch/References/blob/e45ca849e40d19501bc33f7bba5e7f593e9fb725/J-link_connection_1.jpeg

                           - https://github.com/sabiinsearch/References/blob/e45ca849e40d19501bc33f7bba5e7f593e9fb725/J-link_connection_2.jpeg

   3.   Download and use **Jflash** to connect

   4.   Aslo Download and use uniFlash command as described in https://dev.ti.com/tirex/explore/node?node=A__AciOYyNq9gli.nsvJzBtQg__com.ti.SIMPLELINK_ACADEMY_CC13XX_CC26XX_SDK__AfkT0vQ__LATEST

   5.    connect ***Custom board*** to ***JFlash*** (select CC2652R7 -> JTag -> connect) and then ***erase chip***

   5.    Go to terminal (Ctr+shift+T)

                   $ cd <path to uniFlash>
                   $ ./dslite.sh --config=CC2652R7.ccxml -f -v /home/sarbjeetsingh/ti/simplelink_cc13xx_cc26xx_sdk_7_10_01_24/examples/rtos/LP_CC2652R7/ble5stack/hexfiles/project_zero_unsecure_app.hex

   6.    Download and install '**Starter**' by '**TI**' in mobile
   7.    Custom board will be broadcasting '**Project Zero**' .... click on that then toggle LEDs and use button for input

   *Also, refer https://dev.ti.com/tirex/explore/node?node=A__AciOYyNq9gli.nsvJzBtQg__com.ti.SIMPLELINK_ACADEMY_CC13XX_CC26XX_SDK__AfkT0vQ__LATEST*

## Customising matter Thread examples of own

   1.   **copy** (so that u dont over write original) the example (**inside example folder in matter**) to new location (as per ur project)
   2.   There are 2 simlinks inside that folder. Delete them and **create** own simlink as 

                   $  ln -s ~/matter <path to ur copied location>/third_party/connectedhomeip
                   $  ln -s ~/matter/examples/build_overrides <path to ur copied location>/build_overrides
   3.   **Build the example**

          - **Go to matter folder in terminal**
              
             $ cd <path to matter folder>                
             $ source scripts/activate.sh

          - **Go to your example folder** 

             $ gn gen out/debug --args="ti_sysconfig_root=\"$HOME/ti/sysconfig_1.15.0\""             
             $ ninja -C out/debug
   
   4.    Flash the build to ur **Custom Board** (cofirm it is connected to pc)
       
             $ cd <path to uniFlash>
             $ ./dslite.sh --config=CC2652R7.ccxml -f -v <path to compiled output of ...-bim.hex> 

         (confirm the ***CC2652R7.ccxml*** file fullfills connection details and is placed in uniFlash folder)

#### Creating Matter device 
   **Refer**
      1.    https://dev.ti.com/tirex/explore/node?node=A__AciOYyNq9gli.nsvJzBtQg__com.ti.SIMPLELINK_ACADEMY_CC13XX_CC26XX_SDK__AfkT0vQ__LATEST
      2.    https://jerome-silabs.github.io/SE_FAE_team/OpenThread/Applications/OpenThread_Border_Router/create_network.html#creating-network-using-the-web-user-interface

               
