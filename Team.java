package lesson1;

import java.util.Arrays;

    public class Team {
        private String nameTeam;
        private String[] namePlayer = new String[4];
        private int speed;
        private int jump;

        public Team(String nameTeam,String[] nameplayer,int speed,int jump){
            this.nameTeam =nameTeam;
            this.namePlayer= nameplayer;
            this.jump=jump;
            this.speed=speed;
        }

        public String getNameTeam() {
            return nameTeam;
        }

        public void setNameTeam(String nameTeam) {
            this.nameTeam = nameTeam;
        }

        public String[] getNamePlayer() {
            return namePlayer;
        }

        public void setNamePlayer(String[] namePlayer) {
            this.namePlayer = namePlayer;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public int getJump() {
            return jump;
        }

        public void setJump(int jump) {
            this.jump = jump;
        }

        @Override
        public String toString() {
            return "Team{" +
                    "nameTeam='" + nameTeam + '\'' +
                    ", namePlayer=" + Arrays.toString(namePlayer) +
                    ", speed=" + speed +
                    ", jump=" + jump +
                    '}';
        }

        public void allInfo(){
            System.out.print(toString());
        }


    }


