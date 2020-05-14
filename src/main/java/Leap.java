class Leap {

    boolean isLeapYear(int year) {
        boolean isLeapyear = false;
        if (((double) year / 100) % 1 == 0) {
            if (((double) year / 400) % 1 == 0)
                isLeapyear = true;
        } else if (((double) year / 4) % 1 == 0)
            isLeapyear = true;

        return isLeapyear;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
