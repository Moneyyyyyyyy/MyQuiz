package com.test.zp.designpatterns;

/**
 * 建造者模式
 */
public class BuilderPattern {

    public static void main(String[] args) {

        House myHouse = new House.Builder("red").setKitchenNum(1).setRoomNum(5).setLavatoryNum(3).build();
        System.out.println(myHouse.toString());
    }

    public static class House{
        private int roomNum;
        private int lavatoryNum;
        private int kitchenNum;
        private String roomColor;


        private House(Builder builder) {
            this.roomNum = builder.roomNum;
            this.lavatoryNum = builder.lavatoryNum;
            this.roomColor = builder.roomColor;
            this.kitchenNum = builder.kitchenNum;
        }


        public static class Builder{


            private int roomNum;
            private int lavatoryNum;
            private int kitchenNum;
            private String roomColor;

            public Builder(String roomColor) {
                this.roomColor = roomColor;

            }

            public Builder setRoomNum(int roomNum) {
                this.roomNum = roomNum;
                return this;
            }

            public Builder setLavatoryNum(int lavatoryNum) {
                this.lavatoryNum = lavatoryNum;
                return this;
            }

            public Builder setKitchenNum(int kitchenNum) {
                this.kitchenNum = kitchenNum;
                return this;
            }

            public House build(){
                return new House(this);
            }
        }

        @Override
        public String toString() {
            return "House{" +
                    "roomNum=" + roomNum +
                    ", lavatoryNum=" + lavatoryNum +
                    ", kitchenNum=" + kitchenNum +
                    ", roomColor='" + roomColor + '\'' +
                    '}';
        }
    }






}
