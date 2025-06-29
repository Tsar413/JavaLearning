package com.company.javaRelearn.NIIT3.Week5;

class School{
    static class WaterRoom{
        private static int room = 20;
        private int bottle = 100;

        public void getWaterRoomSituation(){
            System.out.println("水站情况");
            System.out.println("需要送水的教室数目" + room);
            System.out.println("桶装水的数量" + bottle);
        }

        public static void getRoomNumber(){
            System.out.println("教室数量");
            System.out.println("需要送水的教室数目" + room);
        }
    }

    public void checkWaterSituation(){
        System.out.println("学校检查");
        WaterRoom waterRoom = new WaterRoom();
        waterRoom.getWaterRoomSituation();
        WaterRoom.getRoomNumber();
    }
}

public class WaterSupply {
    public static void main(String[] args) {
        School.WaterRoom waterRoom = new School.WaterRoom();
        waterRoom.getWaterRoomSituation();
        School.WaterRoom.getRoomNumber();
        School school = new School();
        school.checkWaterSituation();
    }
}
