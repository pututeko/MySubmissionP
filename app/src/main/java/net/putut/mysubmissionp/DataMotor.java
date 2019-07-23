package net.putut.mysubmissionp;

import java.util.ArrayList;

public class DataMotor {
    public static String[][] dataMotor = new String[][]{
            {"FreeGo S Version ABS","BIG LUGGAGE SMART FRONT REFUEL Wide Tubeless Tire 12 Inch Wheel","https://www.yamaha-motor.co.id/uploads/products/JbnEpvSj9UefMivWqad9.png"},
            {"Mio S Smart & Sophisticated","Lampu LED Answer Back System Ban tubeless dengan tapak lebar","https://www.yamaha-motor.co.id/uploads/products/featured_image/FGrmX58i7WRnKWwo5JJf.png"},
            {"All New X-Ride 125","Answer Back System Mesin Blue Core 125cc Yang Bertenaga Lampu Hazard","https://www.yamaha-motor.co.id/uploads/products/featured_image/Ehn0gOEYjXY7XkjqoAOR.png"},
            {"Mio M3 125","Blue Core Bagasi Luas & Lega Trendy Body Striping","https://www.yamaha-motor.co.id/uploads/products/featured_image/DEU81SK0o6MK2lT30MMC.png"},
            {"New Fino Sporty Tubeless & Ban Lebar 125 Blue Cor","Blue Core Advance Key System Helm Retro Stylish","https://www.yamaha-motor.co.id/uploads/products/featured_image/vt4kTh0rI2HbDqHwIBIm.png"},
            {"All New Soul GT AKS","Blue Core New Speedometer Eco Indicator","https://www.yamaha-motor.co.id/uploads/products/featured_image/RAcww8xbSxgpiB0xBEc3.png"},
            {"LEXI - S","MAXI Design but Compact & Lightweight Grand LED Headlight Full Digital Speedometer","https://www.yamaha-motor.co.id/uploads/products/featured_image/7eN6jacUAMwwkERcuFK0.png"},
            {"Nmax 155 ABS","Blue Core NEW - INVERTED LCD DIGITAL SPEEDOMETER NEW - REAR SUB TANK SUSPENSION","https://www.yamaha-motor.co.id/uploads/products/featured_image/xEoXIN1phcaXLYJlhNS7.png"},
            {"XMAX","Yamaha Executive Service 24 Hours (YES24) Powerful 250 CC Blue Core Engine TCS (Traction Control System)","https://www.yamaha-motor.co.id/uploads/products/featured_image/zTurjE3XdXKZgAriziQZ.png"},
            {"Aerox 155 VVA R-Version","New Generation 155cc LC4V Blue Core Engine Asean Best Sporty Scooter 25 Litres Underseat Storage","https://www.yamaha-motor.co.id/uploads/products/featured_image/2KSV5WOXN4YXkL5CgYVI.png"},
            {"TMAX DX","Cruise Control D-Mode E-Adjustable Windscreen ","https://www.yamaha-motor.co.id/uploads/products/featured_image/6sMOLKc9GTs5GylEPySu.png"},
            {"Xabre New Color","USD (up side down) suspension Full LED Head Light Alumunium Rear Arm ","https://www.yamaha-motor.co.id/uploads/products/featured_image/S5u9zjP4yc5VKnfkCmhR.png"},
            {"All New Vixion","Assist & Slipper Clutch (New) LED Head Light & Tail Light (New) Pass Beam & Engine Cut-Off ","https://www.yamaha-motor.co.id/uploads/products/featured_image/vC3wy7aZhuka9QVHVLHg.png"},
            {"All New R15","ENGINE 155CC LC4V WITH VVA FULL DIGITAL SPEEDOMETER + SHIFT TIMING LIGHT HAZARD LAMP ","https://www.yamaha-motor.co.id/uploads/products/featured_image/0oJxoWRvLRLx6xKAOQOe.png"},
            {"All New R1M","High-compression Cylinder Head and Lightweight Engine Race and Track Ready ABS with Unified Brake System","https://www.yamaha-motor.co.id/uploads/products/featured_image/6E285KPXKRq9XjbwUE1d.png"}
    };

    static ArrayList<Motor> geListData(){
        ArrayList<Motor> listdata = new ArrayList<>();
        for (String[] motor_data : dataMotor){
            Motor data = new Motor();
            data.setNama(motor_data[0]);
            data.setDeskripsi(motor_data[1]);
            data.setFoto(motor_data[2]);

            listdata.add(data);
        }
        return listdata;
    };


}
