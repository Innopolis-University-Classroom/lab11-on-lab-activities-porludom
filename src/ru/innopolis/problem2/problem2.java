// your solution here
//fix all the errors including package errors
package ru.innopolis.problem2;
class Main{
    public static void main(String[] args) {
        ChargeStation station = new ChargeStation();
        Android mobile = new Android();
        station.chargeLightning(new UsbToLightningAdapter(mobile));
    }
}
class ChargeStation{
    public void chargeLightning(Lightning device){

    }
}

interface USB{
    void chargeUSB();
}

interface Lightning{
    void chargeLightning();
}

class UsbToLightningAdapter implements Lightning{
    private USB USBDevice;
    @Override
    public void chargeLightning() {
        USBDevice.chargeUSB();
    }

    public UsbToLightningAdapter(USB USBDevice) {
        this.USBDevice = USBDevice;
    }
}

class Android implements USB{

    @Override
    public void chargeUSB() {

    }
}
class Iphone implements Lightning{

    @Override
    public void chargeLightning() {

    }
}