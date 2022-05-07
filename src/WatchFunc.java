public class WatchFunc {
    public static String watchfunc(String in, Watch watch) {
        String str = in;
        char input = str.charAt(0);
        int i = 0;
        while (i < str.length()) {
            if (input == 'a' || input == 'b' || input == 'c' || input == 'd') {
                if (watch.getState().equals("normal")) {
                    if (watch.getInnerstate().equals("Time")) {
                        if (input == 'a') {
                            watch.setInnerstate("Date");
                        } else if (input == 'b') {
                            watch.setState("Alarm");
                            watch.setInnerstate("Alarm");
                        } else if (input == 'c') {
                            watch.setState("Update");
                            watch.setInnerstate("min");
                        }
                    } else if (watch.getInnerstate().equals("Date")) {
                        if (input == 'a') {
                            watch.setInnerstate("Time");
                        } else if (input == 'b') {
                            watch.setState("Alarm");
                            watch.setInnerstate("Alarm");
                        } else if (input == 'c') {
                            watch.setState("Update");
                            watch.setInnerstate("min");
                        }
                    }
                } else if (watch.getState().equals("Alarm")) {
                    if (input == 'a') {
                        watch.setInnerstate("Chime");
                    }
                } else if (watch.getState().equals("Update")) {
                    if (watch.getInnerstate().equals("min")) {
                        if (input == 'a') {
                            watch.setInnerstate("hour");
                        } else if (input == 'b') {
                            if (watch.getm() < 60) {
                                int m = watch.getm();
                                watch.setm(++m);
                            } else watch.setm(0);
                        }
                    } else if (watch.getInnerstate().equals("hour")) {
                        if (input == 'a') {
                            watch.setInnerstate("day");
                        } else if (input == 'b') {
                            if (watch.getH() < 24) {
                                int h = watch.getH();
                                watch.setH(++h);
                            } else watch.setH(0);
                        }
                    } else if (watch.getInnerstate().equals("day")) {
                        if (input == 'a') {
                            watch.setInnerstate("month");
                        } else if (input == 'b') {
                            if (watch.getD() < 31) {
                                int d = watch.getD();
                                watch.setD(++d);
                            } else watch.setD(0);
                        }
                    } else if (watch.getInnerstate().equals("month")) {
                        if (input == 'a') {
                            watch.setInnerstate("year");
                        } else if (input == 'b') {
                            int m = watch.getM();
                            watch.setM(++m);
                        }
                    } else if (watch.getInnerstate().equals("year")) {
                        if (input == 'a') {
                            watch.setState("normal");
                            watch.setInnerstate("Time");
                        } else if (input == 'b') {
                            int y = watch.getY();
                            watch.setY(++y);
                        }
                    }
                }
            } else {
                watch.setState("Error");
                break;
            }
            input = str.charAt(i++);
        }
        if (!watch.getState().equals("Error")) {
            String y = Integer.toString(watch.getY());
            String m = Integer.toString(watch.getM());
            String d = Integer.toString(watch.getD());
            return y + '-' + m + '-' + d;
        }else return "Error wrong input. input can only be (a,b,c,d)";

    }
}
