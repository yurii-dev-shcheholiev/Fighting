package com.company;

public enum Difficulty {

        EASY(4, 2, 0.2, 3, 0.5, 1),
        HARD(8, 4, 0.3, 2, 0.2, 2),
        INSANE(12, 4, 0.5, 1, 0.1, 3);

        private int numCarriers;
        private int numDestroyers;
        private int numCyclesToMove;
        private double ufoFreq;
        private double shootFreq;
        private int numRowsOfCarriers;
        private double turnExplosiveFreq = 0.05;// currently independent of level

        private Difficulty(int numCarrierShips,
                      int numDestroyerShips,
                      double shootFrequency,
                      int numCyclesToMoveOneCell,
                      double ufoFrequency,
                      int numRowsOfCarrierShips)
        {
            numCarriers = numCarrierShips;
            numDestroyers = numDestroyerShips;
            shootFreq = shootFrequency;
            numCyclesToMove = numCyclesToMoveOneCell;
            ufoFreq = ufoFrequency;
            numRowsOfCarriers = numRowsOfCarrierShips;
        }

        public int getNumCarrierShips() {
            return numCarriers;
        }
        public int getNumDestroyers() {
            return numDestroyers;
        }
        public Double getShootFrequency() {
            return shootFreq;
        }
        public int getNumCyclesToMoveOneCell() {
            return numCyclesToMove;
        }
        public Double getUfoFrequency() {
            return ufoFreq;
        }
        public int getNumRowsOfCarrierShips() {
            return numRowsOfCarriers;
        }
        public int getNumCarrierShipsPerRow() {
            return numCarriers / numRowsOfCarriers;
        }
        public int getNumDestroyersPerRow() {
            return getNumDestroyers();
        }

        public static Difficulty parse(String inputString) {//throws MainException{
            for(Difficulty level : Difficulty.values())
                if(level . name().equalsIgnoreCase(inputString))
                    return level;
            throw new IllegalArgumentException("level must be one of: EASY, HARD, INSANE");
        }

        public Double turnExplosiveFrequency() {
            return turnExplosiveFreq;
        }

        public String stringify() {
            String str = "L;" + this;
            return str;
        }
}
