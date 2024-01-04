package practice;

 interface HasExoskeleton {


        abstract int getNumberOfSections();

    }

    abstract class Insect implements HasExoskeleton {

        abstract int getNumberOfLegs();

    }

        class Beetle extends Insect {

        int getNumberOfLegs() { return 6; }

        @Override
        public int getNumberOfSections() {
            return 0;
        }
    }

